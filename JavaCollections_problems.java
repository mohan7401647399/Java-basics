/*

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




package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class problems{
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(List.of("jack","john","kevin"));
		ArrayList<String> temp = new ArrayList<>();
		
		System.out.println(names);
		System.out.println(temp);
		
//		Scanner input = new Scanner(System.in);
//		String findName = input.nextLine();
//		System.out.println(findName);
		//a1b2d5c3 = abbdddddccc bubble-sort exception
		for(int i = names.size() - 1; i >= 0; i--) {
			temp.add(names.get(i));
		}
		System.out.println(temp);
		
	}
}




Bubble-sort

package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class problems {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(40);
		list.add(30);
		list.add(50);
		list.add(10);

		System.out.println("Before Sorting: " + list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		System.out.println("After Sorting: " + list);
	}
}



package Collections;

import java.util.Arrays;

class problems {
	public static void main(String[] args) {
		int[] list = { 5, 2, 3, 4, 1 };

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] < list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(list));
		for (int num : list) {
			System.out.println(num);
		}
	}
}




package Collections;
 */


package Collections;

class problems {
	public static void main(String[] args) {
		String input = "a1b2c3d4";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i += 2) {
			char ch = input.charAt(i);
			System.out.println("ch : " + ch);
			int count = input.charAt(i + 1) - '0';
			System.out.println("count : " + count);
//			int count = Character.getNumericValue(input.charAt(i + 1));
//			System.out.print("count : " + count + "\n");
			for (int j = 0; j < count; j++) {
				result.append(ch);
			}
		}

		System.out.println("Expanded String: " + result.toString());
	}
}