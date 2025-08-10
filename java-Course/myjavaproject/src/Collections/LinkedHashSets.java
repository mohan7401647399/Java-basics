/*
		LinkedHashSet is a class that implements the Set interface and extends HashSet.
		Unlike HashSet, it maintains the insertion order of elements using a linked list internally.


		✅ Key Features of LinkedHashSet
			* No duplicates allowed (just like all Set implementations)			
			* Maintains the insertion order			
			* Allows one null element			
			* Backed by a HashMap with a linked list			
			* Average time complexity for add, remove, contains: O(1)


		🔸 When to Use LinkedHashSet?
				We want a Set (no duplicates).			
				We care about insertion order.				
				We still want fast performance.


		🔸 Hierarchy Diagram
				Set (interface)
				      ↑
			 LinkedHashSet (class)
		

		
		🔸 Difference: HashSet vs LinkedHashSet
			| Feature          | HashSet       | LinkedHashSet         |
			| ---------------- | ------------- | --------------------- |
			| Order maintained | ❌ No          | ✅ Yes               |
			| Performance      | ✅ Fast        | ✅ Slightly slower   |
			| Null elements    | ✅ One allowed | ✅ One allowed       |
			| Backed by        | HashMap       | HashMap + Linked List |



package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSets {
	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		System.out.println(names);
		
		names.add("1");
		names.add("2");
		names.add("3");
		names.add(null);
		names.add("3");					//	Duplicate ignored

		System.out.println("Contains - " + names.contains("1"));
		System.out.println("Get first value - " + names.getFirst());
		System.out.println("Get last value - " + names.getLast());
		System.out.println("isEmpty values - " + names.isEmpty());
		System.out.println("Total elements - " + names.size());
		names.addFirst("0");
		System.out.println(names);
	}
}

*/

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
	public static void main(String[] args) {
		// Create LinkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<>();

		// add()
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple"); // Duplicate - ignored

		System.out.println("After add(): " + set);

		// contains()
		System.out.println("Contains 'Banana'? " + set.contains("Banana"));

		// remove()
		set.remove("Banana");
		System.out.println("After remove(): " + set);

		// addAll()
		LinkedHashSet<String> otherSet = new LinkedHashSet<>();
		otherSet.add("Date");
		otherSet.add("Elderberry");
		set.addAll(otherSet);
		System.out.println("After addAll(): " + set);

		// retainAll()
		LinkedHashSet<String> retainSet = new LinkedHashSet<>();
		retainSet.add("Apple");
		retainSet.add("Date");
		set.retainAll(retainSet);
		System.out.println("After retainAll(): " + set);

		// size() & isEmpty()
		System.out.println("Size: " + set.size());
		System.out.println("Is empty? " + set.isEmpty());

		// iterator()
		System.out.print("Iterating: ");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		// clear()
		set.clear();
		System.out.println("\nAfter clear(): " + set);
	}
}
