package io.datadynamics.nifi.demo.seed;

import io.datadynamics.nifi.client.v2.api.ControllerServicesApi;
import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.ParameterContextsApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.api.ProcessorsApi;
import io.datadynamics.nifi.client.v2.model.ConnectableDTO;
import io.datadynamics.nifi.client.v2.model.ConnectionDTO;
import io.datadynamics.nifi.client.v2.model.ConnectionEntity;
import io.datadynamics.nifi.client.v2.model.ControllerServiceDTO;
import io.datadynamics.nifi.client.v2.model.ControllerServiceEntity;
import io.datadynamics.nifi.client.v2.model.ControllerServiceRunStatusEntity;
import io.datadynamics.nifi.client.v2.model.ParameterContextDTO;
import io.datadynamics.nifi.client.v2.model.ParameterContextEntity;
import io.datadynamics.nifi.client.v2.model.ParameterContextReferenceEntity;
import io.datadynamics.nifi.client.v2.model.ParameterDTO;
import io.datadynamics.nifi.client.v2.model.ParameterEntity;
import io.datadynamics.nifi.client.v2.model.PositionDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupEntity;
import io.datadynamics.nifi.client.v2.model.ProcessorConfigDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorEntity;
import io.datadynamics.nifi.client.v2.model.RevisionDTO;
import io.datadynamics.nifi.client.v2.model.ScheduleComponentsEntity;
import io.datadynamics.nifi.demo.trace.SdkCall;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 데모 데이터(작은 흐름 하나)를 클라이언트로 NiFi에 넣습니다. 모든 단계는 "이름으로 찾아 없을 때만 만들기"이므로
 * 다시 실행해도(앱을 다시 띄워도) 같은 상태가 됩니다. 앱이 뜬 뒤 백그라운드에서 NiFi가 답할 때까지 기다렸다가 실행합니다.
 *
 * <pre>
 * demo-flow (파라미터 컨텍스트 demo-params)
 *   generate (GenerateFlowFile, 5초마다) ─success→ tag (UpdateAttribute) ─success→ log (LogAttribute, 정지)
 *   demo-json-reader, demo-json-writer (컨트롤러 서비스, 활성화)
 * </pre>
 * log는 일부러 멈춰 두어 tag → log 큐에 FlowFile이 쌓이게 합니다(큐 화면에서 목록·내용·비우기를 해 볼 수 있음).
 */
@Component
public class DemoSeeder {
    public static final String GROUP = "demo-flow";
    public static final String CONTEXT = "demo-params";
    public static final String READER = "demo-json-reader";
    public static final String WRITER = "demo-json-writer";
    public static final String GENERATE = "generate";
    public static final String TAG = "tag";
    public static final String LOG = "log";

    private static final Logger log = LoggerFactory.getLogger(DemoSeeder.class);

    public enum State { NOT_STARTED, WAITING_FOR_NIFI, RUNNING, DONE, FAILED }

    public record Step(String title, SdkCall call) {
    }

    private final FlowApi flow;
    private final ProcessGroupsApi groups;
    private final ProcessorsApi processors;
    private final ControllerServicesApi services;
    private final ParameterContextsApi parameters;
    private final SdkCalls calls;
    private final boolean enabled;
    private final Duration timeout;
    private final AtomicBoolean running = new AtomicBoolean();

    private volatile State state = State.NOT_STARTED;
    private volatile List<Step> steps = List.of();
    private volatile Instant finishedAt;
    private volatile String message;
    private volatile String groupId;

    public DemoSeeder(FlowApi flow, ProcessGroupsApi groups, ProcessorsApi processors, ControllerServicesApi services,
                      ParameterContextsApi parameters, SdkCalls calls,
                      @Value("${demo.seed.enabled:true}") boolean enabled,
                      @Value("${demo.seed.timeout:5m}") Duration timeout) {
        this.flow = flow;
        this.groups = groups;
        this.processors = processors;
        this.services = services;
        this.parameters = parameters;
        this.calls = calls;
        this.enabled = enabled;
        this.timeout = timeout;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        if (enabled) {
            runAsync();
        }
    }

    /** 실행 중이 아니면 백그라운드에서 한 번 실행합니다. */
    public boolean runAsync() {
        if (!running.compareAndSet(false, true)) {
            return false;
        }
        Thread t = new Thread(() -> {
            try {
                run();
            } finally {
                running.set(false);
            }
        }, "demo-seeder");
        t.setDaemon(true);
        t.start();
        return true;
    }

