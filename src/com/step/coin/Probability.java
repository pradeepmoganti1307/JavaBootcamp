package com.step.coin;

import java.util.Objects;

public class Probability {
    private static final int IMPOSSIBILITY = 0;
    private static final int CERTAINTY = 1;
    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability of(double probability) throws Exception {
        if (probability < IMPOSSIBILITY || probability > CERTAINTY)
            throw new IllegalArgumentException("Provability invalid");
        return new Probability(probability);
    }

    public Probability complement() {
        double complementOfProbability = CERTAINTY - this.probability;
        return new Probability(complementOfProbability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == IMPOSSIBILITY;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    public Probability and(Probability p2) throws Exception {
        return Probability.of(this.probability * p2.probability);
    }

    public Probability or(Probability p2) throws Exception {
        double probability1 = this.probability + p2.probability - this.probability * p2.probability;
        return Probability.of(probability1);
    }
}
