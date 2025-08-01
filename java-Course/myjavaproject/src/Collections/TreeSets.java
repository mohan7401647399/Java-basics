/*
		The TreeSet class is a SortedSet implementation of the Set interface in Java.
		Unlike HashSet or LinkedHashSet, it stores elements in sorted (ascending) order using a self-balancing binary search tree (specifically, a Red-Black Tree).


	✅ Key Features of TreeSet
		* Stores unique elements only (no duplicates)		
		* Sorted in natural order (ascending) or by a custom Comparator		
		* No null values allowed (throws NullPointerException if you try)		
		* Operations like add, remove, and search: O(log n)		
		* Implements NavigableSet, SortedSet, and Set


	🔸 Hierarchy Diagram
		Set → SortedSet → NavigableSet → TreeSet


	🔸 When to Use TreeSet?
		Use TreeSet when:
			You need sorted elements			
			You want no duplicates			
			You don't need null elements			
			You need range views or navigation methods (e.g., subSet, ceiling)


	🔸 TreeSet vs HashSet vs LinkedHashSet
		| Feature           | HashSet        | LinkedHashSet      | TreeSet         |
		| ----------------- | -------------  | -----------------  | --------------  |
		| Order             | ❌ Unordered   | ✅ Insertion order | ✅ Sorted order |
		| Performance       | ✅ O(1)        | ✅ O(1)            | ❌ O(log n)     |
		| Null elements     | ✅ One allowed | ✅ One allowed     | ❌ Not allowed  |
		| Allows duplicates | ❌             | ❌                 | ❌              |
		| Custom sorting    | ❌             | ❌                 | ✅ Yes          |


 */

package Collections;

import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names);
//		names.add(null);						//	Error
		names.add("1");
		names.add("2");
		System.out.println(names);		
		System.out.println(names.first());		//	Returns the first element currently in this set
		System.out.println(names.last());		//	Returns the last element currently in this set
		System.out.println(names.size());		//	Return the number of elements in this set
		System.out.println(names.isEmpty());	//	Returns true if this set contains no element
		System.out.println(names.remove("3"));	//	Removes the elements in this set if it is present
	}
}
