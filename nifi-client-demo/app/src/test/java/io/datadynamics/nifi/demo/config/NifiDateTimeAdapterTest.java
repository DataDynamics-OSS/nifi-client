package io.datadynamics.nifi.demo.config;

import com.google.gson.stream.JsonReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NifiDateTimeAdapterTest {
    private final NifiDateTimeAdapter adapter = new NifiDateTimeAdapter();

    private OffsetDateTime read(String json) throws IOException {
        return adapter.read(new JsonReader(new StringReader(json)));
    }

    @Test
    void readsNifiFormat() throws IOException {
        assertEquals(OffsetDateTime.of(2026, 10, 31, 6, 49, 58, 970_000_000, ZoneOffset.UTC),
                read("\"10/31/2026 06:49:58.970 UTC\"").withOffsetSameInstant(ZoneOffset.UTC));
    }

    @Test
    void readsIsoAndCompactOffset() throws IOException {
        assertEquals(OffsetDateTime.of(2026, 10, 31, 6, 49, 58, 0, ZoneOffset.UTC), read("\"2026-10-31T06:49:58Z\""));
        assertEquals(OffsetDateTime.of(2026, 10, 31, 6, 49, 58, 0, ZoneOffset.UTC), read("\"2026-10-31T06:49:58+0000\""));
    }

    @Test
    void readsEpochMillisAndNull() throws IOException {
        assertEquals(OffsetDateTime.of(1970, 1, 1, 0, 0, 1, 0, ZoneOffset.UTC), read("1000"));
        assertNull(read("null"));
    }

    @Test
    void rejectsUnknownFormat() {
        assertThrows(IOException.class, () -> read("\"yesterday\""));
    }
}
