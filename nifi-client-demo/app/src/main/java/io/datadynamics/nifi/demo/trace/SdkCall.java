package io.datadynamics.nifi.demo.trace;

import io.datadynamics.nifi.client.v2.ApiException;
import io.datadynamics.nifi.demo.web.support.Failure;

import java.time.Instant;
import java.util.List;

/**
 * 데모가 실행한 클라이언트 호출 하나의 결과입니다: 실행한 Java 코드, 그 호출이 보낸 모든 HTTP 시도,
 * 그리고 결과나 던진 예외.
 */
public record SdkCall(Instant at, String code, Object result, Throwable error, List<HttpAttempt> attempts, long elapsedMs) {

    public boolean ok() {
        return error == null;
    }

    public String errorType() {
        return error == null ? null : error.getClass().getSimpleName();
    }

    /** 예외 클래스의 전체 이름입니다(템플릿에서는 java.* 객체의 메서드를 부를 수 없습니다). */
    public String errorClass() {
        return error == null ? null : error.getClass().getName();
    }

    public String resultType() {
        return result == null ? null : result.getClass().getSimpleName();
    }

    public String errorMessage() {
        return error == null ? null : Failure.of(error, attempts).message();
    }

    /** 생성된 클라이언트의 예외일 때 그 예외(HTTP 상태와 응답 본문을 담고 있음). */
    public ApiException apiError() {
        return error instanceof ApiException e ? e : null;
    }

    /** 화면에 보여 줄 실패 정보. 성공했으면 null. */
    public Failure failure() {
        return error == null ? null : Failure.of(error, attempts);
    }

    /** 호출이 성공했을 때의 결과입니다. */
    @SuppressWarnings("unchecked")
    public <T> T value() {
        return (T) result;
    }
}
