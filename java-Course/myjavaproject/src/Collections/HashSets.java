/*
	The HashSet class is one of the most commonly used implementations of the Set interface in Java.
	It is backed by a HashMap internally and is used to store unique elements only, just like all sets.
	
	
	✅ Key Features of HashSet
		* Implements Set interface
		* No duplicates allowed		
		* Unordered: Doesn't guarantee insertion order		
		* Allows one null element		
		* Fast performance for operations like add, remove, contains (average time complexity: O(1))

	🔸 HashSet Class Hierarchy
			Set (interface)
			   ↑
			HashSet (class)


	
	
 */

package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashSets {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		System.out.println(hs);

		hs.add("jack");
		hs.add(null);
		hs.add("john");
		hs.add("smith");
		hs.add("john");			//	Duplicate will be ignored
		hs.add("jack");			//	Duplicate will be ignored
		hs.add(null);			//	Duplicate will be ignored

		System.out.println(hs);
		System.out.println("isEmpty - " + hs.isEmpty());			//	Returns true if this set contains no elements
		System.out.println("contains - " + hs.contains("jack"));	//	Returns true if this contains the specified element	
		System.out.println("Size - " + hs.size());					//	Returns the number of elements in this set
		hs.remove(null);											//	Remove the specified elements in this Set if it is present
		System.out.println(hs);

			Iterator<String> i = hs.iterator();						//	iterating
			while (i.hasNext()) {
				System.out.println(i.next());
			}
			
	}
}
