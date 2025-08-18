/*
	
	✅ What is Optional in Java?

	Optional<T> is a class in java.util package introduced in Java 8.
	It is a container object which may or may not contain a non-null value.
	It helps in avoiding NullPointerException by providing a way to check value is present or not.
	

	✅ Why use Optional?

		Without Optional:
			String name = null;
			System.out.println(name.length());	//	NullPointerException

		With Optional:
			String name = null;
			Optional<String> opName = Optional.ofNullable(name);
			System.out.println(opName);
			if(opName.isPresent()) System.out.println(opName.get().length());
	
	It helps you to write safe and clean code when dealing with nullable values.


	✅ How to Create Optional
		| Method                       | Description                   |
		| ---------------------------- | ----------------------------- |
		| `Optional.of(value)`         | value must not be null        |
		| `Optional.ofNullable(value)` | value may be null or non-null |
		| `Optional.empty()`           | creates an empty Optional     |


	✅ Common Methods in Optional
		| Method                 | Description                                 |
		| ---------------------- | ------------------------------------------- |
		| `isPresent()`          | returns true if value exists                |
		| `get()`                | returns value, throws exception if empty    |
		| `orElse(defaultValue)` | returns value if present, else defaultValue |
		| `ifPresent(consumer)`  | executes given code if value exists         |


	✅ Advantages of Optional
		Avoids NullPointerExceptions
		Makes code more readable and safe
		Encourages functional style using methods like map, filter, etc.


	✅ Summary Table
		| Concept           | Code                                               |
		| ----------------- | -------------------------------------------------- |
		| Create Optional   | `Optional<String> opt = Optional.of("Hi");`        |
		| Nullable Optional | `Optional<String> opt = Optional.ofNullable(str);` |
		| Check empty       | `opt.isPresent()`                                  |
		| Default value     | `opt.orElse("default")`                            |





	1. Optional.ofNullable + isPresent()

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String name = null;
		Optional<String> opName = Optional.ofNullable(name);
		System.out.println(opName);
		if (opName.isPresent()) {
			System.out.println(opName.get());
		} else {
			System.out.println("Value is null");
		}
	}
}



	2. Optional.of + get()

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String name = "hello";
		Optional<String> opName = Optional.of(name);
		System.out.println(opName);
		System.out.println(opName.get());
	}
}



	3. Optional.empty() + orElse()

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		Optional<Integer> opName = Optional.empty();
		System.out.println(opName);
		Integer num = opName.orElse(15);
		System.out.println(num);
		Optional<String> strName = Optional.empty();
		System.out.println(strName);
		String name = strName.orElse("hello");
		System.out.println(name);
	}
}



	4. ifPresent()

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		Optional<String> opName = Optional.of("names");
		opName.ifPresent(value -> System.out.println("Exist string value is : " + value));
		Optional<Integer> intName = Optional.of(15);
		intName.ifPresent(value -> System.out.println("Exist integer value is : " + value));
	}
}




	4. Null exceptions

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		Optional<String> opName = Optional.ofNullable(null);
		System.out.println(opName.get()); // NoSuchElementException
		Optional<String> opName2 = Optional.of(null);
		System.out.println(opName2.get()); // NullPointerException
		Optional<String> opName3 = Optional.empty();
		System.out.println(opName3.get()); // NoSuchElementException
	}
}





package java8;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		Optional<String> opName = Optional.of("hello");
		System.out.println("empty : " + opName.empty());
		System.out.println("value get : " + opName.get());
		System.out.println("isPresent : " + opName.isPresent());
		System.out.println("orElse : " + opName.orElse("welcome"));
		System.out.println("orElseThrow : " + opName.orElseThrow());
		System.out.println("filter : " + opName.filter(n -> n.equals(n)).get());
		System.out.println("filter : " + opName.map(n -> n + " Welcome").get());

		Optional<String> opName2 = Optional.ofNullable(null);
		System.out.println("orElse : " + opName2.orElse("welcome"));
		System.out.println("orElseThrow : " + opName2.orElseGet(() -> "null value"));
		System.out.println("orElseThrow : " + opName2.orElseThrow(() -> new IllegalArgumentException("null value")));
		System.out.println("orElseThrow : " + opName2.or(null));
	}
}


 */