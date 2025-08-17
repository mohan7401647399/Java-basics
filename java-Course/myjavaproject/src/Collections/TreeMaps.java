/*
    * Keeps keys sorted (ascending) using natural ordering or custom Comparator
    * Does not allow null keys, but allows null values
    * Useful when you need sorted data
    * Slower — operations are O(log n)
    

    Package: java.util
    Implements: Map<K, V>, Cloneable, Serializable
    Key Points:
        Stores key-value pairs.
        No duplicate keys allowed; values can be duplicated.
        Allows one null key and multiple null values.
        Not synchronized (use Collections.synchronizedMap() for thread safety).
        Order of elements is not guaranteed.    

 */

import java.util.*;

public class TreeMaps {
    public static void main(String[] args) {
        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Banana"); // duplicate value allowed
        map.put(null, "Mango"); // one null key allowed
        System.out.println("Initial Map: " + map);

        // get()
        System.out.println("Value for key 2: " + map.get(2));

        // containsKey(), containsValue()
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // remove()
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // replace()
        map.replace(2, "Blueberry");
        System.out.println("After replacing value for key 2: " + map);

        // getOrDefault()
        System.out.println("Get key 5 or default: " + map.getOrDefault(5, "Not Found"));

        // keySet(), values(), entrySet()
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // putAll()
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(5, "Pineapple");
        anotherMap.put(6, "Grapes");
        map.putAll(anotherMap);
        System.out.println("After putAll: " + map);

        // size() and isEmpty()
        System.out.println("Size: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}
