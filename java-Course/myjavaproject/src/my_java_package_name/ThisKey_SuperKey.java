/*

	🔑 Difference between this & super
| Feature          | `this`                          | `super`                        |
| ---------------- | ------------------------------- | ------------------------------ |
| Refers to        | Current object                  | Parent object                  |
| Used for         | Accessing current class members | Accessing parent class members |
| Constructor call | Calls current class constructor | Calls parent class constructor |
| Method access    | Current class method            | Parent class method            |
| Variable access  | Current class variable          | Parent class variable          |




	✅ What is this?
		this is a reference variable that refers to the current object of the class.

	✅ When to use this?
		When local variables (method parameters) hide instance variables (shadowing problem).
		To call current class methods/constructors.
		To pass the current object as an argument.
		To return the current object.

	✅ Why use this?
		To avoid naming conflicts between instance variables and local variables.
		To increase code clarity and reusability.


	*Referring instance variables*

package my_java_package_name;
		
public class ThisKey {
	int value;
	public ThisKey(int value) {
		this.value = value; 			// 'this.value' refers to the instance variable
										//	'value' refers to the local parameter
	}
	public static void main(String[] args) {
		ThisKey t1 = new ThisKey(100);
		System.out.println(t1.value);
	}
}



 	*Invoking current class methods*: 
		this can be used to call other methods within the same class. 

package my_java_package_name;

public class ThisKey {
	public void method1() {
		System.out.println("method 1");
	}
	public void method2() {
		this.method1();							// Invokes method1 of the current object
	}
	public static void main(String[] args) {
		ThisKey t1 = new ThisKey();
		t1.method1();
		t1.method2();
	}
}



	*Invoking current class constructors*: 
		this() can be used to call another constructor from within the same class's constructor, enabling constructor chaining.

package my_java_package_name;

public class ThisKey {
	int x;
	String s;
	
	public ThisKey(int x) {
		this.x = x;
	}
	public ThisKey(int x, String s) {
		this(x);							 // Calls the constructor with one integer argument
		this.s = s;
	}
	public static void main(String[] args) {
		ThisKey t1 = new ThisKey(10);
		System.out.println(t1.x);		
	}
}





class Dummy {
	String name;
	
	Dummy(){
		this("Mohan r");
		System.out.println("Default constrctor");
	}

	Dummy(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("name is " + name);
	}
	
	public void show() {
		this.display();
	}
}

class ThisKey {
	public static void main(String[] args) {
//		Dummy d1 = new Dummy("Mohan");
//		System.out.println(d1.name);
//		d1.show();
		new Dummy();
	}
}





 	*Passing the current object as an argument*:
 		this can be passed as an argument to a method or constructor when the current object's reference is required.


package my_java_package_name;

public class ThisKey {
	String name;
	
	public ThisKey(String name) {
		this.name = name;
	}
	
	void display() {
		System.out.println("name is " + name);
	}
	
	void printObject(ThisKey t) {
		t.display();
	}
	
	void callPrint() {
		printObject(this);
	}
	
	public static void main(String[] args) {
		ThisKey t1 = new ThisKey("Mohan");
		t1.callPrint();
	}
}









					🔹 2. super keyword in Java

✅ What is super?
	super is a reference variable that refers to the parent (superclass) object.

✅ When to use super?
	To access parent class variables/methods that are hidden by child class.
	To call parent class constructor.
	To explicitly call parent methods when overridden in child.

✅ Why use super?
	To achieve inheritance control when parent and child have the same names.
	To reuse parent constructor’s code.




1. Access parent class variable

class Parent {
	String name = "mohan";
}

class Child extends Parent {
	String name = "Rockabye";

	void getNames() {
		System.out.println("Parent class name is : " + super.name);
		System.out.println("Current or child class name is : " + name);
	}
}

class ThisKey_SuperKey {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.getNames();
	}
}
	




2. Access parent class method

class Parent {
	void show(){
		System.out.println("show method in Parent class");
	}
}

class Child extends Parent {
	void show(){
		System.out.println("show method in Child class");
	}

	void getNames() {
		this.show();
		super.show();
	}
}

class ThisKey_SuperKey {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.getNames();
	}
}





3. Call parent constructor


class Parent {
	Parent(String name){
		System.out.println("Parent class name is " + name);
	}
}

class Child extends Parent {
	Child(){
		super("mohan");
		System.out.println("Child class constructor");
	}

}

class ThisKey_SuperKey {
	public static void main(String[] args) {
		new Child();

	}
}

*/
