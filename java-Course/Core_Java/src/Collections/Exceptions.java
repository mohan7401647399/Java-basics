/*
	
	In Java, exceptions in collections occur when you perform invalid operations on collection objects like List, Set, Map, etc.
	These are runtime exceptions and can cause your program to crash if not handled properly.
	
	
	🔹 1. NullPointerException
			Cause: Trying to use a null collection or accessing a null element.
			
			List<String> list = null;
			System.out.println(list);				// NullPointerException

		
	🔹 2. IndexOutOfBoundsException / ArrayIndexOutOfBoundsException
			Cause: Accessing an index that doesn't exist in the list/array.
			
				ArrayList<String> names = new ArrayList<>();
				names.add("mohan");
				System.out.println(names.get(2));			// IndexOutOfBoundsException
			
			
	🔹 3. ClassCastException
			Cause: Invalid type casting when working with collections (e.g., casting an Object to the wrong type).
		
				ArrayList<String> names = new ArrayList<>();
				names.add("mohan");
				Integer num = (Integer) names.get(0);			// ClassCastException
		
		
	🔹 4. ConcurrentModificationException
			Cause: Modifying a collection while iterating through it using a for-each loop.
		
				ArrayList<String> names = new ArrayList<>();
				names.add("mohan");
				names.add("jack");
				for(String name : names) {
					if(names.equals("mohan")) names.remove(name);
				}
				System.out.println(names);		// ConcurrentModificationException
				
				
				✅ Fix: Use Iterator to remove safely.
					
						ArrayList<String> names = new ArrayList<>();
						names.add("mohan");
						names.add("jack");
						Iterator<String> it = names.iterator();
						while(it.hasNext()) {
							if(it.next().equals("mohan")) it.remove();
						}
						System.out.println(names);
			
			
	🔹 5. IllegalArgumentException
			Cause: Passing an illegal argument to a collection method.
					
				ArrayList<String> names = new ArrayList<>(-1);	//	IllegalArgumentException
					
					
	🔹 6. UnsupportedOperationException
			Cause: Trying to modify an unmodifiable collection (like those returned by List.of() or Arrays.asList() in some cases).

				List<String> names = List.of("Mohan","jack");
				names.add("john");								//	UnsupportedOperationException
				System.out.println(names);
							
							
	🔹 7. NoSuchElementException
			Cause: Calling next() on an empty iterator or queue.
			
				Queue<String> queue = new LinkedList<>();
				System.out.println(queue.remove());			//	NoSuchElementException
			
				✅ Fix: Use poll() instead of remove() which returns null if empty.


			
 */

package Collections;

import java.util.*;

public class Exceptions {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		System.out.println(queue.remove());			//	NoSuchElementException
	}
}
