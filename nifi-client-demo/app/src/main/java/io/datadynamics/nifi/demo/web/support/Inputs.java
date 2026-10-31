package io.datadynamics.nifi.demo.web.support;

import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 폼 입력을 클라이언트 인자로 바꾸고, 그 인자를 다시 Java 소스로 적어 줍니다. 결과 패널에 보이는 코드가
 * 실제로 실행한 코드와 같도록 하기 위해서입니다.
 */
public final class Inputs {
    private Inputs() {
    }

    /** 빈 문자열은 null. */
    public static String blank(String s) {
        return s == null || s.isBlank() ? null : s.trim();
    }

    /** "a, b,c" → [a, b, c]. */
    public static List<String> csv(String s) {
        if (blank(s) == null) {
            return List.of();
        }
        return Arrays.stream(s.split(",")).map(String::trim).filter(x -> !x.isEmpty()).collect(Collectors.toList());
    }

    /** 한 줄에 하나인 "k=v"(또는 ';'로 구분)를 순서가 있는 맵으로. 값에 '='가 있어도 됩니다. */
    public static Map<String, String> pairs(String s) {
        Map<String, String> out = new LinkedHashMap<>();
        if (blank(s) == null) {
            return out;
        }
        for (String part : s.split("[\\n;]")) {
            if (part.isBlank()) {
                continue;
            }
            int eq = part.indexOf('=');
            if (eq < 1) {
                throw new IllegalArgumentException("key=value 형식이어야 합니다: '" + part.trim() + "'");
            }
            out.put(part.substring(0, eq).trim(), part.substring(eq + 1).trim());
        }
        return out;
    }

    /** 형식이 틀리면 빈 맵. 코드 문자열을 만들 때 씁니다(실행 쪽에서 같은 입력이 예외를 던집니다). */
    public static Map<String, String> pairsOrEmpty(String s) {
        try {
            return pairs(s);
        } catch (IllegalArgumentException e) {
            return Map.of();
        }
    }

    /** Java 문자열 리터럴, 또는 {@code null}. */
    public static String q(String s) {
        if (s == null) {
            return "null";
        }
        return '"' + s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n") + '"';
    }

    /** 가변 인자용 {@code "a", "b"}. */
    public static String args(List<String> values) {
        return values.stream().map(Inputs::q).collect(Collectors.joining(", "));
    }

    /** {@code List.of("a", "b")}. */
    public static String listOf(List<String> values) {
        return "List.of(" + args(values) + ")";
    }

    /** {@code Map.of("k", "v", ...)} (보여 주기용이므로 10쌍을 넘어도 그대로 적습니다). */
    public static String mapOf(Map<String, String> m) {
        List<String> parts = new ArrayList<>();
        m.forEach((k, v) -> {
            parts.add(q(k));
            parts.add(q(v));
        });
        return "Map.of(" + String.join(", ", parts) + ")";
    }

    /** htmx에 "refresh" 이벤트를 보내, 변경 뒤 목록 영역이 다시 그려지게 합니다. */
    public static void refresh(HttpServletResponse response) {
        response.setHeader("HX-Trigger", "refresh");
    }
}
