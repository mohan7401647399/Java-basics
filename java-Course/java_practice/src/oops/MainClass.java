//package oops;

/* //	single level - One subclass --> one Superclass/parent class
	class Animal{
		
	}
	class Dog extends Animal{
		
	} */
 
	
/* //	Multilevel - chain of inheritance
	class Animal{
		
	}
	class Dog extends Animal{
		
	}
	class pretty extends Dog{
		
	} */


/* //	hierarchical inheritance - Multiple subclasses -> one superclass/parent class
class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
} */



/*
//	example
class Vehicle{
	protected String brand;
}
class Car extends Vehicle{
	private int price;
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void start() {
		System.out.println(brand +  " Started and price with " + price);
	}
}

	
public class MainClass {
	public static void main(String[] args) {
	Car myCar = new Car("BMW", 100000);
	myCar.start();
	}
}
*/