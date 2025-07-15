/*
package oops;

* we cannot inherit private,block and constructor
 * we can inherit variables and methods

class R15Bike{
	String name;
	String color;
	String brand;
}

class R15V1 extends R15Bike{//single level inheritance
	
	String newFeature;
}

class R15V3 extends R15V1{
	
}
//class R15V4 extends R15V3,R15V3{we cannot extends more than one class
	class R15V4 extends R15V3{
	//multi level inheritance
}

//hierarchical inheritance
class A{
}

//multiple and hybrid inheritance not support using class
class B extends A{
}
class C extends A{
}

public class MainClass {

	
}
*/





// 				**** practice *****


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