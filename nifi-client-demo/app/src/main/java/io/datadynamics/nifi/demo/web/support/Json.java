package io.datadynamics.nifi.demo.web.support;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import io.datadynamics.nifi.client.v2.ApiClient;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;

/**
 * 템플릿({@code ${@json.pretty(x)}})과 컨트롤러가 쓰는 JSON 도우미입니다. 생성된 클라이언트의 Gson 설정을 그대로
 * 쓰므로, 화면의 JSON은 실제로 오가는 JSON과 같은 모양입니다.
 */
@Component("json")
public class Json {
    private final ApiClient client;
    private final Gson pretty;

    public Json(ApiClient client) {
        this.client = client;
        this.pretty = client.getJSON().getGson().newBuilder().setPrettyPrinting().create();
    }

    public String pretty(Object value) {
        if (value == null) {
            return "";
        }
        if (value instanceof String s) {
            String t = s.stripLeading();
            if (!t.startsWith("{") && !t.startsWith("[")) {
                return s;
            }
            try {
                return pretty.toJson(JsonParser.parseString(s));
            } catch (RuntimeException e) {
                return s;
            }
        }
        try {
            return pretty.toJson(value);
        } catch (RuntimeException e) {
            return String.valueOf(value);
        }
    }

    public <T> T read(String json, Type type) {
        return client.getJSON().deserialize(json, type);
    }
}
