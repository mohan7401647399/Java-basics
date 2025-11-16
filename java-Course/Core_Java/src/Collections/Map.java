/*
		In Java, the Map interface is part of the java.util package
			and represents a collection of key-value pairs where each key is unique,
				and each key maps to exactly one value.


	✅ Key Points about Map Interface:
		Keys are unique: No duplicate keys are allowed.		
		Values can be duplicated.
		Each key maps to one value.
		It does not extend the Collection interface, but is part of the Collections Framework.


	✅ When to Use Map?	
		We want to associate keys with values (like dictionary/lookup table).		
		We need to retrieve values based on keys quickly.


	✅ Common Implementations of Map:
		| Class           | Characteristics                                                 |
		| --------------- | --------------------------------------------------------------- |
		| `Hash-table`     | Thread-safe (legacy class), doesn't allow `null` key or values. |
		| `HashMap`       | Unordered, allows one `null` key and multiple `null` values.    |
		| `LinkedHashMap` | Maintains insertion order.                                      |
		| `TreeMap`       | Sorted by natural order or custom comparator.                   |


	✅ Common Methods in Map Interface:
		| Method                        | Description                                        |
		| ----------------------------- | -------------------------------------------------- |
		| `put(K key, V value)`         | Inserts a key-value pair.                          |
		| `get(Object key)`             | Returns the value for the given key.               |
		| `remove(Object key)`          | Removes the mapping for the key.                   |
		| `containsKey(Object key)`     | Checks if key exists.                              |
		| `containsValue(Object value)` | Checks if value exists.                            |
		| `keySet()`                    | Returns a set of keys.                             |
		| `values()`                    | Returns a collection of values.                    |
		| `entrySet()`                  | Returns a set of key-value mappings (`Map.Entry`). |
		| `size()`                      | Returns number of entries.                         |
		| `clear()`                     | Removes all mappings.                              |
		| `isEmpty()`                   | Checks if map is empty.                            |

	
	
	
		✅ Comparison Table:
| Class             | Order Maintained?       | Allows null keys/values?               | Thread Safe?         | Underlying Structure                                |
| ----------------- | ----------------------- | -------------------------------------- | -------------------- | --------------------------------------------------- |
| **Hashtable**     | ❌ No                    | ❌ No (no null keys or values allowed)  | ✅ Yes (synchronized) | Hash Table                                          |
| **HashMap**       | ❌ No (random order)     | ✅ Yes (1 null key, many null values)   | ❌ No                 | Hash Table (bucket array + linked list/binary tree) |
| **LinkedHashMap** | ✅ Yes (insertion order) | ✅ Yes                                  | ❌ No                 | Hash Table + Doubly Linked List                     |
| **TreeMap**       | ✅ Yes (sorted by keys)  | ✅ Yes (but null keys ❌, null values ✔) | ❌ No                 | Red Black Tree (Balanced BST)                       |

	
	
package Collections;
import java.util.*;

public class Map {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		System.out.println(map);
		System.out.println("put: " + map.put("orange", 200));
		System.out.println("put: " + map.put("Apple", 100));
		System.out.println(map);
		System.out.println("containsKey " + map.containsKey("Apple"));
		System.out.println("containsValue: " + map.containsValue(100));
		System.out.println("isEmpty: " + map.isEmpty());
		System.out.println("size: " + map.size());
		System.out.println("get: " + map.get("Apple"));
		System.out.println("values: " + map.values());
		System.out.println("keys: " + map.keySet());
		System.out.println("replace value: " + map.replace("Apple", 120));
		System.out.println(map.entrySet());
		System.out.println("values: " + map.getOrDefault("orangee",12345));
		for (String data : map.keySet()) {
			System.out.println(map.get(data));
		}
	}
}
 */

