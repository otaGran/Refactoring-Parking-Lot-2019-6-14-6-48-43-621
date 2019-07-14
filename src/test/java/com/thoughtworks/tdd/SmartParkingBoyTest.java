package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SmartParkingBoyTest {
    @Test
    public void should_park_car_to_the_parkingLot_with_more_empty_positions() throws Exception{
//given
        ParkingLot parkingLotOne = new ParkingLot(100);
        ParkingLot parkingLotTwo = new ParkingLot(10);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLotOne,parkingLotTwo);
        Car car = new Car();

        //when

        Ticket ticket = smartParkingBoy.park(car);


        //then
        assertSame(parkingLotOne.getSize(),1);
        assertSame(parkingLotTwo.getSize(),0);
        assertSame(car, parkingLotOne.getCar(ticket));


    }
}
