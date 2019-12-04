package com.github.hrozhek;

public class QuadraticEquationRoot {
    private double a;
    private double b;
    private double c;
    private double discriminant;
    private boolean hasTwoRoots;

    QuadraticEquationRoot(double a, double b, double c, Discriminant discriminant) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (discriminant.moreThanZero()) {
            this.hasTwoRoots = true;
        }
        this.discriminant = discriminant.getDiscriminant();
    }

    public String getFirstRoot() {
        Double firstRoot;
        if (this.hasTwoRoots) {
            firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            firstRoot = (-b / (2 * a));
        }
        return firstRoot.toString();
    }

    public String getSecondRoot() {
        Double secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
        return secondRoot.toString();
    }
}
