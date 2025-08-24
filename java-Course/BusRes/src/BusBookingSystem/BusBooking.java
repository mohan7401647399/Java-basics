package BusBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BusBooking {
	public static void main(String[] args) {

		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Bookings> bookings = new ArrayList<Bookings>();

		buses.add(new Bus(1, true, 2));
//		buses.add(new Bus(2, false, 20));
//		buses.add(new Bus(3, true, 40));

		for (Bus bus : buses) {
			bus.displayBusInfo();
		}

		int userOption = 1;
		Scanner scanner = new Scanner(System.in);
		while (userOption == 1) {
			System.out.println("Enter 1 to booking or 2 to Exit");
			userOption = scanner.nextInt();
			if (userOption == 1) {
				Bookings booking = new Bookings();
				if (booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				} else {
					System.out.println("Sorry, Bus is full. Try another Bus or Date");
				}
			}

		}
	}
}
