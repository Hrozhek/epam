package com.github.hrozhek.task2;

public class ObjectOrientedQuadraticEquation {
    private double a;
    private double b;
    private double c;

    public ObjectOrientedQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void sayResult() {
        Discriminant discriminant = new Discriminant(a, b, c);
        if (discriminant.isLessThanZero()) {
            System.out.println("No solutions");
        } else {
            QuadraticEquationSolver solution = new QuadraticEquationSolver(a, b, discriminant);
            if (discriminant.isMoreThanZero()) {
                System.out.println("x1 = " + solution.getFirstRoot() + ", x2 = " + solution.getSecondRoot());
            } else {
                System.out.println("x = " + solution.getFirstRoot());
            }
        }
    }
}
