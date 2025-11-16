/*

	* What:-
	A Functional Interface in Java is an interface that has exactly one abstract method (SAM — Single Abstract Method).
	It can have any number of default methods, static methods, and private methods, but only one abstract method.


	* Key Points:-
		Single Abstract Method → makes it usable with Lambda Expressions and Method References.
		Marked with the @FunctionalInterface annotation (optional but recommended to prevent accidental changes).
		Part of the java.util.function package in Java 8+, which provides many built-in functional interfaces like Predicate, Function, Supplier, Consumer.
		Improves readability and supports functional programming in Java.


	* Why Use Functional Interface?
		Enables cleaner, shorter code with lambdas.		
		Promotes functional programming style in Java.		
		Helps pass behavior (logic) as a parameter.




package java8;

@FunctionalInterface
interface A{
	void show();
}

class FunctionalInterfaces {
	public static void main(String[] args) {
		A obj = new A() {
			public void show() {
				System.out.println("in show method");
			}
		};
		obj.show();
	}
}



package java8;

interface Calculator{
	int add(int a, int b);			//	single abstract method
}

public class FunctionalInterfaces {
	public static void main(String[] args) {
		Calculator c1 = (x,y) -> x + y;		//	Lambda expression
		System.out.println(c1.add(15, 5));
	}
}



package java8;

@FunctionalInterface
interface A {
	void show();
}

class FunctionalInterfaces {
	public static void main(String[] args) {
		A obj = () -> System.out.println("In show method");
		obj.show();
	}
}




	*****Predefined Functional Interface*****

	Java 8 introduced many predefined (built-in) functional interfaces in the java.util.function package to support functional programming.
	All of them have exactly one abstract method (plus possible default and static methods).



Core Functional Interfaces
	| Interface               | Abstract Method          | Description                                                          | Example                     |
	| ----------------------- | ------------------------ | -------------------------------------------------------------------- | --------------------------- |
	| **`Function<T,R>`**     | `R apply(T t)`           | Takes an input and returns a result.                                 | Mapping                     |
	| **`BiFunction<T,U,R>`** | `R apply(T t, U u)`      | Function with two inputs and a result.                               | Merging                     |
	| **`Predicate<T>`**      | `boolean test(T t)`      | Tests a condition and returns `true` or `false`.                     | Filtering                   |
	| **`BiPredicate<T,U>`**  | `boolean test(T t, U u)` | Predicate with two inputs.                                           | Comparing two values        |
	| **`Consumer<T>`**       | `void accept(T t)`       | Performs an action on the input but returns nothing.                 | Printing/logging            |
	| **`BiConsumer<T,U>`**   | `void accept(T t, U u)`  | Consumer with two inputs.                                            | Processing two values       |
	| **`Supplier<T>`**       | `T get()`                | Supplies (produces) a value without input.                           | Generating data             |
	| **`UnaryOperator<T>`**  | `T apply(T t)`           | Special case of `Function` where input and output types are same.    | Increment, string uppercase |
	| **`BinaryOperator<T>`** | `T apply(T t1, T t2)`    | Special case of `BiFunction` where inputs and output types are same. | Sum, min, max               |



3. Why Use Them?
	Avoids writing custom functional interfaces.
	Works perfectly with Streams API.
	Improves readability and reduces boilerplate code.
	
	

package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		predefFI();
	}

	public static void predefFI() {
		Predicate<String> p1 = new Predicate<String>() {
			public boolean test(String a) {
				return a == "Hello";
			}
		};
		System.out.println("Predicate-test1 is " + p1.test("Hello"));
		
		Predicate<Integer> isEven = n -> (n / 2) == 0;
		System.out.println("Predicate-test2 is " + isEven.test(5));
		
		Function<String, Integer> lengthFinder = s -> s.length();
		System.out.println("Function-apply is " + lengthFinder.apply("java"));
		
		Consumer<String> printer = s -> System.out.println("Consumer-printer is " + s.toUpperCase());
		printer.accept("hello");
		
		Supplier<Double> randomSupplier = () -> Math.random();
		System.out.println("Supplier-get is " + randomSupplier.get());		
	}
}




		* Lambda with Java Built-in Functional Interfaces

	1. Function — Takes input, returns output

package java8;

import java.util.function.Function;

public class Lambda {
	public static void main(String[] args) {
		Function<String, Integer> lengthFunction = s -> s.length();
		System.out.println(lengthFunction.apply("Hello world"));
	}
}



	2. BiFunction — Takes two inputs, returns output
	
package java8;

import java.util.function.BiFunction;

public class Lambda {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(5, 5));
	}
}


	3. Predicate — Takes input, returns boolean
	
package java8;

import java.util.function.Predicate;

public class Lambda {
	public static void main(String[] args) {
		Predicate<Integer> sum = a -> a < 18;
		System.out.println(sum.test(5));
	}
}



	4. BiPredicate — Takes two inputs, returns boolean

package java8;

import java.util.function.BiPredicate;

public class Lambda {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> sum = (a, b) -> a < b;
		System.out.println(sum.test(5, 6));
		BiPredicate<String, String> sum2 = (a,b) -> a == b;
		System.out.println(sum2.test("Hello", null));
	}
}



	5. Consumer — Takes input, returns nothing

package java8;

import java.util.function.Consumer;

public class Lambda {
	public static void main(String[] args) {
		Consumer<String> printer = a -> System.out.println(a);
		printer.accept("Hello world Java!");
	}
}



	6. BiConsumer — Takes two inputs, returns nothing
	
package java8;

import java.util.function.BiConsumer;

public class Lambda {
	public static void main(String[] args) {
		BiConsumer<String, Integer> printer = (name, age) -> System.out
				.println("name is " + name + " and " + "age is " + age);
		printer.accept("Mohan", 29);
	}
}


	7. Supplier — Takes no input, returns output
	
package java8;

import java.util.function.Supplier;

public class Lambda {
	public static void main(String[] args) {
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
	}
}




			8. *****UnaryOperator*****
			
	Input and output types are the same.
	Takes 1 parameter and returns a value of the same type.


package java8;

import java.util.function.UnaryOperator;

public class Lambda {
	public static void main(String[] args) {
		UnaryOperator<Integer> square = n -> n * n;
		System.out.println(square.apply(5));
		
		UnaryOperator<String> toUpper = n -> n.toUpperCase();
		System.out.println(toUpper.apply("hello"));
	}
}




			9. *****BinaryOperator*****
			
	Takes 2 parameters (same type) and returns a value of the same type.


package java8;

import java.util.function.BinaryOperator;

public class Lambda {
	public static void main(String[] args) {
		BinaryOperator<Integer> square = (a, b) -> a * b;
		System.out.println(square.apply(5, 5));

		BinaryOperator<String> concat = (a, b) -> a + b;
		System.out.println(concat.apply("hello ", "world"));
	}
}
 */

