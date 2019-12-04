package com.github.hrozhek;

public class ObjectOrientedQuadraticEquation {
    private double firstUnknown;
    private double secondUnknown;
    private double thirdUnknown;

    public ObjectOrientedQuadraticEquation(double a, double b, double c) {
        firstUnknown = a;
        secondUnknown = b;
        thirdUnknown = c;
    }

    public void sayResult() {
        Discriminant discriminant = new Discriminant(firstUnknown, secondUnknown, thirdUnknown);
        if (discriminant.lessThanZero()) {
            System.out.println("No solutions");
        } else {
            QuadraticEquationRoot root = new QuadraticEquationRoot(firstUnknown, secondUnknown, thirdUnknown, discriminant);
            if (discriminant.moreThanZero()) {
                System.out.println("x1 = " + root.getFirstRoot() + ", x2 = " + root.getSecondRoot());
            } else {
                System.out.println("x = " + root.getFirstRoot());
            }
        }
    }
}
