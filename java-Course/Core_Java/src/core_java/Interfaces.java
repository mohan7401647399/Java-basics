/*

	✅ What is an interface in Java?
			An interface is a blueprint of a class that contains abstract methods, and from Java 8 onwards it can also contain default and static methods. It defines what a class must do, not how it does it.

			interface Animal {
				void sound();  // abstract method
			}


	✅ Why do we use interface?
		We use interfaces for 3 main reasons:
			Abstraction – Hide implementation details.
			Multiple Inheritance – Java doesn't support multiple inheritance with classes, but you can implement multiple interfaces.
			Loose Coupling – Makes your code flexible and maintainable, especially in large applications.


	✅ How to use interface?
		We declare an interface using the interface keyword, and use the implements keyword in a class to provide body for all interface methods.

		interface Animal {
			void sound();
		}

		class Dog implements Animal {
			public void sound() {
				System.out.println("Bark");
			}
		}


	✅ When should we use interface?
			You need to define a common behavior for multiple unrelated classes (e.g., Dog, Car, Robot all can move()).
			You want to achieve multiple inheritance.
			You want to create a contract for future developers (e.g., all payment types must implement pay()).

	Key points:-
		We must declared variable inside the interface
		Interface cannot have a constructor.
		We cannot create the object for interface.
		We create the methods in interface that's call as abstract method(do not have a body).
		Default key used for method body creation.
		static key used for method body creation.



🔹 Key Differences: Abstract Class vs Interface

	| Feature              | Abstract Class                                                                                     | Interface                                                                                                                                    |
	| -------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
	| **Keyword**          | Declared using `abstract`                                                                          | Declared using `interface`                                                                                                                   |
	| **Object Creation**  | Cannot create object                                                                               | Cannot create object                                                                                                                         |
	| **Methods**          | Can have **abstract methods** and **concrete methods**                                             | Java 7 and earlier: only **abstract methods** <br> Java 8+: can have **default & static methods** <br> Java 9+: can have **private methods** |
	| **Variables**        | Can have **instance variables** (normal variables)                                                 | All variables are **public, static, final** (constants) by default                                                                           |
	| **Constructors**     | Can have constructors                                                                              | Cannot have constructors                                                                                                                     |
	| **Inheritance**      | A class can **extend only one abstract class** (single inheritance)                                | A class can **implement multiple interfaces** (multiple inheritance)                                                                         |
	| **Access Modifiers** | Abstract methods can have **any visibility** (public, protected, etc.)                             | All methods are **public** (by default)                                                                                                      |
	| **Use Case**         | Used when classes share a common base and want to provide **partial abstraction** + **code reuse** | Used to define a **contract/behavior** without caring about implementation                                                                   |
	| **Polymorphism**     | Achieved by extending                                                                              | Achieved by implementing                                                                                                                     |



package my_java_package_name;

interface Animal {
	String name = "Cat";				//	implicity public static final
	int age = 5;						//	implicity public static final

	void sound();						//	abstract method do not have a body

	default void display() {			//	default key used for method body creation
		System.out.println("default method using for methods");
	}

	static void show() {				//	static key used for method body creation
		System.out.println("static methods for interface");
	}
}

class Cat implements Animal {			//	inherit the parent class
	@Override
	public void sound() {				//	method body 
		System.out.println(name + " " + age);
	}
}

public class Interfaces {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.sound();								//	call instance method
		c1.display();							//	call default method
		Animal.show();							//	call static method
	}
}




interface Payments{
    void pay();
}
class GPay implements Payments{
    public void pay(){
        System.out.println("Payments received via Gpay");
    }
}
class PhonePay implements Payments{
    public void pay(){
        System.out.println("Payments received via Phonepay");
    }
}

class Main {
    public static void main(String[] args) {
        PhonePay p1 = new PhonePay();
        p1.pay();
        GPay g1 = new GPay();
        g1.pay();
    }
}


package my_java_package_name;

interface Payments{
	void display();
	default void defaultMethod() {
		System.out.println("default method");
	}
}

class Gpay implements Payments{
	public void display() {
		System.out.println("Gpay class implements payments interface");
	}
}

class PhonePay implements Payments{
	public void display() {
		System.out.println("PhonePay class implements payments interface also");
	}
}


public class Interfaces {
	public static void main(String[] args) {
		Gpay g1 = new Gpay();
		g1.display();
		PhonePay p1 = new PhonePay();
		p1.display();
		g1.defaultMethod();
	}
}



package my_java_package_name;

interface Office {
	void method();

	default void display() {
		System.out.println("default method in Office interface");
	}

	static void view() {
		System.out.println("static method in office interface");
	}
}

class Employee implements Office {
	public void method() {
		System.out.println("method fn in Employee class implements office interface");
	}
}

class HR implements Office {
	public void method() {
		System.out.println("method fn in HR class implements office interface");
	}
}

class Interfaces {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		HR h1 = new HR();
		e1.display();
		e1.method();
		h1.display();
		h1.method();
		Office.view();
	}
}


***** Interface types *****

💡 Summary Table
	| Type                     | Key Feature                             | Example Use              |
	| ------------------------ | --------------------------------------- | ------------------------ |
	| **Normal Interface**     | General contracts with multiple methods | `List`, `Runnable`       |
	| **Functional Interface** | Exactly one abstract method             | `Comparator`, `Runnable` |
	| **Marker Interface**     | No methods, only tagging                | `Serializable`           |
	| **Nested Interface**     | Defined inside another class/interface  | `Map.Entry`              |



	Marker interface
		An empty interface with no methods.
		Used to mark a class for special behavior (often in frameworks or serialization).
		Examples in Java: Serializable, Cloneable.

package my_java_package_name;

interface Inface{};				//	no body

class Interfaces implements Inface{
	//	Markers tells something to JVM or frameword
}





	Functional Interface
		Has exactly one abstract method (can have multiple default/static methods).
		Used in lambda expressions and method references.
		Marked with @FunctionalInterface annotation (optional but recommended).


package my_java_package_name;

interface Calculator {
	int add(int a, int b);
	public default void m1() {
		System.out.println("m1 method");
	};
};

class Interfaces {
	public static void main(String[] args) {
		Calculator c = (x, y) -> x + y;		//	lambda expression
		System.out.println(c.add(5, 9));
		c.m1();
	}
}






	Normal Interface
		Contains only abstract methods (before Java 8) and constants.
		
		From Java 8 onward, it can also have:			
			Default methods (with default keyword)			
			Static methods			
			Private methods (Java 9+)
	
	
package my_java_package_name;

interface Animal {
	void sound();		//	abstract method
	
};

class Interfaces {
	public void sound() {
		System.out.println("Bark");
	}
}





	Nested Interface (Member Interface)
		An interface declared inside another interface or class.
		Can be public, private, or protected (inside a class), but public static when inside another interface.





package my_java_package_name;

class Outer{
	interface Animal {
		void sound();		//	abstract method
	};
}

class Interfaces implements Outer.Animal {
	public void sound() {
		System.out.println("Bark");
	}
}

 

interface First {
	void firstMethod();

	default void secondMethod() {
		System.out.println("second method called in First interface");
	}
}

class Second implements First {
	public void firstMethod() {
		System.out.println("firstMethod called in Second class");
	}
}

class Third implements First {
	public void firstMethod() {
		System.out.println("firstMethod called in Third interface");
	}
}

class Interfaces {
	public static void main(String[] args) {
		First f1 = new Second();
		First f2 = new Third();
		f1.firstMethod();
		f1.secondMethod();
		f2.firstMethod();
		f2.secondMethod();
	}
}

*/
package core_java;

interface A {
	void display();
}

interface B {
	void display();
}

class C implements A, B {
	public void display() {
		System.out.println("C class");
	}
}

class Interfaces {
	public static void main(String[] args) {
		C c1 = new C();
		c1.display();
	}
}