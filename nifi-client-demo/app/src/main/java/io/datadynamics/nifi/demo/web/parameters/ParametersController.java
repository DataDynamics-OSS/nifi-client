package io.datadynamics.nifi.demo.web.parameters;

import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.ParameterContextsApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.model.ParameterContextDTO;
import io.datadynamics.nifi.client.v2.model.ParameterContextEntity;
import io.datadynamics.nifi.client.v2.model.ParameterContextReferenceEntity;
import io.datadynamics.nifi.client.v2.model.ParameterContextUpdateRequestEntity;
import io.datadynamics.nifi.client.v2.model.ParameterContextsEntity;
import io.datadynamics.nifi.client.v2.model.ParameterDTO;
import io.datadynamics.nifi.client.v2.model.ParameterEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupFlowEntity;
import io.datadynamics.nifi.client.v2.model.RevisionDTO;
import io.datadynamics.nifi.demo.trace.SdkCall;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import io.datadynamics.nifi.demo.web.processors.ProcessorsController.GroupOption;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.datadynamics.nifi.demo.web.support.Inputs.blank;
import static io.datadynamics.nifi.demo.web.support.Inputs.csv;
import static io.datadynamics.nifi.demo.web.support.Inputs.pairs;
import static io.datadynamics.nifi.demo.web.support.Inputs.pairsOrEmpty;
import static io.datadynamics.nifi.demo.web.support.Inputs.q;
import static io.datadynamics.nifi.demo.web.support.Inputs.refresh;
import static io.datadynamics.nifi.demo.web.support.Revisions.CLIENT_ID;

/** 파라미터 컨텍스트: 목록, 만들기, 값 바꾸기(비동기 update 요청), 그룹에 연결, 삭제. */
@Controller
@RequestMapping("/parameters")
public class ParametersController {
    private static final int POLLS = 40;
    private static final long POLL_MS = 250;

    private final FlowApi flow;
    private final ParameterContextsApi parameters;
    private final ProcessGroupsApi groups;
    private final SdkCalls calls;

    public ParametersController(FlowApi flow, ParameterContextsApi parameters, ProcessGroupsApi groups, SdkCalls calls) {
        this.flow = flow;
        this.parameters = parameters;
        this.groups = groups;
        this.calls = calls;
    }

    @GetMapping
    public String list(Model model) {
        SdkCall call = calls.run("flow.getParameterContexts()", flow::getParameterContexts);
        model.addAttribute("list", call);
        model.addAttribute("contexts", call.ok() && call.<ParameterContextsEntity>value().getParameterContexts() != null
                ? call.<ParameterContextsEntity>value().getParameterContexts() : List.of());
        model.addAttribute("resultOpen", false);
        model.addAttribute("self", ServletUriComponentsBuilder.fromCurrentRequest().toUriString());
        return "parameters/list";
    }

    @PostMapping("/create")
    public String create(@RequestParam String name, @RequestParam(required = false) String description,
                         @RequestParam(required = false) String values, @RequestParam(required = false) String sensitive,
                         Model model, HttpServletResponse response) {
        List<String> secret = csv(sensitive);
        return panel(model, response, calls.run("""
                parameters.createParameterContext(new ParameterContextEntity()
                        .revision(new RevisionDTO().version(0L))
                        .component(new ParameterContextDTO().name(%s).description(%s)
                                .parameters(List.of(%s))))""".formatted(q(name), q(blank(description)), parameterCode(pairsOrEmpty(values), secret)),
                () -> parameters.createParameterContext(new ParameterContextEntity()
                        .revision(new RevisionDTO().version(0L))
                        .component(new ParameterContextDTO().name(name).description(blank(description))
                                .parameters(toParameters(pairs(values), secret))))));
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable String id, Model model) {
        SdkCall call = calls.run("parameters.getParameterContext(" + q(id) + ", false)", () -> parameters.getParameterContext(id, false));
        model.addAttribute("get", call);
        model.addAttribute("context", call.ok() ? call.value() : null);
        SdkCall root = calls.run("flow.getFlow(\"root\", false)  // group choices", () -> flow.getFlow("root", false));
        List<GroupOption> options = new ArrayList<>();
        if (root.ok()) {
            for (ProcessGroupEntity g : root.<ProcessGroupFlowEntity>value().getProcessGroupFlow().getFlow().getProcessGroups()) {
                options.add(new GroupOption(g.getId(), g.getComponent().getName()));
            }
        }
        model.addAttribute("groupOptions", options);
        model.addAttribute("resultOpen", false);
        return "parameters/detail";
    }

