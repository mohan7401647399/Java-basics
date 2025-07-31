/*


                        java.lang.Iterable<T>
                                 ▲
                                 |
                        java.util.Collection<T>
                      /           |             \
                     /            |              \
         java.util.List<T>  java.util.Set<T>  java.util.Queue<T>
             ▲                  ▲                  ▲
             |                  |                  |
     ArrayList,             HashSet,           PriorityQueue,
     LinkedList,        LinkedHashSet,         ArrayDeque
     Vector, Stack         TreeSet



In Java Collections, **`Iterable`** is the **top-most interface** in the **Collection hierarchy**, and it's fundamental to how you loop through collections like `List`, `Set`, etc.

---

### 🔹 What is `Iterable`?

`Iterable` is an **interface** in `java.lang` package that represents a collection of elements that can be **iterated one by one**.

```java
public interface Iterable<T> {
    Iterator<T> iterator();
}
```

Any class that implements `Iterable` allows its elements to be accessed using a **`for-each` loop** or through an **`Iterator`**.

---

### 🔹 Where is `Iterable` used?

All classes that implement the **`Collection`** interface (like `ArrayList`, `HashSet`, etc.) also implement `Iterable`.

```java
Collection → Iterable
```

---

### 🔹 Real Example

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mohan");
        names.add("Raj");
        names.add("Arun");

        // Using for-each loop (possible because List is Iterable)
        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

This works because `ArrayList` implements `Iterable`.

---

### 🔹 Using Iterator (from Iterable)

You can manually get the iterator like this:

```java
Iterator<String> iterator = names.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

---

### 🔹 Why is `Iterable` important?

| Feature         | Description                                                  |
| --------------- | ------------------------------------------------------------ |
| For-each loop   | Enables `for-each` loop (`for(Type item : collection)`)      |
| Iterator access | Allows use of `.iterator()` method                           |
| Foundation      | It's the base for all Collection classes                     |
| Generic         | Supports generics for type-safety (`Iterable<String>`, etc.) |

---

### 🔹 Summary

* `Iterable` is a base interface to **iterate over a collection**.
* It provides the **`iterator()`** method.
* Enables the use of the **enhanced for-loop** (`for-each`).
* All major collection classes like `ArrayList`, `HashSet`, `LinkedList` implement `Iterable`.

Would you like a visual hierarchy of `Iterable` → `Collection` → `List`, `Set`, etc.?


 */

package Collections;

public class Iterables {

}
