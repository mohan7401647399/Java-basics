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

Types of Constructors:
	*Default Constructor*:
		If no constructor is explicitly defined in a class, the Java compiler automatically provides a public,
			no-argument default constructor. This constructor initializes instance variables with their default values (e.g., 0 for numeric types, null for objects, false for booleans).
	*No-Argument Constructor*:
		This is a constructor explicitly defined by the programmer that takes no arguments.
			It can be used to perform specific initialization logic when an object is created without any initial parameters.
	*Parameterized Constructor*:
		This type of constructor takes one or more arguments, allowing the object's instance variables to be
			initialized with specific values passed during object creation.
	*Copy Constructor*:
		A copy constructor is a special constructor used to create a new object as a copy of an existing object.
		Java does not provide a default copy constructor like C++, but you can define one manually.
	
	Constructor syntax/structure:- 
		class className{
			ClassName(){								//	constructor
				//	codes
			}
		}


package my_java_package_name;

public class Constructors {
	String name;												//	instance variable
	int age;													//	instance variable

	//	No constructor is defined so java provides a default constructor

	public Constructors() {										//	no parameter constructor
		this.name = "Mickel";									//	refer to the current class instance
	}	
	public Constructors(String name) {							//	single parameter constructor
		this.name = name;										//	refers to the current class instance
	}
	public Constructors(String name, int age) {					//	double parameter constructor
		this.name = name;										//	refers to the current class instance
		this.age = age;											//	refers to the current class instance
	}
	public Constructors(Constructors constructor) {				//	copy constructor
		this.name = constructor.name;							//	refers to the current class instance
		this.age = constructor.age;								//	refers to the current class instance
	}
	public void display() {										//	instance method
		System.out.println("constructor method");
	}
	public static void main(String[] args) {
		Constructors noPara = new Constructors();					//	create an object for no para
		System.out.println(noPara.name);
		Constructors singlePara = new Constructors("Mohan");		//	create an object for single para
		System.out.println(singlePara.name);
		Constructors doublePara = new Constructors("Mohan", 29);	//	create an object for double para
		System.out.println(doublePara.name);
		System.out.println(doublePara.age);
		
		Constructors c1 = new Constructors(doublePara);				//	another constructor pass to copy object
		c1.display();
	}
}
 */
