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
        if (parkingLotOne.getAvailablePositionsRate() >= parkingLotTwo.getAvailablePositionsRate()) {
            //System.out.println("1 "+parkingLotOne.getAvailablePositionsRate());
            return parkingLotOne.park(car);
        }
        else{
            //System.out.println("2 "+parkingLotTwo.getAvailablePositionsRate());
            return parkingLotTwo.park(car);


        }
    }
}
