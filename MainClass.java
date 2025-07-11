// Java is a high-level, object-oriented, general-purpose programming language and a computing platform first released by Sun Microsystems in 1995 (now owned by Oracle). 
// It's designed to be portable, secure, and robust, powering everything from mobile apps to enterprise systems.

//          01 - May - 2025
//  function
//  In Java, a function is a block of code that performs a specific task and can be reused throughout a program. However, Java is an object-oriented language, so functions are formally called methods and must be declared within a class (or interface)

// public class fn{
//     void greeting(){
//         System.out.println("Welcome");
//         welcome();
//     }
//     void welcome(){
//         System.out.println("Home");
//     }
//     void addition(){
//         int a = 10;
//         int b = 10;
//         int sum = a + b;
//         System.out.println(sum);
//     }
//     public static void main(String args[]){
//         fn obj = new fn();
//         obj.greeting();
//         fn obj1 = new fn();
//         obj1.addition();
//     }
// }



//  function parameters
//  In programming, function parameters (also called formal parameters) are variables defined in a function's declaration. They act as placeholders for the actual values (arguments) that must be supplied when the function is called. Parameters define what input a function expects to receive.
//  Parameters are specified in the method signature inside parentheses ():


// public class fn{
//     void getShop(int money){                          //  'money' are parameter
//         System.out.println( "money is " +money);
//     }
//     void chocolate(int money){
//         System.out.println("chocolate money is " + money);
//     }
//     void sum(int a, int b){
//         System.out.println(a + b);
//     }
//     public static void main(String[] args) {
//         fn shop = new fn();
//         shop.getShop(20);
//         fn chocolate = new fn();
//         chocolate.chocolate(50);
//         fn addition = new fn();
//         addition.sum(5, 10);
//     }
// }


//  return
//  In Java, the return keyword is used to explicitly exit a method and optionally send a value back to the caller. It plays a critical role in controlling the flow of methods


// public class fn{
//     int getMoney(int money){
//         return money;
//     }
//     public static void main(String args[]){
//         fn obj = new fn();
//         int ans = obj.getMoney(10);
//         System.out.println(ans);
//     }
// }


// public class fn{
//     int sum(int a, int b){
//         int c = a + b;
//         return c;
//     }
//     public static void main(String args[]){
//         fn obj = new fn();
//         int ans = obj.sum(2,30);
//         System.out.println(ans);
//     }
// }


// public class fn{
//     String name(String name){
//         return name;
//     }
//     public static void main(String args[]){
//         fn obj = new fn();
//         String myName = obj.name("Mohan");
//         System.out.println(myName);
//     }
// }


//      02 - May - 2025

// import java.util.Scanner;
// public class fn{

//     void evenoradd(int num){
//         if(num % 2 == 0){
//             System.out.println("Even Num is " + num);
//         } else {
//             System.out.println("Odd Num is " + num);
//         }
//     }

//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         fn obj1 = new fn();
//         obj1.evenoradd(number);
//     }
// }


// import java.util.Scanner;
// public class fn{
//     String passorfail(int num){
//         if(num > 35){
//             return "Pass";
//         } else {
//            return "Fail";
//         }
//     }
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         fn obj1 = new fn();
//         String result =  obj1.passorfail(number);
//         System.out.println(result);
//     }
// }


//          03 - May - 2025
//  method overloading
//  Define multiple methods with the same name but different parameters:


// public class fn{

//     void display(){
//         System.out.println("a");
//     }

//     void display(int a){
//         System.out.println("b");
//     }

//     public static void main(String[] args){
//         fn obj1 = new fn();
//         obj1.display();
//         fn obj2 = new fn();
//         obj2.display(57);
//     }
// }


// public class fn{

//     void display(int a, int b){
//         System.out.println(a + b);
//     }
//     void display(int a, int b, int c){
//         System.out.println(a + b + c);
//     }
//     public static void main(String[] args){
//         fn obj1 = new fn();
//         obj1.display(1,2);
//         fn obj2 = new fn();
//         obj2.display(5,5,6);
//     }
// }


// public int sum(int a, int b) {
//     return a + b;
// }
// public double sum(double a, double b) {
//     return a + b;
// }


//      enhanced foreach-loop

// public class fn{
//     public static void main(String[] args) {
//         int num[] = { 1,2,3,4,5};
//         for(int var:num){
//             System.out.println(var);
//         }
//     }
// }


// public class fn{
//     public static void main(String[] args) {
//         String str[] = { "a", "b", "c", "d"};
//         for(String var:str){
//             System.out.println(var);
//         }
//     }
// }




