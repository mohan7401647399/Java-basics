/*

	A Functional Interface in Java is an interface that has exactly one abstract method (SAM — Single Abstract Method).
	It can have any number of default methods, static methods, and private methods, but only one abstract method.

	Key Points:-
		Single Abstract Method → makes it usable with Lambda Expressions and Method References.
		Marked with the @FunctionalInterface annotation (optional but recommended to prevent accidental changes).
		Part of the java.util.function package in Java 8+, which provides many built-in functional interfaces like Predicate, Function, Supplier, Consumer.
		Improves readability and supports functional programming in Java.

	Why Use Functional Interface?
		Enables cleaner, shorter code with lambdas.		
		Promotes functional programming style in Java.		
		Helps pass behavior (logic) as a parameter.

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





	*****Predefined Functional Interface*****

	Java 8 introduced many predefined (built-in) functional interfaces in the java.util.function package to support functional programming.
	All of them have exactly one abstract method (plus possible default and static methods).



Core Functional Interfaces
	| Interface               | Abstract Method          | Description                                                          | Example                     |
	| ----------------------- | ------------------------ | -------------------------------------------------------------------- | --------------------------- |
	| **`Predicate<T>`**      | `boolean test(T t)`      | Tests a condition and returns `true` or `false`.                     | Filtering                   |
	| **`Function<T,R>`**     | `R apply(T t)`           | Takes an input and returns a result.                                 | Mapping                     |
	| **`Consumer<T>`**       | `void accept(T t)`       | Performs an action on the input but returns nothing.                 | Printing/logging            |
	| **`Supplier<T>`**       | `T get()`                | Supplies (produces) a value without input.                           | Generating data             |
	| **`BiPredicate<T,U>`**  | `boolean test(T t, U u)` | Predicate with two inputs.                                           | Comparing two values        |
	| **`BiFunction<T,U,R>`** | `R apply(T t, U u)`      | Function with two inputs and a result.                               | Merging                     |
	| **`BiConsumer<T,U>`**   | `void accept(T t, U u)`  | Consumer with two inputs.                                            | Processing two values       |
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

 */

package java8;

interface Calculator {
	int add(int a, int b);
}

public class FunctionalInterfaces {
	public static void main(String[] args) {
		Calculator calc = (a, b) -> a + b;
		System.out.println(calc.add(5, 10));
	}

}