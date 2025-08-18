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
				When sub-classing an abstract or concrete class for quick behavior change.			
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







*****Before anonymous functions*****

class MyPrinter {
	public void printMessage() {
		System.out.println("printMessage method in MyPrinter class");
	}
}

public class Anonymous {
	public static void main(String[] args) {
		MyPrinter mp = new MyPrinter();
		mp.printMessage();
	}
}





*****anonymous functions*****

interface MyPrinter {
	void greet();
}

public class Anonymous {
	public static void main(String[] args) {
		MyPrinter mp = new MyPrinter() {
			public void greet() {
				System.out.println("greet method in MyPrinter interface");
			}
		};
		mp.greet();

		MyPrinter mp1 = () -> System.out.println("mp1 method in MyPrinter interface");
		mp1.greet();
	}
}





Example 1: Anonymous class using Runnable

 public class Anonymous {
	public static void main(String[] args) {
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("run method in Runnable interface");
			};
		};
		r1.run();
	}
 }




 Example 2: Anonymous class implementing a custom interface

interface MyPrinter {
	void greet();
}

public class Anonymous {
	public static void main(String[] args) {
		MyPrinter mp = new MyPrinter() {
			@Override
			public void greet() {
				System.out.println("greet method in MyPrinter interface");
			}
		};
		mp.greet();

		MyPrinter mp1 = () -> System.out.println("mp1 method in MyPrinter interface");
		mp1.greet();
	}
}







Example 3: Anonymous class with Comparator

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Anonymous {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banana", "Orange", "Apple");

		Collections.sort(list, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		System.out.println(list);
	}
}





Example 4: Anonymous class with Thread

public class Anonymous {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable(){
			public void run(){
				System.out.println("run method in Thread interface");
			}
		} );
		t.run();
	}
}





Same examples using Lambda (anonymous function)


 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface Greeting {
	void greet();
}

public class Anonymous {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("mohan", "john", "kevin");

		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		System.out.println("list : " + list);

		Runnable r1 = () -> System.out.println("Runnable with lambda");
		r1.run();

		Thread t1 = new Thread(() -> System.out.println("t1 method in Thread interface"));
		t1.run();

		Greeting g1 = new Greeting() {
			public void greet() {
				System.out.println("greet method in Greeting interface");
			}
		};
		g1.greet();

	}
}