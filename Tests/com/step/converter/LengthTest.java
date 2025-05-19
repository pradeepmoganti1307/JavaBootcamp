package com.step.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compareFeetAndInches() {
        Length lengthInInches = Length.createFromInches(12);
        Length lengthInFeet = Length.createFromFeet(1);
        assertEquals(lengthInFeet, lengthInInches);
    }

    @Test
    void compareInchesAndCentimeter() {
        Length lengthInInches = Length.createFromInches(2);
        Length lengthInCm = Length.createFromCm(5);
        assertEquals(lengthInCm, lengthInInches);
    }

    @Test
    void compareFeetAndCentimeter() {
        Length lengthInFeet = Length.createFromFeet(1);
        Length lengthInCm = Length.createFromCm(30);
        assertEquals(lengthInCm, lengthInFeet);
    }

    @Test
    void compareCentimeterAndMillimeter() {
        Length lengthInCm = Length.createFromCm(1);
        Length lengthInMm = Length.createFromMm(10);
        assertEquals(lengthInCm, lengthInMm);
    }
}