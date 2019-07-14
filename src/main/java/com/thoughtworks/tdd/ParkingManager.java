package com.thoughtworks.tdd;

public class ParkingManager {
    private ParkingBoy parkingBoy;

    public ParkingManager(ParkingBoy parkingBoy) {
        this.parkingBoy = parkingBoy;
    }

    public Ticket park(Car car) throws Exception{
        return parkingBoy.park(car);
    }

    public Car fetch(Ticket ticket) throws Exception{
        return parkingBoy.fetch(ticket);
    }
}
