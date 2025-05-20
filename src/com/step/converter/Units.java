package com.step.converter;

public enum Units {
    LITERS("ltr", 1),
    GALLONS("gl", 3.78);

    private final String unit;
    private final double unitConstant;

    Units(String unit, double unitConstant) {
        this.unit = unit;
        this.unitConstant = unitConstant;
    }

    @Override
    public String toString() {
        return unit;
    }

    public double baseValue(double value) {
        return unitConstant * value;
    }

    public Units baseUnit() {
        return Units.LITERS;
    }
}
