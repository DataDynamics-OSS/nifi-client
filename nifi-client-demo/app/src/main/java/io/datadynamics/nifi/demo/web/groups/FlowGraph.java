package io.datadynamics.nifi.demo.web.groups;

import io.datadynamics.nifi.client.v2.model.ConnectionEntity;
import io.datadynamics.nifi.client.v2.model.ConnectionStatusSnapshotDTO;
import io.datadynamics.nifi.client.v2.model.FlowDTO;
import io.datadynamics.nifi.client.v2.model.FunnelEntity;
import io.datadynamics.nifi.client.v2.model.PortEntity;
import io.datadynamics.nifi.client.v2.model.PositionDTO;
import io.datadynamics.nifi.client.v2.model.ProcessGroupEntity;
import io.datadynamics.nifi.client.v2.model.ProcessGroupFlowDTO;
import io.datadynamics.nifi.client.v2.model.ProcessorEntity;
import io.datadynamics.nifi.client.v2.model.RemoteProcessGroupEntity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * {@code flow.getFlow(id)} 결과 하나로 그룹의 캔버스를 SVG로 그리기 위한 도형입니다.
 *
 * <p>컴포넌트 위치는 NiFi UI 캔버스의 좌표({@code entity.getPosition()}, 상자의 왼쪽 위)를 그대로 쓰고, 상자 크기는
 * NiFi UI와 같게 둡니다. 연결은 출발 상자의 중심에서 꺾는 점({@code getBends()})을 지나 도착 상자의 중심으로 가는 선을
 * 상자 테두리에서 자른 것입니다. 출발·도착이 하위 그룹 안의 포트이면 그 하위 그룹 상자에 붙입니다.</p>
 */
public record FlowGraph(List<Node> nodes, List<Edge> edges, String viewBox, double width, double height) {

    /** 화면에 그릴 상자 하나입니다. {@code kind}는 CSS 클래스로도 씁니다. */
    public record Node(String id, String kind, String name, String detail, String state, String stats,
                       double x, double y, double w, double h, String href) {
        double cx() {
            return x + w / 2;
        }

        double cy() {
            return y + h / 2;
        }
    }

    /** 연결 하나: SVG path, 이름표 위치와 글자, 큐에 FlowFile이 있는지. */
    public record Edge(String id, String path, double labelX, double labelY, String relationships, String queued,
                       boolean hasQueued, String href) {
    }

    private static final double PAD = 40;
    private static final double LABEL_W = 180;

