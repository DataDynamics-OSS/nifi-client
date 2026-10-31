package io.datadynamics.nifi.demo.web.lab;

import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.api.ProcessorsApi;
import io.datadynamics.nifi.client.v2.api.TenantsApi;
import io.datadynamics.nifi.client.v2.model.ProcessorConfigDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorEntity;
import io.datadynamics.nifi.client.v2.model.RevisionDTO;
import io.datadynamics.nifi.demo.config.NifiSession;
import io.datadynamics.nifi.demo.seed.DemoSeeder;
import io.datadynamics.nifi.demo.trace.SdkCall;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import static io.datadynamics.nifi.demo.web.support.Revisions.CLIENT_ID;

/**
 * 장애 실험: 토큰 만료와 재로그인, 시간 초과, 예외 모음, revision 충돌을 실제 NiFi에 일부러 일으켜 봅니다.
 * 실험용 클라이언트는 {@link LabClients}에 있습니다.
 */
@Controller
@RequestMapping("/lab")
public class LabController {
    private static final String NO_SUCH_ID = "00000000-0000-0000-0000-000000000000";

    private final FlowApi flow;
    private final ProcessGroupsApi groups;
    private final ProcessorsApi processors;
    private final TenantsApi tenants;
    private final NifiSession session;
    private final DemoSeeder seeder;
    private final LabClients lab;
    private final SdkCalls calls;

    public LabController(FlowApi flow, ProcessGroupsApi groups, ProcessorsApi processors, TenantsApi tenants, NifiSession session,
                         DemoSeeder seeder, LabClients lab, SdkCalls calls) {
        this.flow = flow;
        this.groups = groups;
        this.processors = processors;
        this.tenants = tenants;
        this.session = session;
        this.seeder = seeder;
        this.lab = lab;
        this.calls = calls;
    }

    @GetMapping
    public String page(Model model) {
        model.addAttribute("deadUrl", LabClients.DEAD_URL);
        model.addAttribute("seeded", seeder.groupId() != null);
        return "lab/lab";
    }

    /** ① 토큰 만료: 토큰을 망가뜨린 뒤 평소처럼 호출합니다. 401 → Authenticator가 로그인 → 같은 요청을 다시 보냅니다. */
    @PostMapping("/expire")
    public String expire(Model model) {
        List<SdkCall> steps = new ArrayList<>();
        steps.add(calls.runVoid("client.setAccessToken(\"expired.demo.token\")  // 만료된 토큰 흉내", session::invalidate));
        steps.add(calls.run("flow.getAboutInfo()  // 호출하는 코드는 평소와 같습니다", flow::getAboutInfo));
        return steps(model, steps);
    }

    /** ② 시간 초과: 응답을 1ms 안에 다 읽을 수 없으므로 실패합니다. 생성된 클라이언트는 다시 시도하지 않습니다. */
    @PostMapping("/timeout")
    public String timeout(Model model) {
        return call(model, calls.run("""
                ApiClient slow = new ApiClient().setBasePath(url);
                slow.setHttpClient(slow.getHttpClient().newBuilder().readTimeout(Duration.ofMillis(1)).build());
                new FlowApi(slow).getAboutInfo()""", () -> lab.flow(lab.slow).getAboutInfo()));
    }

    /** ③ 예외 모음. 모두 같은 ApiException이고 getCode()와 응답 본문만 다릅니다. */
    @PostMapping("/error/{kind}")
    public String error(@PathVariable String kind, Model model) {
        SdkCall call = switch (kind) {
            case "404" -> calls.run("processors.getProcessor(\"" + NO_SUCH_ID + "\")", () -> processors.getProcessor(NO_SUCH_ID));
            case "400-revision" -> calls.run("""
                    groups.createProcessor(new ProcessorEntity()
                            .revision(new RevisionDTO().version(1L))   // 새 컴포넌트는 0이어야 합니다
                            .component(new ProcessorDTO().name("lab").type("org.apache.nifi.processors.standard.LogAttribute")),
                            groupId)""", () -> groups.createProcessor(new ProcessorEntity()
                    .revision(new RevisionDTO().version(1L))
                    .component(new ProcessorDTO().name("lab").type("org.apache.nifi.processors.standard.LogAttribute")), seededGroup()));
            case "409-type" -> calls.run("""
                    groups.createProcessor(new ProcessorEntity()
                            .revision(new RevisionDTO().version(0L))
                            .component(new ProcessorDTO().name("lab").type("com.example.NoSuchProcessor")), groupId)""",
                    () -> groups.createProcessor(new ProcessorEntity().revision(new RevisionDTO().version(0L))
                            .component(new ProcessorDTO().name("lab").type("com.example.NoSuchProcessor")), seededGroup()));
            case "409-running" -> calls.run("""
                    ProcessorEntity generate = processors.getProcessor(generateId);   // 실행 중
                    processors.deleteProcessor(generate.getId(), generate.getRevision().getVersion(), CLIENT_ID, null)""", () -> {
                ProcessorEntity generate = processors.getProcessor(seededProcessor(DemoSeeder.GENERATE));
                if (generate.getComponent().getState() != ProcessorDTO.StateEnum.RUNNING) {
                    // 멈춰 있으면 정말 지워지므로 실행하지 않습니다.
                    throw new IllegalStateException("generate가 실행 중이 아닙니다. 프로세서 화면에서 먼저 시작하세요.");
                }
                return processors.deleteProcessor(generate.getId(), generate.getRevision().getVersion(), CLIENT_ID, null);
            });
            case "409-tenants" -> calls.run("tenants.getUsers()  // single-user 로그인은 사용자 관리를 지원하지 않습니다", tenants::getUsers);
            case "400-login" -> calls.run("new AccessApi(noToken).createAccessToken(\"admin\", \"wrong-password\")",
                    () -> lab.access(lab.noToken).createAccessToken("admin", "wrong-password"));
            case "401" -> calls.run("new FlowApi(noToken).getFlow(\"root\", false)  // setAccessToken을 하지 않은 클라이언트",
                    () -> lab.flow(lab.noToken).getFlow("root", false));
            case "transport" -> calls.run("new FlowApi(unreachable).getAboutInfo()  // basePath " + LabClients.DEAD_URL,
                    () -> lab.flow(lab.unreachable).getAboutInfo());
            default -> calls.run("// unknown lab action: " + kind, () -> {
                throw new IllegalArgumentException("Unknown lab action: " + kind);
            });
        };
        return call(model, call);
    }

