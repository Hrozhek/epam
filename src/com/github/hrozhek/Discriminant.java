package com.github.hrozhek;

public class Discriminant {
    private boolean lessThanZero;
    private boolean moreThanZero;
    private double discriminantValue;

    public Discriminant(double a, double b, double c) {
        discriminantValue = b * b - 4 * a * c;
        if (discriminantValue < 0) {
            lessThanZero = true;
        }
        else if (discriminantValue > 0) {
            moreThanZero = true;
        }
    }

    public double getDiscriminant() {
            return discriminantValue;
    }

    public boolean lessThanZero(){
        return lessThanZero;
    }

    public boolean moreThanZero() {
        return moreThanZero;
    }
}
