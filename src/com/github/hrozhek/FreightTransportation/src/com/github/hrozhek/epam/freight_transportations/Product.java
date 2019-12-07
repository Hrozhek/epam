package com.github.hrozhek.epam.freight_transportations;

public class Product {
    private static int currentId = 0;
    private int id;
    private float weight;
    private CargoSize size;
    private float price;
    private SpecialMark specialMark;

    public Product(float weight, CargoSize size, float price, SpecialMark specialMark) {
        this.id = currentId++;
        this.weight = weight;
        this.size = size;
        this.price = price;
        this.specialMark = specialMark;
    }
}
