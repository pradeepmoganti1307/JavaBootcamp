package com.step.coin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void calculateProbabilityOfNotGettingTails() throws Exception {
        Probability probabilityOfTails = Probability.of(0.4);
        assertEquals(Probability.of(0.6), probabilityOfTails.complement());
    }

    @Test
    void andOperationOfProbabilities() throws Exception {
        Probability p1 = Probability.of(0.5);
        Probability p2 = Probability.of(0.2);
        Probability expected = Probability.of(0.1);
        assertEquals(expected, p1.and(p2));
    }


    @Test
    void orOperationOfProbabilities() throws Exception {
        Probability p1 = Probability.of(0.2);
        Probability p2 = Probability.of(0.2);
        Probability expected = Probability.of(0.36);

        assertEquals(expected, p1.or(p2));
    }

    @Test
    void throwIfProbabilityIsNotInRange() {
        assertThrows(IllegalArgumentException.class, () -> Probability.of(12.5));
        assertThrows(IllegalArgumentException.class, () -> Probability.of(-5));
    }
}