package my_java_package_name;

import java.io.FileWriter;
import java.io.IOException;

public class Exc {
	public static void main(String[] args) {
		//CTE or checked exception
		//RTE or unchecked exception

		String s = null;
		System.out.println(10 / 0);// by 0 means we get AE
		System.out.println(s);
		System.out.println(s.length());// object null

	}

	private static void m1() {
		Exception e1;
		// for CTE mandatory to handle the exception

		try {
			Thread.sleep(100);
			FileWriter fr = new FileWriter("");
		} catch (IOException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();				// showing the error places
		} catch (InterruptedException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		String s = "java";
		// for RTE not mandatory to handle the exception
		System.out.println(s.charAt(5));// RTE;

		mymethod1();// for RTE not mandatory to handle
		try {
			mymethod2();// for CTE mandatory to handle
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void mymethod1() throws ArrayIndexOutOfBoundsException {

	}

	private static void mymethod2() throws IOException {

	}

	private static void mymethod3() {

		int age = 30;
		if (age <= 0 && age > 60) {
			new RuntimeException();				// just object creation
			throw new RuntimeException();		// exception throw
		}
	}
}
