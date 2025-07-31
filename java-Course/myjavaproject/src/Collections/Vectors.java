/*
		Vector is a class in Java that is part of the Collections Framework and implements the List interface.
		It is a growable array of objects, like ArrayList, but with thread-safety.


	🔹 Declaration
		public class Vector<E> extends AbstractList<E>
                       implements List<E>, RandomAccess, Cloneable, Serializable


	🔹 Package
		java.util.Vector


	🔹 Vector Hierarchy
		        Iterable<E>
		             ▲
		       Collection<E>
		             ▲
		           List<E>
		             ▲
		       AbstractList<E>
		             ▲
		           Vector<E>


	🔹 Key Features of Vector
		| Feature           | Description                                               |
		| ----------------- | --------------------------------------------------------- |
		| Ordered           | Maintains insertion order (like `List`)                   |
		| Indexed           | Supports access by index                                  |
		| Allows Duplicates | Yes                                                       |
		| Growable Array    | Automatically resizes                                     |
		| Thread-safe       | All methods are synchronized                              |
		| Legacy Class      | Introduced before Java Collections Framework (`Java 1.0`) |


	
	🔹 Important Methods in Vector
		| Method                            | Description                            |
		| --------------------------------- | -------------------------------------- |
		| `add(E e)`                        | Adds element to the end                |
		| `add(int index, E element)`       | Adds element at specified position     |
		| `get(int index)`                  | Returns element at index               |
		| `remove(int index)`               | Removes element at index               |
		| `set(int index, E element)`       | Replaces element at index              |
		| `size()`                          | Returns the number of elements         |
		| `capacity()`                      | Returns current capacity of the Vector |
		| `ensureCapacity(int minCapacity)` | Increases capacity if needed           |
		| `trimToSize()`                    | Trims capacity to match current size   |
		| `firstElement()`                  | Returns the first element              |
		| `lastElement()`                   | Returns the last element               |



	🔹 Vector vs ArrayList
		| Feature     | Vector                  | ArrayList                      |
		| ----------- | ----------------------- | ------------------------------ |
		| Thread-safe | ✅ Yes (synchronized)   | ❌ No (not synchronized)       |
		| Performance | ❌ Slower due to sync   | ✅ Faster in single-threaded   |
		| Introduced  | Java 1.0 (legacy class) | Java 1.2 (part of Collections) |

 */


package Collections;
import java.util.Vector;

public class Vectors {
	public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        System.out.println(vector);
        
        vector.add("Mohan");
        vector.add("John");
        vector.add("Mickel");
        
        System.out.println(vector);
        
        System.out.println("get - " + vector.get(2));
        vector.set(1, "cena");
        System.out.println("After set - " + vector);      
        
        System.out.println("firstElement - " +vector.firstElement());
        System.out.println("lastElement - " + vector.lastElement());
        System.out.println("size - " + vector.size());
        System.out.println("capacity - " + vector.capacity());
        vector.remove(2);
        System.out.println("After removal - " + vector);
    }
}
