package com.github.hrozhek.transportations_task4;

import java.util.Arrays;

public class Carrier extends TransportationObject {
    private static long currentId = 0;
    //private Long id;
    private String name;
    private String address;
    private CarrierType carrierType;
    private Transportation[] transportations;

    public Long getId() {
        return id;
    }

    public Carrier() {
        this.id = currentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CarrierType getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(CarrierType carrierType) {
        this.carrierType = carrierType;
    }

    public Transportation[] getTransportations() {
        return transportations;
    }

    public void setTransportations(Transportation[] transportations) {
        this.transportations = transportations;
    }

    @Override
    public String toString() {
        return "Carrier{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", carrierType=" + carrierType +
                '}';
    }

}