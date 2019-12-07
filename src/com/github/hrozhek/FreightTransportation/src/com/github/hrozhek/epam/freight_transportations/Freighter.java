package com.github.hrozhek.epam.freight_transportations;

public class Freighter {
    private static int currentId = 0;
    private int id;
    private String name;
    private Transport[] transportAvailable; //there must be Map object transport : tariff
    private SpecialMark[] specialMarksAvailable; // there must be Map object Available : Coefficient
    private float[] tariff;
    private float[] specialMarksCoefficient;
}
