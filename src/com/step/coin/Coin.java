package com.step.coin;

public class Coin {

    public static double probabilityOfTails() {
        return 0.50;
    }

    public static double probabilityOfNotGettingTails() {
        return 1 - Coin.probabilityOfTails();
    }
}
