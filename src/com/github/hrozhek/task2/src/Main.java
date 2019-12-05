package com.github.hrozhek.task2;

public class Main {

    public static void main(String[] args) {
        ObjectOrientedQuadraticEquation testWithoutRoots = new ObjectOrientedQuadraticEquation(1, 3, 4);
        ObjectOrientedQuadraticEquation testWithOneRoot = new ObjectOrientedQuadraticEquation(1, -4, 4);
        ObjectOrientedQuadraticEquation testWithTwoRoots = new ObjectOrientedQuadraticEquation(-6, -5, -1);
        testWithoutRoots.sayResult();
        testWithOneRoot.sayResult();
        testWithTwoRoots.sayResult();
    }
}
