package java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*
 * Default and static method
 * Lambda Expression
 * Functional Interface
 * Method Reference
 * Stream API
 * Date and Time API
 */

/* In interface
 * no method - marker or empty interface.
 * 
 * only one abstract method and n no of non abstract method
 *  - functional interface (SAM-single abstract method).
 *  
 * more than one abstract method - normal interface.
 */

interface Shape {
	// final variable and abstract methods
	// after java8 default and static methods
	public abstract void meth1();// sub class force to override this method

	public default void methd2() {
	};// sub class not force to override this method

	public static void methd3() {// common implementation for all subclass
		// default will be override
		// static will not override
	};
}

class Dummy {
	// default constructor
	// static block
	public static void add(int a, int b) {
	}
}

interface Dummy1 {
	// no constructor and block
	public static void add(int a, int b) {
	}
}

class Circle implements Shape {
	public void meth1() {
	}
}

public class Features {

	public static void main(String[] args) {
		predefFI();
		anonymous();
	}

	private static void anonymous() {
		// nameless class
		// this is for one time use only
		Shape circle = new Shape() {
			public void meth1() {
			}
		};
		Shape rectangle = new Shape() {
			public void meth1() {
				area();// we can call this within this class
			}

			// we can extra methods also
			public void area() {
			}// we cannot access this method outside

		};
		rectangle.meth1();
		rectangle.methd2();
		Shape.methd3();
//		rectangle.area();//we cannot call 
	}

	private static void predefFI() {
		Predicate<Integer> p = new Predicate<Integer>() {
			public boolean test(Integer a) {
				return a > 18;
			}
		};
		System.out.println(p.test(12));
		System.out.println(p.test(22));
		
		Predicate<Integer> p2 = new Predicate<Integer>() {
			public void test(Integer a) {
				System.out.println(a);
			}
		};
		Predicate<String> p3 = new Predicate<String>() {
			public boolean test(String a) {
				return a == "hello";
			}
		};
		
		System.out.println(p3.test("hello"));
		// we can use anonymous for any interface or abstract class
		BiPredicate bp;
		Function f;
		BiFunction bf;
		Consumer c;
		BiConsumer bc;
		Supplier s;
		UnaryOperator uo;
		BinaryOperator bo;
	}
}
