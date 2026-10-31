package io.datadynamics.nifi.demo.web.queues;

import io.datadynamics.nifi.client.v2.ApiException;
import io.datadynamics.nifi.client.v2.api.ConnectionsApi;
import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.FlowFileQueuesApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.api.ProcessorsApi;
import io.datadynamics.nifi.client.v2.model.ConnectableDTO;
import io.datadynamics.nifi.client.v2.model.ConnectionDTO;
import io.datadynamics.nifi.client.v2.model.ConnectionEntity;
import io.datadynamics.nifi.client.v2.model.ConnectionStatusSnapshotDTO;
import io.datadynamics.nifi.client.v2.model.ConnectionStatusSnapshotEntity;
import io.datadynamics.nifi.client.v2.model.DropRequestEntity;
import io.datadynamics.nifi.client.v2.model.FlowFileSummaryDTO;
import io.datadynamics.nifi.client.v2.model.ListingRequestEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupStatusEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupStatusSnapshotDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupStatusSnapshotEntity;
import io.datadynamics.nifi.client.v2.model.ProcessorEntity;
import io.datadynamics.nifi.client.v2.model.ProcessorsEntity;
import io.datadynamics.nifi.client.v2.model.RevisionDTO;
import io.datadynamics.nifi.demo.trace.SdkCall;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import io.datadynamics.nifi.demo.web.support.Json;
import jakarta.servlet.http.HttpServletResponse;
import okhttp3.Call;
import okhttp3.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static io.datadynamics.nifi.demo.web.support.Inputs.csv;
import static io.datadynamics.nifi.demo.web.support.Inputs.listOf;
import static io.datadynamics.nifi.demo.web.support.Inputs.q;
import static io.datadynamics.nifi.demo.web.support.Inputs.refresh;
import static io.datadynamics.nifi.demo.web.support.Revisions.CLIENT_ID;

/**
 * 연결과 큐: 흐름 전체의 큐 크기, 연결 만들기·고치기·삭제, 큐 목록 보기(비동기 listing 요청), FlowFile 속성과 내용,
 * 큐 비우기(비동기 drop 요청).
 */
@Controller
@RequestMapping("/queues")
public class QueuesController {
    /** 비동기 요청을 조회할 최대 횟수와 간격입니다. */
    private static final int POLLS = 20;
    private static final long POLL_MS = 250;

    private final FlowApi flow;
    private final ProcessGroupsApi groups;
    private final ProcessorsApi processors;
    private final ConnectionsApi connections;
    private final FlowFileQueuesApi queues;
    private final SdkCalls calls;
    private final Json json;

    public QueuesController(FlowApi flow, ProcessGroupsApi groups, ProcessorsApi processors, ConnectionsApi connections,
                            FlowFileQueuesApi queues, SdkCalls calls, Json json) {
        this.flow = flow;
        this.groups = groups;
        this.processors = processors;
        this.connections = connections;
        this.queues = queues;
        this.calls = calls;
        this.json = json;
    }

    @GetMapping
    public String list(Model model) {
        SdkCall status = calls.run("flow.getProcessGroupStatus(\"root\", true, false, null)  // recursive",
                () -> flow.getProcessGroupStatus("root", true, false, null));
        List<ConnectionStatusSnapshotDTO> rows = new ArrayList<>();
        if (status.ok()) {
            collect(status.<ProcessGroupStatusEntity>value().getProcessGroupStatus().getAggregateSnapshot(), rows);
        }
        rows.sort(Comparator.comparing(ConnectionStatusSnapshotDTO::getGroupId).thenComparing(ConnectionStatusSnapshotDTO::getSourceName));
        model.addAttribute("status", status);
        model.addAttribute("connections", rows);
        SdkCall procs = calls.run("groups.getProcessors(\"root\", true)  // source/destination choices", () -> groups.getProcessors("root", true));
        model.addAttribute("processors", procs.ok() ? procs.<ProcessorsEntity>value().getProcessors().stream()
                .sorted(Comparator.comparing((ProcessorEntity p) -> p.getComponent().getName())).toList() : List.of());
        model.addAttribute("resultOpen", false);
        model.addAttribute("self", ServletUriComponentsBuilder.fromCurrentRequest().toUriString());
        return "queues/list";
    }