    private void run() {
        List<Step> done = new CopyOnWriteArrayList<>();
        steps = done;
        message = null;
        try {
            state = State.WAITING_FOR_NIFI;
            waitFor("flow.getAboutInfo()  // wait for NiFi (the first call logs in after a 401)", flow::getAboutInfo);
            state = State.RUNNING;

            ParameterContextEntity context = require(step(done, "parameter context " + CONTEXT, """
                    parameters.createParameterContext(new ParameterContextEntity()
                            .revision(new RevisionDTO().version(0L))
                            .component(new ParameterContextDTO().name("demo-params")
                                    .parameters(List.of(parameter("env", "demo"), parameter("greeting", "hello")))))  // if absent""",
                    () -> orCreate(findContext(CONTEXT), () -> parameters.createParameterContext(new ParameterContextEntity()
                            .revision(new RevisionDTO().version(0L))
                            .component(new ParameterContextDTO().name(CONTEXT)
                                    .description("Parameters of the nifi-client-demo flow")
                                    .parameters(List.of(parameter("env", "demo"), parameter("greeting", "hello from nifi-client-demo"))))))));

            ProcessGroupEntity group = require(step(done, "process group " + GROUP, """
                    groups.createProcessGroup(new ProcessGroupEntity()
                            .revision(new RevisionDTO().version(0L))
                            .component(new ProcessGroupDTO().name("demo-flow").position(new PositionDTO().x(0d).y(0d))
                                    .parameterContext(new ParameterContextReferenceEntity().id(context.getId()))),
                            "root", null)  // if absent""",
                    () -> orCreate(findGroup(GROUP), () -> groups.createProcessGroup(new ProcessGroupEntity()
                            .revision(new RevisionDTO().version(0L))
                            .component(new ProcessGroupDTO().name(GROUP).position(new PositionDTO().x(0d).y(0d))
                                    .comments("Created by nifi-client-demo")
                                    .parameterContext(new ParameterContextReferenceEntity().id(context.getId()))),
                            "root", null))));
            String gid = group.getId();
            groupId = gid;

            for (String[] cs : new String[][] {{READER, "org.apache.nifi.json.JsonTreeReader"}, {WRITER, "org.apache.nifi.json.JsonRecordSetWriter"}}) {
                SdkCall created = step(done, "controller service " + cs[0],
                        "groups.createControllerService(new ControllerServiceEntity().revision(new RevisionDTO().version(0L))\n"
                                + "        .component(new ControllerServiceDTO().name(\"" + cs[0] + "\").type(\"" + cs[1] + "\")), groupId)  // if absent",
                        () -> orCreate(findService(gid, cs[0]), () -> groups.createControllerService(new ControllerServiceEntity()
                                .revision(new RevisionDTO().version(0L))
                                .component(new ControllerServiceDTO().name(cs[0]).type(cs[1])), gid)));
                if (created.ok()) {
                    String id = created.<ControllerServiceEntity>value().getId();
                    step(done, "enable " + cs[0], """
                            services.updateRunStatus(new ControllerServiceRunStatusEntity()
                                    .revision(service.getRevision()).state(StateEnum.ENABLED), service.getId())  // when valid and disabled""",
                            () -> enableService(id));
                }
            }

            ProcessorEntity generate = require(step(done, "processor " + GENERATE, """
                    groups.createProcessor(new ProcessorEntity().revision(new RevisionDTO().version(0L))
                            .component(new ProcessorDTO().name("generate").type("org.apache.nifi.processors.standard.GenerateFlowFile")
                                    .config(new ProcessorConfigDTO().schedulingPeriod("5 sec")
                                            .properties(Map.of("Custom Text", "{\\"greeting\\":\\"#{greeting}\\",\\"n\\":${random():mod(100)}}")))),
                            groupId)  // if absent""",
                    () -> orCreate(findProcessor(gid, GENERATE), () -> groups.createProcessor(processor(GENERATE,
                            "org.apache.nifi.processors.standard.GenerateFlowFile", 0,
                            new ProcessorConfigDTO().schedulingPeriod("5 sec")
                                    .properties(Map.of("Custom Text", "{\"greeting\":\"#{greeting}\",\"n\":${random():mod(100)}}"))), gid))));
            ProcessorEntity tag = require(step(done, "processor " + TAG, """
                    groups.createProcessor(new ProcessorEntity().revision(new RevisionDTO().version(0L))
                            .component(new ProcessorDTO().name("tag").type("org.apache.nifi.processors.attributes.UpdateAttribute")
                                    .config(new ProcessorConfigDTO().properties(Map.of("env", "#{env}", "source", "nifi-client-demo")))),
                            groupId)  // if absent""",
                    () -> orCreate(findProcessor(gid, TAG), () -> groups.createProcessor(processor(TAG,
                            "org.apache.nifi.processors.attributes.UpdateAttribute", 200,
                            new ProcessorConfigDTO().properties(new LinkedHashMap<>(Map.of("env", "#{env}", "source", "nifi-client-demo")))), gid))));
            ProcessorEntity logAttr = require(step(done, "processor " + LOG, """
                    groups.createProcessor(new ProcessorEntity().revision(new RevisionDTO().version(0L))
                            .component(new ProcessorDTO().name("log").type("org.apache.nifi.processors.standard.LogAttribute")
                                    .config(new ProcessorConfigDTO().autoTerminatedRelationships(List.of("success")))),
                            groupId)  // if absent""",
                    () -> orCreate(findProcessor(gid, LOG), () -> groups.createProcessor(processor(LOG,
                            "org.apache.nifi.processors.standard.LogAttribute", 400,
                            new ProcessorConfigDTO().autoTerminatedRelationships(List.of("success"))), gid))));

            connect(done, gid, generate, tag);
            connect(done, gid, tag, logAttr);

            step(done, "start generate, tag", """
                    flow.scheduleComponents(new ScheduleComponentsEntity().id(groupId).state(StateEnum.RUNNING)
                            .components(Map.of(generate.getId(), generate.getRevision(), tag.getId(), tag.getRevision())), groupId)""",
                    () -> {
                        Map<String, RevisionDTO> components = new LinkedHashMap<>();
                        for (String id : List.of(generate.getId(), tag.getId())) {
                            components.put(id, waitForValid(id).getRevision());
                        }
                        return flow.scheduleComponents(new ScheduleComponentsEntity().id(gid)
                                .state(ScheduleComponentsEntity.StateEnum.RUNNING).components(components), gid);
                    });

            boolean failed = done.stream().anyMatch(s -> !s.call().ok());
            state = failed ? State.FAILED : State.DONE;
            message = failed ? "일부 단계가 실패했습니다. 아래를 보세요." : null;
        } catch (Exception e) {
            state = State.FAILED;
            message = e.getClass().getSimpleName() + ": " + e.getMessage();
            log.warn("Demo seeding failed", e);
        } finally {
            finishedAt = Instant.now();
        }
    }

