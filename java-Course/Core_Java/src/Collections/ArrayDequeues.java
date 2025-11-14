/*
	The ArrayDeque class is part of Java’s Collections Framework.
	It implements both the Queue and De-que interfaces and is used to create double-ended queues using re-sizable arrays.

	✅ Key Features of ArrayDeque
		Allows insertion and deletion from both ends (head and tail)		
		Faster than LinkedList for stack/queue operations		
		No capacity restrictions (auto-growable)		
		Does not allow null elements
		
		Can be used as:		
			Queue (FIFO)			
			Stack (LIFO)
	
	
	✅ Class Hierarchy
			Object
			▲
	AbstractCollection<E>
			▲
	Deque<E> (extends Queue<E>)
			▲
		ArrayDeque<E>


	✅ When to Use ArrayDeque?
		When you need a queue or stack without thread-safety		
		When you need better performance than LinkedList		
		For efficient insertions/removals at both ends
		
		
	❌ Limitations
		Not thread-safe (use ConcurrentLinkedDeque for multi-threading)		
		Does not allow null elements
	
	
	✅ Summary Table
		| Feature             | `ArrayDeque`                  |
		| ------------------- | ----------------------------- |
		| Order               | Maintains order (Queue/Deque) |
		| Null allowed?       | ❌ No                          |
		| Duplicates allowed? | ✅ Yes                         |
		| Thread-safe?        | ❌ No                          |
		| Used as             | Queue, Stack, Deque           |



✅ 1. Example: Using as a Queue (FIFO)

package Collections;
import java.util.*;

public class ArrayDequeues {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>();
		
		System.out.println(queue);
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}


✅ 2. Example: Using as a Stack (LIFO)

package Collections;
import java.util.*;

public class ArrayDequeues {
	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();
		
		System.out.println(queue);
		
		queue.push("A");
		queue.push("B");
		queue.push("C");
		queue.push("D");
		
		System.out.println(queue);
		System.out.println(queue.pop());
		System.out.println(queue);
	}
}


package Collections;
import java.util.*;

public class ArrayDequeues {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
		
		System.out.println(stack);
		
		stack.push("B");
		stack.push("A");
		stack.push("C");
		
		System.out.println(stack);
		
		System.out.println(stack.getFirst());
	
		System.out.println(stack.pop());
		
	}
}




import java.util.*;

public class ArrayDequeues {
	public static void main(String[] args) {
		// Create ArrayDeque as Queue
		Queue<String> queue = new ArrayDeque<>();

		// Adding elements
		queue.add("Apple"); // Throws exception if fails
		queue.offer("Banana"); // Returns false if fails
		queue.offer("Cherry");
		queue.offer(null);// Throws error

		System.out.println("Queue: " + queue);

		// Access head element
		System.out.println("Head (element): " + queue.element()); // Exception if empty
		System.out.println("Head (peek): " + queue.peek()); // null if empty

		// Removing elements
		System.out.println("Removed (remove): " + queue.remove()); // Exception if empty
		System.out.println("Removed (poll): " + queue.poll()); // null if empty

		System.out.println("Queue after removals: " + queue);
	}
}




 */
package Collections;

import java.util.*;

class ArrayDequeues{
    public static void main(String[] args){
        ArrayDeque<Integer> pQueue = new ArrayDeque<>();
        // pQueue.add(null);
        pQueue.add(3);
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(2);
        pQueue.add(5);
        System.out.println(pQueue);
        System.out.println(pQueue.isEmpty());
        System.out.println(pQueue.getFirst());
        System.out.println(pQueue.getLast());
        System.out.println(pQueue.peek());
    }
}