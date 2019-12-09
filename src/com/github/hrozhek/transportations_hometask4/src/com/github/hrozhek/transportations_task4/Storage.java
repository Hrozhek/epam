package com.github.hrozhek.transportations_task4;

public class Storage {
    private static final byte ERROR = -1;
    private static int position = 0;
    private int size;
    private TransportationObject[] storage;

    public Storage(int size) {
        this.size = size;
        this.storage = new TransportationObject[size];
    }

    public void print(int position) {
        if (position > size || position < 0) {
            System.out.println("Position is out of range");
        } else {
            System.out.println(storage[position]);
        }
    }

    public int add(TransportationObject element) {
        if (position < size) {
            storage[position++] = element;
            return position;
        } else {
            return ERROR;
        }
    }

    public void printAllCargo() {
        for (TransportationObject cargo : storage) {
            if (Cargo.class.equals(cargo.getClass())) {
                System.out.println(cargo);
            }
        }
    }

    public void printAllCarriers() {
        for (TransportationObject carrier : storage) {
            if (Carrier.class.equals(carrier.getClass())) {
                System.out.println(carrier);
            }
        }
    }

    public void printAllTransportations() {
        for (TransportationObject transportation : storage) {
            if (Transportation.class.equals(transportation.getClass())) {
                System.out.println(transportation);
            }
        }
    }
}


