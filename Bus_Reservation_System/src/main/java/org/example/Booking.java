package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Represents a single booking made by a passenger for a specific bus on a date.
 *
 * <p>This class provides a simple interactive constructor that reads booking
 * details from standard input (console). It also provides getters/setters and
 * a helper to check availability against existing bookings and bus capacities.
 *
 * <p>Notes:
 * - The constructor expects the booking date in dd/MM/yyyy format.
 * - The interactive constructor does not perform repeated validation or
 *   re-prompting; an invalid date will leave {@code booking_date} as null.
 * - Field names follow the original code; consider renaming to Java-style
 *   camelCase (passengerName, busNo, bookingDate) if you refactor other classes.
 */
public class Booking {
    /** Name of the passenger who made the booking. */
    private String passenger_name;

    /** Bus number for which the booking is made. */
    private int bus_no;

    /** Date of the booking (the day the passenger will travel). */
    private Date booking_date;

    /**
     * Interactive constructor: reads booking details from System.in.
     *
     * <p>Prompts the user for passenger name, bus number, and booking date in
     * dd/MM/yyyy format. If the date cannot be parsed, a message is printed
     * and {@code booking_date} remains null.
     */
    public Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger name: ");
        passenger_name = scanner.nextLine();
        System.out.println("Enter bus no: ");
        bus_no = scanner.nextInt();
        System.out.println("Enter booking date(dd/MM/yyyy): ");
        String dateStr = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
           booking_date = sdf.parse(dateStr);
        } catch (ParseException e) {
            // Keep behavior unchanged: print helpful message and leave booking_date null
            System.out.println("Invalid date format. Please enter date in dd/MM/yyyy format.");
        }
    }

    /** Returns the passenger name for this booking. */
    public String getPassenger_name() {
        return passenger_name;
    }

    /** Sets the passenger name for this booking. */
    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    /** Returns the bus number associated with this booking. */
    public int getBus_no() {
        return bus_no;
    }

    /** Sets the bus number associated with this booking. */
    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }

    /** Returns the booking date (may be null if parsing failed). */
    public Date getBooking_date() {
        return booking_date;
    }

    /** Sets the booking date. */
    public void setBooking_date(Date booking_date) {
        this.booking_date = booking_date;
    }

    /**
     * Checks whether there is availability on the requested bus for the
     * {@code booking_date} of this booking, given lists of existing bookings
     * and buses.
     *
     * <p>Algorithm:
     * - Find the capacity of the bus matching this booking's {@code bus_no}.
     * - Count bookings that have the same bus number and the same booking date
     *   (date equality is checked using {@link Objects#equals}).
     * - Return true if the number of booked seats is less than capacity.
     *
     * @param bookings list of existing bookings to compare against
     * @param buses list of buses (used to lookup capacity by bus number)
     * @return true if seats are available, false otherwise
     */
    public boolean isAvailablity(List<Booking> bookings, List<Bus> buses) {

        int capacity = 0;
        int booked = 0;

        // Find capacity for the bus number associated with this booking
        for (Bus bus : buses) {
            if (bus.getBus_no() == bus_no) {
                capacity = bus.getCapacity();
                break;
            }
        }

        // Count existing bookings that match both bus number and booking date
        for (Booking booking : bookings) {
            if (booking.getBus_no() == bus_no && Objects.equals(booking.booking_date, booking_date)) {
                booked++;
            }
        }
        // Available if booked seats are less than bus capacity
        return booked < capacity;
    }
}
