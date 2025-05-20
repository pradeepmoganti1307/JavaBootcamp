package com.step.converter;

import java.util.Objects;

public class Volume {
    private final double value;
    private final Units unit;

    private Volume(double value, Units unit) {
        this.value = value;
        this.unit = unit;
    }

    private double baseValue() {
        return unit.baseValue(value);
    }

    public static Volume createFrom(double value, Units unit) {
        return new Volume(value, unit);
    }

    public Volume add(Volume volume) {
        double finalVolume = baseValue() + volume.baseValue();
        return Volume.createFrom(finalVolume, unit.baseUnit());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volumes = (Volume) o;
        return Double.compare(baseValue(), volumes.baseValue()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Volume { " + value + " " + unit + " }";
    }
}
