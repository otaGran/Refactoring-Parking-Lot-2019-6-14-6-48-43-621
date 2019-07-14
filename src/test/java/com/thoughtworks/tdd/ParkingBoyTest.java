package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertSame;

public class ParkingBoyTest {

    //AC1
    @Test
    public void should_return_ticket_when_give_car(){
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);


        //when
        Ticket ticket = parkingBoy.park(car);



        //then
        Assertions.assertNotNull(ticket);

    }

    //AC3
    @Test
    public void should_not_featch_car_when_ticket_is_wrong() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Ticket wrongTicket = new Ticket();


        //when
        Ticket ticket = parkingBoy.park(car);
        Car fetchCar = parkingBoy.fetch(wrongTicket);
        parkingBoy.park(car);

        //then

//        final Exception exception = Assertions.assertThrows(Exception.class);
//        Assertions.assertThrows(Exception.class, () -> {
//            parkingBoy.fetch(wrongTicket);
//        });
    }



    //AC1
    @Test
    public void should_return_when_park_car_to_parking_lot_then_get_it_back() {
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



    //AC2
    @Test
    public void should_multiple_cars_when_park_to_parking_lot_then_get_them_back() {
        //given

        Car firstCar = new Car();
        Car secondCar = new Car();

        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);


        //when
        Ticket firstTicket = parkingBoy.park(firstCar);
        Car fetchFirstCar = parkingBoy.fetch((firstTicket));


        Ticket secondTicket = parkingBoy.park(secondCar);
        Car fetchSecondCar = parkingBoy.fetch((secondTicket));


        //then

        assertSame(firstCar, fetchFirstCar);
        assertSame(secondCar, fetchSecondCar);
    }


}
