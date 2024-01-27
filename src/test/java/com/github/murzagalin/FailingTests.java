package com.github.murzagalin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FailingTests {

    @Test
    void failingTest() {
        assertEquals(1, 1 + 1);
    }

    @Test
    void failingTestTwo() {
        assertEquals(1, 1 + 1);
    }
}