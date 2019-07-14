package com.thoughtworks.tdd;

public class SmartParkingBoy extends ParkingBoy {
    public SmartParkingBoy(ParkingLot parkingLotOne, ParkingLot parkingLotTwo) {
        super(parkingLotOne, parkingLotTwo);
    }

    public SmartParkingBoy(ParkingLot parkingLotOne) {
        super(parkingLotOne);
    }

}
