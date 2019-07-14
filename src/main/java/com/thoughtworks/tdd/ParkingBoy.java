package com.thoughtworks.tdd;



public class ParkingBoy {
    protected ParkingLot parkingLotOne;
    protected ParkingLot parkingLotTwo;
    public ParkingBoy(ParkingLot parkingLotOne, ParkingLot parkingLotTwo){
        this.parkingLotOne = parkingLotOne;
        this.parkingLotTwo = parkingLotTwo;

    }
    public ParkingBoy(ParkingLot parkingLotOne){
        this.parkingLotOne = parkingLotOne;


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
