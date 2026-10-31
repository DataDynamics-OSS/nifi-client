package io.datadynamics.nifi.demo.config;

import io.datadynamics.nifi.client.v2.ApiException;
import io.datadynamics.nifi.client.v2.api.FlowApi;
import io.datadynamics.nifi.client.v2.model.AboutDTO;
import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * {@code /actuator/health}의 {@code nifi} 항목입니다. {@code GET /flow/about}이 답하면 UP입니다.
 * 이 호출도 요청 기록 화면에 남습니다.
 */
@Component("nifi")
public class NifiHealthIndicator implements HealthIndicator {
    private final FlowApi flow;
    private final NifiProperties props;

    public NifiHealthIndicator(FlowApi flow, NifiProperties props) {
        this.flow = flow;
        this.props = props;
    }

    @Override
    public Health health() {
        try {
            AboutDTO about = flow.getAboutInfo().getAbout();
            return Health.up().withDetail("url", props.url()).withDetail("version", about.getVersion()).build();
        } catch (ApiException e) {
            return Health.down().withDetail("url", props.url()).withDetail("status", e.getCode())
                    .withDetail("error", e.getCause() != null ? e.getCause().toString() : String.valueOf(e.getMessage())).build();
        }
    }
}
