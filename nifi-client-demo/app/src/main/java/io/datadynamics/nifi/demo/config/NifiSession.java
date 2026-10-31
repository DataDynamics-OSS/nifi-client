package io.datadynamics.nifi.demo.config;

import io.datadynamics.nifi.client.v2.ApiClient;
import io.datadynamics.nifi.client.v2.ApiException;
import io.datadynamics.nifi.client.v2.api.AccessApi;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * NiFi 로그인 상태(Bearer JWT)를 관리합니다.
 * <p>
 * 생성된 클라이언트는 토큰을 넣는 {@code ApiClient.setAccessToken()}만 있고, 언제 로그인할지는 정하지 않습니다.
 * 이 앱은 OkHttp {@link Authenticator}로 그 빈자리를 채웁니다: NiFi가 401을 돌려주면 {@code AccessApi.createAccessToken}
 * 으로 로그인해 새 토큰을 넣고, 같은 요청을 한 번 다시 보냅니다. 그래서 앱이 시작할 때 따로 로그인하지 않아도 되고,
 * 토큰이 만료(기본 12시간)되어도 호출하는 코드는 신경 쓰지 않습니다.
 */
@Component
public class NifiSession implements Authenticator {
    private static final Pattern EXP = Pattern.compile("\"exp\"\\s*:\\s*(\\d+)");

    private final NifiProperties props;
    private volatile ApiClient client;
    private volatile String token;
    private volatile Instant loggedInAt;
    private volatile Instant expiresAt;
    private volatile int logins;

    public NifiSession(NifiProperties props) {
        this.props = props;
    }

    void attach(ApiClient client) {
        this.client = client;
    }

    /** 로그인해 새 토큰을 받고 ApiClient에 넣습니다. 받은 토큰을 돌려줍니다. */
    public synchronized String login() throws ApiException {
        String t = new AccessApi(client).createAccessToken(props.username(), props.password());
        client.setAccessToken(t);
        token = t;
        loggedInAt = Instant.now();
        expiresAt = expiry(t);
        logins++;
        return t;
    }

    /** 장애 실험용: 토큰을 NiFi가 받아 주지 않는 값으로 바꿉니다. 다음 호출이 401 → 재로그인 → 재시도로 이어집니다. */
    public synchronized void invalidate() {
        token = "expired.demo.token";
        client.setAccessToken(token);
    }

    @Override
    public Request authenticate(Route route, Response response) throws IOException {
        if (!props.secured() || response.request().url().encodedPath().endsWith("/access/token")) {
            return null;   // 로그인 요청 자체가 거절되면 다시 시도하지 않습니다(틀린 비밀번호 등).
        }
        if (response.priorResponse() != null) {
            return null;   // 새 토큰으로 다시 보낸 요청도 401이면 포기합니다.
        }
        String sent = response.request().header("Authorization");
        String next;
        synchronized (this) {
            String current = token;
            if (current != null && sent != null && !sent.equals("Bearer " + current)) {
                next = current;    // 다른 스레드가 그사이 다시 로그인했습니다.
            } else {
                try {
                    next = login();
                } catch (ApiException e) {
                    throw new IOException("NiFi login failed: HTTP " + e.getCode() + " " + e.getResponseBody(), e);
                }
            }
        }
        return response.request().newBuilder().header("Authorization", "Bearer " + next).build();
    }

    /** JWT의 exp 클레임(초)을 읽습니다. 서명은 검증하지 않습니다(표시용). */
    private static Instant expiry(String jwt) {
        String[] parts = jwt.split("\\.");
        if (parts.length < 2) {
            return null;
        }
        try {
            String payload = new String(Base64.getUrlDecoder().decode(parts[1]), StandardCharsets.UTF_8);
            Matcher m = EXP.matcher(payload);
            return m.find() ? Instant.ofEpochSecond(Long.parseLong(m.group(1))) : null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public boolean hasToken() {
        return token != null;
    }

    /** 화면에 보여 줄 토큰 앞부분입니다. 토큰 전체는 보여 주지 않습니다. */
    public String tokenPreview() {
        String t = token;
        return t == null ? null : t.substring(0, Math.min(16, t.length())) + "…";
    }

    public Instant loggedInAt() {
        return loggedInAt;
    }

    public Instant expiresAt() {
        return expiresAt;
    }

    public int logins() {
        return logins;
    }
}
