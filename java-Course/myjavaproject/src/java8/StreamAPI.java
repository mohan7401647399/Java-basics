/*

    1. What is a Stream?

    Definition:
        The Stream API (introduced in Java 8, in java.util.stream) is a functional programming tool for processing data in a declarative, pipeline-based way.

        A Stream is not a collection — it’s a sequence of data elements supporting aggregate operations like map, filter, reduce, collect.

        Example in one line:
            list.stream().filter(x -> x > 5).map(x -> x * 2).forEach(System.out::println);

**Key points:**

* Doesn’t store elements — works on a data source
* Can be **sequential** or **parallel**
* Operations are either **intermediate** (return another stream) or **terminal** (produce a result)




2. Why use Stream API?

    | Reason               | Benefit                                                      |
    | -------------------- | ------------------------------------------------------------ |
    | **Less boilerplate** | No need for long loops, `if` checks, and temp lists          |
    | **Functional style** | Uses lambdas for concise, readable code                      |
    | **Pipelining**       | Can chain multiple operations (`map` → `filter` → `collect`) |
    | **Parallelism**      | Easy multi-threaded processing using `parallelStream()`      |
    | **Clear intent**     | Code reads like "what to do" instead of "how to do"          |


Example:
    Before Streams:

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = List.of("mohan", "jack", "john");
        List<String> list = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("j")) {
                list.add(name.toUpperCase());
            }
        }
        System.out.println(list);
    }
}



    With Streams:

import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = List.of("mohan", "jack", "john");
        names.stream().filter(n -> n.startsWith("j")).map(String::toUpperCase).forEach(System.out::println);
    }
}




3️. How does Stream API work?

It works in three stages:

    1.Source — Create the stream
        Stream<String> stream = list.stream();
    Sources can be:
        Collections (list.stream(), set.stream())
        Arrays (Arrays.stream(array))
        Static methods (Stream.of(...))
        Files / I/O (Files.lines(path))


    2.Intermediate Operations — Transform/filter the stream

        Don’t execute immediately (lazy evaluation)
        Return another Stream
        Examples: filter(), map(), distinct(), sorted(), limit()
    
    stream.filter(s -> s.length() > 3).map(String::toUpperCase)


    3.Terminal Operation — Produce the final result

        Triggers execution of the pipeline
        Examples: collect(), forEach(), reduce(), count()

             .forEach(System.out::println);



4️. When should you use Stream API?

✅ Good situations:

    You need to process collections with multiple transformations/filters
    You want parallel execution without manual threading
    You prefer functional style over imperative loops
    You want cleaner, shorter code for bulk data processing

🚫 Avoid Streams when:

    You need index-based access (Streams don’t give element indexes directly)
    You are working with very small datasets where normal loops are simpler and more readable
    You need to modify the original collection in place (Streams are for producing new data, not mutating existing structures)




5.Summary Table

    | Question | Answer                                                                               |
    | -------- | ------------------------------------------------------------------------------------ |
    | **What** | A Java 8 feature for functional-style data processing using pipelines                |
    | **Why**  | Cleaner, shorter, parallelizable code for complex data transformations               |
    | **How**  | Build a pipeline: `source → intermediate ops → terminal op`                          |
    | **When** | When processing large/complex datasets or when you want functional, declarative code |





6. Stream Pipeline Structure

A Stream API pipeline has **three parts**:

1. **Source** → Where data comes from (e.g., `List`, `Set`, `Map`, array, I/O)
2. **Intermediate Operations** → Transform or filter elements (e.g., `map()`, `filter()`, `sorted()`)
3. **Terminal Operation** → Produces a result or side effect (e.g., `collect()`, `forEach()`, `reduce()`)

**Example:**

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohan", "Ravi", "Sita", "Rahul");

        names.stream() // 1. Source
             .filter(name -> name.startsWith("R")) // 2. Intermediate
             .map(String::toUpperCase)             // 2. Intermediate
             .sorted()                             // 2. Intermediate
             .forEach(System.out::println);        // 3. Terminal
    }
}


7.Common Stream Operations

### **Intermediate (return another Stream)**

| Method              | Description                              |
| ------------------- | ---------------------------------------- |
| `filter(Predicate)` | Keep elements matching condition         |
| `map(Function)`     | Transform each element                   |
| `flatMap(Function)` | Flatten nested structures                |
| `distinct()`        | Remove duplicates                        |
| `sorted()`          | Sort elements                            |
| `limit(n)`          | Keep first n elements                    |
| `skip(n)`           | Skip first n elements                    |
| `peek(Consumer)`    | Perform action without changing elements |


### **Terminal (end the stream pipeline)**

| Method                      | Description                      |
| --------------------------- | -------------------------------- |
| `forEach(Consumer)`         | Perform action for each element  |
| `toArray()`                 | Convert to array                 |
| `reduce()`                  | Combine elements into one result |
| `collect()`                 | Convert to collection or summary |
| `count()`                   | Number of elements               |
| `anyMatch(Predicate)`       | Check if any element matches     |
| `allMatch(Predicate)`       | Check if all match               |
| `noneMatch(Predicate)`      | Check if none match              |
| `findFirst()` / `findAny()` | Get element                      |


8.Example: Numbers with Stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenSquares = numbers.stream()
                                           .filter(n -> n % 2 == 0) // keep even
                                           .map(n -> n * n)         // square them
                                           .collect(Collectors.toList()); // collect to list

        System.out.println(evenSquares); // [4, 16, 36, 64]
    }
}


9.Parallel Streams

You can process data in **parallel** for faster execution on multi-core systems:

numbers.parallelStream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);





                                        1. Filter: Keep matching elements

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("mohan", "john", "jack", "mickel");

        lists.stream().filter(n -> n.startsWith("j")).forEach(System.out::println);
        lists.stream().filter(n -> n.length() > 4).forEach( System.out::println);
        lists.stream().filter(n -> n.contains("mohan")).forEach( System.out::println);
    }
}






                                        2. Map: Transform each element

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Mohan", "John", "Jack", "Mickel");

        lists.stream().forEach(System.out::println);
        
        List<String> upperLists = lists.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        List<String> upperLists = lists.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperLists);

        List<String> lowerLists = lists.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerLists);

        List<String> toLists = lists.stream().map(String::toLowerCase).toList();
        System.out.println(toLists);

        List<String> newLists = lists.stream().toList();
        System.out.println(newLists);
    }
}





                                    3. Collect: Convert stream to list/set
                            
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 7, 9, 6, 5, 7);

        Set<Integer> squares = nums.stream().map(n -> n * n).collect(Collectors.toSet());
        System.out.println(squares);

        Set<Integer> newSet = nums.stream().filter(n -> n == 5).collect(Collectors.toSet());
        System.out.println(newSet);
    };
}
    





                                4. Sorted: Sort elements

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 7, 9, 6, 5, 7);

        nums.stream().sorted().forEach(System.out::println);

        System.out.println("total count is : " + nums.stream().count());

        System.out.println("distinct count is : " + nums.stream().distinct().count());

        nums.stream().distinct().forEach(System.out::println);
    };
}
    




                                        5. Distinct: Remove duplicates

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 7, 9, 6, 5, 7);

        nums.stream().distinct().forEach(System.out::println);

        System.out.println("distinct list : " + nums.stream().distinct().toList());

        System.out.println("distinct nums count is : " + nums.stream().distinct().count());

        List<Integer> distinctLists = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctLists);
    };
}
    





                                        6. Limit & Skip

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 7, 9, 6, 5, 7);

        nums.stream().limit(3).forEach(System.out::println);

        nums.stream().skip(3).forEach(System.out::println);
    };
}
    





                                        7. Count

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 7, 9, 6, 5, 7);

        System.out.println("count is : " + nums.stream().count());

        long countNums = nums.stream().filter(n -> n.equals(5)).count();
        System.out.println(countNums);
    };
}
    






                                        8. Reduce: Combine elements to a single value

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 7, 9, 6, 5, 7);

        System.out.println("reduce num is : " + nums.stream().reduce(0, (a, b) -> a + b));
    };
}
    





                                        9. AllMatch / AnyMatch / NoneMatch

 import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 6);

        boolean allEven = nums.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All Even nums is : " + allEven);

        boolean anyEven = nums.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Any Even nums is : " + anyEven);

        boolean allOdd = nums.stream().allMatch(n -> n % 2 != 0);
        System.out.println("All Even nums is : " + allOdd);

        boolean anyOdd = nums.stream().anyMatch(n -> n % 2 != 0);
        System.out.println("Any Odd nums is : " + anyOdd);

        boolean noneMatch = nums.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("None nums is : " + noneMatch);
    };
}
    


list = lists.stream().flatMap(name -> name.stream()).collection(collectors.toList() )




                                        10. Stream from Array

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        String[] names = {"mohan", "john", "mic"};
        
        Arrays.stream(names).filter(name -> name.length() > 4).forEach(System.out::println);
    };
}
    





                                        11. FlatMap: Flatten nested structures

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<List<String>> lists = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));

        System.out.println(lists);

        List<String> flatList = lists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(flatList);
    };
}
    






                                        12. Parallel Stream

 Note: parallelStream() executes in multiple threads for performance on large datasets.
 
 import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,4,6,2,3);

        nums.parallelStream().map(n -> n * 2).forEach(System.out::println);
    };
}





import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StreamAPI {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Mohan", 29), new Person("john", 30), new Person("Mickel", 15));
        List<String> result = list.stream().filter(p -> p.age > 25).map(p -> p.name).collect(Collectors.toList());
        System.out.println(result);
    };
}






package java8;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class StreamAPI {
	public static void main(String[] args) {
		String name = "Mohan java";
		System.out.println(name);
//		List<String> list = Arrays.asList("mohan");
//		list.add("r");
//		System.out.println(list);
//		list.stream().filter(n -> n.contains("j")).forEach(System.out::println);
//		list.stream().map(n -> n.toLowerCase()).forEach(t -> );
//		list.stream().filter(n -> n.length() == 3).forEach(System.out::println);
//		list.stream().filter(n -> n.indexOf("john") == 0).forEach(System.out::println);
//		list.stream().filter(n -> n.lastIndexOf("john") == 1).forEach(System.out::println);
//		System.out.println(list.stream().allMatch((n) -> n.contains("mohan")));
//		List<Integer> listInt = List.of(5, 1, 4, 5, 9);
		List<Integer> listInt = new ArrayList<>();
		listInt.add(20);
		listInt.add(10);
		listInt.add(5);
		System.out.println(listInt);
		System.out.println(listInt.size());
//		System.out.println(listInt.contains(4));
//		System.out.println(listInt.isEmpty());
//		System.out.println(listInt);
//		listInt.stream().filter(n -> n < 5).map(a -> a * 10).forEach(System.out::println);
//		listInt.stream().map(n -> n * 2).forEach(System.out::println);
		Queue<String> queue = new ArrayDeque<>();
		queue.add("4");
		queue.add("1");
		queue.add("3");
		queue.add("2");
		System.out.println(queue);
		Set<Integer> set = new HashSet<>();
		set.add(1);
		System.out.println(set);
	}
}
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamAPI {
    public static void main(String[] args) {
        // 1. From collection
        // Collections in java have a stream() method
        List<String> names = Arrays.asList("Mohan", "john", "mock", "kevin");
        names.stream().forEach(System.out::println);

        // 2. From Arrays
        // Arrays.stream() to create a stream from an array
        int[] nums = { 4, 1, 6, 3, 9, 6, 4 };
        IntStream intNums = Arrays.stream(nums);
        intNums.forEach(System.out::println);

        // 3. Using Stream.of()
        // Stream.of() creates a elements from individual elements or an array
        Stream<String> fruitStream = Stream.of("Apple", "Banana", "Orange");
        fruitStream.forEach(System.out::println);

        // 4. Generating streams
        // Stream.generate() to Create an infinite stream of values.
        Stream<String> genStream = Stream.generate(() -> "Hello").limit(3);
        genStream.forEach(System.out::println);

        //  5. Creating a stream with Stream.iterate()
        //  Example : generating numbers from 5
        Stream<Integer> numbStream = Stream.iterate(5, n -> n + 1).limit(3);
        numbStream.forEach(System.out::println);
    }
}   