    /** 상태 스냅숏은 그룹마다 중첩되어 있으므로 하위 그룹까지 내려가며 연결을 모읍니다. */
    private static void collect(ProcessGroupStatusSnapshotDTO group, List<ConnectionStatusSnapshotDTO> out) {
        if (group.getConnectionStatusSnapshots() != null) {
            for (ConnectionStatusSnapshotEntity c : group.getConnectionStatusSnapshots()) {
                out.add(c.getConnectionStatusSnapshot());
            }
        }
        if (group.getProcessGroupStatusSnapshots() != null) {
            for (ProcessGroupStatusSnapshotEntity child : group.getProcessGroupStatusSnapshots()) {
                collect(child.getProcessGroupStatusSnapshot(), out);
            }
        }
    }

    @PostMapping("/create")
    public String create(@RequestParam String sourceId, @RequestParam String destinationId, @RequestParam String relationships,
                         Model model, HttpServletResponse response) {
        List<String> rels = csv(relationships);
        return panel(model, response, calls.run("""
                ProcessorEntity source = processors.getProcessor(%s);
                ProcessorEntity destination = processors.getProcessor(%s);
                String groupId = source.getComponent().getParentGroupId();   // 연결은 출발점이 있는 그룹에 만듭니다
                groups.createConnection(new ConnectionEntity()
                        .revision(new RevisionDTO().version(0L))
                        .component(new ConnectionDTO()
                                .source(new ConnectableDTO().id(source.getId()).groupId(groupId).type(ConnectableDTO.TypeEnum.PROCESSOR))
                                .destination(new ConnectableDTO().id(destination.getId())
                                        .groupId(destination.getComponent().getParentGroupId()).type(ConnectableDTO.TypeEnum.PROCESSOR))
                                .selectedRelationships(%s)),
                        groupId)""".formatted(q(sourceId), q(destinationId), listOf(rels)),
                () -> {
                    ProcessorEntity source = processors.getProcessor(sourceId);
                    ProcessorEntity destination = processors.getProcessor(destinationId);
                    String groupId = source.getComponent().getParentGroupId();
                    return groups.createConnection(new ConnectionEntity()
                            .revision(new RevisionDTO().version(0L))
                            .component(new ConnectionDTO()
                                    .source(new ConnectableDTO().id(source.getId()).groupId(groupId).type(ConnectableDTO.TypeEnum.PROCESSOR))
                                    .destination(new ConnectableDTO().id(destination.getId())
                                            .groupId(destination.getComponent().getParentGroupId()).type(ConnectableDTO.TypeEnum.PROCESSOR))
                                    .selectedRelationships(rels)),
                            groupId);
                }));
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable String id, Model model) {
        SdkCall call = calls.run("connections.getConnection(" + q(id) + ")", () -> connections.getConnection(id));
        model.addAttribute("get", call);
        ConnectionEntity c = call.ok() ? call.value() : null;
        model.addAttribute("connection", c);
        if (c != null) {
            ConnectionDTO d = c.getComponent();
            model.addAttribute("editJson", json.pretty(new ConnectionEntity().revision(c.getRevision())
                    .component(new ConnectionDTO().id(c.getId()).name(d.getName())
                            .backPressureObjectThreshold(d.getBackPressureObjectThreshold())
                            .backPressureDataSizeThreshold(d.getBackPressureDataSizeThreshold())
                            .flowFileExpiration(d.getFlowFileExpiration())
                            .selectedRelationships(d.getSelectedRelationships()))));
        }
        model.addAttribute("resultOpen", false);
        return "queues/detail";
    }

    /**
     * 큐 목록 보기. NiFi는 큐를 바로 돌려주지 않고 "목록 요청"을 만든 뒤 완료될 때까지 조회하게 합니다.
     * 다 읽은 요청은 지워야 서버에 남지 않습니다.
     */
    @PostMapping("/{id}/list")
    public String listing(@PathVariable String id, Model model) throws InterruptedException {
        List<SdkCall> steps = new ArrayList<>();
        SdkCall created = calls.run("ListingRequestEntity listing = queues.createFlowFileListing(" + q(id) + ")",
                () -> queues.createFlowFileListing(id));
        steps.add(created);
        SdkCall last = created;
        if (created.ok()) {
            String requestId = created.<ListingRequestEntity>value().getListingRequest().getId();
            for (int i = 0; i < POLLS && last.ok() && !Boolean.TRUE.equals(last.<ListingRequestEntity>value().getListingRequest().isFinished()); i++) {
                Thread.sleep(POLL_MS);
                last = calls.run("listing = queues.getListingRequest(" + q(id) + ", listing.getListingRequest().getId())  // until finished",
                        () -> queues.getListingRequest(id, requestId));
                steps.add(last);
            }
            steps.add(calls.run("queues.deleteListingRequest(" + q(id) + ", listing.getListingRequest().getId())  // always clean up",
                    () -> queues.deleteListingRequest(id, requestId)));
        }
        List<FlowFileSummaryDTO> flowFiles = last.ok() && last.<ListingRequestEntity>value().getListingRequest().getFlowFileSummaries() != null
                ? last.<ListingRequestEntity>value().getListingRequest().getFlowFileSummaries() : List.of();
        model.addAttribute("steps", steps);
        model.addAttribute("flowFiles", flowFiles);
        model.addAttribute("connectionId", id);
        model.addAttribute("resultOpen", false);
        return "queues/detail :: listing";
    }

