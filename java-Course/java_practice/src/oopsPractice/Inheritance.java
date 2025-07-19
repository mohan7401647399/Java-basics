package oopsPractice;

class Vehicle{
	int price;
	String color;
	public void display() {
		System.out.println("Vehicle class");
	}
}

class Car extends Vehicle{
	String name;
//	Car c1 = new Car();
//	System.out.println("Vehicle class");
	
}

public class Inheritance {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.display();
		Car c1 = new Car();
		System.out.println(c1.price);
		System.out.println(c1.name);
	}
}
