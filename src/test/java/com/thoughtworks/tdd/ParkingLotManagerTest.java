package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ParkingLotManagerTest {
    @Test
    public void should_manager_add_parking_boy_to_manage_list_and_specify_parking_boy_to_park_or_fetch() throws Exception{
//given
        ParkingLot parkingLotOne = new ParkingLot(20);
        ParkingLot parkingLotTwo = new ParkingLot(10);
        SuperSmartParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy(parkingLotOne,parkingLotTwo);
        ParkingManager parkingManager = new ParkingManager(superSmartParkingBoy);
        Car car = new Car();

        //when
        Ticket ticket = parkingManager.park(car);

        Car fetchCar = parkingManager.fetch(ticket);


        //then
        assertSame(car, fetchCar);



    }
}
