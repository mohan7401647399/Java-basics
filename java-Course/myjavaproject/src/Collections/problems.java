package Collections;

import java.util.*;

public class problems {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("trichy");
		cities.add("chennai");
		cities.add("madurai");
		cities.add("trichy");

		System.out.println(cities);
		System.out.println("Reversed ArrayList - " + cities.reversed());

		for (String city : cities) {
			int index1 = cities.indexOf(city);
			int index2 = cities.lastIndexOf(city);
			if (index1 != index2) {
				System.out.println(index1);
				System.out.println(index2);
				System.out.println("Not Palindrome");
				break;
			}
		}
	}

}
