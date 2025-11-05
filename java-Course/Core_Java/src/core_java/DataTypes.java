/*
	
	In Java, **data types** specify the kind of values a variable can hold.
They fall into two main categories: **Primitive** and **Non-Primitive (Reference)** types.


## **1. Primitive Data Types** (8 types)

These are the most basic types built into Java. They store **actual values** and are **not objects**.

| Data Type   | Size    | Default Value | Example Values                                            | Description                                   |
| ----------- | ------- | ------------- | --------------------------------------------------------- | --------------------------------------------- |
| **byte**    | 1 byte  | 0             | `-128` to `127`                                           | Small integers; often used for saving memory. |
| **short**   | 2 bytes | 0             | `-32,768` to `32,767`                                     | Medium-sized integers.                        |
| **int**     | 4 bytes | 0             | `-2,147,483,648` to `2,147,483,647`                       | Default integer type.                         |
| **long**    | 8 bytes | 0L            | Large integers; add `L` at end.                           |                                               |
| **float**   | 4 bytes | 0.0f          | Decimal numbers (single precision); add `f` at end.       |                                               |
| **double**  | 8 bytes | 0.0d          | Decimal numbers (double precision); default for decimals. |                                               |
| **char**    | 2 bytes | '\u0000'      | `'A'`, `'1'`, `'#'`                                       | Single 16-bit Unicode character.              |
| **boolean** | 1 bit\* | false         | `true`, `false`                                           | Logical values (true/false).                  |

> *Technically `boolean` size isn’t fixed in JVM spec; depends on JVM implementation.*


package core_java;

public class DataTypes {
	public static void main(String[] args) {
		byte b = 10;
		System.out.println("byte value is : " + b);
		short s = 1000;
		System.out.println("short value is : " + s);
		int num = 50000;
		System.out.println("int value is : " + num);
		long bigNum = 123456789L;
		System.out.println("long value is : " + bigNum);
		float f = 10.5f;
		System.out.println("float value is : " + f);
		double d = 19.99999;
		System.out.println("double value is : " + d);
		char c = 'a';
		System.out.println("char value is : " + c);
		boolean isTrue = true;
		System.out.println("boolean value is : " + isTrue);
	}
}



##                   **2. Non-Primitive (Reference) Data Types**

These store **references (memory addresses)** to objects, not the actual data.

Examples:

* **String** → `"Hello"`
* **Arrays** → `int[] arr = {1, 2, 3};`
* **Classes** → `class Person { ... }`
* **Interfaces** → `interface Animal { ... }`
* **Enums** → `enum Days { MON, TUE, ... }`


package core_java;

import java.util.Arrays;

class Person {
	String name = "Mohan";
}

public class DataTypes {
	public static void main(String[] args) {
		String name = "Mohan";
		System.out.println("String value is : " + name);
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("arrays is : " + Arrays.toString(arr));
		Person p = new Person();
		System.out.println("Class with Object value is : " + p.name);
	}
}


### **Key Differences Between Primitive and Non-Primitive**

| Feature        | Primitive               | Non-Primitive                          |
| -------------- | ----------------------- | -------------------------------------- |
| Stored as      | Value                   | Reference to object                    |
| Default values | Simple (0, false, etc.) | `null`                                 |
| Memory         | Less                    | More (stores object metadata)          |
| Methods        | No built-in methods     | Have methods (e.g., `String.length()`) |


 */




