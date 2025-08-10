/*
		In Java, an abstract method is a method that is declared without a body — meaning it only has a method signature (name, parameters, and return type) but no implementation.
It is meant to be overridden in a subclass to provide the actual behavior.


	Key points about abstract methods
		Declaration		
			Use the abstract keyword in the method declaration.		
			End the declaration with a semicolon ; (no {} block).
		
		Where it can exist		
			Abstract methods can only be declared inside an abstract class or an interface.		
			If a class has even one abstract method, that class must be declared abstract.
		
		Purpose		
			To force subclasses to implement specific methods.		
			Useful for defining a common API for different implementations.

	Rules to remember
		No body → abstract methods have only a declaration.		
		Subclass responsibility → all non-abstract subclasses must implement the abstract method.		
		No final or static → abstract methods cannot be final, static, or private because they must be overridden.
		Polymorphism → enables different subclass behaviors while sharing the same method signature.

 */

package my_java_package_name;

abstract class Hotel {
	abstract void display();
	public void place() {
		System.out.println("place instance method in abstract class");
	}
}

class Money extends Hotel {
	public void display() {
		System.out.println("Money class extends Hotel abstract class");
	}
}

class Dish extends Hotel {
	public void display() {
		System.out.println("Dish class extends Hotel abstract class");
	}
}

public class Abstracts {
	public static void main(String[] args) {
		Money m1 = new Money();
		Dish d1 = new Dish();
		
		m1.display();
		d1.display();
		m1.place();
		d1.place();
	}
}
