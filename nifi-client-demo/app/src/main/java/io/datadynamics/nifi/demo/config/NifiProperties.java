package io.datadynamics.nifi.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Duration;

/**
 * {@code nifi.*} 설정입니다. 생성된 클라이언트에는 Spring Boot 스타터가 없으므로 이 앱이 직접 바인딩해
 * {@link NifiClientConfig}에서 {@code ApiClient} 빈을 만듭니다.
 *
 * @param url            NiFi REST API 주소(끝이 {@code /nifi-api})
 * @param username       single-user 로그인 사용자. 비우면 로그인하지 않습니다(HTTP 무인증 NiFi).
 * @param password       로그인 비밀번호
 * @param insecureTls    자체 서명 인증서를 검증 없이 받아들일지 여부(로컬 테스트 전용)
 * @param connectTimeout 연결 시간 제한
 * @param readTimeout    응답 읽기 시간 제한
 */
@ConfigurationProperties("nifi")
public record NifiProperties(String url, String username, String password,
                             @DefaultValue("false") boolean insecureTls,
                             @DefaultValue("10s") Duration connectTimeout,
                             @DefaultValue("60s") Duration readTimeout) {

    public boolean secured() {
        return username != null && !username.isBlank();
    }

    /** 대시보드에 보여 줄 인증 방식 설명입니다. */
    public String authDescription() {
        return secured() ? "single-user 로그인 (" + username + ") → Bearer JWT" : "없음 (HTTP 무인증)";
    }
}
