/*
	The this keyword in Java is a reference variable that refers to the current object. 
	It is used within an instance method or a constructor to access members of the current object

  	this() method - Calls another constructor in same class used inside a constructor only
  	****Note - this() must be the first line in the constructor****
  

Uses of the this keyword:
	*Differentiating between instance variables and local variables*:
		When a method or constructor parameter has the same name as an instance variable,
			this is used to explicitly refer to the instance variable.



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
*/