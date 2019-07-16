package com.thoughtworks.tdd;

public class SmartParkingBoy extends ParkingBoy {
    public SmartParkingBoy(ParkingLot... parkingLots) {
        super(parkingLots);
    }

    @Override
    public Ticket park(Car car) throws Exception {

        ParkingLot parkingLotWithMaxAvailableSize = null;
        int maxAvailableSize = 0;
        for (ParkingLot parkingLot : parkingLots){
            if(parkingLot.getAvailableSize() > maxAvailableSize){
                maxAvailableSize = parkingLot.getAvailableSize();
                parkingLotWithMaxAvailableSize = parkingLot;
            }
        }

            return parkingLotWithMaxAvailableSize.park(car);
    }


}
