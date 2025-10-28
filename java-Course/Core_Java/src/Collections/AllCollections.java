/*


                    ## 🔹 1. **List (Interface)**

**Name:** `ArrayList`

* **Parent Interface:** Collection → List
* **Secondary Interface:** RandomAccess, Cloneable, Serializable
* **Best Suited Operations : :** Retrieval
* **Properties:**

  * Heterogeneous – ✅ Yes
  * Duplicate – ✅ Yes
  * Null Acceptance – ✅ Yes (multiple nulls)
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
  * Duplicate Capacity – 10
* **Version:** JDK 1.2
* **Package:** `java.util`


**Name:** `LinkedList`

* **Parent Interface:** Collection → List, Deque, Queue
* **Secondary Interface:** Serializable, Cloneable
* **Best Suited Operations : :** Insertion and Deletion
* **Properties:**

  * Heterogeneous – ✅ Yes
  * Duplicate – ✅ Yes
  * Null Acceptance – ✅ Yes (multiple nulls)
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
  * Duplicate Capacity – 10
* **Version:** JDK 1.2
* **Package:** `java.util`


**Name:** `Vector`

* **Parent Interface:** Collection → List
* **Secondary Interface:** Serializable, Cloneable, RandomAccess
* **Best Suited Operations : :** Retrieval
* **Properties:**

  * Heterogeneous – ✅ Yes
  * Duplicate – ✅ Yes
  * Null Acceptance – ✅ Yes (multiple nulls)
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
  * Duplicate Capacity – 10
* **Version:** JDK 1.0 (Legacy)
* **Package:** `java.util`


**Name:** `Stack`

* **Parent Interface:** Collection → List → Vector
* **Secondary Interface:** Serializable, Cloneable
* **Best Suited Operations : :** LIFO ( Last In First Out )
* **Properties:**

  * Heterogeneous – ✅ Yes
  * Duplicate – ✅ Yes
  * Null Acceptance – ✅ Yes
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
  * Duplicate Capacity – ✅ Allowed
* **Version:** JDK 1.0 (Legacy)
* **Package:** `java.util`


                    ## 🔹 2. **Set (Interface)**

**Name:** `HashSet`

* **Parent Interface:** Collection → Set
* **Secondary Interface:** Serializable, Cloneable
* **Best Suited Operations : :** Searching
* **Properties:**

  * Heterogeneous – ✅ Yes
  * Duplicate – ❌ No
  * Null Acceptance – ✅ Yes (only 1 null)
  * Insertion Order – ❌ No
  * Sorted Order – ❌ No
  * Duplicate Capacity – 16
* **Version:** JDK 1.2
* **Package:** `java.util`


**Name:** `LinkedHashSet`

* **Parent Interface:** Collection → Set → HashSet
* **Secondary Interface:** Serializable, Cloneable
* **Best Suited Operations : :** Cache Based Application
* **Properties:**

  * Heterogeneous – ✅ Yes
  * Duplicate – ❌ No
  * Null Acceptance – ✅ Yes (only 1 null)
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
  * Duplicate Capacity – 16
* **Version:** JDK 1.4
* **Package:** `java.util`


**Name:** `TreeSet`

* **Parent Interface:** Collection → Set → SortedSet → NavigableSet
* **Secondary Interface:** Serializable, Cloneable
* **Best Suited Operations : :** Sorting
* **Properties:**

  * Heterogeneous – ❌ No (only homogeneous & Comparable objects)
  * Duplicate – ❌ No
  * Null Acceptance – ❌ No (NullPointerException)
  * Insertion Order – ❌ No
  * Sorted Order – ✅ Yes (natural/comparator)
  * Duplicate Capacity – 16  
* **Version:** JDK 1.2
* **Package:** `java.util`


                    ## 🔹 3. **Queue (Interface)**

**Name:** `PriorityQueue`

* **Parent Interface:** Collection → Queue
* **Secondary Interface:** Serializable
* **Best Suited Operations : :** Priority Based Service
* **Properties:**
  * Heterogeneous – ❌ No (must be comparable)
  * Duplicate – ✅ Yes
  * Null Acceptance – ❌ No (NullPointerException)
  * Insertion Order – ❌ No
  * Sorted Order – ✅ Yes (priority based)
  * Duplicate Capacity – 11
* **Version:** JDK 1.5
* **Package:** `java.util`


**Name:** `ArrayDeque`

* **Parent Interface:** Collection → Queue → Deque
* **Secondary Interface:** Serializable, Cloneable
* **Properties:**

  * Heterogeneous – ✅ Yes
  * Duplicate – ✅ Yes
  * Null Acceptance – ❌ No
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
* **Version:** JDK 1.6
* **Package:** `java.util`


**Name:** `LinkedList` (also works as Queue/Deque, already covered under List)


                    ## 🔹 4. **Map (Interface)**

**Name:** `HashMap`

* **Parent Interface:** Map
* **Secondary Interface:** Serializable, Cloneable
* **Best Suited Operations : :** Searching
* **Properties:**

  * Duplicate Keys – ❌ No
  * Duplicate Values – ✅ Allowed
  * Null Key – ✅ Yes (only 1)
  * Null Values – ✅ Yes (multiple)
  * Insertion Order – ❌ No
  * Sorted Order – ❌ No
  * Duplicate Capacity – 16
* **Version:** JDK 1.2
* **Package:** `java.util`


**Name:** `LinkedHashMap`

* **Parent Interface:** Map → HashMap
* **Secondary Interface:** Serializable, Cloneable
* **Best Suited Operations : :** Cache Based Application
* **Properties:**

  * Duplicate Keys – ❌ No
  * Duplicate Values – ✅ Allowed
  * Null Key – ✅ Yes (1)
  * Null Values – ✅ Yes (multiple)
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
  * Duplicate Capacity – 16
* **Version:** JDK 1.4
* **Package:** `java.util`


**Name:** `Hashtable`

* **Parent Interface:** Map (legacy)
* **Secondary Interface:** Serializable, Cloneable
* **Properties:**

  * Duplicate Keys – ❌ No
  * Duplicate Values – ✅ Allowed
  * Null Key – ❌ No
  * Null Values – ❌ No
  * Insertion Order – ❌ No
  * Sorted Order – ❌ No
* **Version:** JDK 1.0
* **Package:** `java.util`


**Name:** `TreeMap`

* **Parent Interface:** Map → SortedMap → NavigableMap
* **Secondary Interface:** Serializable, Cloneable
* **Best Suited Operations : :** Sorting Based on Keys
* **Properties:**

  * Duplicate Keys – ❌ No
  * Duplicate Values – ✅ Allowed
  * Null Key – ❌ No
  * Null Values – ✅ Yes (multiple)
  * Insertion Order – ❌ No
  * Sorted Order – ✅ Yes (keys sorted)
  * Duplicate Capacity – 16
* **Version:** JDK 1.2
* **Package:** `java.util`

 */
