package com.step.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {

    @Test
    void compareInchesAndFeet() {
        assertEquals(new Inch(12), new Feet(1));
    }
}