package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTest {
    @Test
    void firstTest() {
        Dummy dummy = new Dummy();
        assertEquals(2, dummy.get2());
    }
}