    @PostMapping("/{id}/flowfiles/{uuid}")
    public String flowFile(@PathVariable String id, @PathVariable String uuid, Model model) {
        return panel(model, null, calls.run("queues.getFlowFile(" + q(id) + ", " + q(uuid) + ", null)  // attributes and content claim",
                () -> queues.getFlowFile(id, uuid, null)));
    }

    /**
     * FlowFile 내용 받기. 생성된 {@code downloadFlowFileContent}는 반환 타입이 {@code StreamingOutput}(빈 모델)이라 내용을
     * 돌려주지 못합니다. 같은 API의 {@code ...Call} 메서드로 요청만 만들고, OkHttp로 직접 실행해 본문을 읽습니다.
     * 인증 헤더와 인터셉터는 ApiClient가 만든 요청에 그대로 붙습니다.
     */
    @PostMapping("/{id}/flowfiles/{uuid}/content")
    public String content(@PathVariable String id, @PathVariable String uuid, Model model) {
        return panel(model, null, calls.run("""
                Call call = queues.downloadFlowFileContentCall(%s, %s, null, null, null, null, null);
                try (Response response = call.execute()) {
                    if (!response.isSuccessful()) {
                        throw new ApiException(response.code(), response.message(), response.headers().toMultimap(), response.body().string());
                    }
                    return response.body().string();
                }""".formatted(q(id), q(uuid)), () -> {
            Call call = queues.downloadFlowFileContentCall(id, uuid, null, null, null, null, null);
            try (Response response = call.execute()) {
                if (!response.isSuccessful()) {
                    throw new ApiException(response.code(), response.message(), response.headers().toMultimap(), response.body().string());
                }
                return response.body().string();
            }
        }));
    }

    /** 큐 비우기. 목록 보기와 같은 비동기 요청 패턴입니다. */
    @PostMapping("/{id}/drop")
    public String drop(@PathVariable String id, Model model, HttpServletResponse response) throws InterruptedException {
        List<SdkCall> steps = new ArrayList<>();
        SdkCall created = calls.run("DropRequestEntity drop = queues.createDropRequest(" + q(id) + ")", () -> queues.createDropRequest(id));
        steps.add(created);
        if (created.ok()) {
            String requestId = created.<DropRequestEntity>value().getDropRequest().getId();
            SdkCall last = created;
            for (int i = 0; i < POLLS && last.ok() && !Boolean.TRUE.equals(last.<DropRequestEntity>value().getDropRequest().isFinished()); i++) {
                Thread.sleep(POLL_MS);
                last = calls.run("drop = queues.getDropRequest(" + q(id) + ", drop.getDropRequest().getId())  // until finished",
                        () -> queues.getDropRequest(id, requestId));
                steps.add(last);
            }
            steps.add(calls.run("queues.removeDropRequest(" + q(id) + ", drop.getDropRequest().getId())  // always clean up",
                    () -> queues.removeDropRequest(id, requestId)));
        }
        refresh(response);
        model.addAttribute("steps", steps);
        model.addAttribute("resultOpen", false);
        return "fragments :: steps";
    }

    @PostMapping("/{id}/save")
    public String save(@PathVariable String id, @RequestParam String json, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ConnectionEntity connection = client.getJSON().deserialize(json, ConnectionEntity.class);
                connections.updateConnection(connection, %s)""".formatted(q(id)),
                () -> connections.updateConnection(this.json.read(json, ConnectionEntity.class), id)));
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable String id, Model model, HttpServletResponse response) {
        return panel(model, response, calls.run("""
                ConnectionEntity current = connections.getConnection(%s);
                connections.deleteConnection(%s, current.getRevision().getVersion(), CLIENT_ID, null)""".formatted(q(id), q(id)),
                () -> connections.deleteConnection(id, connections.getConnection(id).getRevision().getVersion(), CLIENT_ID, null)));
    }

    private String panel(Model model, HttpServletResponse response, SdkCall call) {
        if (response != null && call.ok()) {
            refresh(response);
        }
        model.addAttribute("call", call);
        model.addAttribute("resultOpen", true);
        return "fragments/call :: call";
    }
}
