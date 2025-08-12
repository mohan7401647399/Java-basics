/*
	A nameless class in Java is an Anonymous Inner Class — a class without a name that is declared and instantiated at the same time.

	Let’s break your question into What, Where, and Why:

		1. What is a Nameless (Anonymous) Class?
			A local inner class with no name.			
			Defined and instantiated in a single statement.			
			Used to override methods of:			
				Interfaces				
				Abstract classes				
				Concrete classes			
			Cannot have explicit constructors (since there’s no name).			
			Can have instance initializer blocks for setup.

		2. Where is it Used?
			You use anonymous classes:			
				Inside a method, constructor, or block.			
				When implementing an interface for one-time use.			
				When subclassing an abstract or concrete class for quick behavior change.			
				Common places:			
					Event handling (e.g., in Java Swing / AWT).			
					Thread creation with Runnable.			
					Custom comparator with Collections.sort.

		3. Why Use an Anonymous Class?
			Advantages:			
				Short and concise for one-off behavior.				
				Avoids creating a separate named class file.				
				Keeps code close to where it’s used.			
			Disadvantages:				
				Cannot be reused.				
				Hard to read for complex logic.				
				Cannot have multiple constructors.
	


	Implementing an Interface
	
	

package java8;

interface Greeting{
	void sayHello();
}

public class Annonymus {
	public static void main(String[] args) {
		Greeting g1 = new Greeting() {
			public void sayHello() {
				System.out.println("SayHello method from annonymous class");
			}
		};
		g1.sayHello();
	}
}




	Implements abstract class
	
package java8;

abstract class Animal {
	abstract void sound();
}

public class Annonymus {
	public static void main(String[] args) {
		Animal dog = new Animal() {
			void sound() {
				System.out.println("sound method from annonymous class");
			}
		};
		dog.sound();
	}
}





	With Runnable (Thread Example)

package java8;

public class Annonymus {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread running....");
			}
		});
		t1.start();
	}
}
 */

package java8;

interface Top {
	void next();
}

public class Annonymus {
	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		Top t1 = new Top() {
			public void next() {
				System.out.println("next method from Top interface");
			}
		};		
		t1.next();
		
		Top t2 = new Top() {
			public void next() {
				System.out.println("another next method from Top interface");
			}
		};
		t2.next();
		
		Top t3 = new Top() {
			public void next() {
				m2();
				System.out.println("another one next method from Top interface");
			}
			public void m2() {
				System.out.println("one extra method");
			}
		};
		t3.next();
	}
}