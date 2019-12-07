package com.github.hrozhek.epam.freight_transportations;

import java.util.Date;

public class Shipping {
    private int id;
    private Freighter freighter;
    private String senderName;
    private String receiverName;
    private Address sourceAddress;
    private Address destinationAddress;
    private float costOfShipping;
    private Date departureDate;
    private Date arrivalDate;
    private CargoState state;
}