    public static FlowGraph of(ProcessGroupFlowDTO pg) {
        FlowDTO f = pg.getFlow();
        Map<String, Node> nodes = new LinkedHashMap<>();
        for (ProcessGroupEntity g : nz(f.getProcessGroups())) {
            String name = g.getComponent() != null ? g.getComponent().getName() : g.getId();
            String stats = "실행 " + nz(g.getRunningCount()) + " · 정지 " + nz(g.getStoppedCount()) + " · 잘못됨 " + nz(g.getInvalidCount());
            String queued = g.getStatus() != null && g.getStatus().getAggregateSnapshot() != null ? g.getStatus().getAggregateSnapshot().getQueued() : null;
            put(nodes, new Node(g.getId(), "group", name, "프로세스 그룹", nz(g.getInvalidCount()) > 0 ? "INVALID" : null,
                    stats + (queued != null ? " · 큐 " + queued : ""), x(g.getPosition()), y(g.getPosition()), 384, 176, "/groups/" + g.getId()));
        }
        for (ProcessorEntity p : nz(f.getProcessors())) {
            String name = p.getComponent() != null ? p.getComponent().getName() : p.getId();
            String type = p.getComponent() != null ? simpleType(p.getComponent().getType()) : "";
            String state = p.getComponent() == null ? null
                    : "INVALID".equals(String.valueOf(p.getComponent().getValidationStatus())) ? "INVALID" : String.valueOf(p.getComponent().getState());
            String stats = p.getStatus() != null && p.getStatus().getAggregateSnapshot() != null
                    ? "입력 " + p.getStatus().getAggregateSnapshot().getInput() + " · 출력 " + p.getStatus().getAggregateSnapshot().getOutput() : "";
            put(nodes, new Node(p.getId(), "processor", name, type, state, stats, x(p.getPosition()), y(p.getPosition()), 352, 128,
                    "/processors/" + p.getId()));
        }
        for (PortEntity port : nz(f.getInputPorts())) {
            put(nodes, port(port, "input-port", "입력 포트"));
        }
        for (PortEntity port : nz(f.getOutputPorts())) {
            put(nodes, port(port, "output-port", "출력 포트"));
        }
        for (FunnelEntity fn : nz(f.getFunnels())) {
            put(nodes, new Node(fn.getId(), "funnel", "funnel", "", null, "", x(fn.getPosition()), y(fn.getPosition()), 48, 48, null));
        }
        for (RemoteProcessGroupEntity r : nz(f.getRemoteProcessGroups())) {
            String name = r.getComponent() != null ? r.getComponent().getName() : r.getId();
            String target = r.getComponent() != null ? r.getComponent().getTargetUris() : "";
            put(nodes, new Node(r.getId(), "remote-group", name, "원격 프로세스 그룹", null, target, x(r.getPosition()), y(r.getPosition()), 384, 176, null));
        }

        List<Edge> edges = new ArrayList<>();
        for (ConnectionEntity c : nz(f.getConnections())) {
            Node from = endpoint(nodes, c.getSourceId(), c.getSourceGroupId());
            Node to = endpoint(nodes, c.getDestinationId(), c.getDestinationGroupId());
            if (from != null && to != null) {
                edges.add(edge(c, from, to));
            }
        }

        // 그림 전체를 감싸는 영역. 연결 이름표와 꺾는 점도 포함합니다.
        double minX = Double.MAX_VALUE, minY = Double.MAX_VALUE, maxX = -Double.MAX_VALUE, maxY = -Double.MAX_VALUE;
        for (Node n : nodes.values()) {
            minX = Math.min(minX, n.x());
            minY = Math.min(minY, n.y());
            maxX = Math.max(maxX, n.x() + n.w());
            maxY = Math.max(maxY, n.y() + n.h());
        }
        for (Edge e : edges) {
            minX = Math.min(minX, e.labelX() - LABEL_W / 2);
            minY = Math.min(minY, e.labelY() - 24);
            maxX = Math.max(maxX, e.labelX() + LABEL_W / 2);
            maxY = Math.max(maxY, e.labelY() + 24);
        }
        for (ConnectionEntity c : nz(f.getConnections())) {
            for (PositionDTO b : nz(c.getBends())) {
                minX = Math.min(minX, x(b));
                minY = Math.min(minY, y(b));
                maxX = Math.max(maxX, x(b));
                maxY = Math.max(maxY, y(b));
            }
        }
        if (nodes.isEmpty()) {
            return new FlowGraph(List.of(), List.of(), "0 0 400 100", 400, 100);
        }
        double w = maxX - minX + 2 * PAD, h = maxY - minY + 2 * PAD;
        return new FlowGraph(List.copyOf(nodes.values()), edges,
                fmt(minX - PAD) + " " + fmt(minY - PAD) + " " + fmt(w) + " " + fmt(h), w, h);
    }

    private static Node port(PortEntity port, String kind, String label) {
        String name = port.getComponent() != null ? port.getComponent().getName() : port.getId();
        String state = port.getComponent() != null ? String.valueOf(port.getComponent().getState()) : null;
        return new Node(port.getId(), kind, name, label, state, "", x(port.getPosition()), y(port.getPosition()), 240, 48, null);
    }

    /** 이 그룹에 바로 있는 컴포넌트면 그 상자, 하위(또는 원격) 그룹의 포트면 그 그룹 상자입니다. */
    private static Node endpoint(Map<String, Node> nodes, String id, String groupId) {
        Node n = nodes.get(id);
        return n != null ? n : nodes.get(groupId);
    }

