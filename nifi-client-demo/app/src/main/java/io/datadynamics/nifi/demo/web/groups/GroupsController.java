package io.datadynamics.nifi.demo.web.groups;

import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.model.DropRequestEntity;
import io.datadynamics.nifi.client.v2.model.FlowBreadcrumbEntity;
import io.datadynamics.nifi.client.v2.model.PositionDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupFlowEntity;
import io.datadynamics.nifi.client.v2.model.RevisionDTO;
import io.datadynamics.nifi.client.v2.model.ScheduleComponentsEntity;
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

import java.util.ArrayList;
import java.util.List;

import static io.datadynamics.nifi.demo.web.support.Inputs.q;
import static io.datadynamics.nifi.demo.web.support.Inputs.refresh;
import static io.datadynamics.nifi.demo.web.support.Revisions.CLIENT_ID;

/** 프로세스 그룹: 흐름 탐색, 하위 그룹 만들기, 그룹 전체 시작·정지, 큐 전체 비우기, JSON 수정, 삭제. */
@Controller
@RequestMapping("/groups")
public class GroupsController {
    private final FlowApi flow;
    private final ProcessGroupsApi groups;
    private final SdkCalls calls;
    private final Json json;

    public GroupsController(FlowApi flow, ProcessGroupsApi groups, SdkCalls calls, Json json) {
        this.flow = flow;
        this.groups = groups;
        this.calls = calls;
        this.json = json;
    }

    /** 상위 그룹 경로의 한 칸입니다. */
    public record Crumb(String id, String name) {
    }

    @GetMapping
    public String root(Model model) {
        return detail("root", model);
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable String id, Model model) {
        SdkCall call = calls.run("flow.getFlow(" + q(id) + ", false)", () -> flow.getFlow(id, false));
        model.addAttribute("id", id);
        model.addAttribute("get", call);
        model.addAttribute("pg", call.ok() ? call.<ProcessGroupFlowEntity>value().getProcessGroupFlow() : null);
        if (call.ok()) {
            // 같은 응답의 컴포넌트 위치와 연결로 흐름 그림을 만듭니다(추가 호출 없음).
            model.addAttribute("graph", FlowGraph.of(call.<ProcessGroupFlowEntity>value().getProcessGroupFlow()));
            List<Crumb> crumbs = new ArrayList<>();
            for (FlowBreadcrumbEntity b = call.<ProcessGroupFlowEntity>value().getProcessGroupFlow().getBreadcrumb(); b != null; b = b.getParentBreadcrumb()) {
                crumbs.addFirst(new Crumb(b.getId(), b.getBreadcrumb() != null ? b.getBreadcrumb().getName() : b.getId()));
            }
            model.addAttribute("crumbs", crumbs);
            String realId = call.<ProcessGroupFlowEntity>value().getProcessGroupFlow().getId();
            SdkCall entity = calls.run("groups.getProcessGroup(" + q(realId) + ")", () -> groups.getProcessGroup(realId));
            model.addAttribute("entity", entity.ok() ? entity.value() : null);
            if (entity.ok()) {
                // 고칠 수 있는 부분만 남긴 본문입니다. NiFi는 component에 들어 있는 필드만 바꿉니다.
                ProcessGroupEntity e = entity.value();
                model.addAttribute("editJson", json.pretty(new ProcessGroupEntity().revision(e.getRevision())
                        .component(new ProcessGroupDTO().id(e.getId()).name(e.getComponent().getName()).comments(e.getComponent().getComments()))));
            }
        }
        model.addAttribute("resultOpen", false);
        return "groups/detail";
    }

    @PostMapping("/{id}/children")
    public String create(@PathVariable String id, @RequestParam String name, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                groups.createProcessGroup(new ProcessGroupEntity()
                        .revision(new RevisionDTO().version(0L))   // 새 컴포넌트는 항상 version 0
                        .component(new ProcessGroupDTO().name(%s).position(new PositionDTO().x(400d).y(0d))),
                        %s, null)""".formatted(q(name), q(id)),
                () -> groups.createProcessGroup(new ProcessGroupEntity()
                        .revision(new RevisionDTO().version(0L))
                        .component(new ProcessGroupDTO().name(name).position(new PositionDTO().x(400d).y(0d))), id, null)));
    }

    /** 그룹 안(하위 그룹 포함)의 모든 프로세서·포트를 시작하거나 멈춥니다. components를 비우면 전부입니다. */
    @PostMapping("/{id}/schedule")
    public String schedule(@PathVariable String id, @RequestParam String state, Model model, HttpServletResponse response) {
        ScheduleComponentsEntity.StateEnum s = ScheduleComponentsEntity.StateEnum.fromValue(state);
        return panel(model, response, calls.run("""
                flow.scheduleComponents(new ScheduleComponentsEntity().id(%s)
                        .state(ScheduleComponentsEntity.StateEnum.%s), %s)""".formatted(q(id), s.name(), q(id)),
                () -> flow.scheduleComponents(new ScheduleComponentsEntity().id(id).state(s), id)));
    }

    @PostMapping("/{id}/save")
    public String save(@PathVariable String id, @RequestParam String json, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ProcessGroupEntity group = client.getJSON().deserialize(json, ProcessGroupEntity.class);
                groups.updateProcessGroup(group, %s)  // group.revision은 지금 서버의 revision이어야 합니다""".formatted(q(id)),
                () -> groups.updateProcessGroup(this.json.read(json, ProcessGroupEntity.class), id)));
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable String id, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ProcessGroupEntity current = groups.getProcessGroup(%s);
                groups.removeProcessGroup(%s, current.getRevision().getVersion(), CLIENT_ID, null)""".formatted(q(id), q(id)),
                () -> groups.removeProcessGroup(id, groups.getProcessGroup(id).getRevision().getVersion(), CLIENT_ID, null)));
    }

    /**
     * 그룹 안 모든 큐 비우기. NiFi의 비동기 요청 패턴(요청 만들기 → 끝날 때까지 조회 → 요청 지우기)을 그대로 보여 줍니다.
     */
    @PostMapping("/{id}/empty")
    public String empty(@PathVariable String id, Model model, HttpServletResponse response) throws InterruptedException {
        List<SdkCall> steps = new ArrayList<>();
        SdkCall created = calls.run("DropRequestEntity drop = groups.createEmptyAllConnectionsRequest(" + q(id) + ")",
                () -> groups.createEmptyAllConnectionsRequest(id));
        steps.add(created);
        if (created.ok()) {
            String requestId = created.<DropRequestEntity>value().getDropRequest().getId();
            SdkCall poll = created;
            for (int i = 0; i < 20 && poll.ok() && !Boolean.TRUE.equals(poll.<DropRequestEntity>value().getDropRequest().isFinished()); i++) {
                Thread.sleep(250);
                poll = calls.run("groups.getDropAllFlowfilesRequest(" + q(id) + ", drop.getDropRequest().getId())  // until finished",
                        () -> groups.getDropAllFlowfilesRequest(id, requestId));
                steps.add(poll);
            }
            steps.add(calls.run("groups.removeDropRequest(" + q(id) + ", drop.getDropRequest().getId())  // always clean up",
                    () -> groups.removeDropRequest(id, requestId)));
        }
        refresh(response);
        model.addAttribute("steps", steps);
        model.addAttribute("resultOpen", false);
        return "fragments :: steps";
    }

    private String panel(Model model, HttpServletResponse response, SdkCall call) {
        if (call.ok()) {
            refresh(response);
        }
        model.addAttribute("call", call);
        model.addAttribute("resultOpen", false);
        return "fragments/call :: call";
    }
}
