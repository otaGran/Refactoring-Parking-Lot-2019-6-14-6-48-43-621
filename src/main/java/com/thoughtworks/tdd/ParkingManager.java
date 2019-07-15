package com.thoughtworks.tdd;

public class ParkingManager {
    protected ParkingLot parkingLotOne;
    protected ParkingLot parkingLotTwo;
    private ParkingBoy parkingBoy;

    public ParkingManager(ParkingLot parkingLotOne, ParkingLot parkingLotTwo) {
        this.parkingLotOne = parkingLotOne;
        this.parkingLotTwo = parkingLotTwo;

    }

    public ParkingManager(ParkingBoy parkingBoy) {
        this.parkingBoy = parkingBoy;
    }

    public Ticket park(Car car) throws Exception {
        if (parkingBoy == null) {
            return parkingLotOne.park(car);
        }
        try {
            Ticket ticket=  parkingBoy.park(car);
            return ticket;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Car fetch(Ticket ticket) throws Exception {
        if (parkingBoy == null) {
            return parkingLotOne.getCar(ticket);
        }
        try {

            Car car = parkingBoy.fetch(ticket);
            return car;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
