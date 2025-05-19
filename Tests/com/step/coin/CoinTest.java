package com.step.coin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void calculateProbabilityOfTails() {
        assertEquals(0.50, Coin.probabilityOfTails());
    }
}