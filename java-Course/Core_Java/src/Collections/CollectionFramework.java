/*
		### 🔷 Java Collection Framework Hierarchy

	In Java, Collections refer to a framework that provides classes and interfaces for storing and manipulating groups of objects.


	🔹 What is the Collections Framework?
		The Java Collections Framework (JCF) is a set of interfaces, implementations (classes), and algorithms that help manage and manipulate data structures like lists, sets, maps, queues, etc.
		It is part of the java.util package.


	🔹 Why Use Collections?
		Efficient data handling
		Reduces programming effort		
		Increases performance		
		Supports algorithms like sorting, searching		
		Thread-safe options (e.g., ConcurrentHashMap, Collections.synchronizedList())


### 🔹 Top-Level Hierarchy

                  java.lang.Iterable<T>
                           ▲
                    java.util.Collection<E>
                           ▲
   ┌────────────┬──────────────┬──────────────┐
   │            │              │              │
 List<E>      Set<E>        Queue<E>        Map<K, V>
   ▲            ▲              ▲               ▲
   │            │              │               │
ArrayList    HashSet     PriorityQueue     HashMap
LinkedList   LinkedHashSet ArrayDeque     LinkedHashMap
Vector       TreeSet         -            TreeMap
Stack           -            -             Hashtable


	🔹 Summary of Hierarchy
		| Level        | Interface / Class               |
		| ------------ | ------------------------------- |
		| 1️ Root     	| `Iterable<T>`                   |
		| 2️ Base     	| `Collection<T>`                 |
		| 3️ Category 	| `List<T>`, `Set<T>`, `Queue<T>` |
		| 4️ Concrete 	| `ArrayList`, `HashSet`, etc.    |



### 🔹 Core Interfaces

| Interface       | Description                                               |
| --------------- | --------------------------------------------------------- |
| `Iterable<T>`   | Root interface that supports iteration (`for-each`)       |
| `Collection<E>` | Root of all collections except `Map`                      |
| `List<E>`       | Ordered, allows duplicates                                |
| `Set<E>`        | Unordered, no duplicates                                  |
| `Queue<E>`      | FIFO, used in processing pipelines                        |
| `Map<K, V>`     | Stores key-value pairs (not part of Collection hierarchy) |

---

### 🔹 Main Classes

| Interface | Common Classes                                     |
| --------- | -------------------------------------------------- |
| `List`    | `ArrayList`, `LinkedList`, `Vector`, `Stack`       |
| `Set`     | `HashSet`, `LinkedHashSet`, `TreeSet`              |
| `Queue`   | `PriorityQueue`, `ArrayDeque`                      |
| `Map`     | `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable` |


### 🔹 Utility Classes

| Class         | Purpose                                       |
| ------------- | --------------------------------------------- |
| `Collections` | Static methods (sort, reverse, shuffle, etc.) |
| `Arrays`      | Similar methods for arrays                    |


### 🔹 Special Sub-Interfaces

| Sub-interface               | Purpose                            |
| --------------------------- | ---------------------------------- |
| `SortedSet`, `NavigableSet` | For sorted collections (`TreeSet`) |
| `SortedMap`, `NavigableMap` | For sorted maps (`TreeMap`)        |
| `Deque`                     | Double-ended queue (`ArrayDeque`)  |

---

### ✅ Summary

* The framework provides **ready-to-use data structures**.
* Supports **algorithms**, **thread safety**, **type-safety (generics)**, and **performance efficiency**.
* It's located mainly in the **`java.util`** package.


 */
package Collections;

import java.util.*;

public class CollectionFramework {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		System.out.println(names);
		names.add("Mohan");
		names.add("john");
		names.add("bruce");
		System.out.println(names);
	}
}
