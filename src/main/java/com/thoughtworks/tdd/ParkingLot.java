package com.thoughtworks.tdd;



import java.util.HashMap;

public class ParkingLot {
    final private int CAPACITY = 10;
    private HashMap<Ticket, Car> parkingCarTicket = new HashMap<>();

    public Ticket park(Car car) throws Exception{
        if(parkingCarTicket.size() >= 10)
            throw new Exception("ParkingLot is full");
        Ticket ticket = new Ticket();
        parkingCarTicket.put(ticket, car);
        return ticket;
    }

    public Car getCar(Ticket ticket) throws Exception {
        if(!parkingCarTicket.containsKey(ticket))
            throw new Exception("Wrong Ticket");

        return parkingCarTicket.remove(ticket);
    }
}
