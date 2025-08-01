/*

	🔷 What is Collection Interface in Java?
		In Java, the Collection<E> interface is part of the Java Collections Framework and is the root interface for working with groups of objects,
		it extends the Iterable interface.

	🔹 Package:
		java.util.Collection

	🔹 Declaration:
		public interface Collection<E> extends Iterable<E>
			Here, E is a generic type parameter that represents the type of elements in this collection.

	🔹 Main Features of Collection Interface
		Basic operations like add, remove, clear, size, etc.
		Supports iteration via iterator()
		Basis for more specific interfaces like List, Set, and Queue.


	🔹 Important Methods
		| Method                       | Description                   |
		| ---------------------------- | ----------------------------- |
		| `boolean add(E e)`           | Adds element                  |
		| `boolean remove(Object o)`   | Removes element               |
		| `int size()`                 | Returns number of elements    |
		| `boolean isEmpty()`          | Checks if collection is empty |
		| `boolean contains(Object o)` | Checks if element exists      |
		| `Iterator<E> iterator()`     | Returns an iterator           |
		| `void clear()`               | Removes all elements          |


	🔹 Subinterfaces of Collection
		| Subinterface | Description                             |
		| ------------ | --------------------------------------- |
		| `List<E>`    | Ordered collection, allows duplicates   |
		| `Set<E>`     | Unordered, no duplicates                |
		| `Queue<E>`   | Used to hold elements before processing |


	🔹 Diagram: Collection Interface Hierarchy
	
	               Iterable<E>
                      ▲
                  Collection<E>
               /        |       \
         List<E>     Set<E>   Queue<E>



*/

package Collections;

import java.util.*;

public class Collection {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		System.out.println(names);
		names.add("Mohan");
		names.add("jack");
		names.add("mickel");
		System.out.println(names);
		
		for(String name : names) {				//	for-each loop
			System.out.println(name);
		}
	}
}
