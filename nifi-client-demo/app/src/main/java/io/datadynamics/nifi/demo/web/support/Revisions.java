package io.datadynamics.nifi.demo.web.support;

/**
 * NiFi의 낙관적 잠금(revision)에 쓰는 값입니다.
 * <p>
 * 변경 요청에는 컴포넌트의 현재 revision(version, clientId)을 함께 보내야 합니다. 삭제 API는 같은 값을 쿼리 파라미터
 * {@code version}, {@code clientId}로 받습니다. NiFi는 version이 낡았더라도 clientId가 마지막으로 고친 클라이언트와
 * 같으면 받아 주므로, 클라이언트(앱 인스턴스)마다 고유한 clientId를 쓰는 것이 좋습니다.
 */
public final class Revisions {
    /** 이 앱이 삭제 요청에 쓰는 clientId입니다. */
    public static final String CLIENT_ID = "nifi-client-demo";

    private Revisions() {
    }
}
