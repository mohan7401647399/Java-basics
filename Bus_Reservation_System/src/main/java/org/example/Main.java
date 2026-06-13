package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to the bus reservation system!");
        List<Bus> buses = new ArrayList<>();
        List<Booking>  bookings = new ArrayList<>();

        Bus bus1 = new Bus(1, true, 1);
        Bus bus2 = new Bus(2, false, 2);
        Bus bus3 = new Bus(3, true, 3);
        Bus bus4 = new Bus(4, true, 4);

        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);
        buses.add(bus4);

        for(Bus bus: buses) {
            bus.getBusDetails();
        }

        int userOption = 1;
        Scanner scanner =  new Scanner(System.in);

        while(userOption == 1) {
            System.out.println("Enter your choice: 1 for booking, 2 for exit");
            userOption = scanner.nextInt();

            if (userOption == 1) {
                Booking booking = new Booking();

                if(booking.isAvailablity(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Booking successful for " + booking.getPassenger_name() + " on bus no " + booking.getBus_no());
                } else {
                    System.out.println("Sorry, no seats available on bus no " + booking.getBus_no() + " for the selected date.");
                }
            }
        }
        System.out.println("Thank you for using the bus reservation system. Goodbye!");
    }
}
