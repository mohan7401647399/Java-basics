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

	


package Collections;
import java.util.*;

public class PriorityQueues {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		System.out.println(pq);

		//	Add elements
		pq.add(5);
		pq.add(4);
		pq.offer(6);
		pq.add(1);
		pq.add(0);
//		pq.add(null);				//	throw error
		
		System.out.println(pq);				//	order not guaranteed
		
		System.out.println("size: " + pq.size());	//	returns the number of elements in this collection
		
		System.out.println("peek: " + pq.peek());	//	check head (smallest)

		System.out.println("contains: " + pq.contains(6));	//	Returns true if this queue contains specified elements		

		System.out.println("remove: " + pq.remove(5));
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());			//	ascending order
		}
		
		pq.clear();				//	Removes all of the elements from this priority queue	
		
		System.out.println(pq);
	}
}
 */


 import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {
        // Min-heap (default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.offer(10);
        pq.offer(30);

        System.out.println("PriorityQueue: " + pq); // not in sorted order

        // Peek at head
        System.out.println("Head element : " + pq.peek());

        // Poll removes head
        System.out.println("Polled: " + pq.poll());
        System.out.println("After poll : " + pq);

        // Contains
        System.out.println("Contains 20 ? " + pq.contains(20));

        // Remove specific element
        pq.remove(40);
        System.out.println("After remove 40 : " + pq);

        // Size
        System.out.println("Size : " + pq.size());

        // Iterate (order is not guaranteed)
        System.out.print("Iterating : ");
        for (Integer num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clear
        pq.clear();
        System.out.println("After clear : " + pq);

		

        // Max-heap example
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.addAll(Arrays.asList(50, 20, 40, 10, 30));
        System.out.println("MaxHeap (PriorityQueue) : " + maxHeap);
        System.out.println("Poll from MaxHeap : " + maxHeap.poll());
    }
}
