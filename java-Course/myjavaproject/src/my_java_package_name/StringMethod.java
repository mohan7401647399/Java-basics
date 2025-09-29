/*
 								*****String*****

	In Java, String is a class in the java.lang package used to represent sequences of characters(text).
	It is one of the most commonly used classes for storing and manipulating text.


🔹 Key Features of Java String

| Feature              | Description                                                                     |
| -------------------- | ------------------------------------------------------------------------------- |
| **Immutable**        | Once created, it **cannot be changed**.                                         |
| **Stored in Pool**   | String literals are stored in a **special memory area (String Constant Pool)**. |
| **Predefined Class** | `String` is a **class**, not a primitive type, but Java makes it easy to use.   |
| **Char Sequence**    | Internally, it's a sequence of **characters (char[])**.                        |


		String s = "mohan";
		System.out.println("s name is " + s);

		String s1 = s;
		System.out.println("s1 name is " + s1);
		System.out.println(s == s1);				//	true

		String s2 = s;
		System.out.println("s2 name is " + s2);
		System.out.println(s == s2);				//	true
		
		System.out.println(s1 == s2);				//	true

		s = "Mohan R";
		System.out.println("s name is " + s);
		System.out.println(s == s1);				//	false

		System.out.println(s + " " + s1 + " " + s2);


	
								*****String memory management*****
### 🔹 **1. String Pool (String Constant Pool - SCP)**

* Java maintains a special memory area called the **String Pool** inside the **heap memory**.

* Whenever you create a string using **string literals**, Java checks the pool first:

  String s1 = "hello";
  String s2 = "hello";  									// Reuses the same object from pool

  ✅ Both `s1` and `s2` refer to the **same object** in the pool.

* If the string doesn’t exist in the pool, a new object is created and stored there.



### 🔹 **2. Heap Memory**

* If you create a string using the `new` keyword, it will **always create a new object** in heap memory:


  String s3 = new String("hello");


  ✅ `s3` refers to a new object in heap, even though `"hello"` exists in the pool.



### 🔹 **3. Interning Strings**

* You can manually add strings to the pool using `.intern()`:


String s4 = new String("hello").intern();


✅ Now `s4` will refer to the string from the **pool**, not the heap.



### 🔹 **Diagram: String Memory Allocation**


             ┌────────────────────┐
             │   String Pool      │  ← Part of Heap
             ├────────────────────┤
             │ "hello"            │ ← s1, s2
             └────────────────────┘

             ┌────────────────────┐
             │     Heap Memory    │
             ├────────────────────┤
             │ new String("hello")│ ← s3
             └────────────────────┘


### 🔸 Summary Table
| Creation Type       | Memory Location | Object Sharing          |
| ------------------- | --------------- | ----------------------- |
| `String s = "abc"`  | String Pool     | Yes (if already exists) |
| `new String("abc")` | Heap            | No (always new)         |
| `s.intern()`        | String Pool     | Yes (forced sharing)    |



package my_java_package_name;

public class StringMethod {
	public static void main(String[] args) {
		str1();
	}
	public static void str1() {
		
		//	String Literal vs. Object
		//		String Literal - Stored in the string pool.
					String stringLiteral = "Java";
					System.out.println(stringLiteral);
		//		Object - Stored in the string pool
					String stringObject = new String("Java");
					System.out.println(stringObject);
		
		String name = "Java Language";
		System.out.println(name.length());					//	total lengths
		System.out.println(name.toLowerCase());				//	small letter
		System.out.println(name.toUpperCase());				//	upper letter
		System.out.println(name.indexOf("a"));				//	index find
		System.out.println(name.charAt(2));					//	get char
		System.out.println(name.codePointAt(1));			//	unicode values
		System.out.println(name.equals("java"));			//	upper letter
		System.out.println(name.equalsIgnoreCase("java"));	//	upper letter
		System.out.println(name.contains("a"));				//	upper letter
	}
}



-------------------------------------------------------------------------------------------------------------

 											*****StringBuffer*****

🔹 What is StringBuffer in Java?
	StringBuffer is a mutable, thread-safe class used to create and manipulate strings.
	Unlike String (which is immutable), a StringBuffer can be modified without creating a new object.


When to Use StringBuffer!
	When you need to modify strings frequently (e.g., in loops).
	When you need thread safety (multiple threads modifying the same string).


🔸 Key Differences from String

| Feature         | `String`                     | `StringBuffer`                    |
| --------------- | ---------------------------- | --------------------------------- |
| **Mutable**     | ❌ No                         | ✅ Yes                             |
| **Thread-safe** | ❌ No                         | ✅ Yes                             |
| **Performance** | ✅ Faster for few operations  | ❌ Slower (due to synchronization) |
| **Memory**      | Creates new object each time  | Modifies same object              |




🔹 Common Methods in StringBuffer
| Method                     | Description                          |
| -------------------------- | ------------------------------------ |
| `append(String str)`       | Adds text to the end                 |
| `insert(int offset, str)`  | Inserts text at given position       |
| `replace(start, end, str)` | Replaces part of the text            |
| `delete(start, end)`       | Deletes part of the text             |
| `reverse()`                | Reverses the string                  |
| `capacity()`               | Returns current buffer size          |
| `length()`                 | Returns current number of characters |
| `charAt(index)`            | Returns character at given index     |



🔹 Creating a StringBuffer

		StringBuffer sb = new StringBuffer();					//	empty buffer
		StringBuffer sb2 = new StringBuffer("Java");			//	with initial value



		StringBuffer s = new StringBuffer();
		s.append("mohan");
		System.out.println(s);

		StringBuffer s1 = s;
		System.out.println(s1);
		System.out.println(s == s1);				//	true

		StringBuffer s2 = s;
		System.out.println(s2);
		System.out.println(s == s2);				//	true

		s.append(" r");
		System.out.println(s + " " + " " + s1 + " " + s2);


		

package my_java_package_name;

public class StringMethod {
	public static void main(String[] args) {
		str1();
	}

	public static void str1() {
		StringBuffer sb = new StringBuffer("Java ");			//	with initial value
		
		sb.append("programming");
		sb.insert(5, "is ");
		sb.replace(8, 19, "awesome language");
		sb.reverse();
		
		System.out.println(sb);
	}
}



-------------------------------------------------------------------------------------------------------------

 											*****StringBuilder*****

🔹 What is StringBuilder in Java?
	StringBuilder is a mutable, non-synchronized class used to manipulate character sequences (strings).
	It works faster than StringBuffer but is not thread-safe.

✅ Use StringBuilder when working with strings in a single-threaded environment.



When to Use StringBuilder
	When you need fast string manipulation.
	When thread-safety is not required.
	When working inside loops or large data processing.


🔸 Key Features of StringBuilder

| Feature             | Description                                     |
| ------------------- | ----------------------------------------------- |
| **Mutable**         | You can change the content (no new object).     |
| **Not Thread-Safe** | Faster, but not safe in multi-threaded code.    |
| **Efficient**       | Best for modifying strings often (e.g., loops). |
| **Introduced in**   | Java 1.5                                        |



🔹 How to Create a StringBuilder
		StringBuilder sb = new StringBuilder();						//	empty builder
		StringBuilder sb2 = new StringBuilder("Java");				//	with initital text




🔹 Common Methods

| Method                       | Description                               |
| ---------------------------- | ----------------------------------------- |
| `append(String s)`           | Adds string at the end                    |
| `insert(int index, s)`       | Inserts string at a given position        |
| `replace(int start, end, s)` | Replaces part of the string               |
| `delete(int start, end)`     | Deletes part of the string                |
| `reverse()`                  | Reverses the entire string                |
| `length()`                   | Returns number of characters              |
| `capacity()`                 | Returns buffer size (default is 16 + str) |




		StringBuilder s = new StringBuilder();
		s.append("mohan");
		System.out.println(s);

		StringBuilder s1 = s;
		System.out.println(s1);
		System.out.println(s == s1);				//	true

		StringBuilder s2 = s;
		System.out.println(s2);
		System.out.println(s == s2);				//	true

		s.append(" r");
		System.out.println(s + " " + " " + s1 + " " + s2);





package my_java_package_name;

public class StringMethod {
	public static void main(String[] args) {
		str1();
	}

	public static void str1() {
		StringBuilder sb = new StringBuilder("Java");				//	with initital text
		
		sb.append(" Developer");
		sb.insert(5, "is a");
		sb.replace(8, 9, "great ");
		sb.delete(0, 5);
		sb.reverse();
		
		System.out.println(sb);
	}
}




package my_java_package_name;

public class StringMethod {
	public static void main(String[] args) {
		str1();
	}
	
	public static void str1() {
		String sentence = "Java is fun";
		
		String[] splitStr = sentence.split(" ");						//	split sentence into words
		
		for(String word : splitStr) {
			StringBuilder sb = new StringBuilder(word);					//	use StringBuilder to user reverse each word
			System.out.println(sb.reverse().toString() + " ");
		}
		
	}
}



🔹 Summary Table

| Feature           | `String`                        | `StringBuffer`                   | `StringBuilder`         |
| ----------------- | ------------------------------  | -------------------------------  | ----------------------- |
| **Mutability**    | ❌ Immutable                    | ✅ Mutable                       | ✅ Mutable               |
| **Thread-safe**   | ❌ No                           | ✅ Yes (synchronized)            | ❌ No (not synchronized) |
| **Performance**   | ❌ Slow (new object every time) | ❌ Slower (due to thread-safety) | ✅ Fastest (no sync)     |
| **Use Case**      | Constant text                   | Multi-threaded updates           | Single-threaded updates |
| **Introduced in** | Java 1.0                        | Java 1.0                         | Java 1.5                |
 */
