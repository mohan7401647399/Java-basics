/*
	In Java, an interface is a reference type, similar to a class, that is a collection of abstract methods. 
	It is used to define a contract that classes must follow. 
	Interfaces help in abstraction and multiple inheritance.

	Why we use interface:-
		In Java, interfaces are used to define a contract or blueprint for classes without specifying the implementation.

	Key points:-
		Interface cannot have a constructor.
		We cannot create the object for interface.
		We create the methods in interface that's call as abstract method(do not have a body).
		Default key used for method body creation.
		static key used for method body creation.





package my_java_package_name;

interface Animal {
	String name = "Cat";				//	implicity public static final
	int age = 5;						//	implicity public static final

	void sound();						//	abstract method do not have a body

	default void display() {			//	default key used for method body creation
		System.out.println("default method using for methods");
	}

	static void show() {				//	static key used for method body creation
		System.out.println("static methods for interface");
	}
}

class Cat implements Animal {			//	inherit the parent class
	@Override
	public void sound() {				//	method body 
		System.out.println(name + " " + age);
	}
}

public class Interfaces {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.sound();								//	call instance method
		c1.display();							//	call default method
		Animal.show();							//	call static method
	}
}




interface Payments{
    void pay();
}
class GPay implements Payments{
    public void pay(){
        System.out.println("Payments received via Gpay");
    }
}
class PhonePay implements Payments{
    public void pay(){
        System.out.println("Payments received via Phonepay");
    }
}

class Main {
    public static void main(String[] args) {
        PhonePay p1 = new PhonePay();
        p1.pay();
        GPay g1 = new GPay();
        g1.pay();
    }
}


package my_java_package_name;

interface Payments{
	void display();
	default void defaultMethod() {
		System.out.println("default method");
	}
}

class Gpay implements Payments{
	public void display() {
		System.out.println("Gpay class implements payments interface");
	}
}

class PhonePay implements Payments{
	public void display() {
		System.out.println("PhonePay class implements payments interface also");
	}
}


public class Interfaces {
	public static void main(String[] args) {
		Gpay g1 = new Gpay();
		g1.display();
		PhonePay p1 = new PhonePay();
		p1.display();
		g1.defaultMethod();
	}
}

 */

package my_java_package_name;

interface Office {
	void method();

	default void display() {
		System.out.println("default method in Office interface");
	}

	static void view() {
		System.out.println("static method in office interface");
	}
}

class Employee implements Office {
	public void method() {
		System.out.println("method fn in Employee class implements office interface");
	}
}

class HR implements Office {
	public void method() {
		System.out.println("method fn in HR class implements office interface");
	}
}

class Interfaces {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		HR h1 = new HR();
		e1.display();
		e1.method();
		h1.display();
		h1.method();
		Office.view();
	}
}
