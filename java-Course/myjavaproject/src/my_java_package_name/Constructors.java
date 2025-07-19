/*
In Java, a constructor is a special type of method used to initialize new objects of a class.
	It is invoked automatically when an object is created using the new keyword. 

Key characteristics of Java constructors:
	*Same Name as Class*:
		A constructor must have the exact same name as the class it belongs to.
	*No Return Type*:
		Unlike regular methods, constructors do not have a return type, not even void.
	*Automatic Invocation*:
		Constructors are called automatically when an object is instantiated.
	*Initialization*:
		Their primary purpose is to set the initial state of an object by assigning values to its instance variables.
	*Overloading*:
		A class can have multiple constructors with different parameter lists, allowing for various ways to initialize objects (constructor overloading). 
2
Types of Constructors:
	*Default Constructor*:
		If no constructor is explicitly defined in a class, the Java compiler automatically provides a public, no-argument default constructor. This constructor initializes instance variables with their default values (e.g., 0 for numeric types, null for objects, false for booleans).
	*No-Argument Constructor*:
		This is a constructor explicitly defined by the programmer that takes no arguments. It can be used to perform specific initialization logic when an object is created without any initial parameters.
	*Parameterized Constructor*:
		This type of constructor takes one or more arguments, allowing the object's instance variables to be initialized with specific values passed during object creation.
	*Copy Constructor*:
		While Java does not have a built-in copy constructor like C++, the concept can be implemented by creating a constructor that takes an object of the same class as an argument and copies its data members to the new object.

	Constructor syntax/structure:- 
		class className{
			ClassName(){								//	constructor
				//	codes
			}
		}
*/

package my_java_package_name;

public class Constructors {
	String name;
	int age;
	
	//	No constructor is definded so java provides a default constructor
	
	public Constructors() {										//	no parameter
		this.name = "Mickel";
	}	
	public Constructors(String name) {							//	single parameter
		this.name = name;
	}
	public Constructors(String name, int age) {					//	double parameter
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Constructors noPara = new Constructors();
		System.out.println(noPara.name);
		Constructors singlePara = new Constructors("Mohan");
		System.out.println(singlePara.name);
		Constructors doublePara = new Constructors("Mohan", 29);
		System.out.println(doublePara.name);
		System.out.println(doublePara.age);
	}
}
