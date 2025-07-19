/*
		Access Modifiers in Java control where your variables,
			methods, or classes can be accessed from.
			
			
		| Modifier               | Access Level                 |
		| ---------------------- | ---------------------------- |
		| `public`               | Everywhere                   |
		| `private`              | Only within the same class   |
		| `protected`            | Same package + child classes |
		| *default* (no keyword) | Same package only            |


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
	
	public void show() {										//	public method
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
	public void display() {										//	public method
		System.out.println("PublicClass called");
	}
}

class PublicClass2{
	public void display() {										//	public method
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
		n1.name;														//	call variable
	}
}

class PrivateClass{
	private String name = "Mohan";
	public void display() {										//	public method
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
		AccessModifiers a1 = new AccessModifiers();				//	create an object
		a1.display();											//	call method
	}
}



package my_java_package_name;

public class AccessModifiers {

	public static void main(String[] args) {
		PrivateClass n1 = new PrivateClass();							//	create on object
		System.out.println(n1.name);									//	call variable
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

	protected  void display() {
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
		System.out.println(n1.name);									//	call variable
		n1.display();													//	call method
	}
}

class ProtectedClass{
	 protected String name = "Mohan";									//	protected variable
	 protected void display() {											//	protected method
		System.out.println("ProtectedClass called");
	}
}



package my_java_package_name;

public class AccessModifiers {
	
	 protected String name = "Mohan";									//	protected variable
	 
	public static void main(String[] args) {
		ProtectedClass n1 = new ProtectedClass();						//	create on object
		n1.display();													//	call method
	}
}

class ProtectedClass extends AccessModifiers{

	 protected void display() {											//	protected method
		System.out.println("ProtectedClass called using extends by " + name);
	}
}

*/