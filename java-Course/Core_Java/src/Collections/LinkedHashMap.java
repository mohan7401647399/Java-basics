/*
    * Maintains insertion order
    * Slightly slower than HashMap due to extra linked list
    * Allows null key and null values
    * Good when you want predictable iteration order

    
    LinkedHashMap in Java
        Package: java.util
        Implements: Map<K,V>, Cloneable, Serializable
        Order: Maintains insertion order of keys.
        Null keys/values: Allows one null key and multiple null values.
        Performance: Similar to HashMap, but slightly slower due to order maintenance.

 */





import java.util.*;

public class LinkedHashMap {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding elements
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        // Displaying map
        System.out.println("Initial LinkedHashMap: " + map);

        // Accessing elements
        System.out.println("Value for key 102: " + map.get(102));

        // Removing an element
        map.remove(103);
        System.out.println("After removal: " + map);

        // Checking presence
        System.out.println("Contains key 101? " + map.containsKey(101));
        System.out.println("Contains value 'Python'? " + map.containsValue("Python"));

        // Replacing value
        map.replace(102, "JavaScript");
        System.out.println("After replacement: " + map);

        // Iterating using entrySet
        System.out.println("Iterating LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Size
        System.out.println("Size: " + map.size());
    }
}
