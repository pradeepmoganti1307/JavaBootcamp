package com.step.converter;

import java.util.Objects;

public class Inch {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    public double toInches() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inch that = (Inch) o;
        return Double.compare(toInches(), that.toInches()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(toInches());
    }
}