//      10 - May - 2025
//	this

// package java_practice;
// public class Teacher {

// 	String myName = null;
// 	Teacher(){
// 		System.out.println("Hello");
// 	}
// 	void setName(String myName) {
// 		this.myName = myName;
// 	}

// 	public static void main(String[] args) {
// 		Teacher t1 = new Teacher();
// 		t1.setName("Mohan");
// 		System.out.println(t1.myName);
// 	}	
// }


//        inheritance

//package java_practice;

//	Super class
//	class Dad{
//		int money = 200;
//	}
//	derived class
//	class Son extends Dad{
//		String name = "Mohan";
//	}
//
//	public class MainClass {
//		
//	public static void main(String[] args) {
//		Son s1 = new Son();
//		System.out.println(s1.money);
//		System.out.println(s1.name);
//	}
//}



//	        Single inheritance

//package java_practice;
	
//	super class
//	class Dad{
//		int money = 200;
//	}
//	derived class
//	class Son extends Dad{
//		String name = "Mohan";
//	}
//
//	public class MainClass {
//		
//	public static void main(String[] args) {
//		Son s1 = new Son();
//		System.out.println(s1.money);
//		System.out.println(s1.name);
//	}
//}



//			12 - May - 2025

//	        Multi level inheritance

//package java_practice;
//	
//	class Dad{
//		void dad() {			
//			System.out.println("Dad");
//		}
//	}
//	class Son extends Dad{
//		void son(){			
//			System.out.println("Son");
//		}
//	}
//	
//	class Daughter extends Son{
//		void daughter() {			
//			System.out.println("Daughter");
//		}
//	}
//
//	public class MainClass {
//		
//	public static void main(String[] args) {
//		Daughter d1 = new Daughter();
//		d1.daughter();
//		d1.son();
//		d1.dad();
//	}
//}



//	Hierarchical inheritance 

//			-> Dad -> Son -> Daughter

//package java_practice;
//	
//	class Dad{
//		void dad() {			
//			System.out.println("Dad");
//		}
//	}
//	class Son extends Dad{
//		void son(){			
//			System.out.println("Son");
//		}
//	}
//	
//	class Daughter extends Son{
//		void daughter() {			
//			System.out.println("Daughter");
//		}
//	}
//
//	public class MainClass {
//		
//	public static void main(String[] args) {
//		Daughter d1 = new Daughter();
//		d1.daughter();
//		d1.son();
//		d1.dad();
//	}
//}


//	hybrid inheritance 

// 	-> ( single ) && ( multi level ) && (Dad -> Son -> Daughter)

// package java_practice;
	
// 	class Dad{
// 		void dad() {			
// 			System.out.println("Dad");
// 		}
// 	}
// 	class Son extends Dad{
// 		void son(){			
// 			System.out.println("Son");
// 		}
// 	}
	
// 	class Daughter extends Son{
// 		void daughter() {			
// 			System.out.println("Daughter");
// 		}
// 	}
	
// 	class Wife extends Dad{
// 		void wife(){
// 			System.out.println("wife")
// 		}
// 	}

// 	public class MainClass {
// 	public static void main(String[] args) {
// 		Daughter d1 = new Daughter();
// 		d1.daughter();
// 		d1.son();
// 		d1.dad();
// 		Wife w1 = new Wife();
// 		w1.dad();
// 	}
// }



//		13 - May - 2025
//	inheritance practice


// package java_practice;

// class Animal{
// 	String name;
// 	int age;
// 	void makeSound() {
// 		System.out.println("Animal make a sound");
// 	}
// }

// class Dog extends Animal{
// 	String breed;
// 	void makeSound() {
// 		System.out.println("Dog barks");		
// 	}
// 	void fetch() {
// 		System.out.println("Dog is fetching");
// 	}
// }

// class Cat extends Animal{
// 	String color;
// 	void makeSound() {
// 		System.out.println("Meowwwww.....");		
// 	}
// 	void climb() {
// 		System.out.println("Cat is climbing");		
// 	}
// }


// public class MainClass {
// 	public static void main(String[] args) {

// 		Dog d1 = new Dog();
// 		d1.makeSound();
// 		d1.name = "pretty";
// 		d1.age = 5;
// 		d1.fetch();
		
// 		Cat c1 = new Cat();
// 		c1.makeSound();
// 		c1.name = "new";
// 		c1.age = 2;
// 		c1.climb();
// 	}

// }



