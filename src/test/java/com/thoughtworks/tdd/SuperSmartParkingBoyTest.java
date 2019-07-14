package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SuperSmartParkingBoyTest {
    @Test
    public void should_park_car_to_the_parkingLot_with_larger_available_positions_rate() throws Exception{
//given
        ParkingLot parkingLotOne = new ParkingLot(20);
        ParkingLot parkingLotTwo = new ParkingLot(10);
        SuperSmartParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy(parkingLotOne,parkingLotTwo);
        Car car = new Car();

        //when

        for(int i = 0;i<14;i++){
            superSmartParkingBoy.park(new Car());
        }


        //then
        assertSame(9,parkingLotOne.getSize());
        assertSame(5, parkingLotTwo.getSize());



    }
}
