package io.datadynamics.nifi.demo.trace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SdkCallsTest {

    @Test
    void masksFormPassword() {
        assertEquals("username=admin&password=*****", SdkCalls.mask("username=admin&password=s3cret"));
        assertEquals("password=*****&username=admin", SdkCalls.mask("password=s3cret&username=admin"));
    }

    @Test
    void masksJsonPassword() {
        assertEquals("{\"user\":\"a\",\"password\":\"*****\"}", SdkCalls.mask("{\"user\":\"a\",\"password\":\"s3cret\"}"));
    }

    @Test
    void leavesOtherBodiesAlone() {
        assertEquals("{\"name\":\"generate\"}", SdkCalls.mask("{\"name\":\"generate\"}"));
    }
}
