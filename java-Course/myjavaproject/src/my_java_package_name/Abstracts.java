/*

	✅ What is an abstract method?

		A method without a body (no implementation).
		Declared with the keyword abstract.
		Ends with a semicolon ;.

				abstract void draw();

		It just tells: "Every subclass must implement this method."

 
	✅ Why we use abstract methods?
		To force child classes to provide their own implementation.
		To create a common structure or blueprint for many classes.
		For polymorphism and code reusability.

	Example: Animal → sound()
	Every animal makes sound, but each animal makes it differently.
	So sound() should be abstract.


	✅ How to use abstract methods?
		Declare it inside an abstract class or interface.
		Subclass must implement it (using @Override).
		If subclass doesn't implement it → subclass must also become abstract.

		abstract class Shape {
			abstract void area(); // abstract method
		}

		class Circle extends Shape {
			@Override
			void area() {
				System.out.println("Area of Circle");
			}
		}


	✅ When to use abstract methods?
		Use abstract methods when:
			You have a common parent class, but the behavior (method) is different for each child.
			You only want to provide basic structure, not the full code.
			You want to enforce certain methods in all subclasses.



		
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
*/