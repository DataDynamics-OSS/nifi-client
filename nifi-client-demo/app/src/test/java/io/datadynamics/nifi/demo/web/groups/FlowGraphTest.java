package io.datadynamics.nifi.demo.web.groups;

import io.datadynamics.nifi.client.v2.model.ConnectableDTO;
import io.datadynamics.nifi.client.v2.model.ConnectionDTO;
import io.datadynamics.nifi.client.v2.model.ConnectionEntity;
import io.datadynamics.nifi.client.v2.model.FlowDTO;
import io.datadynamics.nifi.client.v2.model.PortDTO;
import io.datadynamics.nifi.client.v2.model.PortEntity;
import io.datadynamics.nifi.client.v2.model.PositionDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupFlowDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorEntity;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowGraphTest {

    private static ProcessorEntity processor(String id, double x, double y) {
        return new ProcessorEntity().id(id).position(new PositionDTO().x(x).y(y))
                .component(new ProcessorDTO().name(id).type("org.apache.nifi.processors.standard.LogAttribute"));
    }

    private static ConnectionEntity connection(String id, String from, String fromGroup, String to, String toGroup) {
        return new ConnectionEntity().id(id).sourceId(from).sourceGroupId(fromGroup).destinationId(to).destinationGroupId(toGroup)
                .component(new ConnectionDTO().selectedRelationships(List.of("success"))
                        .source(new ConnectableDTO().id(from)).destination(new ConnectableDTO().id(to)));
    }

    @Test
    void connectsProcessorsAtBoxEdges() {
        ProcessGroupFlowDTO pg = new ProcessGroupFlowDTO().id("pg").flow(new FlowDTO()
                .processors(List.of(processor("a", 0, 0), processor("b", 0, 300)))
                .connections(List.of(connection("c", "a", "pg", "b", "pg"))));
        FlowGraph g = FlowGraph.of(pg);
        assertEquals(2, g.nodes().size());
        // a의 아래 변(y=128) 가운데에서 b의 위 변(y=300) 가운데로
        assertEquals("M176.0,128.0 L176.0,300.0", g.edges().getFirst().path());
        assertEquals("success", g.edges().getFirst().relationships());
        assertEquals("/queues/c", g.edges().getFirst().href());
    }

    @Test
    void attachesPortsInsideChildGroupToTheGroupBox() {
        ProcessGroupFlowDTO pg = new ProcessGroupFlowDTO().id("pg").flow(new FlowDTO()
                .processors(List.of(processor("a", 0, 0)))
                .processGroups(List.of(new ProcessGroupEntity().id("child").position(new PositionDTO().x(600d).y(0d))
                        .component(new ProcessGroupDTO().name("child"))))
                .outputPorts(List.of(new PortEntity().id("out").position(new PositionDTO().x(0d).y(400d)).component(new PortDTO().name("out"))))
                .connections(List.of(connection("c1", "a", "pg", "in-port", "child"), connection("c2", "a", "pg", "out", "pg"))));
        FlowGraph g = FlowGraph.of(pg);
        assertEquals(2, g.edges().size());
        // 하위 그룹 안의 포트(in-port)로 가는 선은 그룹 상자(x=600)의 왼쪽 변에서 끝납니다.
        assertEquals("M352.0,70.9 L600.0,80.5", g.edges().getFirst().path());
    }

    @Test
    void clipsToTheBoxBorder() {
        FlowGraph.Node n = new FlowGraph.Node("n", "processor", "n", "", null, "", 0, 0, 100, 50, null);
        assertArrayEquals(new double[]{100, 25}, FlowGraph.clip(n, new double[]{500, 25}));
        assertArrayEquals(new double[]{50, 0}, FlowGraph.clip(n, new double[]{50, -300}));
    }
}
