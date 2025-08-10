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




1. Push and Pop Elements

import java.util.*;

class Main{
    public static void main(String[] args){
        Stack<Integer> nums = new Stack<>();
        
        nums.push(10);
        nums.push(20);
        nums.push(30);
        
        System.out.println(nums);
        
        System.out.println(nums.pop());
        
        System.out.println(nums);
    }
}




2. Peek the Top Element

import java.util.*;

class Main{
    public static void main(String[] args){
        Stack<Integer> nums = new Stack<>();
        
        nums.push(10);
        nums.push(20);
        nums.push(30);
        
        System.out.println(nums);
        
        System.out.println(nums.peek());
    }
}





3. Check if Stack is Empty

import java.util.*;

class Main{
    public static void main(String[] args){
        Stack<Integer> nums = new Stack<>();
        
        nums.push(10);
        nums.push(20);
        nums.push(30);
        
        System.out.println(nums);
        
        System.out.println(nums.isEmpty());
    }
}




4. Search for an Element

import java.util.*;

class Main{
    public static void main(String[] args){
        Stack<Integer> nums = new Stack<>();
        
        nums.push(10);
        nums.push(20);
        nums.push(30);
        
        System.out.println(nums);
        
        System.out.println(nums.search(10));
        System.out.println(nums.search(20));
        }
}





5. Reverse a String Using Stack

import java.util.*;

class Main{
    public static void main(String[] args){
        String str = "Mohan";
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch : str.toCharArray()){
            stack.push(ch);
        }
        System.out.println(stack);
        
        String reversed = "";
        
        while(!stack.isEmpty()){
            reversed += stack.pop();
        }
        System.out.println(reversed);
    }
}




6. Reverse Stack Elements

import java.util.*;

class Main{
    public static void main(String[] args){
        Stack<Integer> nums = new Stack<>();
        
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        
        System.out.println(nums);
        
        List<Integer> list = new ArrayList<>();
        
        while(!nums.isEmpty()){
            list.add(nums.pop());
        }
        
        for(int num: list) {
            nums.push(num);
        }
        
        System.out.println(nums);
    }
}

*/

import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        // Stack reference
        Stack<String> stack = new Stack<>();

        // Push elements (stack-specific)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack: " + stack);

        // Peek at top element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Search element
        System.out.println("Position of Apple from top: " + stack.search("Apple"));

        // Check if empty
        System.out.println("Is empty? " + stack.empty());

        // Using List interface methods
        stack.add("Mango"); // behaves like Vector add()
        stack.add(1, "Grapes");
        System.out.println("After List add: " + stack);

        System.out.println("Element at index 1: " + stack.get(1));

        stack.remove("Apple");
        System.out.println("After remove: " + stack);

        // Convert to array
        String[] arr = stack.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(arr));

        // Clear stack
        stack.clear();
        System.out.println("After clear: " + stack);
    }
}
