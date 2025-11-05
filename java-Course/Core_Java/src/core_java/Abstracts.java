/*

	✅ What is an abstract method?

		A method without a body (no implementation).
		Declared with the keyword abstract.

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
			You have a common parent class, but the behavior (method) is different for each child.
			You only want to provide basic structure, not the full code.
			You want to enforce certain methods in all subclasses.



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




package core_java;

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








abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	public void sound() {
		System.out.println("sound method implement in Dog class extends abstract Animal class");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("sound method implement in Cat class extends abstract Animal class");
	}
}

public class Abstracts {
	public static void main(String[] args) {
		Animal a1 = new Animal() { // anonymous inner class
			public void sound() {
				System.out.println("Animal abstract class");
			}
		};
		a1.sound(); // prints Animal abstract class

		Dog d1 = new Dog();
		d1.sound(); // prints Dog class

		Cat c1 = new Cat();
		c1.sound();	// prints Cat class
	}
}


abstract class College {
	abstract void studentMethod();
}

class Student extends College {
	void studentMethod() {
		System.out.println("studentMethod method in Student class");
	}
}

class Teacher extends College {
	void studentMethod() {
		System.out.println("studentMethod method in Teacher class");
	}
}

class Abstracts {
	public static void main(String[] args) {
		Student s1 = new Student();
		Teacher t1 = new Teacher();

		s1.studentMethod();
		t1.studentMethod();

		College c1 = new Student();
		c1.studentMethod();

		College c2 = new Teacher();
		c2.studentMethod();

		College[] c = new College[2];
		c[0] = new Student();
		c[1] = new Teacher();

		for (College clg : c) {
			clg.studentMethod();
		}
	}
}


package core_java;

abstract class Company{
	String name;
	abstract void project();
	Company(String name){
		this.name = name;
		System.out.println("constructor");
	}
	void place() {
		System.out.println("place method");
	}
}

class Employee extends Company{
	Employee(String name){
		super(name);
	}
	
	public void project() {
		System.out.println("project method declared in Employee class " + name);
	}
}

class Abstracts {
	public static void main(String[] args) {
		Company c1 = new Employee("Mohan");
		c1.project();
		c1.place();
	}

}



 */
package core_java;

abstract class AbstractClass {

    abstract void abstractMethod();

    void normalMethod() {
        System.out.println("normal method in abstract class");
    }
}

class NormalClass extends AbstractClass {

    @Override
    public void abstractMethod() {
        System.out.println("abstract method in NormalClass class");
    }
}

public class Abstracts {

    public static void main(String[] args) {
        AbstractClass a1 = new NormalClass();
        a1.abstractMethod();
        a1.normalMethod();
        AbstractClass a2 = new AbstractClass() {

            @Override
            void abstractMethod() {
                System.out.println("abstract method called in main class");

            }
        };
        a2.abstractMethod();
    }
}
