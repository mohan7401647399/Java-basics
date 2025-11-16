/*
	The Deque interface (pronounced "deck") stands for Double Ended Queue.
	It is a linear collection that allows insertion and removal of elements from both ends — front (head) and rear (tail).

	✅ Hierarchy of Deque
		             Collection<E>
		                   ▲
		                Queue<E>
		                   ▲
		               Deque<E>
		                   ▲
		     ┌──────────────┬───────────────┐
		     │              │               │
		 ArrayDeque<E>   LinkedList<E>  ConcurrentLinkedDeque<E>

	* ArrayDeque → Most commonly used, faster than Stack & LinkedList
	* LinkedList → Implements both Queue and Deque
	* ConcurrentLinkedDeque → For thread-safe applications

	✅ Why Use Deque?
		Works as a queue (FIFO)		
		Works as a stack (LIFO)		
		More flexible than regular queues or stacks

	✅ When to Use Deque?
		* When you need insert/remove from both ends		
		* For building custom stacks/queues		
		* Better alternative to Stack (faster, more modern)


	✅ Important Methods in Deque
		| Operation     | Head Side         | Tail Side        |
		| ------------- | ----------------- | ---------------- |
		| Add           | `addFirst(E e)`   | `addLast(E e)`   |
		| Offer         | `offerFirst(E e)` | `offerLast(E e)` |
		| Remove        | `removeFirst()`   | `removeLast()`   |
		| Poll          | `pollFirst()`     | `pollLast()`     |
		| Peek          | `peekFirst()`     | `peekLast()`     |
		| Stack Methods | `push(E e)`       | `pop()`          |


	✅ Summary
		| Feature             | `Deque` Interface          |
		| ------------------- | -------------------------- |
		| Order               | FIFO + LIFO                |
		| Allows null?        | ❌ Not recommended          |
		| Duplicates Allowed? | ✅ Yes                      |
		| Common Classes      | `ArrayDeque`, `LinkedList` |

*/


