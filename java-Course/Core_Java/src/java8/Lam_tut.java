package java8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface Calc {
	public void add(int a, int b);
}

public class Lam_tut {
	public static void main(String[] args) {
		m2();
	}

	private static void m1() {
		// anonymous class
		Calc c1 = new Calc() {
			public void add(int a, int b) {
				System.out.println(a + b);
			}
		};
		c1.add(10, 20);
		// lambda expression ()->{}
//		Calc c2 =(int a ,int b)->{System.out.println(a+b);};
//		Calc c2 =(a , b)->{System.out.println(a+b);};
		Calc c2 = (a, b) -> System.out.println(a + b);// single line no {}
		c2.add(10, 20);
		// we have more than one abstract method use anonymous class.
		// we have only one abstract method use lambda expression.
		// we have an abstract method more implementation will be very large
		// means use normal class and write logic.
		// anonymous ! = lambda
	}

	public static void m2() {
		Predicate<Integer> p1 = new Predicate<Integer>() {
			public boolean test(Integer a) {
				return a > 18;
			}
		};
//		Predicate<Integer> p2 =	(Integer a)->{return a>18;};
//		Predicate<Integer> p2 =	(a)->{return a>18;};
//		Predicate<Integer> p2 =	(a)->a>18;
		Predicate<Integer> p2 = a -> a > 18;
		Function<String, Boolean> f1 = new Function<String, Boolean>() {
			public Boolean apply(String a) {
				return a == "Hello";
			}
		};
		f1.apply("Hi");
//		Function<String, Boolean> f2 = (String a) -> {return a == "Hello";};
//		Function<String, Boolean> f2 = (a) -> {
//			return a == "Hello";
//		};
		Function<String, Boolean> f2 = a -> a == "Hello";
		f2.apply("Hi");
		
		UnaryOperator<String> u = str->str.toUpperCase();
		System.out.println(u.apply("java"));
		System.out.println(u.apply("spring Boot"));
			//method reference ::
		UnaryOperator<String> u1 = String::toUpperCase;
		System.out.println(u1.apply("core java"));
		
		
	}
}
