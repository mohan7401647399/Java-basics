/*
	
	The **Stream API** in Java is a feature introduced in **Java 8** that lets you process data (like from collections, arrays, or I/O channels) in a **functional, declarative, and pipeline-like** way instead of writing loops manually.

It’s mainly in **`java.util.stream`** package.

---

## **1️⃣ What is a Stream?**

A **Stream** is **not** a data structure; it’s a **sequence of elements** from a source (like a list) that supports **aggregate operations** (like filtering, mapping, reducing).

**Key points:**

* Doesn’t store elements — works on a data source
* Can be **sequential** or **parallel**
* Operations are either **intermediate** (return another stream) or **terminal** (produce a result)

---

## **2️⃣ Stream Pipeline Structure**

A Stream API pipeline has **three parts**:

1. **Source** → Where data comes from (e.g., `List`, `Set`, `Map`, array, I/O)
2. **Intermediate Operations** → Transform or filter elements (e.g., `map()`, `filter()`, `sorted()`)
3. **Terminal Operation** → Produces a result or side effect (e.g., `collect()`, `forEach()`, `reduce()`)

**Example:**

```java
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
```

**Output:**

```
RAHUL
RAVI
```

---

## **3️⃣ Common Stream Operations**

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

---

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

---

## **4️⃣ Example: Numbers with Stream**

```java
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
```

---

## **5️⃣ Parallel Streams**

You can process data in **parallel** for faster execution on multi-core systems:

```java
numbers.parallelStream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
```

---

## **6️⃣ Summary Table**

| Feature              | Benefit                            |
| -------------------- | ---------------------------------- |
| Declarative style    | Less boilerplate, cleaner code     |
| Functional approach  | Uses lambdas and method references |
| Supports pipelining  | Chain multiple operations          |
| Supports parallelism | Easy multi-core processing         |

---

If you want, I can make you a **single Java program that demonstrates all major Stream API methods (`map`, `filter`, `reduce`, `collect`, etc.)** so you can learn them in one place with output. That way you won’t have to piece it together from multiple examples.

	
	
 */

package java8;

public class StreamAPI {

}
