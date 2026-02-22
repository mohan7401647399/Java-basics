/*
What is Java?

	Java is a platform-independent, object-oriented, high-level programming language used to build web, desktop, mobile and enterprise applications.
	It uses the JVM (Java Virtual Machine) to run code on any OS (Write Once, Run Anywhere).
    Java is currently maintained by Oracle Corporation.


What is platform independence in Java?

    Java program is compiled into bytecode, and the same bytecode can run on any OS using JVM.


Why is Java a platform-independent language?

    Java is platform independent because Java code is compiled into bytecode, not machine code.
    Java compiler (javac) → converts .java → .class (bytecode)
    Bytecode runs on JVM (Java Virtual Machine)
    JVM is platform dependent, but bytecode is the same for all OS

    👉 Write Once, Run Anywhere (WORA)


Why is Java not a pure object-oriented language?

    Java is not 100% object-oriented because:
        It supports primitive data types - (int, float, double, char, boolean)
        It allows static methods and variables
        The main() method is static

    👉 In pure OOP languages, everything must be an object


What is JIT Compiler?

    JIT stands for Just-In-Time Compiler.
    JVM initially interprets bytecode line by line
    JIT identifies frequently used code
    Converts it into native machine code
    Improves performance and execution speed

    👉 JIT makes Java faster by compiling code at runtime


What are the main features of Java?

	Object-Oriented
	Platform Independent (via JVM)
	Simple & Secure
	Multithreaded
	Robust & Portable
	Automatic Memory Management (Garbage Collection)
	High performance (JIT compiler)
	

What is the difference between JDK, JRE, and JVM?

    ▶ JVM (Java Virtual Machine)

        JVM runs the compiled Java bytecode.
        It is platform-dependent.

        It handles:-
        memory
        garbage collection
        execution of bytecode

    ▶ JRE (Java Runtime Environment)

        JRE = JVM + core libraries
        Used only to run Java programs.

    ▶ JDK (Java Development Kit)

        JDK = JRE + development tools (javac, debugger, etc.)
        Used to develop + run Java programs.


What is JVM?

    JVM (Java Virtual Machine) executes the bytecode and provides:-
        Memory management
        Garbage collection
        Platform independence    


What is the difference between Java and C++?

	Java is platform-independent, C++ is not.
	Java has automatic garbage collection, C++ uses manual memory management.
	Java does not support multiple inheritance (only via interfaces), C++ does.


What is variable in java?

		A variable is a name we give to a memory location where we store data (like numbers, names, etc.).
		👉 Think of a variable like a box with a label. We can put something in it, and use it later.
  
		*Variables syntax/structure*:
			dataType variableName = values;

		*Types of Variables in Java*
			| Type            | Where it's declared        | Scope                         |
			|  | -- | -- |
			| 1. **Local**    | Inside a method/block      | Only within that method       |
			| 2. **Instance** | Inside class (not static)  | Each object gets its own copy |
			| 3. **Static**   | Inside class with `static` | Shared across all objects     |


		*Variables naming convention*
			camelCase - first letter only lowerCase then next words first letter starts with uppercase



What is Array in java?

 	Array is a linear data structure
	In Java, an array is a collection of elements of the same data type stored in contiguous memory locations.
	It allows you to store multiple values in a single variable, instead of declaring separate variables for each value.


🔹 Array Features:
	Fixed size (you can't change its length after creation)
	Zero-based indexing (first element is at index 0)
	Same data type for all elements (e.g., all int, or all String)


What do you understand by class and object?
    Class
        	In Java, a class is a fundamental building block of object-oriented programming.
	        It serves as a blueprint or template for creating objects.
            Logical entity

    Object
         	In Java, an object is a fundamental building block of object-oriented programming (OOP).
 	        It represents a specific instance of a class, embodying both data (state) and behavior (methods).

        class Car {
        String color;
        void drive() {
            System.out.println("Car is moving");
        }
    }

    Car c = new Car();                              // Object


What is method?
    	In Java, a method is a block of code that performs a specific task.
	    Methods are fundamental to object-oriented programming in Java as they define the behavior of objects
		and allow for code reusability and organization. 

    		*basic-method syntax/structure*:-
			returnType methodName(parameters){
				//	code to execute
			}
			*method syntax/structure*:-
			access-modifier non-access-modifier returnType methodName(formal parameter) -> Header/signature
			{
				//	code to execute
			}
			* returnType – What type of value the method returns (e.g., int, String, void)
			* methodName – Name of the method (you choose)
			* parameters – Optional inputs (like int a, int b)
			* void – Means the method doesn't return anything


What are data types in Java?

    In Java, **data types** specify the kind of values a variable can hold.
    They fall into two main categories: **Primitive** and **Non-Primitive (Reference)** types.

	Primitive:
        | Data Type   | Size    | Default Value | Example Values                                            | Description                                   |
        | -- | - | - |  |  |
        | **byte**    | 1 byte  | 0             | `-128` to `127`                                           | Small integers; often used for saving memory. |
        | **short**   | 2 bytes | 0             | `-32,768` to `32,767`                                     | Medium-sized integers.                        |
        | **int**     | 4 bytes | 0             | `-2,147,483,648` to `2,147,483,647`                       | Default integer type.                         |
        | **long**    | 8 bytes | 0L            | Large integers; add `L` at end.                           |                                               |
        | **float**   | 4 bytes | 0.0f          | Decimal numbers (single precision); add `f` at end.       |                                               |
        | **double**  | 8 bytes | 0.0d          | Decimal numbers (double precision); default for decimals. |                                               |
        | **char**    | 2 bytes | '\u0000'      | `'A'`, `'1'`, `'#'`                                       | Single 16-bit Unicode character.              |
        | **boolean** | 1 bit\* | false         | `true`, `false`                                           | Logical values (true/false).                  |
	
    Non-primitive:
        String → "Hello"
        Arrays → int[] arr = {1, 2, 3};
        Classes → class Person { ... }
        Interfaces → interface Animal { ... }
        Enums → enum Days { MON, TUE, ... }


What is static keyword?

    Static members belong to the class, not to the object.


Can we override private methods?

    ❌ No, private methods cannot be overridden.
        Private methods are not visible to child classes
        They are class-specific
    👉 This is method hiding, not overriding


What is Static Methods?
	Declared with the static keyword inside an interface.
	Have a method body.
	Cannot be overridden by implementing classes.
	Called using the interface name, not the object.


Can we override a static method?

    No. Static methods are not overridden, they are hidden.


Can static methods be overridden?

    ❌ No, static methods cannot be overridden.
    Static methods belong to class, not object
    Method overriding depends on runtime polymorphism
    Static methods are resolved at compile time

    👉 This is called method hiding, not overriding.

    class Parent {
        static void show() {
            System.out.println("Parent");
        }
    }
    class Child extends Parent {
        static void show() {
            System.out.println("Child");
        }
    }

    Parent p = new Child();
    p.show();   // Output: Parent


Difference between static methods, static variables, and static classes

    | Feature              | static Variable | static Method | static Class         |
    | -- |  | - | -- |
    | Belongs to           | Class           | Class         | Class                |
    | Object needed        | ❌ No            | ❌ No          | ❌ No                 |
    | Access instance data | ❌ No            | ❌ No          | ❌ No                 |
    | Usage                | Shared data     | Utility logic | Helper/Inner classes |
    
    Static classes are allowed only as nested classes
    class Outer {
        static class Inner {
            void show() {
                System.out.println("Static Inner Class");
            }
        }
    }
    
What is constructor?

	In Java, a constructor is a special type of method used to initialize new objects of a class.
	It is invoked automatically when an object is created using the new keyword. 


Explain the concept of Constructor Overloading?

    Constructor overloading means having multiple constructors in the same class with:
        Different parameter lists
        Same constructor name (class name)

        class Employee {
            Employee() {
                System.out.println("Default Constructor");
            }

            Employee(int id) {
                System.out.println("ID: " + id);
            }

            Employee(int id, String name) {
                System.out.println(id + " " + name);
            }
        }
    👉 Used to initialize objects in different ways


Define Copy Constructor in Java

    Java does not have a built-in copy constructor, but we can create one manually.
    A copy constructor copies values from one object to another.
    
    class Student {
        int id;
        String name;

        Student(Student s) {
            this.id = s.id;
            this.name = s.name;
        }
    }


What is OOP?

    OOP is a programming model based on objects and classes.


What are the four pillars of OOP?

	Encapsulation → wrapping data & methods (classes).
	Abstraction → hiding implementation details (abstract class, interface).
	Inheritance → acquiring properties from parent class (extends).
	Polymorphism → many forms (method overloading & overriding).


What is Encapsulation?

    Encapsulation means binding data and methods together and restricting direct access.
        Use private variables
        Access via getter & setter methods

class Employee {
    private int salary;

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}   


What is Inheritance?

    Inheritance allows a class to acquire properties and methods of another class.

    Types of Inheritance in Java:-
        Single
        Multilevel
        Hierarchical
        Multiple (through interface only)
        Hybrid (using interface)

    Example:-
        class Vehicle {
            void run(){
                System.out.println("Vehicle running");
            }
        }

        class Bike extends Vehicle {
        }


Why is multiple inheritance not supported in Java?

    Java does not support multiple inheritance using classes to avoid:-
    ❌ Diamond Problem
        class A {
            void show() {}
        }

        class B extends A {}
        class C extends A {}
        class D extends B, C {} // Ambiguous
    Solution:-
        Java supports multiple inheritance using interfaces.


What is Polymorphism?

    Same method name behaving differently.
    Compile-time → Method overloading
    Run-time → Method overriding

    Example:-
        class Payment {
            void pay() {
                System.out.println("Generic Payment");
            }
        }

        class CardPayment extends Payment {
            void pay() {
                System.out.println("Paid using Card");
            }
        }

        class UpiPayment extends Payment {
            void pay() {
                System.out.println("Paid using UPI");
            }
        }


What is Abstraction?

    Hiding implementation and showing only functionality using:-
    abstract class
    interface

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw(){
        System.out.println("Circle");
    }
}


What is Method Overloading (Compile-time Polymorphism)?

    Same method name
    Different parameter list
    Same class
    Happens at compile time

    Example:-
        class MathUtil {
            int add(int a, int b) {
                return a + b;
            }

            int add(int a, int b, int c) {
                return a + b + c;
            }
        }


What is Method Overriding (Runtime Polymorphism)?

    Same method name & parameters
    Different classes (IS-A relationship)
    Happens at runtime

    Example:-
        class Parent {
            void show() {
                System.out.println("Parent");
            }
        }

        class Child extends Parent {
            @Override
            void show() {
                System.out.println("Child");
            }
        }


Difference between Compile-time and Runtime Polymorphism
    | Feature     | Compile-time       | Runtime           |
    | -- |  | -- |
    | Achieved by | Method overloading | Method overriding |
    | Binding     | Early binding      | Late binding      |
    | Resolved at | Compile time       | Runtime           |
    | Performance | Faster             | Slower            |



Difference between Overloading and Overriding?

	Overloading: Same method name, different parameters (compile-time).
	Overriding: Same method name & parameters in subclass (runtime).


What is an abstract class?

	Declared using abstract keyword
    Cannot be instantiated
    Can have abstract and non-abstract methods
    Can have constructors
    Can have variables
    Supports inheritance

	Example:-
        abstract class Vehicle {
            abstract void start();

            void stop() {
                System.out.println("Stopped");
            }
        }


What is an interface in Java?

	A contract with only abstract methods (Java 8+: default & static methods allowed).
	Supports multiple inheritance.

	interface Animal {
	void sound();
	}


Difference between abstract class and interface?
    Abstract class	                                                    Interface
    Can have constructors	                                        No constructors
    Can have normal methods	                                        All methods are public by default
    Multiple inheritance not supported	                            Multiple inheritance supported
    concrete methods                                                Only abstract methods (until Java 8).
	A class can extend one abstract class but implement multiple interfaces.


What is the difference between == and .equals()?

	== → compares references (memory location).
	.equals() → compares values (content).

String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);        // false
System.out.println(s1.equals(s2));   // true


What is equals–hashCode contract?

    If two objects are equal using equals(), they must have the same hashCode().


What is String immutability in Java?

	Strings are immutable (cannot be changed).
	New objects are created on modification.


Why is String immutable in Java?

    Once a String object is created, it cannot be changed.

    This is mainly for:-
        security
        thread safety
        caching in String pool

    String is widely used in:

        database connection
        file paths
        class loading
        So immutability avoids accidental modification.


What is the difference between String, StringBuffer, and StringBuilder?

    | Feature     | String   | StringBuffer | StringBuilder |
    | -- | -- |  | - |
    | Mutable     | ❌ No     | ✅ Yes        | ✅ Yes         |
    | Thread-safe | ✅ Yes    | ✅ Yes        | ❌ No          |
    | Performance | Slow     | Medium       | Fast          |
    | Introduced  | Java 1.0 | Java 1.0     | Java 1.5      |

Examples:-
    String s = "Java";
    s.concat(" World");  // creates new object

    StringBuilder sb = new StringBuilder("Java");
    sb.append(" World"); // modifies same object


What are threads in Java?

	Smallest unit of execution.
	Created by extending Thread class or implementing Runnable.


Explain Java Thread Lifecycle
    Thread States:

        New
        Runnable
        Running
        Blocked / Waiting
        Terminated

    Diagram Flow:
        New → Runnable → Running → Dead
            ↑
        Waiting/Blocked

    Thread t = new Thread(() -> {
        System.out.println("Thread running");
    });
    t.start();    


What is multithreading?

    Executing multiple threads concurrently to improve performance.
	Achieved using Thread class or Runnable interface.
    Running multiple threads simultaneously.

    Using Thread class
        class MyThread extends Thread {
            public void run(){
                System.out.println("Thread running");
            }
        }

        public class Test {
            public static void main(String[] args) {
                MyThread t = new MyThread();
                t.start();
            }
        }

    Using Runnable (recommended)
        class MyTask implements Runnable {
            public void run(){
                System.out.println("Running");
            }
        }

        public class Test {
            public static void main(String[] args) {
                Thread t = new Thread(new MyTask());
                t.start();
            }
        }


What are the differece between Thread and Multi-thread?

    | Feature        | Single-Threaded            | Multi-Threaded                      |
    | -- | -- | -- |
    | **Threads**    | 1                          | 2 or more                           |
    | **Execution**  | Sequential                 | Parallel/Interleaved                |
    | **Speed**      | Slower for multiple tasks  | Faster for independent tasks        |
    | **Complexity** | Simple to implement        | More complex (need synchronization) |
    | **Best for**   | Small, sequential programs | Large tasks, concurrent processes   |


Difference between Thread class and Runnable interface?

    Thread → extends class
    Runnable → implements interface (better design)


What is the difference between final, finally, and finalize?

	final: Keyword (variable constant, class non-inheritable, method non-overridable).
	finally: Block used in exception handling (always executes).
	finalize(): Method called by Garbage Collector before destroying object.


What is finally block?

    A block that always executes whether exception occurs or not.


Explain the use of final keyword (variable, method, class)

    final Variable:-

        Value cannot be changed
        final int x = 10;

    final Method:-

        Cannot be overridden
        final void display() {}

    final Class:-

        Cannot be inherited
        final class Test {}


What is exception?

    An abnormal situation that occurs during program execution.


What are exceptions in Java?

	Checked exceptions: Checked at compile-time (IOException, SQLException), must handle.
	Unchecked exceptions: Runtime errors (NullPointerException, ArithmeticException), not required to handle.


What is Exception Propagation?

    Exception propagation means an exception moves up the call stack until handled.
        Happens only for unchecked exceptions

    Example:
        void m1() {
            int a = 10 / 0;
        }

        void m2() {
            m1();
        }

        void m3() {
            m2();
        }
    👉 Exception propagates from m1 → m2 → m3


Difference between throw and throws?

    | Feature  | throw                      | throws                    |
    | -- | -- | - |
    | Used to  | Explicitly throw exception | Declare exception         |
    | Syntax   | throw new Exception();     | method() throws Exception |
    | Position | Inside method              | Method signature          |
    | Handles  | One exception              | Multiple exceptions       |

    void check(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not Eligible");
        }
    }


What is the difference between ArrayList and LinkedList?

    | Feature                 | ArrayList          | LinkedList         |
    | -- |  |  |
    | Data structure          | Dynamic array      | Doubly linked list |
    | Access                  | Fast (index based) | Slow               |
    | Insert/Delete in middle | Slow               | Fast               |


What is HashMap in Java?

	Key-value pair storage.
	Allows one null key, multiple null values.
	Not synchronized.


Difference between HashMap and Hashtable?

    | Feature        | HashMap   | HashTable     |
    | -- |  | - |
    | Thread-safe    | ❌ No      | ✅ Yes         |
    | Performance    | Fast      | Slow          |
    | Null key/value | ✅ Allowed | ❌ Not allowed |
    | Introduced     | Java 1.2  | Legacy (1.0)  |



Difference between HashMap and ConcurrentHashMap?

    HashMap → not thread safe
    ConcurrentHashMap → thread safe and high performance


How HashMap works internally?

    Key → hashCode()
    Hash → index calculation
    Stored as Node (key, value)
    Collision handled using:
        LinkedList (before Java 8)
        Red-Black Tree (Java 8+)

    Important points:-
        Uses array + linked list/tree
        Not thread-safe
        Allows one null key


What is HashMap and WeakHashMap?
    HashMap
        Stores key-value pairs
        Strong reference to keys
        Entry exists until explicitly removed

    WeakHashMap
        Keys are weakly referenced
        Entry removed when key is garbage collected

    Example:
        Map<Key, String> map = new WeakHashMap<>();

    👉 Used in cache implementations


What is Iterator and ListIterator?

    Iterator → forward only
    ListIterator → forward & backward


What is synchronization in Java?

	Prevents multiple threads from accessing shared resources at the same time. OR Synchronization is used to control access to a shared resource in a multithreaded environment.
	Achieved using synchronized keyword.

    Types:
        Method-level
        Block-level

    It avoids:-
        data inconsistency
        race condition

    Example without synchronization
        class Counter {
            int count = 0;

            void increment(){
                count++;
            }
        }
    * Multiple threads calling increment() can produce wrong result. *

    With synchronized method
        class Counter {
            int count = 0;

            synchronized void increment(){
                count++;
            }
        }


What is the difference between Array and ArrayList?

	Array: Fixed size, stores primitives/objects.
	ArrayList: Dynamic size, only objects.


What is Garbage Collection in Java?

	Automatic memory management that removes unused objects   -OR-    Automatic memory cleanup of unused objects by JVM.


What is the difference between Comparable and Comparator?

    | Feature          | Comparable   | Comparator    |
    | - |  | - |
    | Package          | java.lang    | java.util     |
    | Method           | compareTo()  | compare()     |
    | Sorting logic    | Inside class | Outside class |
    | Multiple sorting | ❌ No         | ✅ Yes         |

    class Employee implements Comparable<Employee> {
        public int compareTo(Employee e) {
            return this.id - e.id;
        }
    }


What is JDBC in Java?

	Java Database Connectivity API for connecting and executing queries on databases.


What is the difference between JPA and Hibernate?

	JPA: Specification for ORM.
	Hibernate: Implementation of JPA.


What is reflection in Java?

	Ability to inspect and modify classes, methods, and fields at runtime.


What is singleton design pattern?

    A class that allows only one object to be created.


What are design patterns in Java?

	Creational: Singleton, Factory.
	Structural: Adapter, Decorator.
	Behavioral: Observer, Strategy.


What is deadlock?

    Deadlock occurs when two or more threads wait forever for each other’s resources.

    Examples:-
        Thread1 → Resource A → waits for B
        Thread2 → Resource B → waits for A


What is Java Collection Framework?

    A framework that provides ready-made data structures like:

    List
        Allows duplicates
        Maintains order

    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("A");

    Set
        No duplicates

    Set<String> set = new HashSet<>();
    set.add("A");
    set.add("A");   // ignored

    Map

        Stores key-value pairs
        Keys are unique
    
    Map<Integer,String> map = new HashMap<>();
    map.put(1,"John");
    map.put(1,"David"); // replaces



What is fail-fast and fail-safe?

    Fail-fast → throws ConcurrentModificationException
    Fail-safe → works on cloned copy


Difference between Stack and Heap memory?

    Stack → method calls, local variables
    Heap → objects and instance variables


What is ClassLoader?

    ClassLoader is a part of JVM that loads .class files into memory.

        Types of ClassLoaders:-

            Bootstrap ClassLoader
                Loads core Java classes (java.lang, java.util)

            Extension ClassLoader
                Loads classes from ext directory

            Application ClassLoader
                Loads application-level classes (classpath)

        👉 Follows Parent Delegation Model


What is serialization?

    Converting object into byte stream.
        Used for file storage, network transfer

    Example:-
        class Employee implements Serializable {
            int id;
        }


What is deserialization?

    Converting byte stream back into object.


What is transient keyword?

    It prevents a variable from being serialized.


What is marker interface?

    Marker interfaces are empty interfaces (no methods) used to mark a class.

        JVM uses them to provide special behavior
        Acts like metadata

    Common Marker Interfaces:-
        Serializable
        Cloneable
        RandomAccess

        class Employee implements Serializable {
    }
        👉 JVM checks marker interface at runtime

What is cloning?

    Creating a copy of an object using clone() method.


What is composition?

    Composition represents a HAS-A relationship.

        One class contains another class object
        Strong association
        Preferred over inheritance

    Example:-
        class Engine {
        void start() {}
    }

    class Car {
        Engine engine = new Engine();
    }
    👉 If Car is destroyed, Engine is also destroyed


What is Coupling in OOP and why is it helpful?

    Coupling refers to the dependency between classes.

    Types:

        Tight coupling – High dependency ❌
        Loose coupling – Low dependency ✅

    Why loose coupling is helpful:-

        Easy maintenance
        Better scalability
        Improved reusability
        Easier testing

        Example (Loose coupling):
            interface Engine {
                void start();
            }

            class PetrolEngine implements Engine {
                public void start() {}
            }

            class Car {
                Engine engine;
                Car(Engine e) {
                    engine = e;
                }
            }


What is tight coupling and loose coupling?

    Tight → classes highly dependent
    Loose → minimal dependency (better design)


What is volatile keyword?

    volatile ensures visibility of changes across threads.
        Prevents thread-local caching
        Ensures latest value is read
    Example:-
        volatile boolean flag = true;
    👉 Guarantees visibility, not atomicity


Wrapper Class in Java

    Wrapper classes convert primitive → object.
        | Primitive | Wrapper   |
        |  |  |
        | int       | Integer   |
        | double    | Double    |
        | char      | Character |
        | boolean   | Boolean   |

    ✅ Auto-boxing and Un-boxing
        🟩 Auto-boxing:
            Automatic conversion of primitive → Wrapper object.

            int a = 10;
            Integer obj = a;   // auto-boxing


        🟥 Un-boxing:
            Automatic conversion of Wrapper object → primitive.

            Integer newVersion = Integer.valueOf(1);
            int b = newVersion;	//	Un-boxing    

    👉 Needed for Collections, Generics


What is boxing and unboxing?

    Boxing → primitive to wrapper
    Unboxing → wrapper to primitive


What is try-with-resources?

    Automatically closes resources like files and streams.


Can the main() method be overloaded? How?

    ✅ Yes, main() method can be overloaded
    ❌ But JVM will only call this method:-
            public static void main(String[] args)


Why is the main() method static in Java?

    JVM needs to call main() without creating an object
    Static methods belong to class, not object
    If main() was non-static, object creation would be required

    👉 Hence main() is static


Difference between this & super?

    | Feature          | `this`                          | `super`                        |
    | - | - |  |
    | Refers to        | Current object                  | Parent object                  |
    | Used for         | Accessing current class members | Accessing parent class members |
    | Constructor call | Calls current class constructor | Calls parent class constructor |
    | Method access    | Current class method            | Parent class method            |
    | Variable access  | Current class variable          | Parent class variable          |


When do you use super and this keyword?

    this

        Refers to current class object
        Used to resolve variable conflicts
            this.id = id;

    super

    Refers to parent class object
    Used to access parent variables, methods, constructors
        super.display();


Differences between Error and Exception
    | Feature       | Error            | Exception            |
    | - | - | -- |
    | Recoverable   | ❌ No             | ✅ Yes                |
    | Occurs due to | System issues    | Application logic    |
    | Package       | java.lang.Error  | java.lang.Exception  |
    | Example       | OutOfMemoryError | NullPointerException |


Differences between Interface and Abstract Class
    | Feature              | Interface           | Abstract Class      |
    | -- | - | - |
    | Methods              | Abstract + default  | Abstract + concrete |
    | Variables            | public static final | Any                 |
    | Multiple inheritance | ✅ Yes               | ❌ No                |
    | Constructor          | ❌ No                | ✅ Yes               |
    | Access modifiers     | public only         | Any                 |


Difference between HashSet and TreeSet
    | Feature        | HashSet     | TreeSet        |
    | -- | -- | -- |
    | Ordering       | ❌ No order  | ✅ Sorted order |
    | Null values    | One allowed | ❌ Not allowed  |
    | Performance    | Faster      | Slower         |
    | Data structure | Hash table  | Red-Black Tree |

    Set<Integer> hs = new HashSet<>();
    Set<Integer> ts = new TreeSet<>();

   
Java works as “pass by value” or “pass by reference”?

    👉 Java is always PASS BY VALUE
            For primitive types → copy of value is passed
            For objects → copy of the reference value is passed (not the object itself)

    class Test {
        int x = 10;
    }

    void modify(Test t) {
        t.x = 20;   // changes original object
    }
    👉 Reference is copied, not the object → still pass by value


Difference between IS-A and HAS-A relationship
    | IS-A                        | HAS-A                       |
    |  |  |
    | Inheritance                 | Composition                 |
    | `extends`                   | Object reference            |
    | Strong coupling             | Loose coupling              |
    | Reusability via inheritance | Reusability via composition |

IS-A:
    class Dog extends Animal {}

HAS-A:
    class Car {
        Engine engine;
    }


Will finally execute if return is in try/catch?

    ✅ Yes, finally block will always execute

    Except:
        System.exit()
        JVM crash
        Power failure

    Example:
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            System.out.println("Finally block executed");
        }


How to remove duplicates from ArrayList?
    Using HashSet:
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);

    Using Java 8 Streams:
        list = list.stream().distinct().collect(Collectors.toList());


Memory in Java!!!

	In Java, memory is managed through the **Java Memory Model (JMM)**. It divides memory into several regions, each with a specific purpose. 

✅ Main Memory Areas in Java

| Memory Area                       | Description                                                                 |
|  |  |
| **Heap**                          | Stores objects and instance variables. Shared by all threads.               |
| **Stack**                         | Stores method calls, local variables, and references. One stack per thread. |
| **Method Area**                   | Stores class-level metadata (static variables, class info, constants).      |
| **Program Counter (PC) Register** | Stores the current instruction address of the thread. One PC per thread.    |
| **Native Method Stack**           | Used for native methods (written in C/C++ via JNI).                         |

#🧠 Summary Diagram

               ++
               |      Method Area          | <- class metadata, static vars
               ++
               |          Heap             | <- objects, arrays
               ++
Thread 1 >  |          Stack            | <- method calls, local vars
              |   PC Register (Thread 1)   |
              |   Native Method Stack      |
              ++

Thread 2 >  |          Stack            |
              |   PC Register (Thread 2)   |
              |   Native Method Stack      |
              ++



ConcurrentHashMap vs Collections.synchronizedMap

    | Feature        | ConcurrentHashMap    | SynchronizedMap |
    | -- | -- |  |
    | Thread safety  | High                 | Low             |
    | Locking        | Segment/Bucket level | Whole map       |
    | Performance    | Fast                 | Slow            |
    | Null key/value | ❌ Not allowed        | Depends on map  |

    Map m1 = new ConcurrentHashMap();
    Map m2 = Collections.synchronizedMap(new HashMap());


HashMap vs IdentityHashMap

    | Feature        | HashMap         | IdentityHashMap    |
    | -- |  |  |
    | Key comparison | equals()        | ==                 |
    | Usage          | General purpose | Reference-based    |
    | Performance    | Normal          | Faster (no equals) |
    | Null keys      | One allowed     | Multiple allowed   |

    String a = new String("Java");
    String b = new String("Java");

    HashMap<String, String> hm = new HashMap<>();
    hm.put(a, "1");
    hm.put(b, "2"); // Replaces value

    IdentityHashMap<String, String> im = new IdentityHashMap<>();
    im.put(a, "1");
    im.put(b, "2"); // Stored separately



 --

                                                *****Access Modifiers?*****

		Access Modifiers in Java control where our variables, methods, or classes can be accessed from.
		Access modifiers are keywords in Java that define how much access other classes/objects have to variables, methods, and classes.

	💡 Quick Summary-
		Use private for data hiding.
		Use public for global access.
		Use protected for inheritance but controlled access.
		Default is automatically used when no modifier is written.


		| Modifier               | Access Level                 			|
		| - | - 			|
		| `public`               | Everywhere                   			|
		| `private`              | Only within the same class   			|
		| `protected`            | Same class ➜ same package ➜ subclasses  |
		| *default* (no keyword) | Same package only            			|


| Modifier    | Same Class | Same Package | Subclass (other package) | Other Package        |
| -- | - |  |  | -- |
| `public`    | ✅         | ✅           | ✅                       | ✅                   |
| `private`   | ✅         | ❌           | ❌                       | ❌                   |
| *default*   | ✅         | ✅           | ❌                       | ❌                   |
| `protected` | ✅         | ✅           | ✅                       | ❌ (unless inherited)|



--

 								*****Class + Main Method Structure*****

package core_java;

public class Hello {

    int age = 10;

    public static void main(String[] args) {
        m1();

        // return type → two ways to use returned value
        m2();                          // 1. Call directly, ignore return value
        System.out.println(m2());      // 2. Print returned value directly

        int result = m2();             // 3. Store into variable
        System.out.println(result);
    }
}



--

 									*****Methods (Void & Return Type)*****

Void Method
private static void m1() {
    // No return value
}

Return Type Method
private static int m2() {
    return 10;
}



--


 									*****Homogeneous & Heterogeneous*****

⚖️ Summary

Homogeneous = same type of data (e.g., ArrayList<String>)
Heterogeneous = different types of data (e.g., ArrayList raw type)

👉 Arrays are always homogeneous.
👉 Collections can be homogeneous (with generics) or heterogeneous (without generics).


1. Homogeneous (Hemogenious) Data

		Meaning: All elements in the collection (or array) are of the same type.
		In Java, arrays are homogeneous by nature.
		With Generics (like ArrayList<Integer>), collections also become homogeneous.
		
✅ Example of Homogeneous:

// Array of integers - all elements are int
int[] numbers = {1, 2, 3, 4, 5};

// Homogeneous ArrayList (only Strings allowed)
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
// list.add(10); // ❌ Error - only Strings allowed



2. Heterogeneous (Heterogenours) Data

	Meaning: The collection (or array) contains different types of data.
	Before Generics (Java 1.5), collections like ArrayList allowed heterogeneous objects.
	Even now, if you use a raw type (without generics), you can store heterogeneous elements.

✅ Example of Heterogeneous:

// Heterogeneous ArrayList (raw type)
ArrayList list = new ArrayList();
list.add("Java");   // String
list.add(100);      // Integer
list.add(45.67);    // Double
list.add(true);     // Boolean

System.out.println(list); // [Java, 100, 45.67, true]

	
	

--



				*****enum*****

	In Java, an enum (short for enumeration) is a special data type used to define a collection of constants (fixed set of values).

 ✅ When to use Enum?
		When you need a fixed set of related constants (like days of week, directions, status codes, colors, etc.).
		Makes code readable, type-safe, and organized.
 


--


				*****Varargs - Variable Arguments*****


	Varargs in Java stands for Variable Arguments.
	It allows a method to accept zero or multiple arguments of the same type without explicitly defining them as an array.



--

 								***** Type casting *****


	Type casting is when we assign a value of one primitive data type to another type.

In Java, there are two types of casting:

	* Widening Casting (automatically) - converting a smaller type to a larger type size
		byte -> short -> char -> int -> long -> float -> double

	* Narrowing Casting (manually) - converting a larger type to a smaller size type
		double -> float -> long -> int -> char -> short -> byte


Widening Casting:-
	Widening casting is done automatically when passing a smaller size type to a larger size type:
 
package my_java_package_name;

public class TypeCasting {
	
	public static void main(String[] args) {
		int myAge = 29;								//	integer type
		double myDoubleAge = myAge;					//	double(decimal) type
		System.out.println(myAge);
		System.out.println(myDoubleAge);
	}

}
 
 

Narrowing Casting
 	* Narrowing casting must be done manually by placing the type in parentheses () in front of the value.

package my_java_package_name;

public class TypeCasting {
	
	public static void main(String[] args) {
		double myDoubleAge = 29.5d;					//	double(decimal) type
		int myAge = (int) myDoubleAge;				//	convert to integer type
		System.out.println(myDoubleAge);
		System.out.println(myAge);
	}
}





--



 							*****Naming Rules & Identifier Rules*****

Identifiers:-
	Identifiers = names for classes, methods, variables.



Rules:-
	1. Cannot start with a number
		✅ age1 / my2Var
		❌ 1age

	2. Cannot contain spaces
		✅ myName
		❌ my name
	
	3. Cannot use special characters
		✅ $test, _value
		❌ test#, na$me*
	
	4. Cannot use reserved keywords
		❌ class, int, new, static, void, etc.




--



 							*****Naming Conventions (Industry Standard)*****


| Element            | Convention | Example                       |
|  | - | -- |
| **ProjectName**    | PascalCase | OnlineBankingSystem           |
| **ClassName**      | PascalCase | StudentDetails                |
| **MethodName**     | camelCase  | calculateTotal(), getSalary() |
| **VariableName**   | camelCase  | totalAmount, firstName        |
| **PackageName**    | lowerCase  | com.example.demo              |
| **final constant** | UPPER_CASE | MAX_VALUE, PI                 |



1. Project Name — PascalCase

	Rule: Each word starts with a capital letter.
	Purpose: Makes large project names readable and professional.
	
	✅ Example: OnlineBankingSystem
	✅ Example: StudentManagementPortal

2. Package Name — all lowercase

	Rule: Only lowercase letters; words separated by . (dot).
	Purpose: Avoids classpath conflicts; standard for JVM package resolution.
	
	✅ Example: com.example.demo
	✅ Example: org.mycompany.hrmodule

3. Class Name — PascalCase

	Rule: Each word starts with uppercase.
	Purpose: Clearly identifies Java types (class/interface).
	
	✅ Example: EmployeeService
	✅ Example: OrderController

4. Interface Name — PascalCase (Trait-like)

	Rule: Same as class, but often represents a capability.
	Purpose: Shows behavior abstraction.
	
	✅ Example: PaymentService
	✅ Example: UserRepository

5. Method Name — camelCase

	Rule: First word lowercase; next words uppercase.
	Purpose: Represents actions/operations (verbs).
	
	✅ Example: calculateSalary()
	✅ Example: getUserDetails()
	✅ Example: saveOrder()

6. Variable Name — camelCase

	Rule: Same as method naming style; lowerCamelCase.
	Purpose: Represents data/state (nouns).
	
	✅ Example: totalAmount
	✅ Example: employeeName
	✅ Example: accountBalance

7. Constant (final static) — UPPER_SNAKE_CASE

	Rule: All uppercase with underscores separating words.
	Purpose: Indicates immutable values.
	
	✅ Example:
	
	public static final int MAX_LIMIT = 100;
	public static final String COMPANY_NAME = "ABC CORP";

8. Enum Name — PascalCase; Values in UPPERCASE

	Rule: Enum itself: PascalCase
	Enum values: UPPER_SNAKE_CASE
	Purpose: Clearly shows fixed set of constant values.
	
	✅ Example:
	
	public enum Status {
	    ACTIVE,
	    INACTIVE,
	    PENDING
	}

9. Annotation Name — PascalCase

	Rule: Like class naming.
	Purpose: Treats annotation as a type definition.
	
	✅ Example: @Override, @Service, @Transactional

10. Generic Type Parameters — Single Capital Letter

	Rule: T = Type, E = Element, K = Key, V = Value.
	Purpose: Follows Java Collection Generics standard.
	
	✅ Example:
		class Container<T> { }
		Map<K, V> map;



--

 									*****Scanner*****

//  The Scanner class in Java (from java.util package) is used to read input from various sources like the keyboard, files, or strings. 
//  It simplifies parsing primitive types and strings using regular expressions.


//  Key Features
            // Reads input from System.in (keyboard), files, strings, etc.
            // Parses input into primitives (int, double, etc.) or strings.
            // Tokenizes input using delimiters (default: whitespace).


//Common Input Methods-

// Method	    |                Description             |	        Example Input → Output
// nextLine()	    Reads entire line (including spaces)	     "Java Rocks" → "Java Rocks"
// next()	        Reads single word (until whitespace)	     "Java Rocks" → "Java"
// nextInt()	    Reads int	                                 "25" → 25
// nextDouble()	    Reads double	                             "3.14" → 3.14
// nextBoolean()	Reads boolean (true/false)	                 "true" → true
// hasNextXxx()	    Checks if next token is of type Xxx	         sc.hasNextInt() → true/false


--


				*****Inner class*****



	✅ What is an Inner Class?
        An inner class is a class defined inside another class.
	    It helps group classes that are only used in one place, making your code more readable, logical, and encapsulated.
	
    🔹 Types of Inner Classes in Java
            | Type of Inner Class          | Description                                                      |
            | - | - |
            | 1. **Member Inner Class**    | Normal class inside another class (non-static)                   |
            | 2. **Static Nested Class**   | Static class inside another class                                |
            | 3. **Local Inner Class**     | Class defined inside a method                                    |
            | 4. **Anonymous Inner Class** | Class with no name (used for instant override or implementation) |

		

class Outer {
	void outerDisplay() {
		System.out.println("outerDisplay method in Outer class");
	}

	class Inner {
		void innerDisplay() {
			System.out.println("innerDisplay method in Inner class inside the Outer class");
		}
	}

	static class staticInner {
		void staticInnerDisplay() {
			System.out.println("staticInnerDisplay method in staticInner class inside the Outer class");
		}
	}

	void outerMethod(){
		class Inner1{
			void show(){
				System.out.println("show method in Inner1 class inside the outerMethod inside Outer class");
			}
		}
		Inner1 inner1 = new Inner1();
		inner1.show();
	}
}

class AllImportant {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		o1.outerDisplay();
		Outer.Inner i1 = o1.new Inner();	//	normal inner class
		i1.innerDisplay();
		Outer.staticInner i2 = new Outer.staticInner();	//	static class
		i2.staticInnerDisplay();

		new Outer().outerMethod(); 	//	Local inner class
	}
}



--


 							*****package*****



// A Java package is a group of similiar types of classes and interfaces, sub-packages.
//  Package in java can be organized in two form
    // * Build-in package
    // * User-defined package
//  There are many built-in packages such as lang, awt, javax, net ,io, util, sql etc.

// Package Naming Conventions
//         * Reverse domain name: com.company.project.module
//         * Lowercase letters: Avoid uppercase
//         * Meaningful names: finance, utils, model
//         * No Java keywords: Avoid int, class, etc.



--


 							***** Upcasting & Downcasting *****


    ✅ What is Upcasting?
        Upcasting means converting a child class object into a parent class reference.
        ✔ It's done automatically by Java (implicit).

            Animal a = new Dog();   // Upcasting

    ✅ What is Downcasting?
        Downcasting means converting a parent class reference back into a child class reference.
        ⚠ It must be done manually using casting, and it is risky.

            Animal a = new Dog();   // upcasting first
            Dog d = (Dog) a;        // downcasting


    ✅ How do they work?

        Up-casting (safe, automatic):
    
class Animal {
    void sound() {
        System.out.println("sound method in Animal class");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("bark method in Dog subclass extends Animal class");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meow method in Cat subclass extends Animal class");
    }
}

public class Upcasting_Downcasting {
    public static void main(String[] args) {
        Animal d1 = new Dog();      //  up-casting
        d1.sound();
        Animal c1 = new Cat();      //  up-casting
        c1.sound();
    }
}



        Down-casting:

class Animal {
    void sound() {
        System.out.println("sound method in Animal class");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("bark method in Dog subclass extends Animal class");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meow method in Cat subclass extends Animal class");
    }
}

public class Upcasting_Downcasting {
    public static void main(String[] args) {
        Animal d1 = new Dog(); // up-casting
        Dog d = (Dog) d1; // down-casting
        d.bark();
        d.sound();
        Animal c1 = new Cat(); // up-casting
        Cat c = (Cat) c1; // down-casting
        c.meow();
        c.sound();
    }
}



-
                                                                JAVA 8
                                                                

Explain Java 8 features

    Lambda Expressions
    Functional Interfaces
    Stream API
    Method References
    Optional Class
    Default & Static methods in interfaces
    New Date & Time API
    Parallel Streams
    Executor Framework enhancements

    👉 Java 8 focuses on functional programming, clean code, and performance.
    
    
Why did we move to Java 8 instead of Java 7?

    Reduce boilerplate code
    Support functional programming
    Improve performance (parallel processing)
    Handle null pointer issues (Optional)
    Simplify date/time handling

    👉 Java 7 was more imperative, Java 8 is functional + modern


Why did we move to Java 8 instead of Java 7?

    Reduce boilerplate code
    Support functional programming
    Improve performance (parallel processing)
    Handle null pointer issues (Optional)
    Simplify date/time handling

    👉 Java 7 was more imperative, Java 8 is functional + modern


What is Anonymous?
    	A nameless class in Java is an Anonymous Inner Class — a class without a name that is declared and instantiated at the same time.


What is functional interface?

	A Functional Interface in Java is an interface that has exactly one abstract method (SAM — Single Abstract Method).
	It can have any number of default methods, static methods, and private methods, but only one abstract method.
    Example: Runnable, Comparator


What is Optional?

	Optional<T> is a class in java.util package introduced in Java 8.
	It is a container object which may or may not contain a non-null value.
	It helps in avoiding NullPointerException by providing a way to check value is present or not.

		Without Optional:
			String name = null;
			System.out.println(name.length());	//	NullPointerException

		With Optional:
			String name = null;
			Optional<String> opName = Optional.ofNullable(name);
			System.out.println(opName);
			if(opName.isPresent()) System.out.println(opName.get().length());


What is Default Methods?
		Declared in an interface using the default keyword.		
		Have a method body (unlike normal abstract methods).		
		Can be overridden in implementing classes.


What is default method in interface?

    A method with implementation inside interface using default keyword.


What is Lambda Expression?

    A short way to write anonymous functions.
    Lambda is an anonymous function.
    No method name
    No return type
    Used to implement functional interfaces

    Syntax:
        (parameters) -> expression
    Example:
        Runnable r = () -> System.out.println("Thread running");


What is Functional Interface?

    A functional interface has only one abstract method.
    Can have default & static methods
    Annotated with @FunctionalInterface

    Example:
        @FunctionalInterface
        interface Calculator {
            int add(int a, int b);
        }


What is Method Reference?

        A method reference is a shorthand for writing a lambda expression that simply calls an existing method.
            Instead of writing:
                list.forEach(item -> System.out.println(item));
            You can write:
                list.forEach(System.out::println);

        Syntax pattern:
            ClassName(or object reference)::methodName


What is Stream API & why do we use it?

    Definition:
        The Stream API (introduced in Java 8, in java.util.stream) is a functional programming tool for processing data in a declarative, pipeline-based way.

        A Stream is not a collection — it’s a sequence of data elements supporting aggregate operations like map, filter, reduce, collect.

        Example in one line:
            list.stream().filter(x -> x > 5).map(x -> x * 2).forEach(System.out::println);

**Key points:**
    * Doesn’t store elements — works on a data source
    * Can be **sequential** or **parallel** 
    * Operations are either **intermediate** (return another stream) or **terminal** (produce a result)

    Example:
    list.stream()
        .filter(n -> n > 10)
        .forEach(System.out::println);


What is Optional Class?

    Optional is a container object used to avoid NullPointerException.

    Example:
        Optional<String> name = Optional.of("Java");
        name.ifPresent(System.out::println);


What is java.time Package?
    java.time is a modern Date and Time API introduced in Java 8 to replace the old java.util.Date and java.util.Calendar classes.
    It is immutable, thread-safe, and much easier to use.


Frequently used Date & Time API in projects

    LocalDate
    LocalTime
    LocalDateTime
    Period
    Duration
    DateTimeFormatter

    LocalDate today = LocalDate.now();


What is Collectors?
        
    Collectors is a utility class in the java.util.stream package.
	It provides factory methods to create common collectors which are used with the Stream API to process data and collect the result into a desired form like List, Set, Map, String, etc

		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());


Difference between Intermediate and Terminal Operations
    | Feature   | Intermediate    | Terminal             |
    |  |  | -- |
    | Return    | Stream          | Result               |
    | Execution | Lazy            | Immediate            |
    | Example   | map(), filter() | forEach(), collect() |


Difference between Lambda Expression and Method Reference
    | Lambda          | Method Reference      |
    |  |  |
    | More flexible   | More readable         |
    | Custom logic    | Existing method       |
    | `(x)->print(x)` | `System.out::println` |


Predefined Functional Interfaces

    Common ones from java.util.function:-
        Predicate<T>
        Function<T,R>
        Consumer<T>
        Supplier<T>
        BiPredicate
        BiFunction


Default methods in predefined interfaces (Optional)

    Examples:-
        List.sort()
        Iterable.forEach()
        Collection.stream()
        Map.forEach()

    👉 Used to add methods without breaking existing code


Difference between Collection and Stream API
    | Collection  | Stream         |
    | -- | -- |
    | Stores data | Processes data |
    | Reusable    | Single-use     |
    | Eager       | Lazy           |


Stream vs Parallel Stream

    | Stream        | Parallel Stream  |
    | - | - |
    | Sequential    | Parallel         |
    | Single thread | Multiple threads |
    | Safe          | Use carefully    |


Difference between findFirst and findAny

    | findFirst     | findAny            |
    | - |  |
    | First element | Any element        |
    | Ordered       | Unordered          |
    | Slower        | Faster in parallel |


Difference between allMatch and anyMatch

    | allMatch       | anyMatch     |
    | -- |  |
    | All must match | At least one |
    | Strict         | Flexible     |


Difference between map and flatMap

        | map           | flatMap          |
        | - | - |
        | One-to-one    | One-to-many      |
        | Nested stream | Flattened stream |

list.stream().flatMap(l -> l.stream());


Methods present in Optional class?

    of()
    ofNullable()
    isPresent()
    ifPresent()
    orElse()
    orElseGet()
    orElseThrow()
    map()
    flatMap()


Difference between of() and ofNullable()

        | of()                | ofNullable() |
        | - |  |
        | Does not allow null | Allows null  |
        | Throws NPE          | Safe         |


Static, Instance & Constructor Method Reference

        | Type        | Example               |
        | -- |  |
        | Static      | `Class::staticMethod` |
        | Instance    | `obj::method`         |
        | Constructor | `Class::new`          |


What is ExecutorService?

    ExecutorService manages thread pools.
    Better than creating threads manually
    Improves performance

    Example:
        ExecutorService es = Executors.newFixedThreadPool(5);
    es.execute(() -> System.out.println("Task"));


What is Effectively Final?

    A variable is effectively final if:
    Not declared final
    But value is never changed

    Example:
        int x = 10;
        Runnable r = () -> System.out.println(x);
        
    👉 Required for lambda expressions




                    *****Collections*****

                    🔹 1. **List (Interface)**

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


                    🔹 2. **Set (Interface)**

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


                    🔹 3. **Queue (Interface)**

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


                    🔹 4. **Map (Interface)**

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







                                                ******Spring Boot*****



✅ 1. What is Spring Boot and why do we use it?

    Spring Boot is a framework built on top of Spring that helps us create production-ready applications quickly with **minimum configuration**.

    The main problems in traditional Spring were:
        * Too much XML / configuration
        * Manual dependency management
        * External server configuration
        * Complex project setup

    Spring Boot solves these problems by:
        * Auto configuration
        * Embedded servers
        * Opinionated defaults
        * Production features

    #Example

    Without Spring Boot, you had to configure:
        * DispatcherServlet
        * DataSource
        * ViewResolver
        * Component scan

    With Spring Boot:
        @SpringBootApplication
        public class DemoApplication {
            public static void main(String[] args) {
                SpringApplication.run(DemoApplication.class, args);
            }
        }

    Everything is auto-configured.


✅ 2. What is @SpringBootApplication and what happens internally?

    @SpringBootApplication is a combination of **three annotations**:
        @SpringBootConfiguration
        @EnableAutoConfiguration
        @ComponentScan


    #1️⃣ @SpringBootConfiguration
        Marks the class as configuration class.

    #2️⃣ @EnableAutoConfiguration
        Automatically configures beans based on:
            * classpath
            * dependencies
            * properties

    #3️⃣ @ComponentScan
        Scans components in the package and sub-packages.


    #Example:-

        If spring-boot-starter-web is present, Spring Boot will automatically:
            * create DispatcherServlet
            * configure Tomcat
            * setup MVC beans


✅ 3. What is Auto-Configuration in Spring Boot?

    Auto-configuration means:

        Spring Boot automatically creates required beans based on:
            * dependencies
            * environment
            * properties

    #Example

        If you add this dependency:
            spring-boot-starter-data-jpa

        Spring Boot automatically configures:
            * EntityManagerFactory
            * DataSource
            * TransactionManager

    You don’t define them manually.


✅ 4. How does Spring Boot decide which beans to create?

    Spring Boot uses:
        conditional annotations

    Important ones:
        @ConditionalOnClass
        @ConditionalOnMissingBean
        @ConditionalOnProperty

    #Example
            @ConditionalOnClass(DataSource.class)

        Means:
            This bean is created only if DataSource class is present.


✅ 5. What are Spring Boot starters?

    Starters are dependency bundles.
    They group multiple dependencies required for a feature.

    #Example
        spring-boot-starter-web


    Contains:
        * Spring MVC
        * Jackson
        * Validation
        * Embedded Tomcat

    Purpose:
        You don't need to search individual dependencies.



✅ 6. Difference between Spring and Spring Boot

    | Spring                | Spring Boot        |
    | Manual configuration  | Auto configuration |
    | External server       | Embedded server    |
    | XML/Java config heavy | Minimal config     |
    | No production tools   | Actuator support   |



✅ 7. What is Embedded server in Spring Boot?

    Spring Boot provides built-in servers like:
        * Tomcat (default)
        * Jetty
        * Undertow

    You do not deploy WAR manually.

    #Example
        When you run:
            java -jar app.jar

    Tomcat runs inside your application.


✅ 8. How do you change default server port?

    In `application.properties`:
        properties
        server.port=8081


✅ 9. What is application.properties / application.yml?

    These files are used to configure application level settings such as:
        * database
        * ports
        * logging
        * profiles

    #Example
        properties
        spring.datasource.url=jdbc:mysql://localhost:3306/test
        spring.datasource.username=root
        spring.datasource.password=1234


✅ 10. What are Profiles in Spring Boot?

    Profiles are used to load environment-specific configurations.

    Typical environments:
        * dev
        * test
        * prod

    #Example

        Files:
            application-dev.properties
            application-prod.properties

    Activate profile:
        properties
        spring.profiles.active=dev


✅ 11. How does Dependency Injection work in Spring Boot?

    Spring Boot uses Spring IoC container.
    Objects are created and injected by the container.

    #Example
        java
        @Service
        public class UserService {
        }


    java
    @RestController
    public class UserController {

        @Autowired
        private UserService userService;
    }

    Spring injects UserService automatically.



✅ 12. Difference between @Component, @Service, @Repository

    All three are stereotype annotations.
    But their purposes differ.

    * @Component → generic bean
    * @Service → business layer
    * @Repository → data access layer

    Important difference:
        @Repository enables exception translation for persistence exceptions.



✅ 13. What is @RestController and how is it different from @Controller?

    @RestController =  @Controller + @ResponseBody
        It returns JSON directly.

    #Example

    java
    @RestController
    public class TestController {

        @GetMapping("/hello")
        public String test() {
            return "Hello";
        }
    }

    No view resolver is involved.


✅ 14. Explain Spring Boot request flow

    1. Client sends request
    2. Embedded server receives
    3. DispatcherServlet handles request
    4. Finds matching controller
    5. Calls method
    6. Converts return value to JSON using HttpMessageConverters


✅ 15. What is Spring Boot Actuator?

    Actuator provides production-ready endpoints for:
        * health
        * metrics
        * info
        * environment
        * mappings

    #Example
        Add dependency:
            spring-boot-starter-actuator

    Then access:
        /actuator/health


✅ 16. What is JPA and how is it used in Spring Boot?

    JPA is a specification for ORM.
    Spring Boot provides integration through Spring Data JPA.

    #Example
        java
        @Entity
        public class Employee {

            @Id
            @GeneratedValue
            private Long id;
            private String name;
        }

    Repository:
        public interface EmployeeRepository
                extends JpaRepository<Employee, Long> {
        }




✅ 17. Difference between Hibernate and JPA

    JPA is only a specification.
    Hibernate is an implementation of JPA.
    Spring Boot uses Hibernate internally when you use Spring Data JPA.


✅ 18. What is JpaRepository and why do we use it?

    JpaRepository provides ready-made CRUD and paging methods.

    #Example
        employeeRepository.findAll();
        employeeRepository.save(emp);
        employeeRepository.findById(1L);

    No implementation class is required.


✅ 19. What is @Transactional and why is it important?

    @Transactional manages database transactions automatically.

    #Example
        @Transactional
        public void createOrder() {
            saveOrder();
            savePayment();
        }

    If payment save fails, order save is rolled back.


✅ 20. What is Lazy loading and Eager loading in JPA?

    * Lazy → data loaded when accessed
    * Eager → data loaded immediately

    #Example
        @ManyToOne(fetch = FetchType.LAZY)
        private Department dept;


✅ 21. How do you handle exceptions globally in Spring Boot?

    Using:
        @ControllerAdvice
        @ExceptionHandler

    #Example
        @ControllerAdvice
        public class GlobalHandler {

            @ExceptionHandler(Exception.class)
            public ResponseEntity<?> handle(Exception e) {
                return ResponseEntity
                    .status(500)
                    .body(e.getMessage());
            }
        }


✅ 22. What is validation in Spring Boot?

    Spring Boot integrates Bean Validation.

    #Example
        @NotNull
        @Size(min=3)
        private String name;

    Controller:
        public ResponseEntity save(@Valid @RequestBody User user)


✅ 23. Difference between PUT and PATCH

    PUT updates entire resource.
    PATCH updates only partial fields.


✅ 24. How do you implement pagination and sorting?

    Spring Data provides Pageable.

    #Example
        Pageable p = PageRequest.of(0, 10);
        employeeRepository.findAll(p);


✅ 25. How do you write custom query in Spring Data JPA?

    Using:
        * method names
        * @Query

    #Example
        List<Employee> findByName(String name);

        Or:

        @Query("select e from Employee e where e.name = :name")
        List<Employee> getByName(String name);


✅ 26. What is DTO and why is it used in Spring Boot?

    DTO is used to transfer data without exposing entity directly.

    Benefits:
        * security
        * performance
        * API stability

    #Example
        public class EmployeeDTO {
            private String name;
        }


✅ 27. What is ModelMapper or mapping strategy?

    It converts entity to DTO and vice versa.

    Example logic:
        dto.setName(emp.getName());


✅ 28. What is CORS and how do you handle it in Spring Boot?

    CORS allows cross-domain requests.

    #Example
        @CrossOrigin(origins="http://localhost:3000")


✅ 29. How do you secure a Spring Boot application?

    Using Spring Security.

    Main concepts:
        * Authentication
        * Authorization
        * Filters
        * Security context

    Basic flow:
        1. User sends credentials
        2. Authentication filter validates
        3. SecurityContext is populated
        4. Authorization checks role



✅ 30. How JWT authentication works in Spring Boot?

    JWT is stateless authentication.

    Flow:
        1. Login API validates user
        2. Token is generated
        3. Client sends token in header
        4. Filter validates token
        5. User context is created

    #Example header
        Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...


✅ 31. How do you externalize configuration in Spring Boot?

    Using:
        * properties/yml
        * environment variables
        * command line args

    #Example
        @Value("${app.name}")
        private String appName;


✅ 32. What is CommandLineRunner?

    It runs logic after application startup.

    #Example
        @Bean
        CommandLineRunner run() {
            return args -> {
                System.out.println("Started");
            };
        }


✅ 33. How do you write integration testing in Spring Boot?

    Using:
        @SpringBootTest
        @AutoConfigureMockMvc

    #Example
        @SpringBootTest
        class AppTest {
        }

    It loads full context.


✅ 34. Difference between @SpringBootTest and @WebMvcTest

    @SpringBootTest → loads entire application
    @WebMvcTest → loads only controller layer


✅ 35. How do you configure logging in Spring Boot?

    Spring Boot uses Logback by default.

    #Example
        properties
            logging.level.org.springframework=INFO


✅ 36. How do you handle file upload in Spring Boot?

    Using MultipartFile.

    #Example
        @PostMapping("/upload")
        public String upload(@RequestParam MultipartFile file) {
            return file.getOriginalFilename();
        }


✅ 37. What is the difference between @PathVariable and @RequestParam?

    @PathVariable → part of URL
    @RequestParam → query parameter

    #Example
        /user/10     -> PathVariable
        /user?id=10 -> RequestParam


✅ 38. What is asynchronous processing in Spring Boot?

    It allows method to run in separate thread.

    #Example
        @Async
        public void sendMail() { }


✅ 39. How do you consume REST API from Spring Boot?

    Using RestTemplate or WebClient.

    #Example
        restTemplate.getForObject(url, String.class);


✅ 40. How do you deploy Spring Boot application?

    Steps:
    1. Build jar using Maven
    2. Copy jar to server
    3. Run:
        java -jar app.jar

    It runs using embedded server.


    

-------------------------------------------------------------------------------------------------------------------------------------------------



                                            *****Microservices (Java – Spring Boot)*****



✅ 1. What is Microservices architecture and how is it different from Monolithic architecture?

    Microservices architecture is a design style where a large application is broken into **small, independent services**.
    Each service:
        * runs independently
        * has its own database (recommended)
        * communicates through APIs (usually HTTP/REST or messaging)
        * can be deployed independently

    In monolithic architecture:
        * UI, business logic and data access are inside one single application
        * one deployment affects the entire system

    #Real example
        In a monolith:
            Order + Payment + Inventory + User → single WAR / JAR

    In microservices:
        Order Service
        Payment Service
        Inventory Service
        User Service

    Each one is a separate Spring Boot application.

    #Why companies move to microservices
        * independent deployments
        * easier scaling
        * better fault isolation
        * teams can work independently


✅ 2. What are the core principles of microservices?

    Important principles are:
        * single responsibility per service
        * independently deployable
        * decentralized data management
        * API based communication
        * failure isolation
        * automation and DevOps friendly

    #Example
        Order service must only handle:
            * order creation
            * order status
            * order history

    It should not contain payment logic.


✅ 3. How do services communicate in a Spring Boot microservices system?

    There are two main ways:

        #1️⃣ Synchronous communication
            HTTP / REST calls.

        #2️⃣ Asynchronous communication
            Messaging systems.

    #Example (REST call)
        Order service calls payment service:
            restTemplate.postForObject(
                "http://payment-service/pay",
                request,
                PaymentResponse.class
            );

    #Example (Async messaging)
        Order service publishes an event and payment service consumes it.

    This avoids tight coupling.





✅ 4. What is Service Discovery and why is it needed?

    In microservices, service instances are dynamic:
        * ports change
        * containers restart
        * IP addresses change

    Service discovery helps services **find each other automatically**.

    Instead of hard-coding URLs, services register themselves in a registry.

    A very popular discovery pattern was introduced by
    **Netflix** in their microservices ecosystem.

    #Flow
        1. Service starts
        2. Registers itself in discovery server
        3. Other services query the registry to locate it


    #Example
        http://payment-service/pay

    is resolved dynamically.


✅ 5. How does Eureka based discovery work in Spring Boot?

    Eureka is a service registry.
        * services act as Eureka clients
        * registry stores service name and instances

    #Example
        @EnableEurekaClient
        @SpringBootApplication
        public class OrderServiceApplication { }

    After startup:
        ORDER-SERVICE → localhost:8081

    Other services can locate it using the service name.


✅ 6. What is API Gateway and why do we need it?

    API Gateway is the single entry point for all client requests.

    Instead of:
        Frontend → 5 different services

    We use:
        Frontend → API Gateway → services

    #Responsibilities of API Gateway
        * routing
        * authentication
        * authorization
        * request filtering
        * aggregation
        * rate limiting

    #Example
        /api/orders/** → order-service
        /api/payments/** → payment-service



✅ 7. How is routing handled in Spring Cloud Gateway?

    Routes are configured based on path and service name.

    #Example

        yaml
        spring:
        cloud:
            gateway:
            routes:
                - id: order-service
                uri: lb://ORDER-SERVICE
                predicates:
                    - Path=/api/orders/**

    `lb://` means load balanced using service discovery.


✅ 8. What is client-side load balancing?

    Client-side load balancing means:
        The client itself chooses which service instance to call.
        The registry provides available instances and the client selects one.

    #Example
        ORDER-SERVICE → instance1, instance2

    Spring chooses one automatically.


✅ 9. What is centralized configuration in microservices?

    Centralized configuration allows us to store configuration for all services in one place.

    This avoids:
        * duplicated config
        * manual updates
        * restarting multiple services for config changes

    #Example
        order-service.yml
        payment-service.yml

    stored in a central config server.


✅ 10. What is distributed tracing and why is it important?

    In microservices, one request passes through multiple services.

    Tracing allows us to:
        * track one request end-to-end
        * measure latency
        * debug failures easily

    A common tracing stack uses:
        * Sleuth for trace IDs
        * Zipkin for visualization

    #Example flow
        Gateway → Order → Payment → Inventory

    Same traceId is propagated.



✅ 11. What is a Circuit Breaker and why is it required?

    A circuit breaker prevents a failing service from repeatedly being called.

    Without it:
        * threads get blocked
        * latency increases
        * system may crash

    With circuit breaker:
        * failures are detected
        * calls are short-circuited
        * fallback is executed

    A commonly used library is Resilience4j.

    #Example

        @CircuitBreaker(name = "paymentService", fallbackMethod = "fallback")
        public PaymentResponse pay(PaymentRequest req) {
            return paymentClient.pay(req);
        }

        public PaymentResponse fallback(PaymentRequest req, Exception e) {
            return new PaymentResponse("PAYMENT_SERVICE_DOWN");
        }



✅ 12. What is a fallback mechanism?

    Fallback provides an alternative response when a remote service fails.
    It avoids propagating failure to the entire system.

    #Example

    If payment service is down:
        * order service still returns a meaningful response
        * UI can show proper message


✅ 13. What is Bulkhead pattern?

    Bulkhead pattern isolates resources.
    One slow or failing service should not block the entire system.

    #Example

    Separate thread pools for:
        * payment calls
        * inventory calls

    So inventory failure does not block order processing.


✅ 14. What is eventual consistency in microservices?

    In microservices, distributed transactions are avoided.
    Each service manages its own data.
    So data is not immediately consistent, but becomes consistent later.

    #Example

        Order placed → payment succeeds → inventory update happens asynchronously.

    For a short time:
        * order exists
        * inventory still shows old stock

    Later it becomes consistent.


✅ 15. Why should each microservice have its own database?

    Sharing database creates tight coupling.

    Problems:
        * schema change breaks other services
        * services become dependent on same data model
        * scaling becomes difficult

    #Example

        Order service should own:
            orders table

        Payment service should own:
            payments table

    They must communicate through APIs, not database joins.


✅ 16. What is Saga pattern?

    Saga is a pattern for managing distributed business transactions.

    Instead of one global transaction:
        * each service performs a local transaction
        * compensating actions are used when failures occur

    #Example
        Steps:
            1. Order created
            2. Payment completed
            3. Inventory reserved

            If inventory fails:
                * payment is cancelled
                * order is cancelled

    This avoids 2-phase commit.


✅ 17. Difference between Orchestration and Choreography in Saga?

    #Orchestration
        One central service controls the flow.
            Order Orchestrator → Payment → Inventory

    #Choreography
        Each service reacts to events.
            OrderCreated → Payment Service → PaymentCompleted → Inventory Service

    Choreography reduces coupling but increases event complexity.


✅ 18. How do you implement asynchronous communication?

    Using message brokers.

    Two very common platforms are:
        * **Apache Kafka**
        * **RabbitMQ**

    #Example (event publishing)
        Order service publishes:
            OrderCreatedEvent

    Payment service consumes it and processes payment.


✅ 19. What is idempotency and why is it important?

    Idempotency means:
        Calling the same request multiple times produces the same result.

    This is very important in distributed systems because:
        * network retries happen
        * clients may resend requests

    #Example
        Payment API:
            POST /pay

        If client retries:
            The system should not charge twice.

        Usually implemented using:
            requestId / transactionId

    stored in DB.


✅ 20. What is API versioning in microservices?

    API versioning allows services to evolve without breaking existing clients.

    #Example
        /api/v1/orders
        /api/v2/orders

    v2 may return additional fields or different response structure.


✅ 21. How do you secure microservices architecture?

    Security is normally handled using:
        * centralized authentication
        * token based security (JWT)
        * gateway level authorization

    Typical flow:
        1. User authenticates
        2. Gateway validates token
        3. Token is forwarded to backend services
        4. Services verify token claims

    Each service does not maintain session.


✅ 22. How is JWT propagated across services?

    The same JWT token is forwarded through HTTP headers.

    #Example
        Authorization: Bearer <token>

    Gateway forwards the same header to downstream services.

    This enables:
        * identity propagation
        * role checks
        * audit logs


✅ 23. What is configuration refresh in microservices?

    It allows services to reload configuration without restarting.

    #Example
        If timeout value changes in config server:
            A refresh endpoint is triggered and services update properties dynamically.


✅ 24. What is blue-green deployment?

    Two environments are maintained:
        * blue → current production
        * green → new version

    Traffic is switched after verification.

    This ensures:
        * zero downtime
        * easy rollback


✅ 25. What is canary deployment?

    New version is released to a small percentage of users.
    If metrics look good, rollout is expanded.

    Example:
        5% traffic → new version
        95% traffic → old version


✅ 26. How do you containerize Spring Boot microservices?

    Using Docker.
    The company behind the platform is
    **Docker**

    #Example Dockerfile

        dockerfile
        FROM openjdk:17
        COPY app.jar app.jar
        ENTRYPOINT ["java","-jar","/app.jar"]
        

    This creates a container image for the service.


✅ 27. Why do we need container orchestration?

    In real production:
        * hundreds of containers run
        * containers crash
        * scaling is required
        * rolling deployments are needed

    This is handled by orchestration platforms like
    **Kubernetes**

    It provides:
        * auto healing
        * auto scaling
        * service discovery
        * rolling updates


✅ 28. What is health check and readiness in microservices?

    Each service exposes health endpoints.
    Two important states:
        * liveness → is the process running?
        * readiness → is the service ready to accept traffic?

    Example:
        /actuator/health

    Or custom probes in Kubernetes.


✅ 29. What is centralized logging and why is it required?

    Logs from multiple services must be collected in one place.
    Otherwise:
        * debugging becomes impossible
        * correlation across services is very difficult

    Common approach:
        All service logs are pushed to a central logging system.


✅ 30. How do you monitor microservices?

    Monitoring tracks:
        * CPU
        * memory
        * request count
        * error rates
        * latency

    A very popular monitoring stack uses:
        * Prometheus
        * Grafana

This helps detect failures early and tune performance.


✅ 31. What is contract testing in microservices?

    Contract testing ensures that:
        Consumer expectations and provider APIs remain compatible.
        It avoids breaking changes across teams.

    #Example
        Order service expects:
            /pay → status, transactionId

    Payment service must always follow this contract.


✅ 32. How do you avoid cascading failures?

    Using a combination of:
        * circuit breaker
        * timeout
        * retry
        * bulkhead
        * fallback

    #Example
            If payment service is slow:
                * timeout triggers
                * fallback executes
                * order service continues


✅ 33. What is timeout and retry strategy?

    Timeout defines how long a service waits for a response.
    Retry defines how many times a failed call is retried.

    Important interview point:
        Retry without circuit breaker can make failures worse.


✅ 34. What is database per service pattern?

    Each service owns and manages its own database.
    No other service can directly access it.

    Communication is strictly via APIs or events.


✅ 35. What is schema evolution in microservices?

Schema evolution means modifying database structure safely without breaking running services.

Common strategies:
    * add nullable columns
    * avoid destructive changes
    * support old and new fields temporarily


✅ 36. What is sidecar pattern?

    Sidecar is a helper component deployed alongside a service.

    It handles cross-cutting concerns like:
        * logging
        * monitoring
        * security
        * proxying

    The business service remains clean.


✅ 37. What is the strangler pattern?

    It is used to migrate a monolithic system to microservices gradually.

    #Example
        * old monolith still runs
        * new features are implemented as microservices
        * traffic is slowly routed to new services

    Eventually the monolith is retired.


✅ 38. How do you test microservices?

    Different test layers are used:
        * unit tests
        * integration tests
        * contract tests
        * end-to-end tests

Integration tests usually start only the required services and dependencies.


✅ 39. What is service mesh and when is it useful?

    Service mesh manages service-to-service communication at infrastructure level.

    It provides:
        * traffic control
        * retries
        * mTLS
        * observability

    without changing application code.

    It becomes useful when the number of services becomes very large.


✅ 40. What are the biggest challenges in microservices?

    Main challenges are:
        * distributed debugging
        * network failures
        * data consistency
        * configuration management
        * monitoring
        * operational complexity

    That is why microservices should be used only when:
        * the system really requires scalability
        * teams are large
        * automation is mature


    

-------------------------------------------------------------------------------------------------------------------------------------------------




*/
