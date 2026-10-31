package io.datadynamics.nifi.demo.web.processors;

import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.api.ProcessorsApi;
import io.datadynamics.nifi.client.v2.model.DocumentedTypeDTO;
import io.datadynamics.nifi.client.v2.model.PositionDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupFlowEntity;
import io.datadynamics.nifi.client.v2.model.ProcessorConfigDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorEntity;
import io.datadynamics.nifi.client.v2.model.ProcessorRunStatusEntity;
import io.datadynamics.nifi.client.v2.model.ProcessorTypesEntity;
import io.datadynamics.nifi.client.v2.model.ProcessorsEntity;
import io.datadynamics.nifi.client.v2.model.RevisionDTO;
import io.datadynamics.nifi.demo.seed.DemoSeeder;
import io.datadynamics.nifi.demo.trace.SdkCall;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import io.datadynamics.nifi.demo.web.support.Json;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.datadynamics.nifi.demo.web.support.Inputs.blank;
import static io.datadynamics.nifi.demo.web.support.Inputs.csv;
import static io.datadynamics.nifi.demo.web.support.Inputs.listOf;
import static io.datadynamics.nifi.demo.web.support.Inputs.mapOf;
import static io.datadynamics.nifi.demo.web.support.Inputs.pairs;
import static io.datadynamics.nifi.demo.web.support.Inputs.pairsOrEmpty;
import static io.datadynamics.nifi.demo.web.support.Inputs.q;
import static io.datadynamics.nifi.demo.web.support.Inputs.refresh;
import static io.datadynamics.nifi.demo.web.support.Revisions.CLIENT_ID;

/** 프로세서: 전체 목록, 만들기, 설정 수정, 시작·정지·한 번 실행, 상태(state) 조회, 삭제. */
@Controller
@RequestMapping("/processors")
public class ProcessorsController {
    private final FlowApi flow;
    private final ProcessGroupsApi groups;
    private final ProcessorsApi processors;
    private final SdkCalls calls;
    private final Json json;
    private final DemoSeeder seeder;

    public ProcessorsController(FlowApi flow, ProcessGroupsApi groups, ProcessorsApi processors, SdkCalls calls, Json json,
                                DemoSeeder seeder) {
        this.flow = flow;
        this.groups = groups;
        this.processors = processors;
        this.calls = calls;
        this.json = json;
        this.seeder = seeder;
    }

    /** 그룹 선택 상자의 한 줄입니다. */
    public record GroupOption(String id, String name) {
    }

    @GetMapping
    public String list(Model model) {
        SdkCall call = calls.run("groups.getProcessors(\"root\", true)  // includeDescendantGroups", () -> groups.getProcessors("root", true));
        List<ProcessorEntity> list = call.ok() ? call.<ProcessorsEntity>value().getProcessors() : List.of();
        model.addAttribute("list", call);
        model.addAttribute("processors", list.stream()
                .sorted(Comparator.comparing((ProcessorEntity p) -> p.getComponent().getParentGroupId()).thenComparing(p -> p.getComponent().getName()))
                .toList());
        model.addAttribute("groupOptions", groupOptions());
        model.addAttribute("defaultGroup", seeder.groupId());
        SdkCall types = calls.run("flow.getProcessorTypes(null, null, null)", () -> flow.getProcessorTypes(null, null, null));
        model.addAttribute("types", types.ok() ? types.<ProcessorTypesEntity>value().getProcessorTypes().stream()
                .map(DocumentedTypeDTO::getType).sorted().toList() : List.of());
        model.addAttribute("resultOpen", false);
        model.addAttribute("self", ServletUriComponentsBuilder.fromCurrentRequest().toUriString());
        return "processors/list";
    }

    /** root와 그 바로 아래 그룹들. 이 데모의 흐름은 두 단계뿐이므로 충분합니다. */
    List<GroupOption> groupOptions() {
        SdkCall call = calls.run("flow.getFlow(\"root\", false)  // group choices", () -> flow.getFlow("root", false));
        if (!call.ok()) {
            return List.of();
        }
        ProcessGroupFlowEntity root = call.value();
        List<GroupOption> out = new java.util.ArrayList<>();
        out.add(new GroupOption(root.getProcessGroupFlow().getId(), "(root)"));
        for (ProcessGroupEntity g : root.getProcessGroupFlow().getFlow().getProcessGroups()) {
            out.add(new GroupOption(g.getId(), g.getComponent().getName()));
        }
        return out;
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable String id, Model model) {
        SdkCall call = calls.run("processors.getProcessor(" + q(id) + ")", () -> processors.getProcessor(id));
        model.addAttribute("get", call);
        ProcessorEntity p = call.ok() ? call.value() : null;
        model.addAttribute("processor", p);
        if (p != null) {
            // 고칠 수 있는 부분만 남긴 본문. NiFi는 보낸 필드만 바꾸고 나머지는 그대로 둡니다.
            ProcessorConfigDTO c = p.getComponent().getConfig();
            model.addAttribute("editJson", json.pretty(new ProcessorEntity().revision(p.getRevision())
                    .component(new ProcessorDTO().id(p.getId()).name(p.getComponent().getName())
                            .config(new ProcessorConfigDTO().schedulingPeriod(c.getSchedulingPeriod())
                                    .concurrentlySchedulableTaskCount(c.getConcurrentlySchedulableTaskCount())
                                    .properties(nonNull(c.getProperties()))
                                    .autoTerminatedRelationships(c.getAutoTerminatedRelationships())
                                    .comments(c.getComments())))));
        }
        model.addAttribute("resultOpen", false);
        return "processors/detail";
    }