    private static Edge edge(ConnectionEntity c, Node from, Node to) {
        List<double[]> bends = new ArrayList<>();
        for (PositionDTO b : nz(c.getBends())) {
            bends.add(new double[]{x(b), y(b)});
        }
        String path;
        double lx, ly;
        if (from == to && bends.isEmpty()) {
            // 자기 자신으로 돌아오는 연결(예: retry)인데 꺾는 점이 없으면 오른쪽으로 고리를 그립니다.
            double sx = from.x() + from.w(), sy = from.cy() - 20, ey = from.cy() + 20, ox = sx + 70;
            path = "M" + fmt(sx) + "," + fmt(sy) + " C" + fmt(ox) + "," + fmt(sy - 50) + " " + fmt(ox) + "," + fmt(ey + 50) + " " + fmt(sx) + "," + fmt(ey);
            lx = ox + LABEL_W / 2 - 20;
            ly = from.cy();
        } else {
            List<double[]> pts = new ArrayList<>();
            double[] firstTarget = bends.isEmpty() ? new double[]{to.cx(), to.cy()} : bends.getFirst();
            double[] lastSource = bends.isEmpty() ? new double[]{from.cx(), from.cy()} : bends.getLast();
            pts.add(clip(from, firstTarget));
            pts.addAll(bends);
            pts.add(clip(to, lastSource));
            StringBuilder d = new StringBuilder();
            for (int i = 0; i < pts.size(); i++) {
                d.append(i == 0 ? "M" : " L").append(fmt(pts.get(i)[0])).append(',').append(fmt(pts.get(i)[1]));
            }
            path = d.toString();
            // NiFi UI처럼 꺾는 점이 있으면 그 점에, 없으면 가운데에 이름표를 둡니다.
            int li = c.getLabelIndex() != null && c.getLabelIndex() < bends.size() ? c.getLabelIndex() : 0;
            if (!bends.isEmpty()) {
                lx = bends.get(li)[0];
                ly = bends.get(li)[1];
            } else {
                lx = (pts.getFirst()[0] + pts.getLast()[0]) / 2;
                ly = (pts.getFirst()[1] + pts.getLast()[1]) / 2;
            }
        }
        String relationships = c.getComponent() != null && c.getComponent().getSelectedRelationships() != null
                && !c.getComponent().getSelectedRelationships().isEmpty()
                ? String.join(", ", c.getComponent().getSelectedRelationships())
                : c.getComponent() != null && c.getComponent().getName() != null && !c.getComponent().getName().isBlank() ? c.getComponent().getName() : "";
        ConnectionStatusSnapshotDTO s = c.getStatus() != null ? c.getStatus().getAggregateSnapshot() : null;
        String queued = s != null && s.getQueued() != null ? s.getQueued() : "";
        boolean hasQueued = s != null && s.getFlowFilesQueued() != null && s.getFlowFilesQueued() > 0;
        return new Edge(c.getId(), path, lx, ly, relationships, queued, hasQueued, "/queues/" + c.getId());
    }

    /** 상자 중심에서 {@code toward} 쪽으로 그은 선이 상자 테두리와 만나는 점입니다. */
    static double[] clip(Node n, double[] toward) {
        double dx = toward[0] - n.cx(), dy = toward[1] - n.cy();
        if (dx == 0 && dy == 0) {
            return new double[]{n.cx(), n.cy()};
        }
        double t = Math.min(dx == 0 ? Double.MAX_VALUE : (n.w() / 2) / Math.abs(dx),
                dy == 0 ? Double.MAX_VALUE : (n.h() / 2) / Math.abs(dy));
        t = Math.min(t, 1);
        return new double[]{n.cx() + dx * t, n.cy() + dy * t};
    }

    private static void put(Map<String, Node> nodes, Node n) {
        nodes.put(n.id(), n);
    }

    private static String simpleType(String type) {
        return type == null ? "" : type.substring(type.lastIndexOf('.') + 1);
    }

    private static double x(PositionDTO p) {
        return p != null && p.getX() != null ? p.getX() : 0;
    }

    private static double y(PositionDTO p) {
        return p != null && p.getY() != null ? p.getY() : 0;
    }

    private static int nz(Integer i) {
        return i == null ? 0 : i;
    }

    private static <T> List<T> nz(List<T> list) {
        return list == null ? List.of() : list;
    }

    static String fmt(double v) {
        return String.format(Locale.ROOT, "%.1f", v);
    }
}
