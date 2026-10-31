package io.datadynamics.nifi.demo.trace;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/**
 * 화면이 실행하는 클라이언트 호출을 대신 실행하고, 그 호출이 한 일을 기록합니다.
 *
 * <pre>{@code
 * SdkCall call = calls.run("processors.getProcessor(\"" + id + "\")", () -> processors.getProcessor(id));
 * }</pre>
 *
 * 코드 문자열은 호출 옆에 손으로 적어 두므로, 화면에는 개발자가 실제로 쓸 코드가 그대로 보입니다.
 * HTTP 시도는 {@link #install}로 OkHttp 클라이언트에 붙인 인터셉터가 모읍니다. 생성된 클라이언트의 동기 메서드는
 * 호출한 스레드에서 OkHttp를 실행하므로 {@code run} 안에서 일어난 시도는 그 호출의 것입니다. 같은 이유로 웹 요청
 * 하나를 처리하는 동안 보낸 시도는 {@link #beginPage()}의 목록에 모이고({@link TraceInterceptor}), 헬스 체크와
 * 시더가 보낸 것까지 모든 시도는 크기가 제한된 전체 이력(요청 기록 화면)에 쌓입니다.
 */
@Component
public class SdkCalls {
    /** HTTP 시도마다 하나씩 기록하는 Micrometer 타이머 이름입니다. */
    public static final String REQUESTS = "nifi.client.requests";
    /** 같은 API 호출 안의 두 번째 이후 시도(토큰 재발급 후 재전송) 횟수입니다. */
    public static final String RETRIES = "nifi.client.retries";

    private static final int MAX_CALLS = 100;
    private static final int MAX_ATTEMPTS = 300;
    /** 요청·응답 본문을 보관할 최대 글자 수입니다. 넘는 부분은 잘라 냅니다. */
    static final int MAX_BODY_LENGTH = 20_000;
    private static final Pattern FORM_PASSWORD = Pattern.compile("(password=)[^&]*");
    private static final Pattern JSON_PASSWORD = Pattern.compile("(\"password\"\\s*:\\s*\")[^\"]*");

    private final ThreadLocal<List<HttpAttempt>> current = new ThreadLocal<>();
    private final ThreadLocal<List<HttpAttempt>> page = new ThreadLocal<>();
    /** API 메서드 호출 하나(OkHttp Call 하나)의 상태: [0] 시도 수, [1] 마지막 시도가 응답 없이 실패했으면 1. */
    private final ThreadLocal<int[]> callState = new ThreadLocal<>();
    private final Deque<SdkCall> recentCalls = new ArrayDeque<>();
    private final Deque<HttpAttempt> recentAttempts = new ArrayDeque<>();
    private final AtomicLong sequence = new AtomicLong();
    private final ObjectProvider<MeterRegistry> registry;

    public SdkCalls(ObjectProvider<MeterRegistry> registry) {
        this.registry = registry;
    }

    /** 현재 스레드(웹 요청)가 보내는 시도를 모으기 시작합니다. 돌려준 목록에는 이후 시도가 계속 추가됩니다. */
    public List<HttpAttempt> beginPage() {
        List<HttpAttempt> attempts = new ArrayList<>();
        page.set(attempts);
        return attempts;
    }

    /** 현재 스레드의 수집을 끝냅니다. 스레드 풀에서 재사용될 스레드에 목록이 남지 않도록 반드시 호출해야 합니다. */
    public void endPage() {
        page.remove();
    }

    public SdkCall run(String code, Callable<?> call) {
        List<HttpAttempt> attempts = new ArrayList<>();
        List<HttpAttempt> outer = current.get();
        current.set(attempts);
        Instant at = Instant.now();
        long start = System.nanoTime();
        Object result = null;
        Throwable error = null;
        try {
            result = call.call();
        } catch (Exception e) {
            error = e;
        } finally {
            current.set(outer);
            if (outer != null) {
                outer.addAll(attempts);
            }
        }
        SdkCall done = new SdkCall(at, code, result, error, List.copyOf(attempts), (System.nanoTime() - start) / 1_000_000);
        synchronized (recentCalls) {
            recentCalls.addFirst(done);
            while (recentCalls.size() > MAX_CALLS) {
                recentCalls.removeLast();
            }
        }
        return done;
    }

    /** 반환값이 없는 호출(예: 결과를 쓰지 않는 삭제)에 씁니다. */
    public SdkCall runVoid(String code, ThrowingRunnable call) {
        return run(code, () -> {
            call.run();
            return null;
        });
    }

    public List<SdkCall> recentCalls() {
        synchronized (recentCalls) {
            return List.copyOf(recentCalls);
        }
    }

    public List<HttpAttempt> recentAttempts() {
        synchronized (recentAttempts) {
            return List.copyOf(recentAttempts);
        }
    }

    public void clear() {
        synchronized (recentCalls) {
            recentCalls.clear();
        }
        synchronized (recentAttempts) {
            recentAttempts.clear();
        }
    }

