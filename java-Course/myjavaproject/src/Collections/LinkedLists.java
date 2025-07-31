/*
	* In Java, LinkedList is a class in the Collections Framework that implements both the List and Deque interfaces.
	* It is used to store elements in a doubly-linked list structure.
	
	
	🔹 When to Use LinkedList
		| Use Case                                     | Recommendation            |
		| -------------------------------------------- | ------------------------- |
		| Frequent insertion/removal in middle or ends | ✅ Use `LinkedList`        |
		| Fast random access needed                    | ❌ Use `ArrayList` instead |

	
	✅ Summary
		* LinkedList is a doubly-linked list implementation of List and Deque.
		* Best for insertions/removals at start, end, or middle.
		* Not suitable for frequent random access (use ArrayList instead).
	
	
	🔹 Declaration
			public class LinkedList<E>
	    		extends AbstractSequentialList<E>
	    		implements List<E>, Deque<E>, Cloneable, Serializable

	🔹 Package
		java.util.LinkedList

	🔹 LinkedList Hierarchy
		               Iterable<E>
		                   ▲
		             Collection<E>
		                   ▲
		                List<E>
		                   ▲
		   AbstractSequentialList<E>
		                   ▲
		              LinkedList<E>
		                   ▲
		                Deque<E>


	🔹 Key Features
		| Feature                     | Description                                             |
		| --------------------------- | ------------------------------------------------------- |
		| Ordered                     | Maintains insertion order                               |
		| Allows Duplicates           | Yes                                                     |
		| Doubly Linked List          | Each node has a reference to the previous and next node |
		| Efficient Insertion/Removal | Fast insertions and deletions compared to `ArrayList`   |
		| Slower Access               | Slower random access (no index jump)                    |
		| Implements Deque            | Can be used as queue, stack, or deque                   |

	
	🔹 Important Methods
		| Method                       | Description                         |
		| ---------------------------- | ----------------------------------- |
		| `add(E e)`                   | Add to end                          |
		| `addFirst(E e)`              | Add to beginning                    |
		| `addLast(E e)`               | Add to end                          |
		| `remove()` / `removeFirst()` | Remove from beginning               |
		| `removeLast()`               | Remove from end                     |
		| `get(int index)`             | Get element at index                |
		| `getFirst()` / `getLast()`   | Get first/last element              |
		| `offer(E e)`                 | Queue-style add                     |
		| `poll()`                     | Queue-style remove                  |
		| `peek()`                     | View head of queue without removing |


	🔹 LinkedList vs ArrayList
		| Feature        | LinkedList         | ArrayList       |
		| -------------- | ------------------ | --------------- |
		| Data Structure | Doubly-linked list | Dynamic array   |
		| Access Time    | ❌ Slower (O(n))    | ✅ Faster (O(1)) |
		| Insert/Delete  | ✅ Fast (O(1) ends) | ❌ Slow (O(n))   |
		| Memory Usage   | Higher (pointers)  | Lower           |


 */

package Collections;

import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		System.out.println(list);

		list.add("Mohan");						//	add an element to the end
		list.add("jack");						//	add an element to the end
		System.out.println(list);
		list.add(1, "mickel");					//	insert at specific index
		System.out.println(list);
		
		System.out.println(list.get(2));		//	gets elements at index
		
		list.addFirst("Start");					//	inserts the elements at the beginning of this list
		list.addLast("End");					//	Appnds the specified elements to the end of this list
		System.out.println(list);

		System.out.println(list.getFirst());	//	Returns the first elements in this list
		System.out.println(list.getLast());		//	Returns the last elements in this list

		System.out.println(list.remove(1));		//	Removes elemtents at index
		
		list.removeFirst();						//	Removed the returns the first elements from this list
		list.removeLast();						//	Removed the returns the last elements from this list
		System.out.println(list);
	}
}