//		23 - May - 2025
//	Super - keyword


// package java_practice;

// class Animal{
// 	int age = 12;
// 	Animal(String name) {
// 		System.out.println(name);
// 	}
// 	void makesound() {
// 		System.out.println("Animal make a sound");
// 	}
// }

// class Dog extends Animal{
// 	Dog() {
// 		super("Monkey");
// 		super.makesound();
// 		System.out.println("Dog barks");
// 		System.out.println(super.age);
// 	}
// }

// public class MainClass {
// 	public static void main(String[] args) {
// 		Dog d1 = new Dog();
// 	}
// }



// package java_practice;

// class Person{
// 	String name;
// 	Person(String name) {
// 		this.name=name;
// 	}
// }

// class Employee extends Person{
// 	Employee(String name) {
// 		super(name);
// 	}
// }

// public class MainClass {
// 	public static void main(String[] args) {
// 		Employee e1 = new Employee("Mohan");
// 		System.out.println(e1.name);
// 	}

// }



//		25 - May - 2025
//	abstract

// package java_practice;
// abstract class Person{
// 	abstract void child();
// }

// class Employee extends Person{
// 	void child() {
// 		System.out.println("child");
// 	}
// }

// public class MainClass {
// 	public static void main(String[] args) {
// 		Employee e1 = new Employee("Mohan");
// 		System.out.println(e1.name);
// 	}
// }


//		26 - May - 2025
//	static

// package java_practice;

// class Person{
// 	int mark = 0;
// 	static String name = "Mohan";
// }

// public class MainClass {
// 	public static void main(String[] args) {
		
// 		Person p1 = new Person();
// 		p1.mark = 50;
// 		Person.name = "Mohan R";
		
// 		Person p2 = new Person();
// 		p2.mark = 60;
		
// 		System.out.println(p1.name);
// 	}
// }



// package java_practice;

// class Person{

// 	static void disp() {
// 		System.out.println("Hello");
// 	}
// }

// public class MainClass {
// 	public static void main(String[] args) {
		
// 		Person.disp();
// 	}
// }


// package java_practice;

// public class MainClass {
// 	static int num = 10;
// 	public static void main(String[] args) {
// 		System.out.println(num);
// 	}
// }



// package java_practice;

// public class MainClass {
// 	static {
// 		System.out.println("static");
// 	}
// 	public static void main(String[] args) {
// 		System.out.println("main");
// 	}
// }


// package java_practice;

// public class MainClass {
// 	static {
// 		System.out.println("static");
// 	}
// 	public static void main(String[] args) {
// 		System.out.println("main");
// 		MainClass m1 = new MainClass();
// 		MainClass m2 = new MainClass();
// 	}
// }



//		28 - May - 2025
//	Final

// package java_practice;

// final class A{
// 	 void disp() {
// 		System.out.println("Class A");
// 	}
// }

// class B extends A{
// 	void disp() {
// 		System.out.println("Class B");
// 	}
// }

// public class MainClass {

// 	public static void main(String[] args) {
// 		B obj = new B();
// 		obj.disp();
// 	}
// }


//		31 - May - 2025
//	Constructor - Practice

// package java_practice;

//  class Person{
// 	 	public String name;
// 	 	protected int age;
// 	 	private String SecurityNumber;
// 	 	String address;
// 	 	Person(String name, int age, String ssn, String address){
// 	 		this.name = name;
// 	 		this.age = age;
// 	 		this.SecurityNumber = ssn;
// 	 		this.address = address;
// 	 	}
// }

// class Employee extends Person{
// 	Employee(String name, int age, String ssn, String address){
		
// 		super(name, age, ssn, address);
// 		System.out.println("Employee Class");
// 	}
// }

// public class MainClass {

// 	public static void main(String[] args) {
// 		Employee e1 = new Employee("Mohan", 29, "djfdsl", "Chennai");
		
// 		System.out.println(e1.name);
// 		System.out.println(e1.age);
// 		System.out.println(e1.address);
		
// 	}
// }



//	Static - Practice

// package java_practice;

// class Counter{
// 	static int count = 0;
// 	int instanceNumber = 0;
	
// 	Counter(){
// 		count = count + 1;
// 		instanceNumber = instanceNumber + 1;
// 	}
	
// 	void disp() {
// 		System.out.println("instanceNumber " + instanceNumber);
// 		System.out.println("count " + count);
// 	}
// }


// public class MainClass {

