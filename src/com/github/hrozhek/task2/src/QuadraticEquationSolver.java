package com.github.hrozhek.task2;

public class QuadraticEquationSolver {
    private double a;
    private double b;
    private double discriminant;
    private boolean hasTwoRoots;

    QuadraticEquationSolver(double a, double b, Discriminant discriminant) {
        this.a = a;
        this.b = b;
        if (discriminant.isMoreThanZero()) {
            this.hasTwoRoots = true;
        }
        this.discriminant = discriminant.getDiscriminantValue();
    }

    public double getFirstRoot() {
        double firstRoot;
        if (this.hasTwoRoots) {
            firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            firstRoot = (-b / (2 * a));
        }
        return firstRoot;
    }

    public double getSecondRoot() {
        double secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
        return secondRoot;
    }
}