    private void connect(List<Step> done, String gid, ProcessorEntity from, ProcessorEntity to) {
        String a = from.getComponent().getName();
        String b = to.getComponent().getName();
        step(done, "connection " + a + " → " + b, """
                groups.createConnection(new ConnectionEntity().revision(new RevisionDTO().version(0L))
                        .component(new ConnectionDTO()
                                .source(new ConnectableDTO().id(%s.getId()).groupId(groupId).type(TypeEnum.PROCESSOR))
                                .destination(new ConnectableDTO().id(%s.getId()).groupId(groupId).type(TypeEnum.PROCESSOR))
                                .selectedRelationships(List.of("success"))), groupId)  // if absent""".formatted(a, b),
                () -> {
                    Optional<ConnectionEntity> existing = groups.getConnections(gid).getConnections().stream()
                            .filter(c -> from.getId().equals(c.getSourceId()) && to.getId().equals(c.getDestinationId())).findFirst();
                    if (existing.isPresent()) {
                        return existing.get();
                    }
                    return groups.createConnection(new ConnectionEntity().revision(new RevisionDTO().version(0L))
                            .component(new ConnectionDTO()
                                    .source(new ConnectableDTO().id(from.getId()).groupId(gid).type(ConnectableDTO.TypeEnum.PROCESSOR))
                                    .destination(new ConnectableDTO().id(to.getId()).groupId(gid).type(ConnectableDTO.TypeEnum.PROCESSOR))
                                    .selectedRelationships(List.of("success"))), gid);
                });
    }

    private static ProcessorEntity processor(String name, String type, double y, ProcessorConfigDTO config) {
        return new ProcessorEntity().revision(new RevisionDTO().version(0L))
                .component(new ProcessorDTO().name(name).type(type).position(new PositionDTO().x(0d).y(y)).config(config));
    }

    static ParameterEntity parameter(String name, String value) {
        return new ParameterEntity().parameter(new ParameterDTO().name(name).value(value).sensitive(false));
    }

    private Optional<ParameterContextEntity> findContext(String name) throws Exception {
        List<ParameterContextEntity> all = flow.getParameterContexts().getParameterContexts();
        return all == null ? Optional.empty()
                : all.stream().filter(c -> c.getComponent() != null && name.equals(c.getComponent().getName())).findFirst();
    }

