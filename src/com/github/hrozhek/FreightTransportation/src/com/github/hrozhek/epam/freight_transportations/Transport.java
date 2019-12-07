package com.github.hrozhek.epam.freight_transportations;

public enum Transport {
    PLANE(900),
    SHIP(55),
    TRAIN(100),
    TRUCK(80),
    COURIER(20);
    private short averageSpeed;

    Transport(int averageSpeed) {
        this.averageSpeed = (short)averageSpeed;
    }

}
