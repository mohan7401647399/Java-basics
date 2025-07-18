/*
	A method is a block of code which only runs when it is called.
	You can pass data, known as parameters, into a method.
	Methods are used to perform certain actions, and they are also known as functions.
	Why use methods? To reuse code: define the code once, and use it many times.
*/

//				1. Instance Methods
//	can access -> Instance variables, Static variables, Local variables

package methods;

public class Methods {
	private int instanceInt = 10;					// In a class we call - instance variable
	private static int staticInt = 100;				// In a class we call - static variable
	private void instanceMethods() {
		System.out.println("Instance method");		
	}
	private static void staticMethod() {
		System.out.println("Static method");
	}
	
	public void instanceMethod() {
		int localInt = 5;							//	In a method we call - local variable
		this.instanceInt = 5;						//	using - this keyword(optional)
		staticMethod();								//	static method using Direct call
		instanceMethods();							//	instance method using Direct call
		System.out.println(localInt);
		System.out.println(instanceInt);
		System.out.println(staticInt);
	}
	public static void main(String[] args) {
		Methods m1 = new Methods();
		m1.instanceMethod();
	}
}




/*
//				2. Static Methods
//	can access -> Static variables, Local variables
//	cannot access -> Instance variables

package methods;

public class Methods {
	private int instanceInt = 10;					// In a class we call - instance variable
	private static int staticInt = 100;				// In a class we call - static variable
	
	public static void instanceMethod() {
		int localInt = 5;							//In a method we call - local variable
		System.out.println(localInt);
		System.out.println(instanceInt);			//	we cannot access the instance variables(directly)
		System.out.println(staticInt);
	}
	public static void main(String[] args) {
		Methods m1 = new Methods();
		m1.instanceMethod();
	}
}
*/