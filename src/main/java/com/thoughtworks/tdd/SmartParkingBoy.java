package com.thoughtworks.tdd;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmartParkingBoy extends ParkingBoy {
    public SmartParkingBoy(ParkingLot parkingLotOne, ParkingLot parkingLotTwo) {
        super(parkingLotOne, parkingLotTwo);
    }

    public SmartParkingBoy(ParkingLot parkingLotOne) {
        super(parkingLotOne);
    }

    @Override
    public Ticket park(Car car) throws Exception {

        if (parkingLotOne.getEmptySize() >= parkingLotTwo.getEmptySize()) {
            try {
                return parkingLotOne.park(car);
            } catch (Exception E) {
                if (parkingLotTwo == null)
                    throw E;
                else
                    return parkingLotTwo.park(car);
            }
        }
        else{
            try {
                return parkingLotTwo.park(car);
            } catch (Exception E) {
                if (parkingLotOne == null)
                    throw E;
                else
                    return parkingLotOne.park(car);
            }

        }
    }



}
