package io.datadynamics.nifi.demo.web.provenance;

import io.datadynamics.nifi.client.v2.ApiException;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.api.ProvenanceApi;
import io.datadynamics.nifi.client.v2.api.ProvenanceEventsApi;
import io.datadynamics.nifi.client.v2.model.ProcessorEntity;
import io.datadynamics.nifi.client.v2.model.ProcessorsEntity;
import io.datadynamics.nifi.client.v2.model.ProvenanceDTO;
import io.datadynamics.nifi.client.v2.model.ProvenanceEntity;
import io.datadynamics.nifi.client.v2.model.ProvenanceEventDTO;
import io.datadynamics.nifi.client.v2.model.ProvenanceEventEntity;
import io.datadynamics.nifi.client.v2.model.ProvenanceRequestDTO;
import io.datadynamics.nifi.client.v2.model.ProvenanceSearchValueDTO;
import io.datadynamics.nifi.demo.trace.SdkCall;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import okhttp3.Call;
import okhttp3.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static io.datadynamics.nifi.demo.web.support.Inputs.blank;
import static io.datadynamics.nifi.demo.web.support.Inputs.q;

/** 프로비넌스: 이벤트 검색(비동기 query 요청), 이벤트 상세(속성), 이벤트 시점의 내용. */
@Controller
@RequestMapping("/provenance")
public class ProvenanceController {
    private static final int POLLS = 40;
    private static final long POLL_MS = 250;

    private final ProvenanceApi provenance;
    private final ProvenanceEventsApi events;
    private final ProcessGroupsApi groups;
    private final SdkCalls calls;

    public ProvenanceController(ProvenanceApi provenance, ProvenanceEventsApi events, ProcessGroupsApi groups, SdkCalls calls) {
        this.provenance = provenance;
        this.events = events;
        this.groups = groups;
        this.calls = calls;
    }

    @GetMapping
    public String page(@RequestParam(required = false) String componentId, Model model) {
        SdkCall procs = calls.run("groups.getProcessors(\"root\", true)  // component choices", () -> groups.getProcessors("root", true));
        model.addAttribute("processors", procs.ok() ? procs.<ProcessorsEntity>value().getProcessors().stream()
                .sorted(Comparator.comparing((ProcessorEntity p) -> p.getComponent().getName())).toList() : List.of());
        model.addAttribute("componentId", componentId);
        model.addAttribute("options", calls.run("provenance.getSearchOptions()  // searchable fields", provenance::getSearchOptions));
        model.addAttribute("resultOpen", false);
        return "provenance/search";
    }

    /**
     * 검색. 큐 목록과 같은 비동기 요청입니다: 검색 요청 → 끝날 때까지 조회 → 요청 삭제.
     * 컴포넌트로 거를 때의 검색 필드 이름은 {@code ProcessorID}입니다({@code getSearchOptions}로 확인).
     */
    @PostMapping("/query")
    public String query(@RequestParam(required = false) String componentId, @RequestParam(defaultValue = "20") int maxResults,
                        Model model) throws InterruptedException {
        String component = blank(componentId);
        List<SdkCall> steps = new ArrayList<>();
        SdkCall submitted = calls.run("""
                ProvenanceEntity query = provenance.submitProvenanceRequest(new ProvenanceEntity()
                        .provenance(new ProvenanceDTO().request(new ProvenanceRequestDTO()
                                .maxResults(%d).summarize(true).incrementalResults(false)%s)))""".formatted(maxResults,
                        component == null ? "" : "\n                                .searchTerms(Map.of(\"ProcessorID\", new ProvenanceSearchValueDTO().value(" + q(component) + ")))"),
                () -> {
                    ProvenanceRequestDTO request = new ProvenanceRequestDTO().maxResults(maxResults).summarize(true).incrementalResults(false);
                    if (component != null) {
                        request.searchTerms(Map.of("ProcessorID", new ProvenanceSearchValueDTO().value(component)));
                    }
                    return provenance.submitProvenanceRequest(new ProvenanceEntity().provenance(new ProvenanceDTO().request(request)));
                });
        steps.add(submitted);
        SdkCall last = submitted;
        if (submitted.ok()) {
            String id = submitted.<ProvenanceEntity>value().getProvenance().getId();
            for (int i = 0; i < POLLS && last.ok() && !Boolean.TRUE.equals(last.<ProvenanceEntity>value().getProvenance().isFinished()); i++) {
                Thread.sleep(POLL_MS);
                last = calls.run("query = provenance.getProvenance(query.getProvenance().getId(), null, true, false)  // until finished",
                        () -> provenance.getProvenance(id, null, true, false));
                steps.add(last);
            }
            steps.add(calls.run("provenance.deleteProvenance(query.getProvenance().getId(), null)  // always clean up",
                    () -> provenance.deleteProvenance(id, null)));
        }
        List<ProvenanceEventDTO> found = last.ok() && last.<ProvenanceEntity>value().getProvenance().getResults() != null
                ? last.<ProvenanceEntity>value().getProvenance().getResults().getProvenanceEvents() : List.of();
        model.addAttribute("steps", steps);
        model.addAttribute("events", found);
        model.addAttribute("total", last.ok() && last.<ProvenanceEntity>value().getProvenance().getResults() != null
                ? last.<ProvenanceEntity>value().getProvenance().getResults().getTotal() : null);
        model.addAttribute("resultOpen", false);
        return "provenance/search :: results";
    }

    @GetMapping("/events/{id}")
    public String event(@PathVariable long id, Model model) {
        SdkCall call = calls.run("events.getProvenanceEvent(" + id + "L, null)", () -> events.getProvenanceEvent(id, null));
        model.addAttribute("get", call);
        model.addAttribute("event", call.ok() ? call.<ProvenanceEventEntity>value().getProvenanceEvent() : null);
        model.addAttribute("resultOpen", false);
        return "provenance/event";
    }

    /** 이벤트 시점의 내용. 큐의 FlowFile 내용과 같은 이유로 {@code ...Call} 메서드를 OkHttp로 직접 실행합니다. */
    @PostMapping("/events/{id}/content")
    public String content(@PathVariable long id, @RequestParam(defaultValue = "output") String side, Model model) {
        boolean input = "input".equals(side);
        String method = input ? "getInputContentCall" : "getOutputContentCall";
        model.addAttribute("call", calls.run("""
                Call call = events.%s(%dL, null, null, null, null);
                try (Response response = call.execute()) {
                    if (!response.isSuccessful()) {
                        throw new ApiException(response.code(), response.message(), response.headers().toMultimap(), response.body().string());
                    }
                    return response.body().string();
                }""".formatted(method, id), () -> {
            Call call = input ? events.getInputContentCall(id, null, null, null, null) : events.getOutputContentCall(id, null, null, null, null);
            try (Response response = call.execute()) {
                if (!response.isSuccessful()) {
                    throw new ApiException(response.code(), response.message(), response.headers().toMultimap(), response.body().string());
                }
                return response.body().string();
            }
        }));
        model.addAttribute("resultOpen", true);
        return "fragments/call :: call";
    }
}
