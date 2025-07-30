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
 */


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
