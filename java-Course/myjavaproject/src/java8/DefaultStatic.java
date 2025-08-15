/*

Key Differences
	| Feature      | Default Method                           | Static Method          |
	| ------------ | ---------------------------------------- | ---------------------- |
	| Keyword      | `default`                                | `static`               |
	| Access       | Through object                           | Through interface name |
	| Overridable? | ✅ Yes                                   | ❌ No                   |
	| Purpose      | Provide default behavior to implementers | Utility/helper methods |



	1. Default Methods
		Declared in an interface using the default keyword.		
		Have a method body (unlike normal abstract methods).		
		Can be overridden in implementing classes.
		
		Purpose:-		
			Add new methods to interfaces without forcing all implementing classes to implement them.
			Provide a default behavior.
	

package java8;

interface Vehicle {
	default void method1() {
		System.out.println("method1 using default key in Vehicle interface");
	};
}

class Car implements Vehicle {
	public void method1() {
		System.out.println("method1 override");	// can override only if needed
	};
}

public class DefaultStatic {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.method1();
	}
}





	2. Static Methods
		Declared with the static keyword inside an interface.
		Have a method body.
		Cannot be overridden by implementing classes.
		Called using the interface name, not the object.



package java8;

interface Vehicle {
	static void method1() {
		System.out.println("method1 using static key in Vehicle interface");
	};
}

public class DefaultStatic {
	public static void main(String[] args) {
		Vehicle.method1();
	}
}





package java8;
 */


interface Vehicle {
	static void method1() {
		System.out.println("method1 using static key in Vehicle interface");
	};
}

class Car implements Vehicle {
	public void method1() {
		System.out.println("method1 override");
	}
}

public class DefaultStatic {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.method1();
		Vehicle.method1();
	}
}
