package com.github.hrozhek;

public class Main {

    public static void main(String[] args) {
        ObjectOrientedQuadraticEquation testWithoutRoots = new ObjectOrientedQuadraticEquation(1, 3, 4);
        ObjectOrientedQuadraticEquation testWithOneRoot = new ObjectOrientedQuadraticEquation(1, -4, 4);
        ObjectOrientedQuadraticEquation testWithTwoRoots = new ObjectOrientedQuadraticEquation(-6, -5, -1);
        testWithoutRoots.sayResult();
        testWithOneRoot.sayResult();
        testWithTwoRoots.sayResult();
    }

    private static void fullQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Discriminant is less than 0, there is no roots");
        } else if (discriminant == 0) {
            System.out.println("x = " + (-b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }
}

