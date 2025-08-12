package my_java_package_name;
/*
					Class -> Blueprint
					Object -> Real item from class

					OOPS Pillars:
						- Encapsulation (Data hiding)
						- Inheritance   (Reusability)
						- Polymorphism  (Flexibility)
						- Abstraction   (Hiding details)

		*What is OOPS in Java*?
	OOPS stands for Object-Oriented Programming System.
	Java is an object-oriented language, meaning:
		- We build programs using objects and classes instead of just functions.


		*4 Main Pillars of OOPS*
| Concept          | Meaning (Easy Explanation)                                          |
| ---------------- | ------------------------------------------------------------------- |
| 1. Encapsulation | Keep data safe using private variables + public methods             |
| 2. Inheritance   | One class can use properties/methods of another class               |
| 3. Polymorphism  | One thing behaves in different ways (method overloading/overriding) |
| 4. Abstraction   | Show only necessary details, hide unnecessary ones                  |






					*****1. Encapsulation - Binding Data + Methods*****
	Encapsulation is a fundamental OOP principle that bundles data (attributes) and methods (behavior) into a single unit (class) while restricting direct access to internal state. 
	It acts as a protective shield, preventing external code from altering an object's data unexpectedly.

package my_java_package_name;

public class OOPS {
	private String name = "Mohan";									//	private variable = hidden
	private int age = 29;											//	private variable = hidden
	
	public void setValues(String name, int age) {					// helper method - setter
		this.name = name;											//	set values
		this.age = age;												//	set values
	}
	
	public String getValues() {										// helper method - getter
		return this.name + " " + this.age;							//	get values
	}
	
	public static void main(String[] args) {
		OOPS encap = new OOPS();									//	create an object
		System.out.println(encap.getValues());						//	call method in sysout()
	}	
}




					*****2. Inheritance – One Class Inheriting Another*****
		Java Inheritance is a fundamental concept in object-oriented programming that allows a new class to inherit properties and behaviors (fields and methods) from an existing class. 
		This promotes code reusability and establishes a hierarchical relationship between classes.
	
	* we cannot inherit private, block and constructor
	* we can inherit variables and methods
	* Five types of inheritance available -> single, multi, hierarchical, multiple, hybrid
	* multiple and hybrid inheritance not support using class*


							i. single level - One subclass --> one Superclass/parent class
	* One class inherits from another class is known as single level inheritance

package my_java_package_name;

class Hotels{
	public String name ="Taj";
	void dish() {
		System.out.println("Hotel name is " + name);
		System.out.println("Dishes methods are available in the hotel class");
	}
}

public class OOPS extends Hotels {
	public int price = 50000;
	void items() {
		System.out.println(name + "food price is " + price);
		System.out.println("Extra one items methods are available in the OOPS class using extends keyword");
	}
	
	public static void main(String[] args) {
		OOPS inheritance = new OOPS();									//	create an object
		inheritance.dish();
		inheritance.items();
	}	
}




						ii. Multilevel - chain of inheritance
		* A class inherit from another class, that class inherit from another
							class is known as multi-level inheritance

package my_java_package_name;

class Restaurant{
	public String place ="India";
	void locate() {
		System.out.println("Restaurant located in " + place);
		System.out.println("Restaurant class");
	}
}

class Hotels extends Restaurant{
	public String name ="Taj";
	void dish() {
		System.out.println("Hotel name is " + name);
		System.out.println("One more datas available from Restaurant class + Dishes methods are available in the hotel class");
	}
}

public class OOPS extends Hotels {
	public int price = 50000;
	void items() {
		System.out.println(name + "food price is " + price);
		System.out.println("Extra one items methods are available in the OOPS class using extends keyword");
	}
	
	public static void main(String[] args) {
		OOPS inheritance = new OOPS();									//	create an object
		inheritance.dish();
		inheritance.items();
		inheritance.locate();
	}	
}




							iii. hierarchical inheritance - Multiple subclasses -> one superclass/parent class
	* Multiple classes inherit from the same parent class is known as hierarchical inheritance.

package my_java_package_name;

class Restaurant{
	public String place ="India";
	void locate() {
		System.out.println("Restaurant located in " + place);
		System.out.println("Restaurant class");
	}
}

class Hotels extends Restaurant{
}

public class OOPS extends Restaurant {
	public int price = 50000;
	void items() {
		System.out.println("Restaurant located in " + place);
		System.out.println("Parent class data are available in the OOPS class using extends keyword");
	}
	
	public static void main(String[] args) {
		OOPS inheritance = new OOPS();									//	create an object
		inheritance.items();
		inheritance.locate();
	}	
}





							iv. Multiple inheritance - Mulitple classes using interface

		* If a child class is having more than one parent is known as multiple inheritance. 
		* Multiple inheritance is not possible by using class, but multiple inheritance is possible by using interface


package my_java_package_name;

	interface A {
		void show();
	}
	interface B {
		void display();
	}
	class C implements A, B{
		public void show() {
			System.out.println("A interface with show method");
		}
		public void display() {
			System.out.println("B interface with display method");
		}
	}
	
	public class OOPS {
		
	public static void main(String[] args) {
		C multipleInhertiance = new C();							//	create an object
		multipleInhertiance.show();									//	call method
		multipleInhertiance.display();								//	call method
	}	
}




					v. Hybrid Inheritance = Combination of more than one type of inheritance.

		 * Examples -> Single + Hierarchical or Multilevel + Multiple
		 * Hybrid = Interface + Class Inheritance

package my_java_package_name;

interface A{
	void show();
}
interface B{
	void display();
}
class C{
	void greet() {
		System.out.println("C class");
	}
}

//Hybrid: inherits from Base + implements multiple interfaces
class OOPS extends C implements A, B {
	
	public void show() {
		System.out.println("show method");
	}
	public void display() {
		System.out.println("display method");
	}
	
	public static void main(String[] args) {
		OOPS hybridInheritance = new OOPS();
		hybridInheritance.show();
		hybridInheritance.display();
		hybridInheritance.greet();
	}
}





					*****3. Polymorphism – One Name, Many Forms*****

		* Polymorphism means many forms.
		* Polymorphism refers to the ability of an object to take many forms specifically,
				- in Java, it means that a method can have the same
						- name but different implementations is known as polymorphism.

		* In Java we have 2 types of polymorphism:
				1. Compile time polymorphism(or)static binding.
				2. Run time polymorphism(or)dynamic binding.

		* Compile-time Polymorphism (Method Overloading):
			1. This occurs when a class has multiple methods with the same name but different parameters (number, type, or order of arguments).
			2. The correct method to be executed is determined by the compiler based on the arguments passed during the method call.
			3. Example: Having multiple add methods in a class, one for integers (add(int a, int b)) and another for doubles (add(double a, double b)).


a. Method Overloading (same name, different parameters)

package my_java_package_name;

public class OOPS{
	
	void add(int a, int b) {
		System.out.println(a + b);
	}
	void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		OOPS intNums = new OOPS();
		intNums.add(5, 2);
		intNums.add(2.5, 5.1);
	}
}


			* Runtime Polymorphism (Method Overriding):
				* This occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. 
				* The method to be executed is determined at runtime based on the actual object type being referred to by the reference variable (Dynamic Method Dispatch). 
				* This typically involves using the @Override annotation for clarity and compiler checks.
				* Example: A Shape class with a draw() method, and Circle and Square subclasses that override draw() to provide their specific drawing logic. A Shape reference variable holding a Circle object will call Circle's draw() method at runtime.


b. Method Overriding (child class changes parent method)

package my_java_package_name;

class Animal{
	void sound() {
		System.out.println("Animal make a sound");
	}
}

class OOPS extends Animal{
	@Override
	void sound() {
		System.out.println("OOPS make a sound");
	}
	
	public static void main(String[] args) {
		OOPS p1 = new OOPS();							//	polymorphism
		p1.sound();										//	call subclass method
	}
}




// 				Run-time polymorphism (method overriding)
class A {
    void add() {    // original method
        System.out.println("add method called");
    }
}

class B extends A {
    @Override
    void add() {    // overridden method
        System.out.println("add method rewrite");
    }
}

class Main {
    public static void main(String[] args) {
        A obj = new B();   // upcasting: parent reference, child object
        obj.add();         // will call overridden method in B
    }
}



					*****4. Abstraction – Hiding Details, Showing Only Essentials *****

			* Abstraction is the process of hiding unnecessary implementation
					- details and providing the essential features of an object.
			* Abstraction hides the “how” and shows only “what”.
			* We can achieve abstraction by using abstract class or interface.

		* Why We Use abstract:-
			* In Java, the abstract keyword is used with classes and methods to define incomplete structures that must be implemented by subclasses.
			* It’s a key part of abstraction and inheritance in object-oriented programming.

		* Key rules:- 
			1. Abstract method don't have a body.
			2. Abstract method only inside the abstract class.
			3. Abstract class have a constructor.
			4. Abstract class have a methods.


* Method - 01 *
package my_java_package_name;

abstract class Vehicle{
	abstract void start();									//	abstract method - no body
}

class OOPS extends Vehicle{
	void start() {											//	create the body for abstract
		System.out.println("OOPS class to invoke");
	}
	public static void main(String[] args) {
		Vehicle a1 = new OOPS();							//	create an object
		a1.start();											//	call method
	}
}



* Method - 02 *
package my_java_package_name;

abstract class Vehicle{
	abstract void start();									//	abstract method - no body

	void speed() {											//	instance method
		System.out.println("XYZ brand");
	}
}

class Car extends Vehicle{									//	Car class extends vehicle
	void start() {											//	create the body for abstract
		System.out.println("car extends the vehicle class");
	}
}

class OOPS extends Car{										//	Car OOPS extends vehicle
	void start() {											//	create the body for abstract
		System.out.println("OOPS class to invoked");
	}
	public static void main(String[] args) {
		Car a1 = new OOPS();								//	create an object
		a1.start();											//	call method
	}
}



* Method - 03 *
abstract class A{
    abstract void a1();						//	abstract method
    public void display(){					//	instance method
        System.out.println("display method in abstract class");
    }
    A(){									//	constructor
        System.out.println("A constructor");
    }
}
class B extends A{
    void a1(){
        System.out.println("B class write in A abstract class");
    }
}

class Main {
    public static void main(String[] args) {
        A a1 = new B(); //  upcasting parent reference, child class
        a1.display();	//	call method
        a1.a1();        //  call method
    }
}
*/


/*

class OOPS {
	private String name = "John";
	private int age = 29;

	public String getName() {
		return this.name;
	}

	public void setName(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		OOPS encap = new OOPS();
		System.out.println(encap.getName());
		
		encap.setName("Mohan", 20);
		System.out.println(encap.getName());
	}
}
*/


class A{
	public String name = "jack";
	public int age = 29;
	
}

class B{

}

class OOPS extends B{
	public static void main(String[] args){

	}
}