package io.datadynamics.nifi.demo.config;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * {@link OffsetDateTime} 필드를 NiFi가 실제로 보내는 형식으로 읽습니다.
 * <p>
 * 생성된 클라이언트의 Gson은 날짜를 ISO-8601로만 읽는데, NiFi는 비동기 요청 DTO의 {@code submissionTime},
 * {@code lastUpdated} 등을 {@code "10/31/2026 06:49:58.970 UTC"} 형식으로 보냅니다. 그대로 두면
 * {@code ParameterContextUpdateRequestEntity} 같은 응답을 읽다가 {@code DateTimeParseException}이 납니다.
 * 이 어댑터는 ISO-8601, NiFi 형식, epoch 밀리초를 모두 받아들이고, 쓸 때는 ISO-8601로 씁니다.
 */
public class NifiDateTimeAdapter extends TypeAdapter<OffsetDateTime> {
    private static final DateTimeFormatter NIFI = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss.SSS z");

    @Override
    public void write(JsonWriter out, OffsetDateTime value) throws IOException {
        if (value == null) {
            out.nullValue();
        } else {
            out.value(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(value));
        }
    }

    @Override
    public OffsetDateTime read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        String text = in.nextString();
        try {
            return OffsetDateTime.parse(text.endsWith("+0000") ? text.substring(0, text.length() - 5) + "Z" : text);
        } catch (DateTimeParseException iso) {
            try {
                return ZonedDateTime.parse(text, NIFI).toOffsetDateTime();
            } catch (DateTimeParseException nifi) {
                try {
                    return Instant.ofEpochMilli(Long.parseLong(text)).atOffset(ZoneOffset.UTC);
                } catch (NumberFormatException notMillis) {
                    throw new IOException("Unrecognized date-time: " + text, iso);
                }
            }
        }
    }
}
