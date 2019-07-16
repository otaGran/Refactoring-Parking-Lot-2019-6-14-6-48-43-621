package com.thoughtworks.tdd;



import java.util.HashMap;

public class ParkingLot {
     private int capacity;
    private HashMap<Ticket, Car> parkingCarTicket = new HashMap<>();
    public ParkingLot() {
        this.capacity = 10;
    }
    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public Ticket park(Car car) throws Exception{
        if(parkingCarTicket.size() >= capacity)
            throw new NotEnoughPositionException("Not enough position.");
        Ticket ticket = new Ticket();
        parkingCarTicket.put(ticket, car);
        return ticket;
    }

    public Car getCar(Ticket ticket) throws Exception {


        if(!parkingCarTicket.containsKey(ticket))
            throw new UnrecognizedParkingTicketException("Unrecognized parking ticket.");

        return parkingCarTicket.remove(ticket);
    }

    public int getSize(){
        return parkingCarTicket.size();
    }

    public int getAvailableSize(){
        return capacity - parkingCarTicket.size();
    }

    public double getAvailablePositionsRate(){
        return (double)(capacity - parkingCarTicket.size())/(double)capacity;
    }

}
