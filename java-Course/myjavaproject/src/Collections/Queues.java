/*
	The Queue interface in Java represents a First-In-First-Out (FIFO) data structure.
	It is part of the java.util package and is used when order of processing matters 
		— like in task scheduling, print jobs, or breadth-first search in graphs.


	✅ Queue Interface Hierarchy
	            Collection<E>
	                  ▲
	               Queue<E>
	                  ▲
	  ┌─────────────┬─────────────┬─────────────┐
	  │             │             │             │
	PriorityQueue   LinkedList   ArrayDeque   (Concurrent Queues)
	
PriorityQueue – Elements processed based on priority, not strictly FIFO
LinkedList – Can be used as a queue or deque
ArrayDeque – Faster than LinkedList for queue operations
ConcurrentLinkedQueue – For multi-threaded environments


	✅ When to Use Queue?
		Task scheduling (e.g., print queue, job queue)		
		Level-order tree traversal		
		Order-preserving scenarios		
		Producer-consumer problems

	✅ Summary
		| Feature             | Queue Interface                                   |
		| ------------------- | ------------------------------------------------- |
		| Order               | FIFO (usually)                                    |
		| Duplicates Allowed? | ✅ Yes                                             |
		| Null Allowed?       | ❌ In some implementations (e.g., `PriorityQueue`) |
		| Common Classes      | `LinkedList`, `ArrayDeque`, `PriorityQueue`       |

	
		
		
		
 */

package Collections;
import java.util.*;

public class Queues {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		queue.offer("C");
		queue.offer("B");
		queue.offer("A");

		System.out.println(queue);

		System.out.println(queue.peek());	//	Retrieves but not remove, the head of this queue
		System.out.println("After peek - " +  queue);
		
		System.out.println("get elements - " + queue.element());	//	Retrieves but not remove, the head of this queue		
		
		System.out.println(queue.poll());	//	Retrieves and removed, the head of this queue
		System.out.println("After poll - " + queue);
		
		System.out.println(queue.remove());	//	Retrieves and removed, the head of this queue
		System.out.println("After remove - " + queue);
	}
}
