package com.thoughtworks.tdd;

public class ParkingManager {
    private ParkingBoy parkingBoy;
    protected ParkingLot parkingLotOne;
    protected ParkingLot parkingLotTwo;
    public ParkingManager(ParkingLot parkingLotOne, ParkingLot parkingLotTwo){
        this.parkingLotOne = parkingLotOne;
        this.parkingLotTwo = parkingLotTwo;

    }
    public ParkingManager(ParkingBoy parkingBoy) {
        this.parkingBoy = parkingBoy;
    }

    public Ticket park(Car car) throws Exception{
        if(parkingBoy == null){
            return parkingLotOne.park(car);
        }
        return parkingBoy.park(car);
    }

    public Car fetch(Ticket ticket) throws Exception{
        if(parkingBoy == null){
            return parkingLotOne.getCar(ticket);
        }
        return parkingBoy.fetch(ticket);
    }
}
