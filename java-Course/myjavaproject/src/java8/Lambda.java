/*
	1️⃣ Basic Syntax
		(parameters) -> { body }

	Examples:
		() -> System.out.println("Hello Lambda!");      // No parameters
		x -> x * x;                                     // One parameter, single expression
		(a, b) -> a + b;                                // Multiple parameters

	2️⃣ Why Use Lambda Expressions?
		Shorter and cleaner code (no need to write anonymous classes)
		Makes working with functional interfaces easier (like Runnable, Comparator, Predicate)
		Useful in Streams API for filtering, mapping, reducing data
		
		
	3️⃣ Functional Interface Requirement
		A lambda expression can only be used where there’s a functional interface.
		
		
Example:-
		
package java8;

@FunctionalInterface
interface MyFunction {
	void sayHello(); // MyFunction has only one abstract method (sayHello).
}

public class Lambda {
	public static void main(String[] args) {
		MyFunction m1 = () -> System.out.println("Hi");// Lambda expression
		m1.sayHello();
	}
}	

	
4️⃣ Example with Parameters

package java8;

@FunctionalInterface
interface Adder {
	int add(int a, int b);
}

public class Lambda {
	public static void main(String[] args) {
		Adder c1 = (a, b) -> a + b;
		System.out.println(c1.add(5, 10));
	}
}




5️⃣ Lambda with Java Built-in Functional Interfaces

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




	8. *****Special Primitive Variants*****
	
	Java provides primitive versions to avoid boxing/unboxing:
	
	Function Variants
		IntFunction<R> – takes int, returns R		
		LongFunction<R> – takes long, returns R		
		DoubleFunction<R> – takes double, returns R

✅ Example:

package java8;

import java.util.function.IntFunction;

public class Lambda {
	public static void main(String[] args) {
		IntFunction<String> intToString = num -> "number: " + num;
		System.out.println(intToString.apply(5));
	}
}


Predicate Variants
	IntPredicate, LongPredicate, DoublePredicate — take primitive, return boolean

✅ Example:

package java8;

import java.util.function.IntPredicate;

public class Lambda {
	public static void main(String[] args) {
		IntPredicate isPositive = n -> n < 0;
		System.out.println(isPositive.test(10));
	}
}



Consumer Variants
	IntConsumer, LongConsumer, DoubleConsumer — take primitive, return nothing

✅ Example:

package java8;

import java.util.function.IntConsumer;

public class Lambda {
	public static void main(String[] args) {
		IntConsumer squarePrinter = n -> System.out.println(n * n);
		squarePrinter.accept(10);
	}
}


Supplier Variants
	BooleanSupplier, IntSupplier, LongSupplier, DoubleSupplier — no input, return primitive

✅ Example:

package java8;

import java.util.function.IntSupplier;

public class Lambda {
	public static void main(String[] args) {
		IntSupplier diceRole = () -> (int) (Math.random() * 6) + 1;
		System.out.println(diceRole.getAsInt());
	}
}




		11. *****Lambda with Collections (Streams API Example)*****
		
import java.util.ArrayList;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("john");
		names.add("jack");
		names.add("mickel");
		names.add("roman");
		System.out.println(names);
		names.forEach(name -> System.out.println("forEach : " + name));
	}
}





			9. *****UnaryOperator*****
			
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




			10. *****BinaryOperator*****
			
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






	With Collections.min() / Collections.max()
		These are useful with comparators:

package java8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Lambda {
	public static void main(String[] args) {

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(Comparator.naturalOrder());
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Comparator.naturalOrder());
		
		System.out.println(minBy.apply(5, 9));
		System.out.println(maxBy.apply(5, 9));
	}
}

 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Lambda {
	public static void main(String[] args) {
		// 1. Lambda with no parameters
		Runnable r = () -> System.out.println("No parameter lambda");
		r.run();

		// 2. Lambda with one parameter
		Function<Integer, Integer> fn = a -> a * a;
		System.out.println(fn.apply(5));

		// 3. Lambda with two parameters
		BiFunction<Integer, Integer, Integer> fn2 = (a, b) -> a + b;
		System.out.println(fn2.apply(5, 10));

		// 4. Lambda replacing anonymous class
		// Before (Anonymous class):
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Running ...");
			};
		};
		r1.run();
		// After (Lambda):
		Runnable r2 = () -> System.out.println("Running with lambda.....");
		r2.run();

		// 5. Lambda with List + forEach
		List<String> lists = Arrays.asList("Mohan", "john", "james");
		lists.forEach(s -> System.out.println(s));

		// 6. Using built-in Predicate
		Predicate<Integer> p1 = a -> a % 2 == 0;
		System.out.println(p1.test(5));

		// 7. Using built-in Consumer
		Consumer<Integer> printer = a -> System.out.println(a);
		printer.accept(10);

		// 8. Lambda with UnaryOperator
		UnaryOperator<String> names = name -> name.toUpperCase();
		System.out.println(names.apply("mohan"));

		// 9. Stream + lambda combined
		List<Integer> nums = Arrays.asList(1, 4, 8, 3, 5);
		nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
};