package io.datadynamics.nifi.demo.web.lab;

import io.datadynamics.nifi.client.v2.ApiClient;
import io.datadynamics.nifi.client.v2.api.AccessApi;
import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.demo.config.NifiClientConfig;
import io.datadynamics.nifi.demo.config.NifiProperties;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Component;

import java.time.Duration;

/**
 * 장애 실험용으로 일부러 잘못 설정한 클라이언트들입니다. 앱의 {@code ApiClient} 빈과 같은 주소·TLS 설정으로 따로 만들고,
 * 다른 데모 클라이언트처럼 요청을 기록합니다. 빈으로 등록하지 않는 것은, 같은 타입의 빈이 둘이면 주입이 모호해지기 때문입니다.
 */
@Component
public class LabClients {
    /** 절대 풀리지 않는 호스트 이름(.invalid는 예약됨)이라, 아무것도 보내기 전에 실패합니다. */
    public static final String DEAD_URL = "https://nifi-down.invalid:8443/nifi-api";

    /** 토큰 없이 보내는 클라이언트(401, 틀린 비밀번호 로그인). */
    final ApiClient noToken;
    /** 읽기 시간 제한이 1ms인 클라이언트. */
    final ApiClient slow;
    /** 연결할 수 없는 주소의 클라이언트. */
    final ApiClient unreachable;

    public LabClients(NifiProperties props, SdkCalls calls) {
        noToken = build(props.url(), props, calls, "lab-401", Duration.ZERO);
        slow = build(props.url(), props, calls, "lab-timeout", Duration.ofMillis(1));
        unreachable = build(DEAD_URL, props, calls, "lab-unreachable", Duration.ZERO);
    }

    FlowApi flow(ApiClient client) {
        return new FlowApi(client);
    }

    AccessApi access(ApiClient client) {
        return new AccessApi(client);
    }

    private static ApiClient build(String url, NifiProperties props, SdkCalls calls, String name, Duration readTimeout) {
        ApiClient client = new ApiClient().setBasePath(url);
        OkHttpClient.Builder http = client.getHttpClient().newBuilder()
                .connectTimeout(props.connectTimeout())
                .readTimeout(readTimeout.isZero() ? props.readTimeout() : readTimeout);
        if (props.insecureTls()) {
            NifiClientConfig.trustAll(http);
        }
        calls.install(http, name);
        return client.setHttpClient(http.build());
    }
}
