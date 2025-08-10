/*
	In Java, ArrayList is a resizable array implementation of the List interface.
	It allows you to store elements dynamically and access them by index,
			just like an array — but with more powerful features.
	
	✅ Summary
		ArrayList is a dynamic array implementation of List.
		It's the most commonly used collection in Java.
		Fast for read operations, but slower for inserting/removing in the middle.
	
	🔹 Key Features
		| Feature               | Description                                            |
		| --------------------- | ------------------------------------------------------ |
		| **Ordered**           | Maintains insertion order                              |
		| **Allows Duplicates** | Yes                                                    |
		| **Indexed Access**    | Fast access via index (like an array)                  |
		| **Resizable**         | Automatically grows when full                          |
		| **Not Thread-safe**   | Use `Collections.synchronizedList()` for thread safety |
		| **Efficient**         | Best for random access and add/remove at end           |


	🔹 ArrayList vs Array
		| Feature     | Array                | ArrayList                        |
		| ----------- | -------------------- | -------------------------------- |
		| Size        | Fixed                | Dynamic (resizable)              |
		| Methods     | Basic (length, loop) | Rich (add, remove, etc.)         |
		| Type        | Can store primitives | Only objects (use wrapper types) |
		| Flexibility | Less                 | More                             |

	
	
	🔹 Declaration
			public class ArrayList<E> extends AbstractList<E>
	                          implements List<E>, RandomAccess, Cloneable, Serializable

	🔹 Package
		java.util.ArrayList


	🔹 ArrayList Hierarchy
		               Iterable<E>
		                    ▲
		              Collection<E>
		                    ▲
		                 List<E>
		                    ▲
		           AbstractList<E>
		                    ▲
		              ArrayList<E>

	

package Collections;

import java.util.*;

class ArrayLists{
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Mohan");
		names.add("john");
		names.add("jack");
		names.add("roman");
		
		System.out.println(names);
		
		System.out.println(names.get(0));				//	Returns the values at the specified index in this list
		
		names.set(0, "R Mohan");						//	Replaces the element at the specified position in this list with the specified elements 
		
		System.out.println(names);
		
		System.out.println(names.size());				//	Returns the number of elements in this list
		
		System.out.println(names.remove(3));			//	Removes the element at the specified position in this list
		
		System.out.println(names);
	}
}	
	
	
	
	* 10 - problems *
	
1. Create and Print an ArrayList
import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();

        names.add("Mohan");
        names.add("John");
        names.add("Cena");
        names.add("Roman");

        System.out.println(names);

        for(String name: names){
            System.out.println(name);
        }
    }
}	

	
	
	
2. Add and Remove Elements
import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(3);

        System.out.println(nums);
        
        System.out.println(nums.remove(0));
        
        System.out.println(nums);
        
        nums.remove(Integer.valueOf(2));
        
        for(Integer num: nums){
            System.out.println(num);
        }
    }
}	




3. Search for an Element

import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        int target = 4;
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(3);
        
        if(nums.contains(target)){
            System.out.println(target + " target found index at "+ nums.indexOf(target));
        } else {
            System.out.println(target + " not found");
        }
    }
}




4. Find Maximum and Minimum Element

import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(3);
        
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        
        System.out.println("max number is " + max);
        System.out.println("min number is " + min);
    }
}



5. Sort the ArrayList

import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        int target = 4;
        nums.add(2);
        nums.add(1);
        nums.add(4);
        nums.add(3);
        
        Collections.sort(nums);
        
        System.out.println("Sorted numbers is - " + nums);
    }
}



6. Reverse the ArrayList

import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        
        Collections.reverse(nums);
        
        System.out.println("Reversed numbers is - " + nums);
    }
}




7. Remove Duplicates from an ArrayList

import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>(List.of("Mohan", "John", "Mohan", "jack"));
        System.out.println(names);
        
        Set<String> unique = new LinkedHashSet<>(names);
        System.out.println(unique);
        
        ArrayList<String> noDuplicates = new ArrayList<>(unique);
        System.out.println(noDuplicates);
    }
}




8. Convert Array to ArrayList

import java.util.*;

class Main{
    public static void main(String[] args){
        String[] arr = {"One", "Two", "Three"};
        
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        
        System.out.println(list);
    }
}




9. Find Frequency of an Element

import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<String> datas = new ArrayList<>(List.of("A","B","C","D","C","D"));
        
        System.out.println(datas);
        
        int count = Collections.frequency(datas, "C");
        System.out.println("frequency of C word is - " + count);
    }
}





10. Merge Two ArrayLists

import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> names1 = new ArrayList<>(List.of(1,2,3));
        ArrayList<Integer> names2 = new ArrayList<>(List.of(4,5,6));
        
        names1.addAll(names2);
        
        System.out.println("merged array is - " + names1);
    }
}
 */

import java.util.*;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mohan");
        names.add("john");
        names.add("jack");
        names.add("roman");

        System.out.println("names: " + names);

        System.out.println("Element at index - 2 " + names.get(2)); // Get element

        names.set(1, "R Mohan");// Update element

        System.out.println("After updates : " + names);

        System.out.println(names.contains("jack"));// Check contains

        names.remove("jack");// Remove by value
        System.out.println("After updates : " + names);

        names.remove(2);// Remove by value
        System.out.println("After updates : " + names);

        System.out.println("Size : " + names.size()); // size
        System.out.println("Size : " + names.isEmpty()); // isEmpty

        List<String> list = names.subList(0, 2);
        System.out.println("subList : " + list); // subList

        String[] arr = names.toArray(new String[0]); // Convert to array
        System.out.println(Arrays.toString(arr));

        names.clear();
        System.out.println("After updates : " + names);
    }
}