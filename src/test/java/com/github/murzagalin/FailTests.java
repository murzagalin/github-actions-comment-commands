package com.github.murzagalin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FailTests {

    @Test
    void failingTestOne() {
        assertEquals(1, 1 + 1);
    }

    @Test
    void failingTestTwo() {
        assertEquals(2, 1 + 2);
    }
}
