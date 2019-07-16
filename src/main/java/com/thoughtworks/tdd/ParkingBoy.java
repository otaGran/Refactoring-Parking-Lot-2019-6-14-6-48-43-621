package com.thoughtworks.tdd;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ParkingBoy {
    protected List<ParkingLot> parkingLots = new LinkedList<>();
    public ParkingBoy(ParkingLot... parkingLots){
        this.parkingLots.addAll(Arrays.asList(parkingLots));
    }

    public Ticket park(Car car) throws Exception{

        Ticket ticket = null;
        for (int i = 0;i<parkingLots.size();i++){
            try{
               ticket =  parkingLots.get(i).park(car);
               break;
            }catch (NotEnoughPositionException e){


            }

        }
        if(ticket == null){

            throw new NotEnoughPositionException("Not enough position.");
        }else{
            return ticket;
        }

    }

    public Car fetch(Ticket ticket) throws Exception{

        if(ticket == null)
            throw new NoTicketProvideException("Please provide your parking ticket.");

        Car car = null;
        for (ParkingLot parkingLot : parkingLots){
            try{
                car =  parkingLot.getCar(ticket);
            }catch (Exception e){
            }
        }
        if(car == null){
            throw new UnrecognizedParkingTicketException("Unrecognized parking ticket.");
        }else{
            return car;
        }
    }
}
