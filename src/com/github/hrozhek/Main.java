package com.github.hrozhek;

public class Main {

    public static void main(String[] args) {
        System.out.println("test x^2 + 3*x + 4:");
        fullQuadraticEquation(1, 3, 4);
        System.out.println("test x^2 + 3*x - 4:");
        fullQuadraticEquation(1, 3, -4);
        System.out.println("test -6*x^2 - 5*x - 1:");
        fullQuadraticEquation(-6, -5, -1);
        System.out.println("test x^2 = 9:");
        fullQuadraticEquation(1, 0, - 9);
        System.out.println("test x^2 = 9:");
        fullQuadraticEquation(1, 0, - 9);
        System.out.println("test x^2 - 4x + 4:");
        fullQuadraticEquation(1, -4, 4);
    }

    private static void fullQuadraticEquation(double a, double b, double c){
        String answer;
        double discriminant = b * b - 4 * a * c;
        answer = (discriminant < 0) ? "Discriminant is less than 0, there is no roots":
                (discriminant == 0) ? ("x = " + (-b / (2 * a))) :
                        ("x1 = " + ((-b + Math.sqrt(discriminant))/ (2 * a)) +
                                ", x2 = " +  ((-b - Math.sqrt(discriminant))/ (2 * a)));
        System.out.println(answer);
    }
}
