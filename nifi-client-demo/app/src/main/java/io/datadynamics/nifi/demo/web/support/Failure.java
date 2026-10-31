package io.datadynamics.nifi.demo.web.support;

import io.datadynamics.nifi.client.v2.ApiException;
import io.datadynamics.nifi.demo.trace.HttpAttempt;

import java.util.List;

/**
 * 사용자에게 보여 줄 형태로 바꾼 예외입니다.
 * <p>
 * 생성된 클라이언트는 모든 실패를 {@link ApiException} 하나로 던집니다. 무엇이 잘못됐는지는 예외 타입이 아니라
 * {@code getCode()}(HTTP 상태, 응답을 못 받았으면 0)와 {@code getResponseBody()}(NiFi가 보낸 오류 문장),
 * {@code getCause()}(연결 실패·시간 초과 같은 I/O 예외)로 구분해야 합니다. 이 화면은 그 세 가지를 나눠서 보여 줍니다.
 *
 * @param type          예외 클래스의 전체 이름
 * @param status        NiFi가 돌려준 HTTP 상태 코드(응답을 받았을 때만)
 * @param request       실패한 요청의 "메서드 경로"(기록된 시도가 있을 때만)
 * @param message       예외 메시지
 * @param serverMessage NiFi가 응답 본문에 담아 보낸 오류 메시지(있을 때만)
 * @param cause         원인 예외의 "클래스 이름: 메시지"(I/O 실패일 때)
 */
public record Failure(String type, Integer status, String request, String message, String serverMessage, String cause) {

    public static Failure of(Throwable e) {
        return of(e, List.of());
    }

    public static Failure of(Throwable e, List<HttpAttempt> attempts) {
        String request = attempts.stream().filter(HttpAttempt::failed).reduce((a, b) -> b)
                .map(a -> a.method() + " " + a.target()).orElse(null);
        String cause = e.getCause() == null ? null : e.getCause().getClass().getName()
                + (e.getCause().getMessage() == null ? "" : ": " + e.getCause().getMessage());
        if (e instanceof ApiException a) {
            Integer status = a.getCode() == 0 ? null : a.getCode();
            String body = a.getResponseBody() == null || a.getResponseBody().isBlank() ? null : a.getResponseBody().strip();
            String message = a.getMessage();
            if (message == null || message.isBlank()) {
                message = status != null ? "HTTP " + status : cause;
            }
            return new Failure(e.getClass().getName(), status, request, message, body, cause);
        }
        return new Failure(e.getClass().getName(), null, request, e.getMessage() != null ? e.getMessage() : e.toString(), null, cause);
    }

    /** 패키지를 뺀 예외 클래스 이름입니다. 예: {@code ApiException} */
    public String simpleType() {
        return type.substring(type.lastIndexOf('.') + 1);
    }
}
