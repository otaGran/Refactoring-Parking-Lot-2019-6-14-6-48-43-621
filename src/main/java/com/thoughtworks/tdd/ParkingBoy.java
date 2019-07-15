package com.thoughtworks.tdd;


import java.util.Collections;
import java.util.List;

public class ParkingBoy {
    protected List<ParkingLot> parkingLots;
    public ParkingBoy(ParkingLot... parkingLots){
        Collections.addAll(this.parkingLots, parkingLots);


    }

    public Ticket park(Car car) throws Exception{
        try{
            return parkingLotOne.park(car);
        }catch(Exception E){
            if(parkingLotTwo == null)
                throw E;
            else
                return parkingLotTwo.park(car);
        }

    }

    public Car fetch(Ticket ticket) throws Exception{
        try {
            return parkingLotOne.getCar(ticket);
        }catch(Exception E){
            if(parkingLotTwo == null)
                throw E;
            else
            return parkingLotTwo.getCar(ticket);
        }
    }
}