    private static Map<String, String> nonNull(Map<String, String> properties) {
        Map<String, String> out = new LinkedHashMap<>();
        if (properties != null) {
            properties.forEach((k, v) -> {
                if (v != null) {
                    out.put(k, v);
                }
            });
        }
        return out;
    }

    @PostMapping("/create")
    public String create(@RequestParam String groupId, @RequestParam String type, @RequestParam String name,
                         @RequestParam(required = false) String schedulingPeriod, @RequestParam(required = false) String properties,
                         @RequestParam(required = false) String autoTerminate, Model model, HttpServletResponse response) {
        String period = blank(schedulingPeriod);
        List<String> terminate = csv(autoTerminate);
        String code = """
                groups.createProcessor(new ProcessorEntity()
                        .revision(new RevisionDTO().version(0L))
                        .component(new ProcessorDTO().name(%s).type(%s)
                                .position(new PositionDTO().x(400d).y(0d))
                                .config(new ProcessorConfigDTO()%s
                                        .properties(%s)
                                        .autoTerminatedRelationships(%s))),
                        %s)""".formatted(q(name), q(type), period == null ? "" : ".schedulingPeriod(" + q(period) + ")",
                mapOf(pairsOrEmpty(properties)), listOf(terminate), q(groupId));
        return panel(model, response, calls.run(code, () -> {
            ProcessorConfigDTO config = new ProcessorConfigDTO().properties(pairs(properties)).autoTerminatedRelationships(terminate);
            if (period != null) {
                config.schedulingPeriod(period);
            }
            return groups.createProcessor(new ProcessorEntity()
                    .revision(new RevisionDTO().version(0L))
                    .component(new ProcessorDTO().name(name).type(type).position(new PositionDTO().x(400d).y(0d)).config(config)), groupId);
        }));
    }

    @PostMapping("/{id}/save")
    public String save(@PathVariable String id, @RequestParam String json, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ProcessorEntity processor = client.getJSON().deserialize(json, ProcessorEntity.class);
                processors.updateProcessor(processor, %s)  // 실행 중이면 409: 먼저 멈춰야 합니다""".formatted(q(id)),
                () -> processors.updateProcessor(this.json.read(json, ProcessorEntity.class), id)));
    }

    /** 실행 상태 바꾸기. 최신 revision이 필요하므로 먼저 읽습니다. */
    @PostMapping("/{id}/run-status")
    public String runStatus(@PathVariable String id, @RequestParam String state, Model model, HttpServletResponse response) {
        ProcessorRunStatusEntity.StateEnum s = ProcessorRunStatusEntity.StateEnum.fromValue(state);
        return panel(model, response, calls.run("""
                ProcessorEntity current = processors.getProcessor(%s);
                processors.updateRunStatus(new ProcessorRunStatusEntity()
                        .revision(current.getRevision()).state(ProcessorRunStatusEntity.StateEnum.%s), %s)""".formatted(q(id), s.name(), q(id)),
                () -> processors.updateRunStatus(new ProcessorRunStatusEntity()
                        .revision(processors.getProcessor(id).getRevision()).state(s), id)));
    }

    @PostMapping("/{id}/state")
    public String state(@PathVariable String id, Model model) {
        return panel(model, null, calls.run("processors.getState(" + q(id) + ")  // 프로세서가 저장한 상태(로컬·클러스터)",
                () -> processors.getState(id)));
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable String id, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ProcessorEntity current = processors.getProcessor(%s);
                processors.deleteProcessor(%s, current.getRevision().getVersion(), CLIENT_ID, null)""".formatted(q(id), q(id)),
                () -> processors.deleteProcessor(id, processors.getProcessor(id).getRevision().getVersion(), CLIENT_ID, null)));
    }

    private String panel(Model model, HttpServletResponse response, SdkCall call) {
        if (response != null && call.ok()) {
            refresh(response);
        }
        model.addAttribute("call", call);
        model.addAttribute("resultOpen", false);
        return "fragments/call :: call";
    }
}
