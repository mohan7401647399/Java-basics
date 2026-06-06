package org.example;

/*
    * This customer class represents a customer in the taxi booking system.
    * It contains information about the customer's ID, pick-up location, drop-off location, and pick-up time.
 */

public class Customer {

    private int customerId;
    private char pickUp;
    private char drop;
    private int pickUpTime;

    public Customer(int customerId, char pickUp, char drop, int pickUpTime) {
        this.customerId = customerId;
        this.pickUp = pickUp;
        this.drop = drop;
        this.pickUpTime = pickUpTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public char getPickUp() {
        return pickUp;
    }

    public void setPickUp(char pickUp) {
        this.pickUp = pickUp;
    }

    public char getDrop() {
        return drop;
    }

    public void setDrop(char drop) {
        this.drop = drop;
    }

    public int getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(int pickUpTime) {
        this.pickUpTime = pickUpTime;
    }
}
