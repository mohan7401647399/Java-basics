package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Booking {
    private String passenger_name;
    private int bus_no;
    private Date booking_date;

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
            System.out.println("Invalid date format. Please enter date in dd/MM/yyyy format.");
        }
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public int getBus_no() {
        return bus_no;
    }

    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }

    public Date getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(Date booking_date) {
        this.booking_date = booking_date;
    }

    public boolean isAvailablity(List<Booking> bookings, List<Bus> buses) {

        int capacity = 0;
        int booked = 0;

        for (Bus bus : buses) {
            if (bus.getBus_no() == bus_no) {
                capacity = bus.getCapacity();
                break;
            }
        }

            for (Booking booking : bookings) {
                if (booking.getBus_no() == bus_no && Objects.equals(booking.booking_date, booking_date)) {
                    booked++;
                }
            }
        return booked < capacity;
    }
}
