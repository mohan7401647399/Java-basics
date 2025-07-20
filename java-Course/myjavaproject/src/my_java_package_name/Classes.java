/*
	In Java, a class is a fundamental building block of object-oriented programming.
	It serves as a blueprint or template for creating objects.

Key characteristics of a Java class:
	*Blueprint for Objects*:
		A class defines the structure and behavior that objects of that class will possess.
		It specifies the data (fields or attributes) and the operations (methods) that objects can perform.
 	*Logical Entity*:
		A class is a logical construct and does not occupy memory when declared.
		Memory is allocated only when an object (an instance of the class) is created.
 	*Encapsulation*:
		Classes support encapsulation by bundling data and the methods that operate on that data into a single unit. 
		This helps in controlling access to the data and promoting data integrity.
 	*User-Defined Type*:
		When you define a class, you are essentially creating a new data type that can be used to declare variables and create objects.
 	*Syntax*:
		A class is declared using the class keyword, followed by the class name and a block of code enclosed in curly braces, which contains the class members (fields, methods, constructors, etc.). 

	class syntax/structure:- 
		class className {
			//	fields(variables/properties)
			//	methods(actions/behaviour)
		}
*/

/* Example - 1
package my_java_package_name;

public class Classes {
	String name;													//	fields(state)
	int age;														//	fields(state)
	
	public void showDetails() {										// method(behaviour)
		System.out.println("Name is " + name + " age is " + age);
	}
	
	public static void main(String[] args) {
		Classes c1 = new Classes();									//	create an object
		c1.name = "Mohan";
		c1.age = 29;
		c1.showDetails();											//	call method
	}

}
*/


package my_java_package_name;

public class Classes {
	String name;													//	fields(state)
	int age;														//	fields(state)
	
	//	constructor - 	No need to assign values one by one after creating the object
	public Classes(String name, int age) {							
		this.name = name;
		this.age = age;
	}
	
	public void showDetails() {										// method(behaviour)
		System.out.println("Name is " + name + " age is " + age);
	}
	
	public static void main(String[] args) {
		Classes c1 = new Classes("Mohan", 29);						//	create an object
		c1.showDetails();											//	call method
	}

}