/*
	The PriorityQueue class in Java is part of the java.util package and implements the Queue interface.
	Unlike normal queues (FIFO), a PriorityQueue orders its elements according to their natural ordering or by a custom Comparator.


	✅ Key Features:
		* Not FIFO-based — elements are processed by priority		
		* Does not allow null elements		
		* Duplicates are allowed		
		* Unordered when printed (but retrieval is always priority-based)		
		* Backed by a min-heap

	✅ When to Use PriorityQueue?
		* Task scheduling based on priority		
		* Dijkstra’s Algorithm for shortest path		
		* CPU job queues		
		* Anytime order of processing matters more than insertion order


	✅ Class Hierarchy:
			Object
		  	   ▲
		AbstractCollection<E>
		  	   ▲
		    Queue<E>
		       ▲
	     PriorityQueue<E>

	✅ Important Methods
		| Method             | Description                                          |
		| ------------------ | ---------------------------------------------------- |
		| `add(E e)`         | Inserts an element, throws exception if fails        |
		| `offer(E e)`       | Inserts element, returns false if fails              |
		| `poll()`           | Removes and returns the **highest priority** element |
		| `peek()`           | Returns but does not remove the head                 |
		| `remove(Object o)` | Removes a specific element                           |


	⚠️ Limitations:
		* Not thread-safe (use PriorityBlockingQueue for concurrency)		
		* No guarantee on order when using iterator() or toString()
	
	
	✅ Summary Table
		| Feature            | Behavior                       |
		| ------------------ | ------------------------------ |
		| Order              | By natural order or comparator |
		| Null allowed?      | ❌ No                           |
		| Duplicate allowed? | ✅ Yes                          |
		| Implements         | `Queue<E>`                     |
		| Common use         | Scheduling, priority tasks     |

	
 */

package Collections;
import java.util.*;

public class PriorityQueues {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		System.out.println(pq);
		
		pq.add(5);
		pq.add(6);
		pq.add(4);
		pq.add(1);
		
		while(pq.isEmpty()) {
			System.out.println(pq.poll());			//	ascending order
		}
		
		System.out.println(pq);
	}
}
