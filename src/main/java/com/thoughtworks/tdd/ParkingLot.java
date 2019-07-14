package com.thoughtworks.tdd;



import java.util.HashMap;

public class ParkingLot {

    private HashMap<Ticket, Car> parkingCarTicket = new HashMap<>();

    public Ticket park(Car car){
        Ticket ticket = new Ticket();
        parkingCarTicket.put(ticket, car);
        return ticket;
    }

    public Car getCar(Ticket ticket) throws Exception {
        if(!parkingCarTicket.containsKey(ticket))
            throw new Exception("Wrong Ticket");

        return parkingCarTicket.get(ticket);
    }
}
