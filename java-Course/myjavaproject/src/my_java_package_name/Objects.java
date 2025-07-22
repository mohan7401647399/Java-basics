/*
 	* In Java, an object is a fundamental building block of object-oriented programming (OOP).
 	* It represents a specific instance of a class, embodying both data (state) and behavior (methods).

Key characteristics of Java objects:
	*Instance of a Class*:
		An object is created from a class, which serves as its blueprint. 
			The class defines the structure and behavior that objects of that type will possess.
	*State (Attributes/Fields)*:
		Objects have a state, which is represented by their attributes or fields. 
			These are variables declared within the class that hold data specific to each individual object. For example, a Car object might have attributes like make, model, and color.
	*Behavior (Methods)*:
		Objects exhibit behavior through their methods.
			These are functions defined within the class that perform actions or operations on the object's data. For instance, a Car object might have methods like startEngine() or accelerate().
 	*Identity*:
		Each object has a unique identity, allowing it to be distinguished from other objects, even if they are instances of the same class and have identical states. This identity is typically managed by the Java Virtual Machine (JVM).
 	*Creation*:
		Objects are created using the new keyword followed by the class's constructor. This process allocates memory for the object and initializes its state. 
	*Interaction*:
		Objects interact with each other by invoking methods and accessing fields. This interaction forms the basis of program logic in object-oriented applications. 
 	*Encapsulation*:
		Objects encapsulate their data and methods within a single unit, promoting data hiding and controlled access to internal state.
		In essence, objects are the concrete realizations of the abstract definitions provided by classes, allowing developers to model real-world entities and build modular, reusable, and maintainable software components. 
	
	
	*object syntax/structure:- *
		className objectName = new ClassName(arguments);
		
		
package my_java_package_name;

public class Objects {									//	class(blueprint)
	String name;										//	fields(state)
	int age;											//	fields(state)
	
	public void display() {								//	method(behaviout)
		System.out.println("My name is " + name + " and age is " + age);
	}
	
	public static void main(String[] args) {
		Objects o1 = new Objects();						//	o1 is an object
		o1.name = "Mohan";								//	assign values to object fields
		o1.age = 29;									//	assign values to object fields
		o1.display();									//	call method using object
	}
}		
*/