    /**
     * OkHttp 빌더에 기록용 인터셉터 두 개를 붙입니다. {@code client}는 요청 기록에 보일 클라이언트 이름입니다.
     * <ul>
     *   <li>네트워크 인터셉터: 실제로 서버에 나간 요청마다 불립니다. 401 → (Authenticator가 다시 로그인) → 재전송처럼
     *       OkHttp가 내부에서 다시 보낸 요청도 따로 보입니다.</li>
     *   <li>애플리케이션 인터셉터: API 메서드 호출마다 한 번 불립니다. 시도 번호를 세고, 연결 자체가 안 되어
     *       네트워크 인터셉터까지 가지 못한 실패(호스트를 찾을 수 없음 등)를 기록합니다. 응답 본문을 그대로 보려고
     *       gzip 응답을 받지 않도록 {@code Accept-Encoding: identity}를 붙입니다.</li>
     * </ul>
     */
    public void install(OkHttpClient.Builder http, String client) {
        http.addInterceptor(chain -> {
            int[] outer = callState.get();
            int[] state = new int[2];
            callState.set(state);
            Request request = chain.request().newBuilder().header("Accept-Encoding", "identity").build();
            Instant at = Instant.now();
            long start = System.nanoTime();
            try {
                return chain.proceed(request);
            } catch (IOException | RuntimeException e) {
                if (state[1] == 0) {
                    record(client, request, at, start, state[0] + 1, null, describe(e), requestBody(request), null);
                }
                throw e;
            } finally {
                callState.set(outer);
            }
        });
        http.addNetworkInterceptor(chain -> {
            int[] state = callState.get();
            int attempt = state == null ? 1 : ++state[0];
            Request request = chain.request();
            String requestBody = requestBody(request);
            Instant at = Instant.now();
            long start = System.nanoTime();
            try {
                Response response = chain.proceed(request);
                String body = responseBody(response);
                if (body != null && request.url().encodedPath().endsWith("/access/token")) {
                    body = body.substring(0, Math.min(16, body.length())) + "… (토큰은 앞부분만 기록)";
                }
                record(client, request, at, start, attempt, response.code(), null, requestBody, body);
                if (state != null) {
                    state[1] = 0;
                }
                return response;
            } catch (IOException | RuntimeException e) {
                record(client, request, at, start, attempt, null, describe(e), requestBody, null);
                if (state != null) {
                    state[1] = 1;
                }
                throw e;
            }
        });
    }

    private void record(String client, Request request, Instant at, long start, int attempt, Integer status, String error,
                        String requestBody, String responseBody) {
        long elapsedNanos = System.nanoTime() - start;
        HttpAttempt a = new HttpAttempt(sequence.incrementAndGet(), at, client, request.method(), URI.create(request.url().toString()),
                attempt, status, error, elapsedNanos / 1_000_000, requestBody, responseBody);
        List<HttpAttempt> sink = current.get();
        if (sink != null) {
            sink.add(a);
        }
        List<HttpAttempt> pageSink = page.get();
        if (pageSink != null) {
            pageSink.add(a);
        }
        synchronized (recentAttempts) {
            recentAttempts.addFirst(a);
            while (recentAttempts.size() > MAX_ATTEMPTS) {
                recentAttempts.removeLast();
            }
        }
        MeterRegistry r = registry.getIfAvailable();
        if (r != null) {
            String outcome = status == null ? "IO_ERROR" : status < 400 ? "SUCCESS" : status < 500 ? "CLIENT_ERROR" : "SERVER_ERROR";
            Timer.builder(REQUESTS).description("HTTP attempts sent by the NiFi client")
                    .tag("client", client).tag("method", request.method())
                    .tag("status", status == null ? "none" : String.valueOf(status)).tag("outcome", outcome)
                    .register(r).record(Duration.ofNanos(elapsedNanos));
            if (attempt > 1) {
                Counter.builder(RETRIES).description("Requests sent again within one API call (after re-login)")
                        .tag("client", client).tag("method", request.method()).register(r).increment();
            }
        }
    }

    private static String describe(Throwable e) {
        return e.getClass().getSimpleName() + (e.getMessage() == null ? "" : ": " + e.getMessage());
    }

    /** 요청 본문을 글자로 읽습니다. 비밀번호는 가립니다. 파일 업로드(multipart)는 본문 전체를 그대로 보여 줍니다. */
    private static String requestBody(Request request) {
        RequestBody body = request.body();
        if (body == null) {
            return null;
        }
        try {
            if (body.isOneShot() || body.contentLength() == 0) {
                return null;
            }
            Buffer buffer = new Buffer();
            body.writeTo(buffer);
            return truncate(mask(buffer.readString(StandardCharsets.UTF_8)));
        } catch (IOException e) {
            return "(본문을 읽지 못함: " + e + ")";
        }
    }

    /** 응답 본문을 소비하지 않고 앞부분만 엿봅니다. 글자가 아닌 본문(파일 내용 등)은 크기만 적습니다. */
    private static String responseBody(Response response) throws IOException {
        if (response.body() == null) {
            return null;
        }
        MediaType type = response.body().contentType();
        if (type != null && !isText(type)) {
            long length = response.body().contentLength();
            return "(" + type + (length >= 0 ? ", " + length + " bytes" : "") + ")";
        }
        String text = response.peekBody(MAX_BODY_LENGTH * 4L).string();
        return text.isEmpty() ? null : truncate(text);
    }

    private static boolean isText(MediaType type) {
        String sub = type.subtype();
        return "text".equals(type.type()) || sub.contains("json") || sub.contains("xml") || sub.contains("x-www-form-urlencoded");
    }

    static String mask(String body) {
        return JSON_PASSWORD.matcher(FORM_PASSWORD.matcher(body).replaceAll("$1*****")).replaceAll("$1*****");
    }

    /** 본문이 너무 길면 앞부분만 남기고, 잘린 글자 수를 끝에 덧붙입니다. 화면과 메모리 사용량을 제한하기 위해서입니다. */
    private static String truncate(String body) {
        if (body == null || body.length() <= MAX_BODY_LENGTH) {
            return body;
        }
        return body.substring(0, MAX_BODY_LENGTH) + "\n... (" + (body.length() - MAX_BODY_LENGTH) + "자 더 있음)";
    }

    @FunctionalInterface
    public interface ThrowingRunnable {
        void run() throws Exception;
    }
}