    /**
     * 값 바꾸기. 파라미터를 쓰는 프로세서는 값이 바뀌는 동안 멈췄다 다시 시작해야 하므로, NiFi는 이것을 비동기
     * 요청으로 처리합니다(요청 → 완료될 때까지 조회 → 요청 삭제). 보낸 파라미터만 바뀌고 나머지는 그대로입니다.
     */
    @PostMapping("/{id}/update")
    public String update(@PathVariable String id, @RequestParam String values, @RequestParam(required = false) String sensitive,
                         Model model, HttpServletResponse response) throws InterruptedException {
        List<String> secret = csv(sensitive);
        List<SdkCall> steps = new ArrayList<>();
        SdkCall current = calls.run("ParameterContextEntity current = parameters.getParameterContext(" + q(id) + ", false)",
                () -> parameters.getParameterContext(id, false));
        steps.add(current);
        if (current.ok()) {
            ParameterContextEntity context = current.value();
            SdkCall submitted = calls.run("""
                    // NiFi는 component.id를 요구하지만 생성된 ParameterContextDTO에는 id 설정자가 없습니다(스펙에서 읽기 전용).
                    // 그래서 방금 읽은 DTO(id가 들어 있음)에 바꿀 파라미터만 넣어 보냅니다.
                    ParameterContextUpdateRequestEntity update = parameters.submitParameterContextUpdate(new ParameterContextEntity()
                            .id(%s).revision(current.getRevision())
                            .component(current.getComponent()
                                    .parameters(List.of(%s))), %s)""".formatted(q(id), parameterCode(pairsOrEmpty(values), secret), q(id)),
                    () -> parameters.submitParameterContextUpdate(new ParameterContextEntity().id(id).revision(context.getRevision())
                            .component(context.getComponent().parameters(toParameters(pairs(values), secret))), id));
            steps.add(submitted);
            if (submitted.ok()) {
                String requestId = submitted.<ParameterContextUpdateRequestEntity>value().getRequest().getRequestId();
                SdkCall last = submitted;
                for (int i = 0; i < POLLS && last.ok() && !Boolean.TRUE.equals(last.<ParameterContextUpdateRequestEntity>value().getRequest().isComplete()); i++) {
                    Thread.sleep(POLL_MS);
                    last = calls.run("update = parameters.getParameterContextUpdate(" + q(id) + ", update.getRequest().getRequestId())  // until complete",
                            () -> parameters.getParameterContextUpdate(id, requestId));
                    steps.add(last);
                }
                steps.add(calls.run("parameters.deleteUpdateRequest(" + q(id) + ", update.getRequest().getRequestId(), null)  // always clean up",
                        () -> parameters.deleteUpdateRequest(id, requestId, null)));
            }
        }
        refresh(response);
        model.addAttribute("steps", steps);
        model.addAttribute("resultOpen", false);
        return "fragments :: steps";
    }

    /** 그룹에 이 컨텍스트를 연결합니다. 그룹 안 컴포넌트의 #{이름}이 이 컨텍스트에서 값을 찾습니다. */
    @PostMapping("/{id}/bind")
    public String bind(@PathVariable String id, @RequestParam String groupId, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ProcessGroupEntity group = groups.getProcessGroup(%s);
                groups.updateProcessGroup(new ProcessGroupEntity().revision(group.getRevision())
                        .component(new ProcessGroupDTO().id(%s)
                                .parameterContext(new ParameterContextReferenceEntity().id(%s))), %s)""".formatted(q(groupId), q(groupId), q(id), q(groupId)),
                () -> groups.updateProcessGroup(new ProcessGroupEntity().revision(groups.getProcessGroup(groupId).getRevision())
                        .component(new ProcessGroupDTO().id(groupId).parameterContext(new ParameterContextReferenceEntity().id(id))), groupId)));
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable String id, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ParameterContextEntity current = parameters.getParameterContext(%s, false);
                parameters.deleteParameterContext(%s, current.getRevision().getVersion(), CLIENT_ID, null)""".formatted(q(id), q(id)),
                () -> parameters.deleteParameterContext(id, parameters.getParameterContext(id, false).getRevision().getVersion(), CLIENT_ID, null)));
    }

    private static List<ParameterEntity> toParameters(Map<String, String> values, List<String> sensitive) {
        return values.entrySet().stream().map(e -> new ParameterEntity().parameter(new ParameterDTO()
                .name(e.getKey()).value(e.getValue()).sensitive(sensitive.contains(e.getKey())))).toList();
    }

    private static String parameterCode(Map<String, String> values, List<String> sensitive) {
        return values.entrySet().stream().map(e -> "\n                new ParameterEntity().parameter(new ParameterDTO().name(" + q(e.getKey())
                + ").value(" + q(sensitive.contains(e.getKey()) ? "*****" : e.getValue()) + ").sensitive(" + sensitive.contains(e.getKey()) + "))")
                .collect(Collectors.joining(","));
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
