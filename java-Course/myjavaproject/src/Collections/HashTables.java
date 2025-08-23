/*


    * Old class, synchronized (thread-safe)
    * No null keys, no null values (will throw NullPointerException)
    * Slower than HashMap
    * Rarely used in new code, replaced by ConcurrentHashMap

	Hashtable in Java
		Package: java.util		
		Implements: Map<K, V>, Cloneable, Serializable		
		Stores key–value pairs.		
		No null keys and no null values allowed.		
		Thread-safe (all methods are synchronized).		
		Uses hashing for fast access.
			
	
	
 

 
	import java.util.Hashtable;
import java.util.Map;

public class HashTables {
    public static void main(String[] args) {
        // Creating a Hashtable
        Map<Integer, String> table = new Hashtable<>();

        // Adding elements
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        // Displaying the table
        System.out.println("Initial Hashtable: " + table);

        // Accessing a value
        System.out.println("Value for key 2: " + table.get(2));

        // Checking for key and value
        System.out.println("Contains key 3? " + table.containsKey(3));
        System.out.println("Contains value 'Banana'? " + table.containsValue("Banana"));

        // Replacing a value
        table.replace(2, "Blueberry");
        System.out.println("After replace: " + table);

        // Removing an entry
        table.remove(1);
        System.out.println("After removing key 1: " + table);

        // Iterating using forEach
        table.forEach((key, value) -> System.out.println(key + " => " + value));

        // Using entrySet
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clearing the table
        table.clear();
        System.out.println("Is Hashtable empty? " + table.isEmpty());
    }
}
	
*/

import java.util.Hashtable;

class HashTables {
    public static void main(String[] args) {
        Hashtable<String, Integer> hTable = new Hashtable<>();
        System.out.println(hTable);
        // hTable.put(null, 29);
        hTable.put("mohan", 29);
        hTable.put("john", 25);
        // hTable.put(null, 29);
        System.out.println(hTable.get("mohan"));
        System.out.println(hTable.isEmpty());
        System.out.println(hTable.entrySet());
    }
}