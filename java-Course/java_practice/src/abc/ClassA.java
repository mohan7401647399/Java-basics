package abc;

import java.util.Scanner;

public class ClassA {
	public static int a = 10;
	static Scanner sc = new Scanner(System.in);
	public static void m2() {
		System.out.println(ClassA.a);
		System.out.println("Enter the value");
		int first = sc.nextInt();
		System.out.println("Enter the value");
		sc.nextLine();//for resolve buffer issue
		String second = sc.nextLine();
		System.out.println(first);
		System.out.println(second);
		char c =sc.next().charAt(0);
		System.out.println(c);
	}
}
