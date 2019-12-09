package com.github.hrozhek.transportations_task4;

import java.util.Arrays;

public class Cargo extends TransportationObject {
    private static long currentId = 0;

    //private Long id;
    private String name;
    private int weight;
    private CargoType cargoType;
    private Transportation[] transportations;

    public Long getId() {
        return id;
    }

    public Cargo() {
        this.id = currentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }

    public Transportation[] getTransportations() {
        return transportations;
    }

    public void setTransportations(Transportation[] transportations) {
        this.transportations = transportations;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cargoType=" + cargoType +
                '}';
    }
}