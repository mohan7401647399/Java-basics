/*

	🔷 What is List Interface in Java Collections Framework?
		* The List interface is part of the Java Collections Framework. 
		* It is a sub-interface of Collection and represents an ordered collection (sequence) of elements that can contain duplicates.

	🔹 Package:
		java.util.List
	
	🔹 Declaration:
		public interface List<E> extends Collection<E>

	🔹 Key Features of List
		| Feature           | Description                                                 |
		| ----------------- | ----------------------------------------------------------- |
		| Ordered           | Maintains **insertion order**                               |
		| Indexed           | Allows access by **index** (like arrays)                    |
		| Duplicates        | **Allows duplicate elements**                               |
		| Positional Access | Can **add, remove, replace** elements at specific positions |

	🔹 Common Methods in List
		| Method                              | Description                         |
		| ----------------------------------- | ----------------------------------- |
		| `void add(int index, E element)`    | Adds element at a specific position |
		| `E get(int index)`                  | Retrieves element at index          |
		| `E set(int index, E element)`       | Replaces element at index           |
		| `E remove(int index)`               | Removes element at index            |
		| `int indexOf(Object o)`             | Returns first occurrence index      |
		| `int lastIndexOf(Object o)`         | Returns last occurrence index       |
		| `List<E> subList(int from, int to)` | Returns a view of part of the list  |


	🔹 Implementations of List
		| Class        | Description                                |
		| ------------ | ------------------------------------------ |
		| `ArrayList`  | Resizable array, fast random access        |
		| `LinkedList` | Doubly-linked list, good for insert/delete |
		| `Vector`     | Legacy, thread-safe                        |
		| `Stack`      | Subclass of Vector, LIFO structure         |


	Diagram: List Interface Hierarchy
	
	               Iterable<E>
                        ▲
                  Collection<E>
                        ▲
                     List<E>
            ┌──────────┼─────────────┐
       ArrayList     LinkedList     Vector
                                       ▲
                                    Stack



	✅ Summary of List:
		* Ordered collection
		* Index-based access		
		* Allows duplicates		
		* Used when position of elements matters




	✅ Comparison Table
| Feature / Class    | ArrayList     | LinkedList         | Vector            | Stack                  |
| ------------------ | ------------- | ------------------ | ----------------- | ---------------------- |
| Internal Structure | Dynamic Array | Doubly Linked List | Dynamic Array     | Dynamic Array (Vector) |
| Order Maintained   | ✅ Yes         | ✅ Yes              | ✅ Yes             | ✅ Yes                  |
| Allows Duplicates  | ✅ Yes         | ✅ Yes              | ✅ Yes             | ✅ Yes                  |
| Thread-safe        | ❌ No          | ❌ No               | ✅ Yes             | ✅ Yes                  |
| Fast Access (get)  | ✅ Very Fast   | ❌ Slow             | ✅ Fast            | ✅ Fast                 |
| Fast Insert/Delete | ❌ Slow        | ✅ Fast             | ❌ Slow            | ❌ Slow                 |
| Legacy?            | ❌ No          | ❌ No               | ✅ Yes             | ✅ Yes                  |
| Special Use        | General List  | List + Queue       | Synchronized List | LIFO Stack             |






	🔹 1. Adding Elements

package Collections;

import java.util.*;

public class Lists{
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        System.out.println(names);
        
        names.add("Mohan");
        names.add("jack");
        names.add("mickel");
        names.add("john");
        System.out.println(names);
        System.out.println(names.size());   		//  get array length size
        System.out.println(names.get(1));   		//  get index values
        
        names.add(1, "Mohan");              		//  insert at given index
        System.out.println(names);
        names.addAll(names);						//	add all elements from another collection
        System.out.println(names);
        names.addAll(3, names);						//	add all elements at a specific index
        System.out.println(names);
        names.addFirst("RM");						//	add an elements at the first elements in collection
        System.out.println(names);
        names.addLast("R");							//	add an elements at the last elements in collection
        System.out.println(names);
    }
}


🔹 2. Accessing Elements

package Collections;

import java.util.*;

public class Lists{
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        System.out.println(names);
        
        names.add("Mohan");
        names.add("jack");
        names.add("mickel");
        names.add("john");
        names.add("Mohan");
        System.out.println(names);
        System.out.println(names.get(1));   				//  return elements at the specific index
        System.out.println(names.getFirst());				//	get the first elements in the collection
        System.out.println(names.getLast());				//	get the last elements in the collection
        System.out.println(names.getClass());				//	return class object
        System.out.println(names.indexOf("jack"));			//	return the first occurance of the specified elements
        System.out.println(names.lastIndexOf("Mohan"));		//	return the index of the last occurance of the specified elements at the index
    }
}



🔹 3. Modifying Elements

package Collections;

import java.util.*;

public class Lists{
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        System.out.println(names);
        
        names.add("Mohan");
        names.add("jack");
        names.add("mickel");
        names.add("john");
        names.add("Mohan");
        System.out.println(names);
        names.set(1, "R");								//	Replaces elements at the given index
        System.out.println(names);   
    }
}



🔹 4. Removing Elements

package Collections;

import java.util.*;

public class Lists{
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        System.out.println(names);
        
        names.add("Mohan");
        names.add("jack");
        names.add("mickel");
        names.add("john");
        names.add("Mohan");
        System.out.println(names);
        names.remove(0);						//	remove elements at the specified index
        names.remove("Mohan");				//	removes first occurance of the object
        names.removeAll(names);				//	removes all matching elements
        names.removeFirst();					//	removes and returns the first element of this collection
        names.removeIf(null);					//	removes all the elements of this collection
        names.removeLast();					//	removes and returns the last elements of this collection
        names.clear();							//	removes all the elements from this list
        System.out.println(names);
    }
}



🔹 5. Checking Elements

package Collections;

import java.util.*;

public class Lists {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		System.out.println(names);

		names.add("Mohan");
		names.add("jack");
		names.add("mickel");
		names.add("john");
		names.add("Mohan");
		System.out.println(names.contains("Mohan"));		//	checks if contains the element
		System.out.println(names.containsAll(names));		//	returns true if this list contains of the specified collection
		System.out.println(names.isEmpty());				//	check if the list is empty
		System.out.println(names.size());					//	returns the number of elements
	}
}



🔹 6. Iteration & View

package Collections;

import java.util.*;

public class Lists {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		System.out.println(names);

		names.add("Mohan");
		names.add("jack");
		names.add("mickel");
		names.add("john");
		names.add("Mohan");

		System.out.println("Using Iterator() - Forward-only traversal");
		Iterator<String> iteration = names.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}

		System.out.println("listIterator() - Bi-directional iterator");
		ListIterator<String> listIteration = names.listIterator();
		while (listIteration.hasNext()) {
			System.out.println("Forward direction : " + listIteration.next());
		}
		while (listIteration.hasPrevious()) {
			System.out.println("Backward direction : " + listIteration.previous());
		}

		System.out.println("\n subList (int fromIndex, int toIndex) - Get a partial view of the original list");
		List<String> subLists = names.subList(1, 4); // view part of the list
		for (String name : subLists) {
			System.out.println(name);
		}

	}
}
 */