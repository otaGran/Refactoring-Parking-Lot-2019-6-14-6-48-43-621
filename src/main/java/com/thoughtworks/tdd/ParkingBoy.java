package com.thoughtworks.tdd;

import sun.security.krb5.internal.Ticket;

public class ParkingBoy {
    private ParkingLot parkingLot;
    public ParkingBoy(ParkingLot parkingLot){
        this.parkingLot = this.parkingLot;
    }

    public Ticket park(Car car){
        return parkingLot.park(car);
    }

    public Car fetch(Ticket ticket){
        return parkingLot.getCar(ticket);
    }
}
