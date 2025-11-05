/*
		Access Modifiers in Java control where our variables, methods, or classes can be accessed from.

		Access modifiers are keywords in Java that define how much access other classes/objects have to variables, methods, and classes.


	❓ Why do we use Access Modifiers?
		To control visibility of code.
		To protect data from unwanted access and modification.
		To implement encapsulation (core OOP principle).
		To reduce errors and misuse of internal code.


	⚙ How to use Access Modifiers?
		You write them before the data type or return type:
			public class Student {
				private int id;            // accessed only inside this class
				public String name;        // accessed from anywhere
				protected int marks;       // accessed by subclasses or within same package
						String grade;      // default/package-private
		}


	📅 When should we use each one?
		| Modifier                 | When to Use                                                                           |
		| ------------------------ | ------------------------------------------------------------------------------------- |
		| **public**               | If something should be accessible from anywhere. Eg: API methods, utility classes.    |
		| **private**              | If data/methods are internal to the class. Eg: variables, helper methods.             |
		| **protected**            | When you want to allow child classes to access but not other classes outside package. |
		| **default (no keyword)** | When it's only needed inside the same package, not outside.                           |


	💡 Quick Summary

		Use private for data hiding.
		Use public for global access.
		Use protected for inheritance but controlled access.
		Default is automatically used when no modifier is written.


		| Modifier               | Access Level                 			|
		| ---------------------- | ---------------------------- 			|
		| `public`               | Everywhere                   			|
		| `private`              | Only within the same class   			|
		| `protected`            | Same class ➜ same package ➜ subclasses  |
		| *default* (no keyword) | Same package only            			|


| Modifier    | Same Class | Same Package | Subclass (other package) | Other Package        |
| ----------- | ---------- | ------------ | ------------------------ | -------------------- |
| `public`    | ✅         | ✅           | ✅                       | ✅                   |
| `private`   | ✅         | ❌           | ❌                       | ❌                   |
| *default*   | ✅         | ✅           | ❌                       | ❌                   |
| `protected` | ✅         | ✅           | ✅                       | ❌ (unless inherited)|





						*****1. public – Accessible everywhere*****

package my_java_package_name;

public class AccessModifiers {
	
	//	We can access name and show() from any class, even in other packages.
	public String name = "Mohan";								//	public variable
	
	public void show() {											//	public method
		System.out.println("name is " + name);
	}
	
	public static void main(String[] args) {
		AccessModifiers a1 = new AccessModifiers();				//	create an object
		a1.show();												//	call method
	}
}


package my_java_package_name;

public class AccessModifiers {

	public static void main(String[] args) {
		PublicClass p1 = new PublicClass();							//	create on object
		p1.display();												//	call method
		PublicClass2 p1 = new PublicClass2();						//	create on object
		p2.display();												//	call method
	}
}

class PublicClass{
	public void display() {											//	public method
		System.out.println("PublicClass called");
	}
}

class PublicClass2{
	public void display() {											//	public method
		System.out.println("PublicClass2 called");
	}
}



						*****2. private – Accessible only in the same class*****

package my_java_package_name;

public class AccessModifiers {
	
	//	We cannot access name or show() from outside this class.
	private String name = "Mohan";								//	public variable
	
	private void show() {										//	public method
		System.out.println("name is " + name);
	}
	
	public void display() {
		show();
	}
	
	public static void main(String[] args) {
		AccessModifiers a1 = new AccessModifiers();				//	create an object
		a1.display();											//	call method
	}
}



package my_java_package_name;

public class AccessModifiers {

	public static void main(String[] args) {
		PrivateClass n1 = new PrivateClass();							//	create on object
		n1.display();													//	call method
		//	we cannot call the private data into the another class
		n1.name;															//	call variable
	}
}

class PrivateClass{
	private String name = "Mohan";
	public void display() {												//	public method
		System.out.println("newClass called");
	}
}




					*****3. default (no keyword) – Accessible only in the same package*****

package my_java_package_name;

class AccessModifiers {
	//	You can access this only from classes in the same package, not outside.
	int age = 29;
	
	void display() {
		System.out.println("age is  " + age);
	}
	
	public static void main(String[] args) {
		AccessModifiers a1 = new AccessModifiers();						//	create an object
		a1.display();													//	call method
	}
}



package my_java_package_name;

public class AccessModifiers {

	public static void main(String[] args) {
		PrivateClass n1 = new PrivateClass();							//	create on object
		System.out.println(n1.name);										//	call variable
		n1.display();													//	call method
	}
}

class PrivateClass{														//	default class
	 String name = "Mohan";												//	default variable
	 void display() {													//	default method
		System.out.println("newClass called");
	}
}




					*****4. protected – Accessible in same package + subclasses (child classes)*****
package my_java_package_name;

class AccessModifiers {
	//	You can access this only from classes in the same package, not outside.
	protected int age = 29;

	protected void display() {
		System.out.println("age is  " + age);
	}
	
	public static void main(String[] args) {
		AccessModifiers a1 = new AccessModifiers();				//	create an object
		a1.display();											//	call method
	}
}



package my_java_package_name;

public class AccessModifiers {

	public static void main(String[] args) {
		ProtectedClass n1 = new ProtectedClass();						//	create on object
		System.out.println(n1.name);										//	call variable
		n1.display();													//	call method
	}
}

class ProtectedClass{
	 protected String name = "Mohan";									//	protected variable
	 protected void display() {											//	protected method
		System.out.println("ProtectedClass called");
	}
}


*/
package core_java;

public class AccessModifiers {
	
	 protected String name = "Mohan";									//	protected variable
	 
	public static void main(String[] args) {
		ProtectedClass n1 = new ProtectedClass();						//	create on object
		n1.display();													//	call method
		System.out.println(n1.name);										//	print another class variable using extends
	}
}

class ProtectedClass extends AccessModifiers{
	
	 protected void display() {											//	protected method
		System.out.println("ProtectedClass called using extends by " + name);
	}
}

 