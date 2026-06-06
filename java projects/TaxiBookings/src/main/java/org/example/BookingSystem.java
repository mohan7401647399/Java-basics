package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {

    private final List<Taxi> taxis =  new ArrayList<Taxi>();
    int bookingId = 1;

    //  This constructor initializes the booking system with a specified number of taxis. It creates a list of Taxi objects and adds them to the taxis list.
    public BookingSystem(int taxiCount) {
        for (int i = 1; i <= taxiCount; i++) {
            taxis.add(new Taxi(i));
        }
    }

    //  This method processes a booking request from a customer. It checks for available taxis, calculates the charge for the trip, and creates a new Booking object if a taxi is assigned to the customer.
    public int calculateCharge(char pickup, char drop) {
        int distance = Math.abs(pickup - drop) * 15 - 5;
        return 100 + distance * 10;
    }

    public Taxi findTaxi(char pickUp, int pickUpTime) {
        List<Taxi> availableTaxis = new ArrayList<Taxi>();
        for (Taxi taxi : taxis) {
            if (taxi.isFree(pickUp, pickUpTime)) {
                availableTaxis.add(taxi);
            }
        }
        if (availableTaxis.isEmpty())  return null;
        int minDistance =  Integer.MAX_VALUE;
        for (Taxi taxi : availableTaxis) {
            int distance = Math.abs(pickUp - taxi.getCurrentSpot());
            if(distance < minDistance) {
                minDistance = distance;
            }
        }
        List<Taxi> minDistanceTaxis = new ArrayList<>();
        for (Taxi taxi : availableTaxis) {
            int distance = Math.abs(pickUp - taxi.getCurrentSpot());
            if(distance == minDistance) {
                minDistanceTaxis.add(taxi);
            }
        }
        Taxi selectedTaxi = minDistanceTaxis.get(0);
        for(Taxi taxi : minDistanceTaxis) {
            if(taxi.getEarnings() < selectedTaxi.getEarnings()){
                selectedTaxi = taxi;
            }
        }
        return selectedTaxi;
    }

    public void bookTaxi(Customer customer) {
        Taxi selectedTaxi = findTaxi(customer.getPickUp(), customer.getPickUpTime());
        if (selectedTaxi == null) {
            System.out.println("No taxis available for the requested time and location.");
            return;
        }
        int travelTime = Math.abs(customer.getPickUp() - customer.getDrop());
        int dropTime = customer.getDrop() + travelTime;
        int charges = calculateCharge(customer.getPickUp(), customer.getDrop());
        Booking booking = new Booking(bookingId, dropTime, charges, customer);
        bookingId++;
        selectedTaxi.assignBooking(booking);
        selectedTaxi.setCurrentSpot(customer.getDrop());
        selectedTaxi.setFreeTime(dropTime);
        selectedTaxi.setEarnings(selectedTaxi.getEarnings() + charges);
        System.out.println("Taxi " + selectedTaxi.getTaxiId() + " assigned to customer " + customer.getCustomerId() + " with booking ID " + booking.getBookingId());
    }

    public void displayTaxiDetails() {
        System.out.println();
        for (Taxi taxi : taxis) {
            System.out.println("Taxi - " + taxi.getTaxiId() + " Earnings " + taxi.getEarnings());
            System.out.println("BookingID\tCustomerID\tPickup\tDrop\tPickupTime\tDropTime\tAmount");
            for (Booking booking : taxi.getBookings()) {
                System.out.println(booking.getBookingId() + "               " + booking.getCustomer().getCustomerId() + "       " + booking.getCustomer().getPickUp() + "       " + booking.getCustomer().getDrop() + "           " + booking.getCustomer().getPickUpTime() + "           " + booking.getDropTime() + "         " + booking.getAmount());
            }
             System.out.println();
        }
    }
}