// 	public static void main(String[] args) {
// 		Counter e1 = new Counter();
// 		e1.disp();
// 		Counter e2 = new Counter();
// 		e2.disp();
// 		Counter e3 = new Counter();
// 		e3.disp();
// 	}
// }



// package java_practice;

// abstract class Animal{
// 	String name;
// 	Animal(String name){
// 		this.name = name;
// 	}
// 	abstract void makeSound();
// }

// class Dog extends Animal{
// 	Dog(String name){
// 		super(name);
// 	}
// 	void makeSound() {
// 		System.out.println("Wowwww....!");
// 	}
// }

// class Cat extends Animal{
// 	Cat(String name){
// 		super(name);
// 	}
// 	void makeSound() {
// 		System.out.println("Meowwww....!");
// 	}
// }


// public class MainClass {

// 	public static void main(String[] args) {
// 		Dog d1 = new Dog("Pretty");
// 		System.out.println(d1.name);
// 		d1.makeSound();
		
// 		Cat c1 = new Cat("Blacky");
// 		System.out.println(c1.name);
// 		c1.makeSound();
// 	}
// }



// package java_practice;

// abstract class vehicle{
// 	final void startEngine() {
// 		System.out.println("Engine Started.....!");
// 	}
	
// 	static String getVehicleType() {
// 		return "Generic Vehicle";
// 	}
	
// 	abstract void drive();
// }

// class Car extends vehicle{
// 	void drive() {
// 		System.out.println("Drive a Car");
// 	}
// }

// class Bike extends vehicle{
// 	void drive() {
// 		System.out.println("Drive a Bike");
// 	}
// }


// public class MainClass {

// 	public static void main(String[] args) {
// 		Car c1 = new Car();
// 		c1.drive();
// 		System.out.println(vehicle.getVehicleType());
		
// 		Bike b1 = new Bike();
// 		b1.drive();
// 		System.out.println(vehicle.getVehicleType());
// 	}
// }




//		01 - Jun - 2025
//	interface

// package java_practice;

// interface Animal{
// 	int mark = 20;
// 	void sound();
	
// 	default void disp() {
// 		System.out.println("disp...");
// 	}
// }

// class Cat implements Animal{
// 		public void sound() {
// 			System.out.println("Cat....");
// 		}
// }

// public class MainClass {

// 	public static void main(String[] args) {
// 		Cat c1 = new Cat();
// 		c1.sound();
// 		System.out.println(c1.mark);
// 		c1.disp();
// 	}
// }




//	        multi interface

// package java_practice;

// interface A{
// 	void disp();
// }

// interface B{
// 	void disp();
// }

// class C implements A,B{
// 	public void display() {
// 		System.out.println("Class C...");
// 	}
// }

// public class MainClass {

// 	public static void main(String[] args) {
// 		C c1 = new C();
// 		c1.display();
// 	}
// }



//	Lambda Expression

// package java_practice;

// interface A{
// 	void disp();
// }


// public class MainClass {

// 	public static void main(String[] args) {
// 		A obj = () -> {
// 			System.out.println("Class A");
// 		};
// 		obj.disp();
// 	}
// }




//		02 - Jun - 2025
//	Exception handling

//package java_practice;
//
//import java.util.Scanner;
//
//public class MainClass {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		try {
//			System.out.print("Enter the number : ");
//			int a = scan.nextInt();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("Program Ended");
//	}
//}


