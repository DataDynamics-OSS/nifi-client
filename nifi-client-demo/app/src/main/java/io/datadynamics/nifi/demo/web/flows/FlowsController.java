package io.datadynamics.nifi.demo.web.flows;

import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.model.ProcessGroupEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupFlowEntity;
import io.datadynamics.nifi.demo.seed.DemoSeeder;
import io.datadynamics.nifi.demo.trace.SdkCall;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import io.datadynamics.nifi.demo.web.processors.ProcessorsController.GroupOption;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static io.datadynamics.nifi.demo.web.support.Inputs.q;
import static io.datadynamics.nifi.demo.web.support.Revisions.CLIENT_ID;

/**
 * 플로우 정의: 프로세스 그룹을 JSON(flow definition)으로 내보내고, 고친 JSON을 새 그룹으로 올립니다.
 * NiFi UI의 "Download flow definition"과 "Upload flow definition"에 해당합니다.
 */
@Controller
@RequestMapping("/flows")
public class FlowsController {
    private final FlowApi flow;
    private final ProcessGroupsApi groups;
    private final SdkCalls calls;
    private final DemoSeeder seeder;

    public FlowsController(FlowApi flow, ProcessGroupsApi groups, SdkCalls calls, DemoSeeder seeder) {
        this.flow = flow;
        this.groups = groups;
        this.calls = calls;
        this.seeder = seeder;
    }

    @GetMapping
    public String page(Model model) {
        SdkCall root = calls.run("flow.getFlow(\"root\", false)  // group choices", () -> flow.getFlow("root", false));
        List<GroupOption> options = new ArrayList<>();
        String rootId = null;
        if (root.ok()) {
            ProcessGroupFlowEntity r = root.value();
            rootId = r.getProcessGroupFlow().getId();
            for (ProcessGroupEntity g : r.getProcessGroupFlow().getFlow().getProcessGroups()) {
                options.add(new GroupOption(g.getId(), g.getComponent().getName()));
            }
        }
        model.addAttribute("groupOptions", options);
        model.addAttribute("rootId", rootId);
        model.addAttribute("defaultGroup", seeder.groupId());
        model.addAttribute("resultOpen", false);
        return "flows/flows";
    }

    @PostMapping("/export")
    public String export(@RequestParam String groupId, @RequestParam(defaultValue = "false") boolean includeReferencedServices,
                         Model model) {
        SdkCall call = calls.run("String flowJson = groups.exportProcessGroup(" + q(groupId) + ", " + includeReferencedServices + ", false)",
                () -> groups.exportProcessGroup(groupId, includeReferencedServices, false));
        model.addAttribute("call", call);
        model.addAttribute("flowJson", call.ok() ? call.value() : null);
        model.addAttribute("rootId", rootIdOrRoot());
        model.addAttribute("resultOpen", false);
        return "flows/flows :: exported";
    }

    /**
     * 업로드. 생성된 {@code uploadProcessGroup}은 multipart 파일 인자를 {@code Object file}로 받고, 내부에서 {@link File}일 때만
     * 파일 파트로 보냅니다. 그래서 JSON을 임시 파일에 쓴 뒤 넘깁니다.
     */
    @PostMapping("/upload")
    public String upload(@RequestParam String json, @RequestParam String parentId, @RequestParam String name, Model model) {
        model.addAttribute("call", calls.run("""
                Path tmp = Files.createTempFile("flow-", ".json");
                Files.writeString(tmp, flowJson);
                try {
                    groups.uploadProcessGroup(%s, CLIENT_ID, false, tmp.toFile(), %s, 0d, 600d);
                } finally {
                    Files.deleteIfExists(tmp);
                }""".formatted(q(parentId), q(name)), () -> {
            Path tmp = Files.createTempFile("flow-", ".json");
            Files.writeString(tmp, json, StandardCharsets.UTF_8);
            try {
                return groups.uploadProcessGroup(parentId, CLIENT_ID, false, tmp.toFile(), name, 0d, 600d);
            } finally {
                Files.deleteIfExists(tmp);
            }
        }));
        model.addAttribute("resultOpen", false);
        return "fragments/call :: call";
    }

    private String rootIdOrRoot() {
        SdkCall root = calls.run("flow.getFlow(\"root\", false)  // root id for upload", () -> flow.getFlow("root", false));
        return root.ok() ? root.<ProcessGroupFlowEntity>value().getProcessGroupFlow().getId() : "root";
    }
}
