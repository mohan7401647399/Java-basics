/*
		The Set interface in Java is a part of the Java Collections Framework and extends the Collection interface.
		It represents a collection that cannot contain duplicate elements — i.e., each element is unique.


	✅ Key Features of Set
		* No duplicates allowed
		* Unordered (some implementations like HashSet do not maintain insertion order)		
		* Allows at most one null element (in some implementations like HashSet)

	🔸 Hierarchy Diagram
		         Collection (interface)
		              ↑
		             Set (interface)
		              ↑
		    ┌─────────┼─────────┐
		    ↓         ↓         ↓
		 HashSet   LinkedHashSet  TreeSet
		 (class)	  (class)	  (class)

	
	
	🔹 Common Set Implementations
		| Class             | Ordered?                        | Sorted?                                   | Allows null? | Thread-safe? |
		| ----------------- | ------------------------------- | ----------------------------------------- | ------------ | ------------ |
		| **HashSet**       | ❌ Unordered                     | ❌ No                                      | ✅ One null   | ❌            |
		| **LinkedHashSet** | ✅ Insertion order               | ❌ No                                      | ✅ One null   | ❌            |
		| **TreeSet**       | ✅ Sorted (ascending by default) | ✅ Yes (uses `Comparable` or `Comparator`) | ❌            | ❌            |


	🔸 When to Use Set?
		Use Set when:			
			* You want to prevent duplicates			
			* You don’t care about the order (use HashSet)			
			* You want insertion order preserved (use LinkedHashSet)			
			* You need sorted data (use TreeSet)
	
 */

package Collections;

public class Sets {

}
