package org.example;

/*
    * This Booking class represents a booking in the taxi booking system.
    * It contains information about the booking ID, drop time, amount, and the customer associated with the booking.
 */

public class Booking {
    private final int bookingId;
    private final int dropTime;
    private final int amount;
    private final Customer customer;      //  Aggregation

    public Booking(int bookingId, int dropTime, int amount, Customer customer) {
        this.bookingId = bookingId;
        this.dropTime = dropTime;
        this.amount = amount;
        this.customer = customer;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getDropTime() {
        return dropTime;
    }

    public int getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }
}
