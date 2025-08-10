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




##                   **2. Non-Primitive (Reference) Data Types**

These store **references (memory addresses)** to objects, not the actual data.

Examples:

* **String** → `"Hello"`
* **Arrays** → `int[] arr = {1, 2, 3};`
* **Classes** → `class Person { ... }`
* **Interfaces** → `interface Animal { ... }`
* **Enums** → `enum Days { MON, TUE, ... }`

### **Key Differences Between Primitive and Non-Primitive**

| Feature        | Primitive               | Non-Primitive                          |
| -------------- | ----------------------- | -------------------------------------- |
| Stored as      | Value                   | Reference to object                    |
| Default values | Simple (0, false, etc.) | `null`                                 |
| Memory         | Less                    | More (stores object metadata)          |
| Methods        | No built-in methods     | Have methods (e.g., `String.length()`) |


 */

package my_java_package_name;

public class DataTypes {

}
