package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTest {
    @Test
    void firstTest() {
        assertEquals(2, new Dummy().get2());
    }
}