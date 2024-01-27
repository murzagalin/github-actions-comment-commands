package com.github.murzagalin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FailingTests {

    @Test
    void failingTest1() {
        assertEquals(1, 1 + 1);
    }

    @Test
    void failingTest2() {
        assertEquals(2, 1 + 2);
    }
}