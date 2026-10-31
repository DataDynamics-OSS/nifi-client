package io.datadynamics.nifi.demo.web.services;

import io.datadynamics.nifi.client.v2.api.ControllerServicesApi;
import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.model.ControllerServiceDTO;
import io.datadynamics.nifi.client.v2.model.ControllerServiceEntity;
import io.datadynamics.nifi.client.v2.model.ControllerServiceRunStatusEntity;
import io.datadynamics.nifi.client.v2.model.ControllerServiceTypesEntity;
import io.datadynamics.nifi.client.v2.model.ControllerServicesEntity;
import io.datadynamics.nifi.client.v2.model.DocumentedTypeDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupFlowEntity;
import io.datadynamics.nifi.client.v2.model.RevisionDTO;
import io.datadynamics.nifi.demo.seed.DemoSeeder;
import io.datadynamics.nifi.demo.trace.SdkCall;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import io.datadynamics.nifi.demo.web.processors.ProcessorsController.GroupOption;
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

import java.util.ArrayList;
import java.util.List;

import static io.datadynamics.nifi.demo.web.support.Inputs.mapOf;
import static io.datadynamics.nifi.demo.web.support.Inputs.pairs;
import static io.datadynamics.nifi.demo.web.support.Inputs.pairsOrEmpty;
import static io.datadynamics.nifi.demo.web.support.Inputs.q;
import static io.datadynamics.nifi.demo.web.support.Inputs.refresh;
import static io.datadynamics.nifi.demo.web.support.Revisions.CLIENT_ID;

/** 컨트롤러 서비스: 목록, 만들기, 활성화·비활성화, 참조하는 컴포넌트, 수정, 삭제. */
@Controller
@RequestMapping("/services")
public class ServicesController {
    private final FlowApi flow;
    private final ProcessGroupsApi groups;
    private final ControllerServicesApi services;
    private final SdkCalls calls;
    private final Json json;
    private final DemoSeeder seeder;

    public ServicesController(FlowApi flow, ProcessGroupsApi groups, ControllerServicesApi services, SdkCalls calls, Json json,
                              DemoSeeder seeder) {
        this.flow = flow;
        this.groups = groups;
        this.services = services;
        this.calls = calls;
        this.json = json;
        this.seeder = seeder;
    }

    @GetMapping
    public String list(Model model) {
        SdkCall call = calls.run("flow.getControllerServicesFromGroup(\"root\", false, true, false, false)  // includeDescendantGroups",
                () -> flow.getControllerServicesFromGroup("root", false, true, false, false));
        model.addAttribute("list", call);
        model.addAttribute("services", call.ok() ? call.<ControllerServicesEntity>value().getControllerServices() : List.of());
        SdkCall types = calls.run("flow.getControllerServiceTypes(null, null, null, null, null, null, null)",
                () -> flow.getControllerServiceTypes(null, null, null, null, null, null, null));
        model.addAttribute("types", types.ok() ? types.<ControllerServiceTypesEntity>value().getControllerServiceTypes().stream()
                .map(DocumentedTypeDTO::getType).sorted().toList() : List.of());
        SdkCall root = calls.run("flow.getFlow(\"root\", false)  // group choices", () -> flow.getFlow("root", false));
        List<GroupOption> options = new ArrayList<>();
        if (root.ok()) {
            ProcessGroupFlowEntity r = root.value();
            options.add(new GroupOption(r.getProcessGroupFlow().getId(), "(root)"));
            for (ProcessGroupEntity g : r.getProcessGroupFlow().getFlow().getProcessGroups()) {
                options.add(new GroupOption(g.getId(), g.getComponent().getName()));
            }
        }
        model.addAttribute("groupOptions", options);
        model.addAttribute("defaultGroup", seeder.groupId());
        model.addAttribute("resultOpen", false);
        model.addAttribute("self", ServletUriComponentsBuilder.fromCurrentRequest().toUriString());
        return "services/list";
    }

    @PostMapping("/create")
    public String create(@RequestParam String groupId, @RequestParam String type, @RequestParam String name,
                         @RequestParam(required = false) String properties, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                groups.createControllerService(new ControllerServiceEntity()
                        .revision(new RevisionDTO().version(0L))
                        .component(new ControllerServiceDTO().name(%s).type(%s)
                                .properties(%s)),
                        %s)""".formatted(q(name), q(type), mapOf(pairsOrEmpty(properties)), q(groupId)),
                () -> groups.createControllerService(new ControllerServiceEntity()
                        .revision(new RevisionDTO().version(0L))
                        .component(new ControllerServiceDTO().name(name).type(type).properties(pairs(properties))), groupId)));
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable String id, Model model) {
        SdkCall call = calls.run("services.getControllerService(" + q(id) + ", false)", () -> services.getControllerService(id, false));
        model.addAttribute("get", call);
        ControllerServiceEntity s = call.ok() ? call.value() : null;
        model.addAttribute("service", s);
        if (s != null) {
            model.addAttribute("editJson", json.pretty(new ControllerServiceEntity().revision(s.getRevision())
                    .component(new ControllerServiceDTO().id(s.getId()).name(s.getComponent().getName())
                            .comments(s.getComponent().getComments()).properties(s.getComponent().getProperties()))));
        }
        model.addAttribute("resultOpen", false);
        return "services/detail";
    }

    /** 활성화·비활성화. 활성화된 서비스는 설정을 고치거나 지울 수 없습니다. */
    @PostMapping("/{id}/run-status")
    public String runStatus(@PathVariable String id, @RequestParam String state, Model model, HttpServletResponse response) {
        ControllerServiceRunStatusEntity.StateEnum s = ControllerServiceRunStatusEntity.StateEnum.fromValue(state);
        return panel(model, response, calls.run("""
                ControllerServiceEntity current = services.getControllerService(%s, false);
                services.updateRunStatus(new ControllerServiceRunStatusEntity()
                        .revision(current.getRevision()).state(ControllerServiceRunStatusEntity.StateEnum.%s), %s)""".formatted(q(id), s.name(), q(id)),
                () -> services.updateRunStatus(new ControllerServiceRunStatusEntity()
                        .revision(services.getControllerService(id, false).getRevision()).state(s), id)));
    }

    @PostMapping("/{id}/references")
    public String references(@PathVariable String id, Model model) {
        return panel(model, null, calls.run("services.getControllerServiceReferences(" + q(id) + ")",
                () -> services.getControllerServiceReferences(id)));
    }

    @PostMapping("/{id}/save")
    public String save(@PathVariable String id, @RequestParam String json, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ControllerServiceEntity service = client.getJSON().deserialize(json, ControllerServiceEntity.class);
                services.updateControllerService(service, %s)  // 활성 상태면 409""".formatted(q(id)),
                () -> services.updateControllerService(this.json.read(json, ControllerServiceEntity.class), id)));
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable String id, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ControllerServiceEntity current = services.getControllerService(%s, false);
                services.removeControllerService(%s, current.getRevision().getVersion(), CLIENT_ID, null)""".formatted(q(id), q(id)),
                () -> services.removeControllerService(id, services.getControllerService(id, false).getRevision().getVersion(), CLIENT_ID, null)));
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
