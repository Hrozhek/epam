package com.github.hrozhek.epam.freight_transportations;

public class Address {
    private String country;
    private String region;
    private String city;
    private String addressLine;
    private float latitude;
    private float longitude;

    private float getDistance(Address destination) {
        return 0.0f;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
