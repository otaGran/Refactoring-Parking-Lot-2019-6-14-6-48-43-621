package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import sun.security.krb5.internal.Ticket;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ParkingBoyTest {
    public void should_not_featch_car_when_ticket_is_wrong(){
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Ticket wrongTicket = new Ticket();


        //when
        parkingBoy.park(car);

        //then
        Assertions.assertThrows(Exception.class, ()->{
            parkingBoy.fetch(wrongTicket);
        });
    }

    public void should_return_when_park_car_to_parking_lot_then_get_it_back(){
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);


        //when
        Ticket ticket = parkingBoy.park(car);
        Car fetchCar = parkingBoy.fetch(ticket);


        //then
        assertSame(car, fetchCar);

    }


}
