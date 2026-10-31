package io.datadynamics.nifi.demo.config;

import io.datadynamics.nifi.client.v2.ApiClient;
import io.datadynamics.nifi.client.v2.api.AccessApi;
import io.datadynamics.nifi.client.v2.api.ConnectionsApi;
import io.datadynamics.nifi.client.v2.api.ControllerServicesApi;
import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.api.FlowFileQueuesApi;
import io.datadynamics.nifi.client.v2.api.ParameterContextsApi;
import io.datadynamics.nifi.client.v2.api.ProcessGroupsApi;
import io.datadynamics.nifi.client.v2.api.ProcessorsApi;
import io.datadynamics.nifi.client.v2.api.ProvenanceApi;
import io.datadynamics.nifi.client.v2.api.ProvenanceEventsApi;
import io.datadynamics.nifi.client.v2.api.SystemDiagnosticsApi;
import io.datadynamics.nifi.client.v2.api.TenantsApi;
import io.datadynamics.nifi.demo.trace.SdkCalls;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.time.OffsetDateTime;

/**
 * 생성된 NiFi 클라이언트를 Spring 빈으로 만듭니다. 생성 코드에는 스타터가 없으므로, 실제 애플리케이션에서
 * 하게 될 구성을 여기서 직접 합니다.
 * <ul>
 *   <li>{@link ApiClient} 하나를 만들고, 그 OkHttp 클라이언트에 시간 제한, (선택) 자체 서명 인증서 허용,
 *       요청 기록 인터셉터({@link SdkCalls#install}), 토큰 재발급({@link NifiSession})을 붙입니다.</li>
 *   <li>Gson에 NiFi 날짜 형식을 읽는 어댑터({@link NifiDateTimeAdapter})를 넣습니다.</li>
 *   <li>API 클래스(FlowApi, ProcessorsApi …)는 모두 같은 ApiClient를 공유하는 빈입니다. 상태가 없으므로
 *       싱글턴으로 써도 됩니다.</li>
 * </ul>
 */
@Configuration(proxyBeanMethods = false)
public class NifiClientConfig {
    /** 요청 기록 화면과 메트릭에 보일 클라이언트 이름입니다. */
    public static final String CLIENT = "nifi";

    @Bean
    ApiClient nifiApiClient(NifiProperties props, SdkCalls calls, NifiSession session) {
        ApiClient client = new ApiClient().setBasePath(props.url());
        OkHttpClient.Builder http = client.getHttpClient().newBuilder()
                .connectTimeout(props.connectTimeout())
                .readTimeout(props.readTimeout());
        if (props.insecureTls()) {
            trustAll(http);
        }
        calls.install(http, CLIENT);
        if (props.secured()) {
            http.authenticator(session);
        }
        client.setHttpClient(http.build());
        // NiFi의 날짜 형식("MM/dd/yyyy HH:mm:ss.SSS z")을 읽도록 Gson을 고칩니다. NifiDateTimeAdapter 참고.
        client.getJSON().setGson(client.getJSON().getGson().newBuilder()
                .registerTypeAdapter(OffsetDateTime.class, new NifiDateTimeAdapter()).create());
        session.attach(client);
        return client;
    }

    @Bean
    AccessApi accessApi(ApiClient client) {
        return new AccessApi(client);
    }

    @Bean
    FlowApi flowApi(ApiClient client) {
        return new FlowApi(client);
    }

    @Bean
    ProcessGroupsApi processGroupsApi(ApiClient client) {
        return new ProcessGroupsApi(client);
    }

    @Bean
    ProcessorsApi processorsApi(ApiClient client) {
        return new ProcessorsApi(client);
    }

    @Bean
    ConnectionsApi connectionsApi(ApiClient client) {
        return new ConnectionsApi(client);
    }

    @Bean
    FlowFileQueuesApi flowFileQueuesApi(ApiClient client) {
        return new FlowFileQueuesApi(client);
    }

    @Bean
    ControllerServicesApi controllerServicesApi(ApiClient client) {
        return new ControllerServicesApi(client);
    }

    @Bean
    ParameterContextsApi parameterContextsApi(ApiClient client) {
        return new ParameterContextsApi(client);
    }

    @Bean
    ProvenanceApi provenanceApi(ApiClient client) {
        return new ProvenanceApi(client);
    }

    @Bean
    ProvenanceEventsApi provenanceEventsApi(ApiClient client) {
        return new ProvenanceEventsApi(client);
    }

    @Bean
    SystemDiagnosticsApi systemDiagnosticsApi(ApiClient client) {
        return new SystemDiagnosticsApi(client);
    }

    @Bean
    TenantsApi tenantsApi(ApiClient client) {
        return new TenantsApi(client);
    }

    /**
     * 모든 인증서와 호스트 이름을 받아들이게 합니다. NiFi 도커 이미지는 시작할 때마다 자체 서명 인증서를 새로 만들기
     * 때문입니다. okhttp4-gson 클라이언트에는 {@code setVerifyingSsl()}이 없으므로 OkHttp 빌더에서 직접 설정합니다.
     * 운영에서는 NiFi 인증서의 CA를 신뢰 저장소에 넣으세요.
     */
    public static void trustAll(OkHttpClient.Builder http) {
        try {
            X509TrustManager trustManager = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            SSLContext ssl = SSLContext.getInstance("TLS");
            ssl.init(null, new TrustManager[]{trustManager}, new SecureRandom());
            http.sslSocketFactory(ssl.getSocketFactory(), trustManager).hostnameVerifier((host, session) -> true);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
