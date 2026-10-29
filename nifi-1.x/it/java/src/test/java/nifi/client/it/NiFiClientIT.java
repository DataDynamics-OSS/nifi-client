package nifi.client.it;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.AccessApi;
import io.swagger.client.api.FlowApi;
import io.swagger.client.api.ProcessGroupsApi;
import io.swagger.client.api.ProcessorsApi;
import io.swagger.client.model.AboutEntity;
import io.swagger.client.model.CurrentUserEntity;
import io.swagger.client.model.PositionDTO;
import io.swagger.client.model.ProcessGroupDTO;
import io.swagger.client.model.ProcessGroupEntity;
import io.swagger.client.model.ProcessorConfigDTO;
import io.swagger.client.model.ProcessorDTO;
import io.swagger.client.model.ProcessorEntity;
import io.swagger.client.model.ProcessorRunStatusEntity;
import io.swagger.client.model.RevisionDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Collections;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * 실행 중인 NiFi에 대한 통합 테스트.
 *
 * <pre>
 * NIFI_URL       예) http://localhost:8080/nifi-api, https://localhost:8443/nifi-api
 * NIFI_USERNAME  설정하면 /access/token 으로 로그인 후 Bearer 토큰 사용 (HTTPS)
 * NIFI_PASSWORD
 * </pre>
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NiFiClientIT {

    private static final String CLIENT_ID = "nifi-client-it-" + UUID.randomUUID();

    private final String url = env("NIFI_URL", "http://localhost:8080/nifi-api");
    private final String username = System.getenv("NIFI_USERNAME");
    private final String password = System.getenv("NIFI_PASSWORD");

    private ApiClient client;

    @BeforeAll
    void setUp() throws ApiException {
        client = newClient();
        if (isSecured()) {
            String token = new AccessApi(client).createAccessToken(username, password);
            assertNotNull(token);
            assertEquals(3, token.split("\\.").length, "JWT 형식이 아님: " + token);
            client.addDefaultHeader("Authorization", "Bearer " + token);
        }
    }

    @Test
    void about() throws ApiException {
        AboutEntity about = new FlowApi(client).getAboutInfo();
        assertEquals("1.28.1", about.getAbout().getVersion());
    }

    @Test
    void currentUser() throws ApiException {
        CurrentUserEntity user = new FlowApi(client).getCurrentUser();
        if (isSecured()) {
            assertEquals(username, user.getIdentity());
            assertFalse(user.isAnonymous());
        } else {
            assertTrue(user.isAnonymous());
        }
    }

    @Test
    void securedEndpointsRejectMissingOrBadCredentials() {
        assumeTrue(isSecured(), "HTTPS 로그인 모드에서만 의미 있음");
        ApiException noToken = assertThrows(ApiException.class, () -> new FlowApi(newClient()).getFlow("root", null));
        assertEquals(401, noToken.getCode());

        ApiException badLogin = assertThrows(ApiException.class,
                () -> new AccessApi(newClient()).createAccessToken(username, password + "-wrong"));
        assertEquals(400, badLogin.getCode());
    }

    @Test
    void processGroupAndProcessorLifecycle() throws Exception {
        FlowApi flowApi = new FlowApi(client);
        ProcessGroupsApi groupsApi = new ProcessGroupsApi(client);
        ProcessorsApi processorsApi = new ProcessorsApi(client);

        String rootId = flowApi.getFlow("root", null).getProcessGroupFlow().getId();
        assertNotNull(rootId);

        ProcessGroupEntity group = groupsApi.createProcessGroup(rootId, new ProcessGroupEntity()
                .revision(revision(0L))
                .component(new ProcessGroupDTO().name("nifi-client-it").position(position())), null);
        String groupId = group.getId();
        try {
            ProcessorEntity processor = groupsApi.createProcessor(groupId, new ProcessorEntity()
                    .revision(revision(0L))
                    .component(new ProcessorDTO()
                            .type("org.apache.nifi.processors.standard.GenerateFlowFile")
                            .name("generate")
                            .position(position())
                            .config(new ProcessorConfigDTO()
                                    .schedulingPeriod("10 sec")
                                    .autoTerminatedRelationships(Collections.singletonList("success")))));
            String processorId = processor.getId();
            assertEquals("10 sec", processor.getComponent().getConfig().getSchedulingPeriod());

            processor = processorsApi.updateProcessor(processorId, new ProcessorEntity()
                    .revision(processor.getRevision())
                    .component(new ProcessorDTO().id(processorId).name("generate-renamed")
                            .config(new ProcessorConfigDTO().schedulingPeriod("30 sec"))));
            assertEquals("generate-renamed", processor.getComponent().getName());
            assertEquals("30 sec", processor.getComponent().getConfig().getSchedulingPeriod());

            processor = waitForValid(processorsApi, processorId);

            processor = processorsApi.updateRunStatus(processorId, new ProcessorRunStatusEntity()
                    .revision(processor.getRevision()).state(ProcessorRunStatusEntity.StateEnum.RUNNING));
            assertEquals(ProcessorDTO.StateEnum.RUNNING, processor.getComponent().getState());

            processor = processorsApi.updateRunStatus(processorId, new ProcessorRunStatusEntity()
                    .revision(processor.getRevision()).state(ProcessorRunStatusEntity.StateEnum.STOPPED));
            assertEquals(ProcessorDTO.StateEnum.STOPPED, processor.getComponent().getState());

            processor = waitForStopped(processorsApi, processorId);
            processorsApi.deleteProcessor(processorId,
                    String.valueOf(processor.getRevision().getVersion()), CLIENT_ID, null);
        } finally {
            ProcessGroupEntity current = groupsApi.getProcessGroup(groupId);
            groupsApi.removeProcessGroup(groupId,
                    String.valueOf(current.getRevision().getVersion()), CLIENT_ID, null);
        }

        ApiException gone = assertThrows(ApiException.class, () -> groupsApi.getProcessGroup(groupId));
        assertEquals(404, gone.getCode());
    }

    private ProcessorEntity waitForValid(ProcessorsApi api, String id) throws Exception {
        for (int i = 0; i < 30; i++) {
            ProcessorEntity p = api.getProcessor(id);
            if (p.getComponent().getValidationStatus() == ProcessorDTO.ValidationStatusEnum.VALID) {
                return p;
            }
            Thread.sleep(500);
        }
        throw new AssertionError("processor did not become VALID: " + api.getProcessor(id).getComponent().getValidationErrors());
    }

    private ProcessorEntity waitForStopped(ProcessorsApi api, String id) throws Exception {
        for (int i = 0; i < 30; i++) {
            ProcessorEntity p = api.getProcessor(id);
            if (p.getStatus().getAggregateSnapshot().getActiveThreadCount() == 0) {
                return p;
            }
            Thread.sleep(500);
        }
        throw new AssertionError("processor threads did not stop");
    }

    private ApiClient newClient() {
        ApiClient c = new ApiClient().setBasePath(url);
        if (url.startsWith("https")) {
            // docker 이미지의 self-signed 인증서
            c.setVerifyingSsl(false);
        }
        return c;
    }

    private boolean isSecured() {
        return username != null && !username.isEmpty();
    }

    private static RevisionDTO revision(Long version) {
        return new RevisionDTO().version(version).clientId(CLIENT_ID);
    }

    private static PositionDTO position() {
        return new PositionDTO().x(0d).y(0d);
    }

    private static String env(String key, String def) {
        String v = System.getenv(key);
        return v == null || v.isEmpty() ? def : v;
    }
}
