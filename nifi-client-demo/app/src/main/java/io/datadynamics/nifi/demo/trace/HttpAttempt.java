package io.datadynamics.nifi.demo.trace;

import java.net.URI;
import java.time.Instant;

/**
 * NiFi 클라이언트가 보낸 HTTP 시도 하나를 기록한 값입니다. 401을 받고 다시 로그인한 뒤 같은 요청을 다시 보내면
 * 시도마다 따로 기록됩니다.
 *
 * @param id           기록 순서대로 1부터 매기는 일련번호
 * @param client       요청을 보낸 클라이언트 이름(nifi, lab-…)
 * @param uri          쿼리 문자열을 포함한 전체 URI
 * @param attempt      같은 API 메서드 호출 안에서 몇 번째 시도인지(1부터). 토큰을 다시 받아 재전송하면 2입니다.
 * @param status       HTTP 상태 코드. 응답을 받지 못했으면 null
 * @param error        응답을 받지 못했을 때의 실패 내용("예외 클래스 이름: 메시지")
 * @param requestBody  요청 본문(비밀번호는 가리고, 길면 잘림). 없으면 null
 * @param responseBody 응답 본문(길면 잘림). 없으면 null
 */
public record HttpAttempt(long id, Instant at, String client, String method, URI uri, int attempt,
                          Integer status, String error, long elapsedMs,
                          String requestBody, String responseBody) {

    public boolean failed() {
        return error != null || status == null || status >= 400;
    }

    /** 경로와 쿼리 문자열. 표에서 짧게 보여 줄 때 씁니다. */
    public String target() {
        String q = uri.getRawQuery();
        return uri.getRawPath() + (q == null ? "" : "?" + q);
    }

    public String origin() {
        return uri.getScheme() + "://" + uri.getAuthority();
    }

    /** 요청 본문을 Monaco에서 어떤 언어로 보여 줄지: JSON처럼 보이면 json, 아니면 text. */
    public String requestLang() {
        return lang(requestBody);
    }

    public String responseLang() {
        return lang(responseBody);
    }

    private static String lang(String body) {
        String t = body == null ? "" : body.stripLeading();
        return t.startsWith("{") || t.startsWith("[") ? "json" : "text";
    }
}
