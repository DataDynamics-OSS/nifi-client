package io.datadynamics.nifi.demo.web.dashboard;

import io.datadynamics.nifi.client.v2.ApiClient;
import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.SystemDiagnosticsApi;
import io.datadynamics.nifi.demo.config.NifiProperties;
import io.datadynamics.nifi.demo.config.NifiSession;
import io.datadynamics.nifi.demo.seed.DemoSeeder;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

/** 연결 상태, 로그인(토큰), NiFi 버전과 상태, 시스템 진단, 게시판(bulletin), 시드 상태. */
@Controller
public class DashboardController {
    private final ApiClient client;
    private final FlowApi flow;
    private final SystemDiagnosticsApi diagnostics;
    private final NifiProperties props;
    private final NifiSession session;
    private final SdkCalls calls;
    private final DemoSeeder seeder;

    public DashboardController(ApiClient client, FlowApi flow, SystemDiagnosticsApi diagnostics, NifiProperties props,
                               NifiSession session, SdkCalls calls, DemoSeeder seeder) {
        this.client = client;
        this.flow = flow;
        this.diagnostics = diagnostics;
        this.props = props;
        this.session = session;
        this.calls = calls;
        this.seeder = seeder;
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("basePath", client.getBasePath());
        model.addAttribute("props", props);
        model.addAttribute("login", session);
        model.addAttribute("about", calls.run("flow.getAboutInfo()", flow::getAboutInfo));
        model.addAttribute("user", calls.run("flow.getCurrentUser()", flow::getCurrentUser));
        model.addAttribute("status", calls.run("flow.getControllerStatus()", flow::getControllerStatus));
        model.addAttribute("diag", calls.run("diagnostics.getSystemDiagnostics(false, null, null)",
                () -> diagnostics.getSystemDiagnostics(false, null, null)));
        model.addAttribute("bulletins", calls.run("flow.getBulletinBoard(null, null, null, null, null, 10)",
                () -> flow.getBulletinBoard(null, null, null, null, null, 10)));
        model.addAttribute("seeder", seeder);
        model.addAttribute("resultOpen", false);
        return "dashboard";
    }

    @PostMapping("/seed")
    public String reseed() {
        seeder.runAsync();
        return "redirect:/";
    }

    /** 지금 토큰을 버리지 않고 새로 로그인합니다. */
    @PostMapping("/login")
    public String login(Model model) {
        model.addAttribute("call", calls.run("""
                String token = new AccessApi(client).createAccessToken(username, password);
                client.setAccessToken(token);  // 화면에는 토큰 앞부분과 만료 시각만 보여 줍니다""", () -> {
            session.login();
            return Map.of("token", session.tokenPreview(), "expiresAt", String.valueOf(session.expiresAt()));
        }));
        model.addAttribute("resultOpen", false);
        return "fragments/call :: call";
    }
}
