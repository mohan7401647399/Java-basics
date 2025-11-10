/*
	
	Here’s a clear list of **Java 8 key features** introduced in 2014:

1. **Lambda Expressions**

   * Introduces a concise way to write **anonymous functions**.
   * Example:

     ```java
     (a, b) -> a + b
     ```

2. **Functional Interfaces**

   * Interfaces with exactly **one abstract method** (can have default and static methods).
   * Example: `Runnable`, `Callable`, or custom interfaces with `@FunctionalInterface`.

3. **Stream API**

   * Enables functional-style operations on collections (like filtering, mapping, reducing) without modifying the source.
   * Example:

     ```java
     list.stream().filter(x -> x > 10).forEach(System.out::println);
     ```

4. **Default Methods in Interfaces**

   * Interfaces can now have **default implementations** of methods.
   * Example:

     ```java
     default void display() { System.out.println("Hello"); }
     ```

5. **Static Methods in Interfaces**

   * You can now define **static methods** inside interfaces.

6. **Method References**

   * A shorthand for calling methods/lambdas.
   * Example:

     ```java
     list.forEach(System.out::println);
     ```

7. **Optional Class**

   * Helps handle `null` values without `NullPointerException`.
   * Example:

     ```java
     Optional<String> name = Optional.ofNullable(null);
     name.ifPresent(System.out::println);
     ```

8. **New Date and Time API (java.time package)**

   * Immutable, thread-safe, and easier to use than old `Date` and `Calendar`.
   * Example:

     ```java
     LocalDate today = LocalDate.now();
     ```

9. **Collectors and Collectors.toList()**

   * Used to collect stream results into lists, sets, maps, etc.

10. **Nashorn JavaScript Engine**

    * Allows Java to execute JavaScript code (later removed in Java 15).

	
 */

