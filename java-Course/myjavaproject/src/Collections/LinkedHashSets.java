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

 */

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
