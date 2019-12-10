package com.github.hrozhek.transportations_task4;

public class Storage {
    private static final float FILLING_COEFFICIENT = 0.8f;
    private static final int STARTING_SIZE = 10;
    private static int position = 0;
    private int size = STARTING_SIZE;
    private TransportationObject[] storage;

    public Storage() {
        this.storage = new TransportationObject[size];
    }

    public void printElement(int position) {
        if (position > size || position < 0) {
            System.out.println("Position is out of range");
        } else {
            System.out.println(storage[position]);
        }
    }

    public void add(TransportationObject element) {
        if (position < size * FILLING_COEFFICIENT) {
            storage[position++] = element;
        } else {
            size *= 2;
            TransportationObject [] newStorage = new TransportationObject[size];
            for (int i = 0; i < storage.length; i ++) {
                newStorage[i] = storage[i];
            }
            storage = newStorage;
            storage[position++] = element;
        }
    }

    public void printAllCargo() {
        for (TransportationObject cargo : storage) {
            if (cargo != null && Cargo.class.equals(cargo.getClass())) {
                System.out.println(cargo);
            }
        }
    }

    public void printAllCarriers() {
        for (TransportationObject carrier : storage) {
            if (carrier != null && Carrier.class.equals(carrier.getClass())) {
                System.out.println(carrier);
            }
        }
    }

    public void printAllTransportations() {
        for (TransportationObject transportation : storage) {
            if (transportation != null && Transportation.class.equals(transportation.getClass())) {
                System.out.println(transportation);
            }
        }
    }
}


