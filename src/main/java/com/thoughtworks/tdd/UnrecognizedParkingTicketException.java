package com.thoughtworks.tdd;

public class UnrecognizedParkingTicketException extends Exception{
    public UnrecognizedParkingTicketException(String message) {
        super(message);
    }
}