    /**
     * ④ revision 충돌: 멈춰 있는 log 프로세서를 두 번 읽어 사본 A, B를 만듭니다. A로 고치면 서버 version이 오르고, 낡은 B로
     * 고치면 400입니다. 그런데 B가 A와 같은 clientId를 쓰면 NiFi는 낡은 version이라도 받아 줍니다(같은 클라이언트의 연속 수정으로 봄).
     * 마지막에 comments를 원래대로 돌려놓습니다.
     */
    @PostMapping("/locking")
    public String locking(Model model) {
        List<SdkCall> steps = new ArrayList<>();
        SdkCall readA = calls.run("ProcessorEntity a = processors.getProcessor(logId)", () -> processors.getProcessor(seededProcessor(DemoSeeder.LOG)));
        steps.add(readA);
        if (readA.ok()) {
            ProcessorEntity a = readA.value();
            String id = a.getId();
            String original = a.getComponent().getConfig().getComments();
            long stale = a.getRevision().getVersion();
            steps.add(calls.run("ProcessorEntity b = processors.getProcessor(logId)", () -> processors.getProcessor(id)));
            steps.add(calls.run("""
                    processors.updateProcessor(new ProcessorEntity()
                            .revision(new RevisionDTO().version(a.getRevision().getVersion()).clientId("copy-a"))
                            .component(new ProcessorDTO().id(logId).config(new ProcessorConfigDTO().comments("edited by copy A"))), logId)""",
                    () -> processors.updateProcessor(comments(id, stale, "copy-a", "edited by copy A"), id)));
            steps.add(calls.run("""
                    processors.updateProcessor(new ProcessorEntity()
                            .revision(new RevisionDTO().version(b.getRevision().getVersion()).clientId("copy-b"))   // b의 version은 낡음
                            .component(new ProcessorDTO().id(logId).config(new ProcessorConfigDTO().comments("edited by stale copy B"))), logId)""",
                    () -> processors.updateProcessor(comments(id, stale, "copy-b", "edited by stale copy B"), id)));
            steps.add(calls.run("""
                    processors.updateProcessor(new ProcessorEntity()
                            .revision(new RevisionDTO().version(b.getRevision().getVersion()).clientId("copy-a"))   // 낡은 version, A와 같은 clientId
                            .component(new ProcessorDTO().id(logId).config(new ProcessorConfigDTO().comments("edited by copy A again"))), logId)""",
                    () -> processors.updateProcessor(comments(id, stale, "copy-a", "edited by copy A again"), id)));
            steps.add(calls.run("""
                    ProcessorEntity current = processors.getProcessor(logId);
                    processors.updateProcessor(new ProcessorEntity().revision(current.getRevision())
                            .component(new ProcessorDTO().id(logId).config(new ProcessorConfigDTO().comments(original))), logId)  // restore""",
                    () -> {
                        ProcessorEntity current = processors.getProcessor(id);
                        return processors.updateProcessor(new ProcessorEntity().revision(current.getRevision())
                                .component(new ProcessorDTO().id(id).config(new ProcessorConfigDTO().comments(original == null ? "" : original))), id);
                    }));
        }
        return steps(model, steps);
    }

    private static ProcessorEntity comments(String id, long version, String clientId, String comments) {
        return new ProcessorEntity().revision(new RevisionDTO().version(version).clientId(clientId))
                .component(new ProcessorDTO().id(id).config(new ProcessorConfigDTO().comments(comments)));
    }

    private String seededGroup() {
        String id = seeder.groupId();
        if (id == null) {
            throw new IllegalStateException("데모 데이터가 아직 없습니다. 대시보드에서 시드 상태를 확인하세요.");
        }
        return id;
    }

    private String seededProcessor(String name) throws Exception {
        return groups.getProcessors(seededGroup(), false).getProcessors().stream()
                .filter(p -> name.equals(p.getComponent().getName())).findFirst()
                .orElseThrow(() -> new IllegalStateException("demo-flow에 " + name + " 프로세서가 없습니다. 시드를 다시 실행하세요."))
                .getId();
    }

    private static String call(Model model, SdkCall call) {
        model.addAttribute("call", call);
        model.addAttribute("resultOpen", false);
        return "fragments/call :: call";
    }

    private static String steps(Model model, List<SdkCall> steps) {
        model.addAttribute("steps", steps);
        model.addAttribute("resultOpen", false);
        return "fragments :: steps";
    }
}
