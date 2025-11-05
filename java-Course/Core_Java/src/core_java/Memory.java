/*
	In Java, memory is managed through the **Java Memory Model (JMM)**. It divides memory into several regions, each with a specific purpose. 

### ✅ **Main Memory Areas in Java**

| Memory Area                       | Description                                                                 |
| --------------------------------- | --------------------------------------------------------------------------- |
| **Heap**                          | Stores objects and instance variables. Shared by all threads.               |
| **Stack**                         | Stores method calls, local variables, and references. One stack per thread. |
| **Method Area**                   | Stores class-level metadata (static variables, class info, constants).      |
| **Program Counter (PC) Register** | Stores the current instruction address of the thread. One PC per thread.    |
| **Native Method Stack**           | Used for native methods (written in C/C++ via JNI).                         |


### 🔹 **1. Heap Memory**

* **Stores:** Objects, class instances, arrays.
* **Garbage Collected:** Yes.
* **Example:**

  Student s = new Student();  // s is reference in stack, object is in heap


### 🔹 **2. Stack Memory**

* **Stores:** Local variables, method calls, object references.
* **Thread-specific:** Each thread has its own stack.
* **Example:**

  int a = 5;  // 'a' stored in stack


### 🔹 **3. Method Area (aka Metaspace in Java 8+)**

* **Stores:** Class definitions, static variables, method metadata, constant pool.
* **Shared:** Among all threads.
* **Note:** Pre-Java 8: Part of PermGen (deprecated). Java 8+: Moved to Metaspace.


### 🔹 **4. PC Register**

* **Stores:** Address of the JVM instruction being executed for the current thread.
* **Thread-specific**


### 🔹 **5. Native Method Stack**

* **Stores:** Information for native methods used in Java via **JNI (Java Native Interface)**.
* Used less frequently unless working with native libraries.


### 🧠 Summary Diagram

               +---------------------------+
               |      Method Area          | <- class metadata, static vars
               +---------------------------+
               |          Heap             | <- objects, arrays
               +---------------------------+
Thread 1 --->  |          Stack            | <- method calls, local vars
              |   PC Register (Thread 1)   |
              |   Native Method Stack      |
              +---------------------------+

Thread 2 --->  |          Stack            |
              |   PC Register (Thread 2)   |
              |   Native Method Stack      |
              +---------------------------+

### 🔍 Optional: JVM Internal Memory Breakdown

* **Young Generation (Eden + Survivor spaces)**
* **Old Generation (Tenured)**
* **Garbage Collector** works across these generations in the heap

 */
package core_java;

