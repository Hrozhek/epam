package com.github.hrozhek.epam.freight_transportations;

public class CargoSize {
    private float length;
    private float width;
    private float height;

    public CargoSize(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume() {
        return length * width * height;
    }

    public float getBiggestSize() {
        float max = Math.max(length, width);
        max = Math.max(max, height);
        return max;
    }
}
