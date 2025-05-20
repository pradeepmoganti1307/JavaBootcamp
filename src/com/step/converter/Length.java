package com.step.converter;

import java.util.Objects;

public class Length {
    private final double inch;

    public Length(double inch) {
        this.inch = inch;
    }

    public static Length createFromInches(double inch) {
        return new Length(1 * inch / 1);
    }

    public static Length createFromFeet(double feet) {
        return new Length(12 * feet / 1);
    }

    public static Length createFromCm(double cm) {
        return new Length(2 * cm / 5);
    }

    public static Length createFromMm(double mm) {
        return new Length(2 * mm / 50);

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return inch == length.inch;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inch);
    }
}
