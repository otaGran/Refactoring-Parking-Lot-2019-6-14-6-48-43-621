package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

    @Test
    public void should_manager_add_parking_Lot_to_manage_list_and_park_or_fetch_as_stardand_parking_boy() throws Exception{
//given
        ParkingLot parkingLotOne = new ParkingLot(20);
        ParkingLot parkingLotTwo = new ParkingLot(10);
        //SuperSmartParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy(parkingLotOne,parkingLotTwo);
        ParkingManager parkingManager = new ParkingManager(parkingLotOne,parkingLotTwo);
        Car car = new Car();

        //when
        Ticket ticket = parkingManager.park(car);

        Car fetchCar = parkingManager.fetch(ticket);


        //then
        assertSame(car, fetchCar);



    }

    @Test
    public void should_manager_display_error_message_to_customer_when_parking_boy_failed() throws Exception{
//given
        ParkingLot parkingLotOne = new ParkingLot(20);
        ParkingLot parkingLotTwo = new ParkingLot(10);
        SuperSmartParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy(parkingLotOne,parkingLotTwo);
        ParkingManager parkingManager = new ParkingManager(superSmartParkingBoy);
        Car car = new Car();

        //when

        for(int i = 0;i<31;i++){
            parkingManager.park(new Car());
        }
        PrintStream console = System.out;          // 声明（为null）：输出流 (字符设备) console
        ByteArrayOutputStream bytes =  new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流 重定向 到 bytes// 声明（为null）：bytes 用于缓存console 重定向过来的字符流
        console = System.out;

        //then
        ;
        assertSame("Not enough position.", bytes.toString());



    }
}
