/*
	
	The HashMap class is one of the most commonly used implementations of the Map interface in Java.
		It stores key-value pairs
			and allows fast retrieval, insertion, and deletion based on keys.
	
	
	📦 Package:
		import java.util.HashMap;

	
	✅ Key Characteristics of HashMap:
		Stores key-value pairs.
		Keys are unique, but values can be duplicated.
		Allows one null key and multiple null values.
		Does not maintain any order (i.e., it is unordered).
		Provides constant time performance (O(1)) for basic operations like get() and put().
		Not synchronized (not thread-safe) — for thread-safe version, use Collections.synchronizedMap() or ConcurrentHashMap.
		
			
	⚠️ Notes:
		HashMap is not sorted. If you want a sorted map, use TreeMap.
		It is not thread-safe. For multithreaded scenarios, use:		
			Map<K, V> syncMap = Collections.synchronizedMap(new HashMap<>());


	✅ Common Methods:
		| Method                        | Description                                   |
		| ----------------------------- | --------------------------------------------- |
		| `put(K key, V value)`         | Adds or updates a key-value pair.             |
		| `get(Object key)`             | Retrieves value for the given key.            |
		| `remove(Object key)`          | Removes key-value pair.                       |
		| `containsKey(Object key)`     | Checks if a key exists.                       |
		| `containsValue(Object value)` | Checks if a value exists.                     |
		| `size()`                      | Number of key-value pairs.                    |
		| `isEmpty()`                   | Checks if map is empty.                       |
		| `clear()`                     | Removes all mappings.                         |
		| `keySet()`                    | Returns all keys.                             |
		| `values()`                    | Returns all values.                           |
		| `entrySet()`                  | Returns a set of key-value pairs (Map.Entry). |

			
 */


package Collections;
import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm);
		
		hm.put("Apple", 100);
		hm.put("Banana", 50);
		hm.put("Orange", 85);
		hm.put("Mango", 60);
		
		System.out.println("HashMaps: " + hm);
		
		System.out.println("get values: " + hm.get("Banana"));
		
		System.out.println("Keys: " + hm.keySet());
		
		System.out.println("Values: " + hm.values());
		
		System.out.println("Total pairs: " + hm.entrySet());
		
		System.out.println("pair sizes: " + hm.size());
		
		System.out.println("Empty: " + hm.isEmpty());
		
		System.out.println("containsKey: " + hm.containsKey("Apple"));
		
		System.out.println("containsValue: " +  hm.containsValue(200));
		
		System.out.println(hm.remove("Apple"));
		
		System.out.println(hm);
		
		hm.clear();
		
		System.out.println(hm);
	}
}