    private Optional<ProcessGroupEntity> findGroup(String name) throws Exception {
        List<ProcessGroupEntity> all = groups.getProcessGroups("root").getProcessGroups();
        return all == null ? Optional.empty()
                : all.stream().filter(g -> name.equals(g.getComponent().getName())).findFirst();
    }

    private Optional<ControllerServiceEntity> findService(String gid, String name) throws Exception {
        List<ControllerServiceEntity> all = flow.getControllerServicesFromGroup(gid, false, false, false, false).getControllerServices();
        return all == null ? Optional.empty()
                : all.stream().filter(s -> name.equals(s.getComponent().getName())).findFirst();
    }

    private Optional<ProcessorEntity> findProcessor(String gid, String name) throws Exception {
        List<ProcessorEntity> all = groups.getProcessors(gid, false).getProcessors();
        return all == null ? Optional.empty()
                : all.stream().filter(p -> name.equals(p.getComponent().getName())).findFirst();
    }

    /** 검증이 끝날 때까지 기다린 뒤, 꺼져 있으면 켭니다. */
    private ControllerServiceEntity enableService(String id) throws Exception {
        ControllerServiceEntity s = services.getControllerService(id, false);
        for (int i = 0; i < 30 && s.getComponent().getValidationStatus() == ControllerServiceDTO.ValidationStatusEnum.VALIDATING; i++) {
            Thread.sleep(500);
            s = services.getControllerService(id, false);
        }
        if (s.getComponent().getState() != ControllerServiceDTO.StateEnum.DISABLED) {
            return s;
        }
        return services.updateRunStatus(new ControllerServiceRunStatusEntity()
                .revision(s.getRevision()).state(ControllerServiceRunStatusEntity.StateEnum.ENABLED), id);
    }

    /** 프로세서는 만든 직후 VALIDATING일 수 있습니다. VALID가 되어야 시작할 수 있습니다. */
    private ProcessorEntity waitForValid(String id) throws Exception {
        ProcessorEntity p = processors.getProcessor(id);
        for (int i = 0; i < 30 && p.getComponent().getValidationStatus() == ProcessorDTO.ValidationStatusEnum.VALIDATING; i++) {
            Thread.sleep(500);
            p = processors.getProcessor(id);
        }
        if (p.getComponent().getValidationStatus() != ProcessorDTO.ValidationStatusEnum.VALID) {
            throw new IllegalStateException(p.getComponent().getName() + " is not valid: " + p.getComponent().getValidationErrors());
        }
        return p;
    }

    /** 백오프를 두고 성공할 때까지 반복합니다. 시드 시간 제한을 넘으면 포기합니다. */
    private void waitFor(String code, Callable<?> probeCall) throws InterruptedException {
        Instant deadline = Instant.now().plus(timeout);
        long delay = 2_000;
        while (true) {
            SdkCall probe = calls.run(code, probeCall);
            if (probe.ok()) {
                return;
            }
            if (Instant.now().isAfter(deadline)) {
                throw new IllegalStateException("No answer within " + timeout + " from " + code + ": " + probe.errorMessage());
            }
            log.info("Waiting: {} -> {}", code, probe.errorMessage());
            Thread.sleep(delay);
            delay = Math.min(delay * 2, 15_000);
        }
    }

    private SdkCall step(List<Step> done, String title, String code, Callable<?> call) {
        SdkCall c = calls.run(code, call);
        done.add(new Step(title, c));
        if (!c.ok()) {
            log.warn("Seed step '{}' failed: {}", title, c.errorMessage());
        }
        return c;
    }

    /** 다음 단계가 이 결과를 써야 하므로, 실패하면 시드를 멈춥니다. */
    private static <T> T require(SdkCall call) {
        if (!call.ok()) {
            throw new IllegalStateException("Step failed: " + call.errorMessage(), call.error());
        }
        return Objects.requireNonNull(call.value());
    }

    /** 찾았으면 그것을, 없으면 만들어서 돌려줍니다. */
    private static <T> T orCreate(Optional<T> found, Callable<T> create) throws Exception {
        return found.isPresent() ? found.get() : create.call();
    }

    public State state() {
        return state;
    }

    public List<Step> steps() {
        return List.copyOf(steps);
    }

    public Instant finishedAt() {
        return finishedAt;
    }

    public String message() {
        return message;
    }

    public boolean isRunning() {
        return running.get();
    }

    /** 시드가 만든(또는 찾은) demo-flow 그룹 id. 아직 없으면 null. */
    public String groupId() {
        return groupId;
    }
}
