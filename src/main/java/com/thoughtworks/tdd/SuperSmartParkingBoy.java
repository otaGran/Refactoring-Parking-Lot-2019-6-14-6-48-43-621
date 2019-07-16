package com.thoughtworks.tdd;

public class SuperSmartParkingBoy extends SmartParkingBoy {

    public SuperSmartParkingBoy(ParkingLot parkingLotOne, ParkingLot parkingLotTwo) {
        super(parkingLotOne, parkingLotTwo);
    }

    public SuperSmartParkingBoy(ParkingLot parkingLotOne) {
        super(parkingLotOne);
    }

    @Override
    public Ticket park(Car car) throws Exception {

        ParkingLot parkingLotWithMaxAvailableRate = null;
        double maxAvailableRate = 0;
        for (ParkingLot parkingLot : parkingLots){
            if(parkingLot.getAvailablePositionsRate() > maxAvailableRate){
                maxAvailableRate = parkingLot.getAvailablePositionsRate();
                parkingLotWithMaxAvailableRate = parkingLot;
            }
        }

        return parkingLotWithMaxAvailableRate.park(car);
    }
}
