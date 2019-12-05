package com.github.hrozhek.task2;

public class Discriminant {
    private boolean lessThanZero;
    private boolean moreThanZero;
    private double discriminantValue;

    public Discriminant(double a, double b, double c) {
        discriminantValue = b * b - 4 * a * c;
        if (discriminantValue < 0) {
            lessThanZero = true;
        } else if (discriminantValue > 0) {
            moreThanZero = true;
        }
    }

    public double getDiscriminantValue() {
        return discriminantValue;
    }

    public boolean isLessThanZero() {
        return lessThanZero;
    }

    public boolean isMoreThanZero() {
        return moreThanZero;
    }
}