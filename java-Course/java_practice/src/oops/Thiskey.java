//	The this keyword in Java is a special reference variable used inside an instance method or constructor to refer to the current object — the object whose method or constructor is being executed.

/*
| Use Case           | Description                                 |
| ------------------ | ------------------------------------------- |
| `this.variable`    | Refers to instance variable                 |
| `this()`           | Calls another constructor in the same class |
| `this.method()`    | Calls a method on the current object        |
| `this` as argument | Pass current object to method/constructor   |
| `return this;`     | Return current object (useful for chaining) |
*/



package oops;
/*
//	1. To refer to the current class's instance variables
//	When local variables (like method parameters) have the same name as instance variables, this distinguishes between them.
public class Thiskey {
	String name;
	
	Thiskey(String name){
		this.name = name;		// this.name → instance variable; name → parameter
	}
	
	public static void main(String[] args) {
		Thiskey t1 = new Thiskey("Mohan");
		System.out.println(t1.name);
	}
}
*/

/*
//	2. To call another constructor in the same class
// You can use this() to call another constructor from one constructor (constructor chaining).
public class Thiskey {
	String name;
	int age;

	Thiskey(String name) {
		this(name, 18);			  			// Calls the other constructor
	}
	Thiskey(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Thiskey t1 = new Thiskey("Mohan");
		System.out.println(t1.name);
		System.out.println(t1.age);
	}
}
*/


/*
//	3. To pass the current object as an argument
//	Sometimes, you may want to pass the current object to another method or constructor.
public class Thiskey {
	void show(Thiskey t) {
		System.out.println("this is: " + t);
	}
	void display() {
		show(this);
	}

	public static void main(String[] args) {
		Thiskey t1 = new Thiskey();
		t1.display();
	}
}
*/


/*
//	4. To return the current object
//	Useful for method chaining.
public class Thiskey {
	Thiskey setName(String name) {
		this.name = name;
		return this;
	}
	
	Thiskey setAge(int age) {
		this.age = age;
		return this;
	}

	public static void main(String[] args) {
		Thiskey t1 = new Thiskey();
		System.out.println(t1.setName("Mohan"));
		
	}
}
*/


//	5. To access current class methods or fields (optional)
//	Sometimes you can use this.method() or this.variable, but it's often optional unless there's ambiguity.

public class Thiskey {

	public void getName() {
		System.out.println("optional for this keyword");
	}
	public void printName() {
//		this.getName();
		getName();
	}

	public static void main(String[] args) {
		Thiskey t1 = new Thiskey();
		t1.getName();
		
	}
}