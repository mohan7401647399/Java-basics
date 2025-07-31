/*
	* In Java, Stack is a class that is a part of the Collections Framework and extends Vector,
		which in turn implements the List interface.
	* Stack follows the Last-In-First-Out (LIFO) principle —
		the last element added is the first one to be removed.

	🔹 Declaration:
		public class Stack<E> extends Vector<E>

	🔹 Package:
		java.util.Stack

	🔹 Stack Hierarchy:
		     Iterable<E>
                ▲
            Collection<E>
                ▲
              List<E>
                ▲
             Vector<E>
                ▲
             Stack<E>

	🔹 Main Methods of Stack
		| Method             | Description                              |
		| ------------------ | ---------------------------------------- |
		| `push(E item)`     | Adds an item to the top                  |
		| `pop()`            | Removes and returns the top item         |
		| `peek()`           | Returns the top item without removing it |
		| `empty()`          | Checks if the stack is empty             |
		| `search(Object o)` | Returns 1-based position from the top    |


	🔹 When to Use Stack?
		Use Stack when:
			You need LIFO operations.
			You want a simple stack data structure without using more modern classes like Deque.
		⚠️ Note: Modern Java recommends using Deque (like ArrayDeque) over Stack due to better performance and thread safety.
*/

package Collections;
import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		System.out.println(stack);
		
		stack.push("Mohan");						//	Add an item to the top
		stack.push("john");							//	Add an item to the top
		stack.push("jack");							//	Add an item to the top
		stack.push("mickel");						//	Add an item to the top
		stack.push("john");							//	Add an item to the top

		System.out.println(stack);
//		System.out.println(stack.pop());			//	Removes and returns the top item
		System.out.println(stack.peek());			//	Returns the top item without removing it
		System.out.println(stack.isEmpty());		//	check if the stack is empty
		System.out.println(stack.search("john"));	//	Return 1-based position from the top
		
		//	Vector/List-methods
		System.out.println(stack.size());			//	Returns the number of components in the vector
		System.out.println(stack.get(0));			//	Returns the elements at the specified position in this vector
	}
}
