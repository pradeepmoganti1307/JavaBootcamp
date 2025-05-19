package com.step.converter;

public class Feet extends Inch {
    public Feet(double value) {
        super(value);
    }

    @Override
    public double toInches() {
        return 12 * super.toInches();
    }
}
