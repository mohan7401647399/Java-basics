package org.example;

/*
  This taxi booking system is designed to manage a fleet of taxis and handle customer bookings efficiently.
  The system consists of three main classes: Taxi, Customer, and Booking.
 */

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private int taxiId;
    private char currentSpot;
    private int freeTime;
    private int earnings;
    private List<Booking> bookings;

    public Taxi(int taxiId) {
        this.taxiId = taxiId;
        currentSpot = 'A';
        freeTime = 0;
        earnings = 0;
        bookings = new ArrayList<>();
    }

    //  This method assigns a booking to the taxi and updates the taxi's current spot, free time, and earnings based on the booking details.
    public boolean isFree(char pickup, int pickupTime) {
        return freeTime <= pickupTime && currentSpot == pickup;
    }

    //  This method adds a booking to the taxi's list of bookings and updates the taxi's current spot, free time, and earnings based on the booking details.
    public void assignBooking(Booking booking) {
        bookings.add(booking);
    }

    public int getTaxiId() {
        return taxiId;
    }

    public char getCurrentSpot() {
        return currentSpot;
    }

    public void setCurrentSpot(char currentSpot) {
        this.currentSpot = currentSpot;
    }

    public void setFreeTime(int freeTime) {
        this.freeTime = freeTime;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