//package java_practice;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class MainClass {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		try {
//			System.out.print("Enter the number : ");
//			int a = scan.nextInt();
//			int b = 10/0;			
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		} catch (InputMismatchException e){
//			System.out.println(e);
//		}
//		System.out.println("Program Ended");
//	}
//}



// package java_practice;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class MainClass {

// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		int a = 0;
// 		int b = 0;
// 		int c = 0;
		
// 		try {
// 			System.out.print("Enter the number : ");
// 			a = scan.nextInt();
// 			System.out.print("Enter the number : ");
// 			b = scan.nextInt();
// 			c = a / b;
// 		} catch (ArithmeticException e) {
// 			System.out.println(e + " Please try");
// 		} catch (InputMismatchException e) {
// 			System.out.println(e + " Please try");
// 		}
// 		System.out.println("Program Ended " + c);
// 	}
// }



//		03 - Jun - 2025
//	Finally
// package java_practice;

// import java.util.Scanner;

// public class MainClass {

// 	public static void main(String[] args) {
// 		try {
// 			int a = 10/0;
// 		} catch (Exception e) {
// 			System.out.println("error" + e);
// 		} finally {
// 			System.out.println("finally completed");
// 		}
// 	}
// }



// package java_practice;

// public class MainClass {

// 	public static void main(String[] args) {
// 		int err = 0;
// 		try {
// 			int a = 10/0;
// 			err=0;
// 		} catch (Exception e) {
// 			err=1;
// 		} finally {
// 			if(err == 1) {
// 				System.out.println("Error found");
// 			} else {
// 				System.out.println("No Error");
// 			}
// 		}
// 	}
// }



//		04 - Jun - 2025
//	throw

// package java_practice;

// import java.util.Scanner;

// public class MainClass {

// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		try {
// 			int age = scan.nextInt();
// 			if(age < 1) throw new ArithmeticException("Age should be greater than 1");
// 		} catch (ArithmeticException e) {
// 			System.out.println(e);
// 		}
// 	}
// }



//		05 - Jun - 2025
//	custom exception handling

// package java_practice;
// import java.util.Scanner;

// class NotValidException extends Exception{
// 	public NotValidException(String s) {
// 		super(s);
// 	}
// }

// public class MainClass {

// 	public static void main(String[] args) {
		
// 		Scanner scan = new Scanner(System.in);
		
// 		try {
// 			int age = scan.nextInt();
// 			if(age < 18) throw new NotValidException("Your age should be above - 18");
// 		} catch (NotValidException e) {
// 			System.out.println(e);
// 		} catch(Exception e) {
// 			System.out.println(e);
// 		}
// 	}
// }



//		07 - Jun - 2025
//	custom exception handling - Practice

// package java_practice;
// import java.util.Scanner;

// class DivisionExample{
// 	void divideNumbers(int num, int den) {		
// 	try {
// 		int result = num / den;
// 		System.out.println("Result is " + result);
// 	} catch (ArithmeticException e){
// 		System.out.println("Cannot divide by zero");
// 		}
// 	}
// }

// public class MainClass {

// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		int n1 = scan.nextInt();
// 		int n2 = scan.nextInt();
		
// 		DivisionExample d1 = new DivisionExample();
// 		d1.divideNumbers(5, 10);
// 	}
// }



// package java_practice;

// import java.util.Scanner;

// class InvalidAgeException extends Exception{
// 	public InvalidAgeException(String message) {
// 		super(message);
// 	}
// }

// class AgeValidator{
// 	void checkage(int age) {
// 		try {
// 			if(age < 0 || age > 150) {
// 				throw new InvalidAgeException("Age is Invalid");
// 			} else {
// 				System.err.println("Valid Age");
// 			}
// 		} catch (Exception e) {
// 			System.out.println(e);
// 		}
// 	}
// }

// public class MainClass {

// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		int age = scan.nextInt();
		
// 		AgeValidator a1 = new AgeValidator();
// 		a1.checkage(50);
// 	}
// }



//	throws

// package java_practice;

// class Calc{
// 	void div() throws Exception{
// 		int num = 10/0;
// 	}
// }

// public class MainClass {

// 	public static void main(String[] args) {
// 		Calc c1 = new Calc();
// 		try{
// 			c1.div();
// 		} catch (Exception e) {
// 			System.out.println(e);
// 		}
// 	}
// }



//		08 - Jun - 2025
//	Text-File handling

//  File - creation

// package java_practice;

// import java.io.FileWriter;

// public class MainClass {

// 	public static void main(String[] args) {
		
// 		try{			
// 			FileWriter fw = new FileWriter("Output.txt");
// 			fw.write("Hello world");
// 			fw.close();			
// 			System.out.println("File appended");
// 		} catch (Exception e) {
// 			System.out.println("Something has happened");
// 		}
// 	}
// }



//  File - append

// package java_practice;

// import java.io.FileWriter;

// public class MainClass {

// 	public static void main(String[] args) {
		
// 		try{			
// 			FileWriter fw = new FileWriter("Output.txt");
// 			fw.append("Heyyyy");
// 			fw.close();			
// 			System.out.println("File appended");
// 		} catch (Exception e) {
// 			System.out.println("Something has happened");
// 		}
// 	}
// }


//  File - added

// package java_practice;

// import java.io.FileWriter;

// public class MainClass {

// 	public static void main(String[] args) {
		
// 		try{			
// 			FileWriter fw = new FileWriter("Output.txt", true);
// 			fw.append("hello");
// 			fw.close();			
// 			System.out.println("File appended");
// 		} catch (Exception e) {
// 			System.out.println("Something has happened");
// 		}
// 	}
// }



//      Buffered writer


// package java_practice;

// import java.io.BufferedWriter;
// import java.io.FileWriter;

// public class MainClass {

// 	public static void main(String[] args) {
		
// 		try{			
// 			FileWriter fw = new FileWriter("Output.txt", true);
// 			BufferedWriter bw = new BufferedWriter(fw);
// 			bw.write("buffered writter");
// 			bw.newLine();
// 			bw.write("new Buffered line");
// 			bw.close();
// 			System.out.println("Buffered file");
// 		} catch (Exception e) {
// 			System.out.println("Something has happened");
// 		}
// 	}
// }


//		09 - Jun - 2025
//	Text-File read method

// package java_practice;

// import java.io.FileReader;

// public class MainClass {

// 	public static void main(String[] args) {
		
// 		try{			
// 			FileReader fr = new FileReader("Output.txt");
// 			int c = fr.read();
// 			while(c != -1) {
// 				System.out.println((char)c);
// 				c = fr.read();
// 			}
// 			fr.close();

// 		} catch (Exception e) {
// 			System.out.println("Something has happened");
// 		}
// 	}
// }



//	Buffered

// package java_practice;

// import java.io.BufferedReader;
// import java.io.FileReader;

// public class MainClass {

// 	public static void main(String[] args) {
		
// 		try{			
// 			FileReader fr = new FileReader("Output.txt");
// 			BufferedReader br = new BufferedReader(fr);
// 			String line = br.readLine();
			
// 			while(line != null) {
// 				System.out.println(line);
// 				line = br.readLine();
// 			}
// 			br.close();

// 		} catch (Exception e) {
// 			System.out.println("Something has happened");
// 		}
// 	}
// }



//		10 - Jun - 2025
//	Thread

// package java_practice;

// class A extends Thread{
// 	public void run() {
// 		for(int i=0; i<5; i++) {
// 			System.out.println("A class....");
// 		}
// 	}
// }

// class B extends Thread{
// 	public void run() {
// 		for(int i=0; i<5; i++) {
// 			System.out.println("B class....");
// 		}
// 	}
// }

// public class MainClass {
	
// 	public static void main(String[] args) {
// 		A a1 = new A();
// 		B b1 = new B();
		
// 		a1.start();
// 		b1.start();
// 	}
// }


//  sleep()

// package java_practice;

// class A extends Thread{
// 	public void run() {
// 		for(int i=0; i<5; i++) {
// 			System.out.println("A class....");
// 			try {
// 				Thread.sleep(5);
// 			} catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

// class B extends Thread{
// 	public void run() {
// 		for(int i=0; i<5; i++) {
// 			System.out.println("B class....");
// 			try {
// 				Thread.sleep(5);
// 			} catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

// public class MainClass {
	
// 	public static void main(String[] args) {
// 		A a1 = new A();
// 		B b1 = new B();
		
// 		a1.start();
// 		b1.start();
// 	}
// }



//		10 - Jun - 2025
//	setPriority

// package java_practice;

// class A extends Thread{
// 	public void run() {
// 		for(int i=0; i<5; i++) {
// 			System.out.println("A class....");
// 			try {
// 				Thread.sleep(5);
// 			} catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

// class B extends Thread{
// 	public void run() {
// 		for(int i=0; i<5; i++) {
// 			System.out.println("B class....");
// 			try {
// 				Thread.sleep(5);
// 			} catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

// public class MainClass {
	
// 	public static void main(String[] args) {
// 		A a1 = new A();
// 		B b1 = new B();
		
// 		b1.setPriority(5);
// 		a1.setPriority(5);		
// 		a1.start();
// 		b1.start();
// 	}
// }



//		11 - Jun - 2025
//	Join

// package java_practice;

// class A extends Thread{
// 	int j = 0;
// 	public void run() {
// 		j = 50;
// 	}
// }

// public class MainClass {
	
// 	public static void main(String[] args) {
// 		A a1 = new A();
// 		a1.start();
// 		try {
// 			a1.join();
// 		} catch (InterruptedException e) {
// 			e.printStackTrace();
// 		}
// 		System.out.println(a1.j);
// 	}
// }




//		11 - Jun - 2025
//	Runnable thread

// package java_practice;

// class A implements Runnable{
// 	public void run() {
// 		System.out.println("Runnable thread");
// 	}
// }

// public class MainClass {
	
// 	public static void main(String[] args) {
// 		Runnable a1 = new A();
		
// 		Thread t1 = new Thread(a1);
// 		t1.start();
// 	}

// }