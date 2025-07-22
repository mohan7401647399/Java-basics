/*
		In Java, the final keyword is used to restrict modification. It can be applied to:


1. Final Variable
	* A final variable’s value cannot be changed once assigned.
	* It becomes a constant.


package my_java_package_name;

public class Final {
	
	static String name = "Mohan";							//	static variable
	final String place = "Chennai";							//	final variable
//	String place = "madurai";								//	❌ Error: Cannot assign a value to final variable 'place'
		
	public static void main(String[] args) {
		System.out.println(name);							//	call static variable directly
		Final f1 = new Final();								//	create an object
		System.out.println(f1.place);						//	call final variable using object
	}
}




2. Final Method
	* A final method cannot be overridden by subclasses.

package my_java_package_name;

class Parent {
	final void show() {										//	final method
		System.out.println("This is a final method");
	}
}

class Child extends Parent{
	void show() {											// ❌ Error: Cannot override final method
		System.out.println("Trying to method override");
	}
}

public class Final {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.show();
	}
}



3. Final Class
	* A final class cannot be extended (no subclassing).

package my_java_package_name;

final class Parent {
	void show() {										//	final method
		System.out.println("This is a final method");
	}
}

class Child extends Parent{								// ❌ Error: Cannot inherit from final class
	void show() {
		System.out.println("Trying to method override");
	}
}

public class Final {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.show();
	}
}
 */


