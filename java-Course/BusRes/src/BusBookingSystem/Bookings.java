package BusBookingSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Bookings {
	String passengerName;
	int busNo;
	Date date;

	Bookings() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger : ");
		passengerName = scanner.next();
		System.out.println("Enter bus no : ");
		busNo = scanner.nextInt();
		System.out.println("Enter date - DD-MM-YYYY : ");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		try {
			dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Bookings> bookings, ArrayList<Bus> buses) {
		// bus capacity check
		int capacity = 0;
		for (Bus bus : buses) {
			if (bus.getBusNo() == busNo)
				capacity = bus.getCapacity();
		}

		// total booking count
		int booked = 0;
		for (Bookings booking : bookings) {
			if (booking.busNo == busNo && booking.date.equals(date)) {
				booked++;
			}
		}

		return booked < capacity ? true : false;
	}
}
