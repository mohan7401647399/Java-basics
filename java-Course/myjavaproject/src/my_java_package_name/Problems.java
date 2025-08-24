/*
String Occurance, second min and max, using object type data stored, comparable and comparators



1.Reverse a string
	Method 01

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		String[] splitStr = name.split("");
		String str = "";
		for(int i = 0; i < splitStr.length; i++) {
			str = splitStr[i] + str;
		}
		System.out.println(str);
	}
}


	Method 02
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		String[] splitStr = name.split("");
		String str = "";
		for(int i = splitStr.length - 1; i >= 0; i--) {
			str += splitStr[i];
		}
		System.out.println(str);
	}
}



	Method 03
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		String[] splitStr = name.split("");
		String str = "";
		for(int i = splitStr.length - 1; i >= 0; i--) {
			String temp = splitStr[i];
			splitStr[i] = splitStr[splitStr.length - 1];
			splitStr[splitStr.length - 1] = temp;
		}
		System.out.println(str);
	}
}


	Method 04
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		String str = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			str += name.charAt(i);
		}
		System.out.println(str);
	}
}



	Method 05
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		StringBuilder sb = new StringBuilder(name);
		String reverseStr = sb.reverse().toString();
		System.out.println(reverseStr);
	}
}



	Method 06
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		char[] chars = name.toCharArray();
		for(int i = chars.length - 1; i >= 0; i--) {
			System.out.println(chars[i]);
		}
	}
}



	Method 07
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		String name = "Mohan";
		String reverse = m1(name);
		System.out.println(reverse);
	}
	public static String m1(String str) {
		if(str.isEmpty()) return str;
		return m1(str.substring(1)) + str.charAt(0);
	}
}


	Method 08
package my_java_package_name;

import java.util.Stack;

public class Problems {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		String name = "Mohan";
		Stack<Character> stack = new Stack<>();
		
		for(char c : name.toCharArray()) {
			stack.push(c);
		}
		
		String str = "";
		
		while(!stack.isEmpty()) {
			str += stack.pop();
		}
		
		System.out.println(str);
	}
}


______________________________________________________________________


2.Get a value in the string

	Method 01

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a Java developer";
	
		if(name.contains("Java")) {
			System.out.println("Word found");
		} else {
			System.out.println("word is not found");
		}
	}
}



	Method 02

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a Java developer";
		
		int index = name.indexOf("Java");
	
		if(index != -1) {
			System.out.println("Word found");
		} else {
			System.out.println("word is not found");
		}
	}
}



	Method 03

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a Java developer";
		
		char ch = name.charAt(2);
		System.out.println("character at index is " + ch);
	}
}



	Method 04
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a /Java developer";
		
		if(name.matches(".*Java.*")) {
			System.out.println("Word matched");
		} else {
			System.out.println("Word is not matched");
		}
	}
}




	Method 05
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a Java developer";
		char target = 'g';
		boolean found = false;
		
		for(int i = 0; i < name.length(); i++) {
			if(name.indexOf(i) == target) {
				found = true;
				System.out.println("word found");
				break;
			} 
		}
		if(!found) {
			System.out.println("word is not found");
		}
	}
}
___________________________________________________________________



3.Duplicate character value in the string

	Method 01

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		String name = "apple";
		char[] chars = name.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					System.out.println("Duplicate words is " + chars[i]);
				}
			}
		}
	}
}
 

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		String name = "apple";
		char[] chars = name.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					System.out.println("Duplicate words is " + chars[i]);
				}
			}
		}
	}
}






		Add Two Numbers with User Input

import java.util.Scanner;

class Problems {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plase enter the first number : ");
		int x = scanner.nextInt();
		System.out.println("Plase enter the another number : ");
		int y = scanner.nextInt();
		System.out.println("Plase enter the another number : ");
		int sum = x + y;
		System.out.println("Sum number is : " + sum);
	}
}





		Count Number of Words in a String

class Problems {
	public static void main(String[] args) {
		String name = "hello java";
		System.out.println("Total letter is : " + name.length());
		System.out.println("Total word is : " + name.split("\\s").length);
	}
}
	




	Calculate the Sum of an Array

class Problems {
	public static void main(String[] args) {
		int[] array = { 1, 5, 6, 7, 5 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			temp += array[i];
		}
		System.out.println(temp);
	}
}







		Convert a String to an Array

class Problems {
	public static void main(String[] args) {
		String name = "hello";
		char[] str = name.toCharArray();
		System.out.println(str);
		System.out.println(str[0]);
	}
}







		How To Sort an Array

class Problems {
	public static void main(String[] args) {
		String[] cars = { "BMW", "Toyota", "Maruti", "Volvo" };
		Arrays.sort(cars);
		for (String car : cars) {
			System.out.println(car);
		}
	}
}







		How To Calculate the Average of Array Elements

class Problems {
	public static void main(String[] args) {
		int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };

		float avg, sum = 0;

		int length = ages.length;

		for (int age : ages) {
			sum += age;
		}

		avg = length / sum;

		System.out.println("Array average is : " + avg);
	}
}








		How To Find the Smallest Element in an Array

class Problems {
	public static void main(String[] args) {
		int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };
		int smallInt = ages[0];

		for (int age : ages) if (age < smallInt)	smallInt = age;
		System.out.println(smallInt);
	}
}







		Loop Through an ArrayList

class Problems {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Maruti");
		cars.add("Volvo");
		cars.add("Lamboghini");
		for (String car : cars) {
			System.out.println(car);
		}
	}
}









		Loop Through a HashMap

import java.util.HashMap;

class Problems {
	public static void main(String[] args) {
		HashMap<String, Integer> names = new HashMap<>();
		names.put("mohan", 29);
		names.put("john", 24);
		names.put("james", 35);
		names.put("daniel", 20);
		for (String name : names.keySet()) {
			System.out.println(name);
		}
		for (Integer age : names.values()) {
			System.out.println(age);
		}
	}
}






		Loop Through an Enum

enum Level {
	LOW, MEDIUM, HIGH
}

class Problems {
	public static void main(String[] args) {
		for( Level myVar : Level.values()){
			System.out.println(myVar);
		}
	}
}







		Area of Rectangle

class Problems {
	public static void main(String[] args) {
		int length = 10;
		int width = 5;
		int area = length * width;
		System.out.println("Area of rectangle : " + area);
	}
}







		Check Whether a Number is Even or Odd

class Problems {
	public static void main(String[] args) {
		int number = 5;
		if(number % 2 == 0){
			System.out.println("Even number");
		} else {
			System.out.println("Odd Number");
		}
	}
}








		Find Out if a Number is Positive or Negative

class Problems {
	public static void main(String[] args) {
		int number = 5;
		if (number > 0) {
			System.out.println("Number is positive");
		} else if (number < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is 0");
		}
	}
}






		Square Root of a Number & random

class Problems {
	public static void main(String[] args) {
		System.out.println(Math.sqrt(3));
		System.out.println(Math.random());
	}
}
*/