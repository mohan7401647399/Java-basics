/*
		The Set interface in Java is a part of the Java Collections Framework and extends the Collection interface.
		It represents a collection that cannot contain duplicate elements — i.e., each element is unique.


	✅ Key Features of Set
		* No duplicates allowed
		* Unordered (some implementations like HashSet do not maintain insertion order)		
		* Allows at most one null element (in some implementations like HashSet)


	🔸 When to Use Set?
			* We want to prevent duplicates
			* We don’t care about the order (use HashSet)
			* We want insertion order preserved (use LinkedHashSet)
			* We need sorted data (use TreeSet)


	🔸 Hierarchy Diagram
		         Collection (interface)
		              ↑
		             Set (interface)
		              ↑
		    ┌─────────┼─────────┐
		    ↓         ↓         ↓
		 HashSet   LinkedHashSet  TreeSet
		 (class)	  (class)	  (class)



	🔹 Common Set Implementations
		| Class             | Ordered?                        | Sorted?                                   | Allows null? | Thread-safe? |
		| ----------------- | ------------------------------- | ----------------------------------------- | ------------ | ------------ |
		| **HashSet**       | ❌ Unordered                     | ❌ No                                      | ✅ One null   | ❌            |
		| **LinkedHashSet** | ✅ Insertion order               | ❌ No                                      | ✅ One null   | ❌            |
		| **TreeSet**       | ✅ Sorted (ascending by default) | ✅ Yes (uses `Comparable` or `Comparator`) | ❌            | ❌            |




		✅ Comparison Table:
| Feature / Class     | **HashSet**            | **LinkedHashSet**            | **TreeSet**                   |
| ------------------- | ---------------------- | ---------------------------- | ----------------------------- |
| Order               | No order (random)      | Insertion order kept         | Sorted order (ascending)      |
| Data Structure      | Hash table             | Hash table + Linked list     | Red-Black Tree (balanced BST) |
| Duplicate Allowed?  | ❌ No                   | ❌ No                         | ❌ No                          |
| Performance (Speed) | FASTEST (O(1) ops)     | Slightly slower than HashSet | SLOWEST (O(log n) ops)        |
| Allows Null?        | ✅ Yes (1 null element) | ✅ Yes (1 null)               | ❌ No (null → exception)       |
| Sorting Supported?  | ❌ No                   | ❌ No                         | ✅ Yes (natural or custom)     |
| Use case            | Fast unique values     | Unique + maintain order      | Unique + sorted retrieval     |




 */