/*
                                                    *****Java*****


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



 									*****Methods (Void & Return Type)*****

Void Method
private static void m1() {
    // No return value
}

Return Type Method
private static int m2() {
    return 10;
}



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



 							*****Naming Conventions (Industry Standard)*****


| Element            | Convention | Example                       |

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



What is Java?

	Java is a platform-independent, object-oriented, high-level programming language used to build web, desktop, mobile and enterprise applications.
	It uses the JVM (Java Virtual Machine) to run code on any OS(Operating System) (Write Once, Run Anywhere).
    Java is currently maintained by Oracle Corporation.


What is platform independence in Java?

    Java program is compiled into bytecode, and the same bytecode can run on any OS using JVM.


Why is Java a platform-independent language?

    Java is platform independent because Java code is compiled into bytecode, not machine code.
    Java compiler (javac) → converts .java → .class (bytecode)
    Bytecode runs on JVM (Java Virtual Machine)
    JVM is platform dependent, but bytecode is the same for all OS(Operating System)

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


What is the difference between Java and C++?

	Java is platform-independent, C++ is not.
	Java has automatic garbage collection, C++ uses manual memory management.
	Java does not support multiple inheritance (only via interfaces), C++ does.


What is variable in java?

		A variable is a name we give to a memory location where we store data (like numbers, names, etc...).
		👉 Think of a variable like a box with a label. We can put something in it, and use it later.
  
		*Variables syntax/structure*:
			dataType variableName = values;

		*Types of Variables in Java*
			| Type            | Where it's declared        | Scope                         |

			| 1. **Local**    | Inside a method/block      | Only within that method       |
			| 2. **Instance** | Inside class (not static)  | Each object gets its own copy |
			| 3. **Static**   | Inside class with `static` | Shared across all objects     |

		*Variables naming convention*
			camelCase - first letter only lowerCase then next words first letter starts with uppercase


You need to store a password. Which datatype will you use?

    Use char[] instead of String.
        char[] password = {'a','b','c'};


Why char[] array is preferred to store password than String?

    Because String is :
        String is immutable
        It stays in String pool until GC(Garbage Collector)
        We cannot clear it manually

    char[] is safer because we can remove the password from memory.

    Example:-
        char[] pwd = {'a','b','c'};
        Arrays.fill(pwd, ' ');


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
		It allow for code reusability and organization. 

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

    In Java, data types specify the kind of values a variable can hold.
    They fall into two main categories: **Primitive** and **Non-Primitive (Reference)** types.

	Primitive:
        | Data Type   | Size    | Default Value | Example Values                                            | Description                                   |

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


Can the main() method be overloaded? How?

    ✅ Yes, main() method can be overloaded

    ❌ But JVM will only call this method:-
            public static void main(String[] args)


Why is the main() method static in Java?

    JVM needs to call main() without creating an object
    Static methods belong to class, not object
    If main() was non-static, object creation would be required

    👉 Hence main() is static


Can we override a private methods in java?

    ❌ No, private methods cannot be overridden.
        Private methods are not visible to child classes
        They are class-specific

    👉 This is method hiding, not overriding


What is static keyword?

    Static members belong to the class, not to the object.


What is Static Methods?

	Declared using the static keyword inside a class or interface.
    It can have a method body.
    It cannot be overridden by subclasses or implementing classes
    It is called using the class / interface name, not by creating an object.


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


What is static initializer block ?

    👉 A static block is used to initialize static data.

    Example:-
        static {
            System.out.println("Static block executed");
        }
    ✔ Executed only once when class is loaded.


Where does the static block get stored in memory ?

    👉 Static variables and static blocks belong to the class metadata.

    ✔ They are stored in Metaspace (Java 8 and above).

    👉 Objects → Heap
    👉 Local variables → Stack
    👉 Class information & static members → Metaspace


Difference between static methods, static variables, and static classes

    | Feature              | static Variable | static Method | static Class         |

    | Belongs to           | Class           | Class         | Class                |
    | Object needed        | ❌ No           | ❌ No        | ❌ No                |
    | Access instance data | ❌ No           | ❌ No        | ❌ No                |
    | Usage                | Shared data     | Utility logic | Helper/Inner classes |
    
    Static classes are allowed only as nested classes
        class Outer {
            static class Inner {
                void show() {
                    System.out.println("Static Inner Class");
                }
            }
        }


Difference between static and non-static method ?

    | Static method                        | Non-static method        |
    | ------------------------------------ | ------------------------ |
    | Belongs to class                     | Belongs to object        |
    | Called using class name              | Called using object      |
    | Cannot access instance data directly | Can access instance data |

    Test.show();            // static
    new Test().run();       // non-static


Can we serialize static variables?

    ❌ No.  Static variables belong to the class, not to the object.


Why Java does not support operator overloading?

    Java avoids operator overloading to keep the language simple and readable.
    Operator overloading can make code confusing.

    Example (not allowed in Java):

        a + b   // custom meaning like in C++

    Only + is overloaded in Java for:

        numbers
        strings


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


Can we use default constructor if explicit constructor is defined ?

    ❌ No. If you define any constructor, Java will NOT generate default constructor.

    class Student {
        // Explicit constructor
        Student(int id) {
            System.out.println("ID = " + id);
        }
        public static void main(String[] args) {
            Student s1 = new Student();                         // ❌ Compile-time error
        }
    }

    //  Correct method:-
    class Student {
        Student() {
            System.out.println("Default constructor");
        }
        Student(int id) {
            System.out.println("ID = " + id);
        }
        public static void main(String[] args) {
            Student s1 = new Student();                     // works
            Student s2 = new Student(10);                   // works
        }
    }


What is OOP ?

    OOP stands for Object-Oriented Programming. OOP is a programming model based on objects and classes.


What are the four pillars of OOP?

	Encapsulation → wrapping data & methods (classes).
	Inheritance → acquiring properties from parent class (extends).
	Polymorphism → many forms (method overloading & overriding).
	Abstraction → hiding implementation details (abstract class, interface).


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
        Single inheritance (A → B)
        Multilevel inheritance (A → B → C)
        Hierarchical inheritance (one parent → many children)
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
        class D extends B, C {}                 // Ambiguous - which show() to call?

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


Difference between Compile-time and Runtime Polymorphism ?

    | Feature     | Compile-time       | Runtime           |
    
    | Achieved by | Method overloading | Method overriding |
    | Binding     | Early binding      | Late binding      |
    | Resolved at | Compile time       | Runtime           |
    | Performance | Faster             | Slower            |


Difference between Overloading and Overriding ?

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
    --------------                                                  ------------------------------------
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


Reason for overriding equals() and hashCode()?

    To make logical comparison work correctly.
    especially in collections like HashMap, HashSet.

    Example problem:

        Two different objects but same data:-
            Employee e1 = new Employee(1);
            Employee e2 = new Employee(1);

    Without overriding:
        e1.equals(e2)  // false

    After overriding:
        e1.equals(e2)  // true

    ✔ And hashCode() must be consistent with equals()
    so hash based collections work properly.
    

What is equals and hashCode contract ?

    1️⃣ If two objects are equal using equals(), 👉 they must return the same hashCode()

    2️⃣ If two objects have the same hashCode(),  👉 they may or may not be equal.

    Example

        @Override
        public boolean equals(Object o) { ... }

        @Override
        public int hashCode() { ... }

    ✔ Very important when using HashMap / HashSet.


What is String immutability in Java?

	Strings are immutable (cannot be changed).
	New objects are created on modification.


Is String thread-safe in Java?

    ✅ Yes. Because String is immutable.

    Once created, it cannot be modified, so multiple threads can safely use it.

    Example:
        String s = "Hello";

    No thread can change this object.


Why is String is immutable in Java ?

    Once a String object is created, it cannot be changed.

    This is mainly for:-
        security
        thread safety
        caching in String pool
        hashcode consistency

        String s = "abc";
        s.concat("d");   // creates new object

    String is widely used in:-
        database connection
        file paths
        class loading

        So immutability avoids accidental modification.


What is the use of intern() method?
 
    intern() moves the string to the String pool (or returns existing one).

    String s1 = new String("Java");
    String s2 = s1.intern();

    String s3 = "Java";

    System.out.println(s2 == s3);                           // true


What is immutable class?

    An immutable class is a class whose object cannot be modified after creation.
    

How to create an immutable class in Java?

    Make class final
    Make fields private final
    No setters
    Initialize using constructor

    final class Employee {
        private final int id;
        private final String name;

        public Employee(int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }
    }


What is StringTokenizer?

    StringTokenizer is used to break a string into tokens based on a delimiter.

        Example:-
            StringTokenizer st = new StringTokenizer("Java,Spring,React", ",");

            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }

        Output:
                Java
                Spring
                React

        
What is String Constant Pool?

    String Constant Pool is a special memory area in the heap where string literals are stored.

    If the same string already exists, Java reuses it.

    Example:
        String a = "Java";
        String b = "Java";

    System.out.println(a == b);   // true

    Both refer to the same object from the pool.


What are different ways to create a String object?

    String literal uses String Constant Pool, new always creates a new object.

    There are mainly 2 ways.

    1️⃣ Using String literal (uses String pool)
        String s1 = "Java";
    2️⃣ Using new keyword (creates new object in heap)
        String s2 = new String("Java");


What is the difference between String, StringBuffer, and StringBuilder?

    | Feature     | String   | StringBuffer | StringBuilder |

    | Mutable     | ❌ No     | ✅ Yes        | ✅ Yes        |
    | Thread-safe | ✅ Yes    | ✅ Yes        | ❌ No         |
    | Performance | Slow      | Medium         | Fast          |
    | Introduced  | Java 1.0  | Java 1.0       | Java 1.5      |

Examples:-
    String s = "Java";
    s.concat(" World");                                             // creates new object

    StringBuilder sb = new StringBuilder("Java");
    sb.append(" World");                                            // modifies same object


What are threads in Java?

	Smallest unit of execution.
	Created by extending Thread class or implementing Runnable interface.


If two threads have same priority, which executes first ?

    👉 No guarantee.
    It depends on:-
                    ✔ thread scheduler
                    ✔ OS    


Explain Java Thread Lifecycle ?

    Thread States:-
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


Extend Thread vs Implement Runnable. Which method to override? Where thread starts? Can we call start twice?**

    👉 When extending Thread
            We override:
                public void run()

    👉 When implementing Runnable
            We also implement:
                public void run()

    👉 Where does thread start?
            Thread starts when we call:
                t.start();

    Not with run().

    Difference
        | Thread                      | Runnable                 |
        | --------------------------- | ------------------------ |
        | Extends class               | Implements interface     |
        | Cannot extend another class | Can extend another class |

    Can we call start() twice?
        ❌ No.
        It throws:
            IllegalThreadStateException
            

What is multithreading?

    Multithreading is the process of executing multiple threads concurrently to improve performance.
    It is implemented using the Thread class or the Runnable interface.

    Using Thread class
        class MyThread extends Thread {*5
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


Will finally execute if return is in try/catch?

    ✅ Yes, finally block will always execute.

    Except:
        System.exit()
        JVM crash
        Power failure

    Examples:
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            System.exit(0);
        } finally {
            System.out.println("Finally"); // not executed
        }


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


In try, catch and finally – if all return a value, which one has priority?

    👉 finally block has the highest priority.

        static int test() {
            try {
                return 1;
            } finally {
                return 2;
            }
        }


What is a blank final variable?

    A final variable declared without initialization is called a blank final variable.

    It must be initialized:
        in constructor (for instance variable)

    class Test {
        final int x;
        Test() {
            x = 10;   // must be assigned
        }
    }


What is exception?

    exception is an abnormal situation that occurs during program execution.
        Use try, catch, finally to handle exceptions.


Difference between compile time and run time exception ?

    | Compile time exception  | Runtime exception   |
    | ----------------------- | ------------------- |
    | Checked exception       | Unchecked exception |
    | Handled at compile time | Occurs at runtime   |


What are exceptions available in Java?

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


How do you create custom exceptions?

    Create a class that extends Exception (for checked) or RuntimeException (for unchecked).

    Example:-
        class MyException extends Exception {
            public MyException(String message) {
                super(message);
            }
        }


How will you handle NullPointerException in Java ?

    1. Null check before usage
        if(name != null) {
            System.out.println(name.length());
        }

    2. Use Optional
        Optional<String> n = Optional.ofNullable(name);
        System.out.println(n.orElse("NA"));

    3. Proper object initialization
        String name = "John";           // Initialize with a value
        

What are the different types of exceptions you have faced till now ?

    ✔ NullPointerException
    ✔ ArrayIndexOutOfBoundsException
    ✔ ClassNotFoundException
    ✔ SQLException
    ✔ IOException
    ✔ NumberFormatException
    ✔ ConcurrentModificationException

    Example:-
        String s = null;
        s.length();   // NullPointerException


What is order/hierarchy of exception in Java, which is highest ?

    👉 Top (highest) in hierarchy is:
            Throwable extends Exception extends RuntimeException

    Throwable
        |
        +--- Error
        |
        +--- Exception
                    |
                    +--- RuntimeException

    ✔ Highest = Throwable


What is exception order in catch block ?

    👉 Order must be:-
            child first → parent last

    Example:-
        try { }
        catch (NullPointerException e) { }
        catch (Exception e) { }

    ❌ This is wrong:
        try { }
        catch(Exception e)
        catch(NullPointerException e)               // unreachable


Difference between throw and throws?

    | Feature  | throw                      | throws                    |

    | Used to  | Explicitly throw exception | Declare exception         |
    | Syntax   | throw new Exception();     | method() throws Exception |
    | Position | Inside method              | Method signature          |
    | Handles  | One exception              | Multiple exceptions       |

    void check(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not Eligible");
        }
    }

    void read() throws IOException {
    }


Is it possible to rethrow an exception ?

    ✅ Yes. We catch it, do some work (like logging), and throw it again.
    
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            throw e;   // rethrowing
        }


What happens if an exception is thrown by a super class method?

    When overriding a method:
        Subclass cannot throw broader checked exceptions than the superclass method.

    class A {
        void test() throws IOException { }
    }

    class B extends A {
        // valid
        void test() throws FileNotFoundException { }
    }

    But this is ❌ not allowed:
        class B extends A {
            void test() throws Exception { }   // broader checked exception
        }


What is synchronization in Java?

	Prevents multiple threads from accessing shared resources at the same time. OR Synchronization is used to control access to a shared resource in a multithreaded environment.
	Achieved using synchronized keyword.

    Two Types availble:
        Method-level
        Block-level

    It avoids:-
        data inconsistency
        race condition

    Example without synchronization:--
        class Counter {
            int count = 0;

            void increment(){
                count++;
            }
        }
    * Multiple threads calling increment() can produce wrong result. *

    With synchronized method:---
        class Counter {
            int count = 0;

            synchronized void increment(){
                count++;
            }
        }


Synchronized block or synchronized method – which is better ?

    👉 Synchronized block is better.

    Because:
        ✔ It locks only the critical section
        ✔ Better performance

    Example:

        public void update() {
            synchronized(this) {
                // critical code
            }
        }


Difference between new ArrayList() and Arrays.asList() ?

    ✅ new ArrayList()
        List<Integer> list = new ArrayList<>();
        list.add(1);                                                        // allowed

    Resizable list.

    ✅ Arrays.asList()
        List<Integer> list = Arrays.asList(1,2,3);
        list.add(4);                                                        // ❌ UnsupportedOperationException

    Fixed-size list backed by array.


What is the difference between Array and ArrayList?

    | Array               | ArrayList             |
    | ------------------- | --------------------- |
    | Fixed size          | Dynamic size          |
    | Primitive + objects | Only objects          |
    | Faster              | Slightly slower       |
    | No utility methods  | Many built-in methods |

    int[] a = new int[5];                                       //  Array
    ArrayList<Integer> list = new ArrayList<>();                //  ArrayList


What is Garbage Collection in Java?

	Automatic memory management that removes unused objects by JVM


There is a method called gc(). What is its purpose?

    System.gc() is a request to the JVM to run garbage collection.


How does Garbage Collection work internally in Java?

    JVM tracks object references
    If an object is not reachable from any live reference → it is eligible for GC(Garbage Collection)
    GC(Garbage Collection) removes it and frees heap memory

    👉 Modern JVM uses generational GC:-
            Young Generation
            Old Generation


What is the difference between Comparable and Comparator?

    | Feature          | Comparable   | Comparator    |

    | Package          | java.lang    | java.util     |
    | Method           | compareTo()  | compare()     |
    | Sorting logic    | Inside class | Outside class |
    | Multiple sorting | ❌ No        | ✅ Yes       |

    Example – Comparable:-
        class Employee implements Comparable<Employee> {
            int id;

            public int compareTo(Employee e) {
                return this.id - e.id;
            }
        }
    
    Example – Comparator:-
        Comparator<Employee> byId =  (e1, e2) -> e1.id - e2.id;


What is JDBC in Java?

	Java Database Connectivity API for connecting and executing queries on databases.


What is the difference between JPA and Hibernate?

	JPA: Specification for ORM(Object Relational Mapping).
	Hibernate: Implementation of JPA.


What is reflection in Java?

	Ability to inspect and modify classes, methods, and fields at runtime.

    Example:-
        Class<?> c = Class.forName("com.app.Employee");
        Object obj = c.getDeclaredConstructor().newInstance();


How can we create object dynamically at runtime in Java ?

👉 By using Reflection API.

    Example:-
        Class<?> cls = Class.forName("com.app.Employee");
        Employee emp = (Employee) cls.getDeclaredConstructor().newInstance();

✔ Class name is decided at runtime.


What is singleton design pattern?

    A class that allows only one object to be created.

    class Singleton {
        private static Singleton obj;

        private Singleton(){}

        public static Singleton getInstance(){
            if(obj == null){
                obj = new Singleton();
            }
            return obj;
        }
    }


What are design patterns in Java?

	Creational: Singleton, Factory.
	Structural: Adapter, Decorator.
	Behavioral: Observer, Strategy.


What design patterns have you worked on?

    I have mainly used Singleton and Factory patterns in projects.

    * Singleton
    * Factory
    * Builder (basic usage in APIs / objects)


Explain Builder design pattern?

    Builder pattern is used to create complex objects step by step and avoid many constructors.

    class User {
        private String name;
        private int age;

        private User(Builder b) {
            this.name = b.name;
            this.age = b.age;
        }

        static class Builder {
            private String name;
            private int age;

            Builder name(String name){
                this.name = name;
                return this;
            }

            Builder age(int age){
                this.age = age;
                return this;
            }

            User build(){
                return new User(this);
            }
        }
    }

    User u = new User.Builder()
            .name("Mohan")
            .age(29)
            .build();


Difference between Factory and Abstract Factory pattern ?

    | Factory                     | Abstract Factory                     |
    | --------------------------- | ------------------------------------ |
    | Creates one type of product | Creates a family of related products |
    | Single factory              | Factory of factories                 |


How do you break a singleton pattern?

    A singleton can be broken by:

                                Reflection
                                Serialization
                                Cloning

    Reflection example idea:-
        Constructor<Singleton> c = Singleton.class.getDeclaredConstructor();
        c.setAccessible(true);
        Singleton s2 = c.newInstance();


How do you prevent a singleton from breaking?

    ✅ 1. Protect from Reflection

            Throw exception inside constructor.

                private Singleton(){
                    if(instance != null){
                        throw new RuntimeException("Use getInstance()");
                    }
                }

    ✅ 2. Protect from Serialization

            Use readResolve().

                protected Object readResolve() {
                    return instance;
                }

    ✅ 3. Best and simple solution (interview friendly)

            Use enum Singleton

                enum Singleton {
                    INSTANCE;
                }


What is deadlock ?

    Deadlock occurs when two or more threads wait forever for each other’s resources.

    Examples:-
        Thread1 → Resource A → waits for B
        Thread2 → Resource B → waits for A


What is ClassLoader ?

    ClassLoader is a part of JVM that loads .class files into memory.

        Types of ClassLoaders:-

            Bootstrap ClassLoader
                Loads core Java classes (java.lang, java.util)

            Extension ClassLoader
                Loads classes from ext directory

            Application ClassLoader
                Loads application-level classes (classpath)

        👉 Follows Parent Delegation Model


Is it possible to load a class by two ClassLoaders in Java?

    ✅ Yes. The same class name loaded by two different classloaders is treated as different classes.

    Example:-
        ClassLoader cl1 = new URLClassLoader(...);
        ClassLoader cl2 = new URLClassLoader(...);

        Class<?> c1 = cl1.loadClass("com.app.MyClass");
        Class<?> c2 = cl2.loadClass("com.app.MyClass");


What is serialization in Java?

    Converting object into byte stream.
    Used for file storage, network transfer

    Example:-
        class Employee implements Serializable {
            int id;
        }


What happens if a Serializable class has a member which is not serializable?  How do you fix it?

        It throws:
             NotSerializableException

        Fix: 
            mark that variable as transient.

        Example:-
            class Address { }

            class Employee implements Serializable {
                private int id;
                private transient Address address;   // fix
            }


Have you used serialization anywhere in your application ?

    👉 Yes, it is commonly used when:-
            sending objects over network
            storing objects in file / cache (Redis, session)

        public class User implements Serializable {
        }

        In real projects, it is often used for:-
            session storage
            API / microservice communication


What is Externalization in Java ?

    👉 Externalizable is used when we want full control over serialization.
    ✔ More control than Serializable.

    We manually write and read fields.

    Example:-

        class Employee implements Externalizable {

            int id;
            String name;

            public void writeExternal(ObjectOutput out) throws IOException {
                out.writeInt(id);
                out.writeObject(name);
            }

            public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
                id = in.readInt();
                name = (String) in.readObject();
            }
        }


What is deserialization?

    Converting byte stream back into object.


What is transient keyword?

    Transient prevents a variable from being serialized.


What is marker interface?

    Marker interfaces are empty interfaces (no methods) used to mark a class.
    JVM uses them to provide special behavior
    Acts like metadata
    👉 JVM checks marker interface at runtime

    Common Marker Interfaces:-
        Serializable
        Cloneable
        RandomAccess

        class Employee implements Serializable {
        }


What is cloning in Java?

    Creating a copy of an object using clone() method.

    The class must implement Cloneable.
    👉 And override clone().

    class Employee implements Cloneable {

        int id;

        Employee(int id) {
            this.id = id;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public static void main(String[] args) throws Exception {

            Employee e1 = new Employee(1);

            Employee e2 = (Employee) e1.clone();

            System.out.println(e1.id); // 1
            System.out.println(e2.id); // 1
        }
    }


What is composition in Java?

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


Difference between IS-A and HAS-A relationship ?

    | IS-A                        | HAS-A                       |

    | Inheritance                 | Composition                 |
    | `extends`                   | Object reference            |
    | Strong coupling             | Loose coupling              |
    | Reusability via inheritance | Reusability via composition |

    IS-A:
        class Dog extends Animal {}     //  inheritance

    HAS-A:
        class Car {
            Engine engine;              //  composition
        }


Difference between Inheritance and Composition?

    | Inheritance       | Composition        |
    | ----------------- | ------------------ |
    | IS-A relationship | HAS-A relationship |
    | Tight coupling    | Loose coupling     |

    class Car extends Vehicle   // inheritance

    class Car {
        Engine engine;          // composition
    }


Difference between Aggregation and Composition?

    Both represent HAS-A relationship but differ in ownership.
    Aggregation = weak ownership.
    Composition = strong ownership.

    Aggregation (HAS-A – weak relation)
        Aggregation is a HAS-A relationship where one object uses another object,
        but both can exist independently.
        Child can exist without parent.

            class Department { }
            class Employee {
                Department dept;   // aggregation
            }

    Composition (HAS-A – strong relation)
        Child cannot exist without parent.

            class House {
                private Room room = new Room();   // composition
            }
        

What is Coupling in OOP and why is it helpful?

    Coupling refers to the dependency between classes.

    Types:

        Tight coupling – High dependency ❌
        Loose coupling – Low dependency ✅

    Why loose coupling is helpful:-

        Easy maintenance
        Easier testing
        Better scalability
        Improved reusability

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

    volatile is used to mark a variable as shared across threads.
        Prevents thread-local caching
        Ensures latest value is read

    Example:-
        volatile boolean flag = true;

    👉 Guarantees visibility, not atomicity


Wrapper Class in Java?

    Wrapper classes convert primitive type into an object.

        | Primitive | Wrapper   |
        -------------------------
        | int       | Integer   |
        | double    | Double    |
        | char      | Character |
        | boolean   | Boolean   |

    ✅ Auto-boxing and Un-boxing
        🟩 Auto-boxing:
            Automatic conversion of primitive type into a Wrapper object.

            int a = 10;
            Integer obj = a;   // auto-boxing


        🟥 Un-boxing:
            Automatic conversion of Wrapper object into primitive type.

            Integer newVersion = Integer.valueOf(1);
            int b = newVersion;	//	Un-boxing    

    👉 Needed for Collections, Generics.


What is the use of Generics in Java ?

    👉 Provides type safety and avoids casting.

    Example:-
        List<String> list = new ArrayList<>();

    ✔ Only String allowed
    ✔ No ClassCastException at runtime


What is try-with-resources?

    Automatically closes resources like files and streams.


Variables declared outside main – how to access in main?

    If it is an instance variable
        class Test {
            int a = 10;

            public static void main(String[] args) {
                Test t = new Test();
                System.out.println(t.a);
            }
        }
            
    If it is static
        class Test {
            static int a = 10;

            public static void main(String[] args) {
                System.out.println(a);
            }
        }
    

Difference between this & super?

    | Feature          | `this`                          | `super`                        |

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
        super is used to access parent class variables, methods and constructors.
        Used to access parent variables, methods, constructors
            super.display();


Differences between Error and Exception

    | Feature       | Error            | Exception            |

    | Recoverable   | ❌ No            | ✅ Yes              |
    | Occurs due to | System issues    | Application logic    |
    | Package       | java.lang.Error  | java.lang.Exception  |
    | Example       | OutOfMemoryError | NullPointerException |

   
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


Memory in Java?

	In Java, memory is managed through the **Java Memory Model (JMM)**. It divides memory into several regions, each with a specific purpose. 

    | Memory Area                       | Description                                                                 |

    | **Heap**                          | Stores objects and instance variables. Shared by all threads.               |
    | **Stack**                         | Stores method calls, local variables, and references. One stack per thread. |
    | **Method Area**                   | Stores class-level metadata (static variables, class info, constants).      |
    | **Program Counter (PC) Register** | Stores the current instruction address of the thread. One PC per thread.    |
    | **Native Method Stack**           | Used for native methods (written in C/C++ via JNI(Java Native Interface)).                         |

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


Difference between Heap Memory and JVM?

    JVM
        Java Virtual Machine executes Java programs.

    Heap memory
        Part of JVM memory
        Used to store objects and instance variables.


How are Java objects stored in memory?

    Objects are stored in Heap memory
    Reference variables are stored in Stack

        Test t = new Test();
    
    t → stack
    new Test() → heap


Difference between Heap and Stack memory?

    Heap → objects and instance variables
    Stack → method calls, local variables


                                                *****Access Modifiers?*****

	Access Modifiers in Java control where our variables, methods, or classes can be accessed from.
	Access modifiers are keywords in Java that define how much access other classes/objects have to variables, methods, and classes.

	💡 Quick Summary-
            Use private for data hiding.
            Use public for global access.
            Use protected for inheritance but controlled access.
            Default is automatically used when no modifier is written.


		| Modifier               | Access Level                 			|
        ---------------------------------------------------------------------
		| `public`               | Everywhere                   			|
		| `private`              | Only within the same class   			|
		| `protected`            | Same class ➜ same package ➜ subclasses |
		| *default* (no keyword) | Same package only            			|


        | Modifier    | Same Class | Same Package | Subclass (other package) | Other Package          |
        -----------------------------------------------------------------------------------------------
        | `public`    | ✅         | ✅           | ✅                       | ✅                   |
        | `protected` | ✅         | ✅           | ✅                       | ❌ (unless inherited)|
        | *default*   | ✅         | ✅           | ❌                       | ❌                   |
        | `private`   | ✅         | ❌           | ❌                       | ❌                   |


 									*****Homogeneous & Heterogeneous*****

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


				                                            *****enum*****

	In Java, an enum (short for enumeration) is a special data type used to define a collection of constants (fixed set of values).

    ✅ When to use Enum?
            When you need a fixed set of related constants (like days of week, directions, status codes, colors, etc.).
            Makes code readable, type-safe, and organized.


				                                *****Varargs - Variable Arguments*****

	Varargs in Java stands for Variable Arguments.
	It allows a method to accept zero or multiple arguments of the same type without explicitly defining them as an array.

    class Test {
        static void printNumbers(int... nums) {
            for (int n : nums) {
                System.out.println(n);
            }
        }

        public static void main(String[] args) {
            printNumbers(1);
            printNumbers(1, 2, 3);
            printNumbers(10, 20, 30, 40);
        }
    }


 								***** Type casting *****

	Type casting is when we assign a value of one primitive data type to another type.

    Widening Casting:-

        * Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
    
        public static void main(String[] args) {
            int myAge = 29;								//	integer type
            double myDoubleAge = myAge;					//	double(decimal) type
            System.out.println(myAge);
            System.out.println(myDoubleAge);
        }
    
    Narrowing Casting:-

        * Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        
        public static void main(String[] args) {
            double myDoubleAge = 29.5d;					//	double(decimal) type
            int myAge = (int) myDoubleAge;				//	convert to integer type
            System.out.println(myDoubleAge);
            System.out.println(myAge);
        }


 									*****Scanner*****

    The Scanner class in Java (from java.util package) is used to read input from various sources like the keyboard, files, or strings. 
    It simplifies parsing primitive types and strings using regular expressions.

    Key Features
                Reads input from System.in (keyboard), files, strings, etc.
                Parses input into primitives (int, double, etc.) or strings.
                Tokenizes input using delimiters (default: whitespace).

    Common Input Methods-
        
        | Method          | Description                            | Example Input → Output             |
        | --------------- | -------------------------------------- | ---------------------------------- |
        | `nextLine()`    | Reads entire line (including spaces)   | `"Java Rocks"` → `"Java Rocks"`    |
        | `next()`        | Reads single word (until whitespace)   | `"Java Rocks"` → `"Java"`          |
        | `nextInt()`     | Reads integer value                    | `"25"` → `25`                      |
        | `nextDouble()`  | Reads double value                     | `"3.14"` → `3.14`                  |
        | `nextBoolean()` | Reads boolean value (`true` / `false`) | `"true"` → `true`                  |
        | `hasNextXxx()`  | Checks if next token is of type `Xxx`  | `sc.hasNextInt()` → `true / false` |


What is an Inner Class?

    An inner class is a class defined inside another class.
    It helps group classes that are only used in one place, making your code more readable, logical, and encapsulated.
	
   🔹 Types of Inner Classes in Java:-
            | Type of Inner Class          | Description                                                      |
            ---------------------------------------------------------------------------------------------------
            | 1. **Member Inner Class**    | Normal class inside another class (non-static)                   |
            | 2. **Static Nested Class**   | Static class inside another class                                |
            | 3. **Local Inner Class**     | Class defined inside a method                                    |
            | 4. **Anonymous Inner Class** | Class with no name (used for instant override or implementation) |


What is a package in Java?

    A Java package is a group of similiar types of classes and interfaces, sub-packages.

    Package in java can be organized in two form
        * Build-in package
        * User-defined package

    There are many built-in packages such as lang, awt, javax, net, io , util, sql etc.


 							***** Upcasting & Downcasting *****

What is Upcasting?

        Upcasting means converting a child class object into a parent class reference.
        ✔ It's done automatically by Java (implicit).

            Animal a = new Dog();   // Upcasting

What is Downcasting?

        Downcasting means converting a parent class reference back into a child class reference.
        ⚠ It must be done manually using casting, and it is risky.

            Animal a = new Dog();   // upcasting first
            Dog d = (Dog) a;        // downcasting


How to make a class thread-safe?
    
    Use synchronization, concurrent collections, or immutability.

    1. Synchronize critical methods / blocks
            public synchronized void increment() {
                count++;
            }

    2. Use thread-safe classes
            ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

    3. Make object immutable
            final class Employee {
                private final String name;
                private final int id;

                public Employee(String name, int id) {
                    this.name = name;
                    this.id = id;
                }

                public String getName() { return name; }
                public int getId() { return id; }
            }

            
How to create a thread-safe Singleton class using double-checked locking?

    Double-checked locking ensures that synchronization happens only when the instance is created.

    class Singleton {

        private static volatile Singleton instance;

        private Singleton() {}

        public static Singleton getInstance() {
            if (instance == null) {                 // 1st check
                synchronized (Singleton.class) {
                    if (instance == null) {         // 2nd check
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
Why volatile?
    To make sure all threads see the updated object correctly.

    
How do you create HTTP POST request in Java?

    We create POST request using HttpClient and HttpRequest.
    (In Spring Boot, usually we use RestTemplate or WebClient.)

    Simple example (Java 11 HttpClient):-

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/api/save"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString("{\"name\":\"Mohan\"}"))
                .build();

        client.send(request, HttpResponse.BodyHandlers.ofString());


What is the difference between ClassNotFoundException and NoClassDefFoundError?

    ClassNotFoundException
        Checked exception
        Happens when class is not found at runtime using ClassLoader

    NoClassDefFoundError
        Error
        Class was present at compile time but not found at runtime


What is the difference between sleep() and wait() in Java?

    | sleep()               | wait()                              |
    | --------------------- | ----------------------------------- |
    | Thread method         | Object method                       |
    | Does not release lock | Releases lock                       |
    | Used for time delay   | Used for inter-thread communication |

    Thread.sleep(1000);

    obj.wait();


I want to suspend a thread for 5 seconds. How to do this?

    👉 Use Thread.sleep().

    Example:-
        Thread.sleep(5000);         // 5 seconds

    ✔ It pauses the current thread.


What would happen if I don’t import java.lang ?

    👉 Nothing will happen.
    ✅ java.lang package is imported by default.

    So classes like:-
        String
        Math
        System
     It's works without import.

    Example:
        String s = "Hello";   // works without import


What is stateless object ?

    👉 An object that does not store any client specific data.
    It behaves same for every request.

    Example(Spring Service):-
        @Service
        public class CalculatorService {

            public int add(int a, int b){
                return a + b;
            }
        }
    No fields → only methods → stateless.


What is instance level locking and class level locking ?

    👉 Instance level locking

        Locks a particular object.

            public synchronized void method() { }
            or
            synchronized(this) { }

    👉 Class level locking

        Locks the class.

            public static synchronized void method() { }
            or
            synchronized(Employee.class) { }


What is ExecutorService?

    ExecutorService manages thread pools.
    Better than creating threads manually
    Improves performance

    Example:
        ExecutorService es = Executors.newFixedThreadPool(5);
        es.execute(() -> System.out.println("Task"));


What is Callable interface in threads?

    👉 Callable is like Runnable, but:
            ✔ It can return a value
            ✔ It can throw checked exception

    Example:
        Callable<Integer> task = () -> 10;

    👉 It is used with ExecutorService.


What is shutdown hook in Java?

    👉 A shutdown hook is a thread that runs when JVM is shutting down
    (normal exit, CTRL+C, kill).

    Example:-
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Cleanup done");
        }));

    ✔ Used for closing DB connections, files, logs, etc.


How can you take a thread dump in Java?

    👉 Using command line:
            jstack <pid>

    👉 Or

        jcmd <pid> Thread.print

    ✔ Used to analyze deadlocks and thread issues.


Difference between thread and process?

    | Thread               | Process              |
    | -------------------- | -------------------- |
    | Lightweight          | Heavyweight          |
    | Shares same memory   | Has its own memory   |
    | Faster communication | Slower communication |


What is classpath ?

    👉 Classpath tells the JVM where to find .class files and libraries.

    Example:-
        java -cp myapp.jar;lib/* com.app.Main


Why pointers are not used in Java

    👉 To improve:-
            security
            memory safety
            avoid illegal memory access

    Java uses references, not raw pointers.


What is Log4j in Java?

    Log4j is a logging framework for Java.

    👉 It is used to print application messages (logs) like:

        information messages
        errors
        warnings
        debugging messages

    It is developed and maintained by Apache Software Foundation.
 
Common log levels in Log4j

    | Level | Meaning                     |
    | ----- | --------------------------- |
    | INFO  | Normal message              |
    | DEBUG | Developer debugging message |
    | WARN  | Warning                     |
    | ERROR | Error message               |


What was Log4j vulnerability? How to fix it?

    The Log4j vulnerability is called Log4Shell (CVE-2021-44228).
    It allows remote code execution when a crafted string is logged.

    Root cause: 
               JNDI lookup inside log messages.
    Fix:
        Upgrade Log4j to 2.17.x or later
        Or disable lookups


int vs Integer – which takes more memory ?

    👉 Integer takes more memory

    Because:
        int → primitive
        Integer → object

    ✔ So wrapper class uses extra memory.



    

--------------------------------------------------------------------------------------------------------------------------------------------------


                                                                *****JAVA 8*****                                                                

Explain Java 8 features?

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


What is Metaspace in Java 8?

    In Java 8, PermGen is removed and replaced by Metaspace.

    Metaspace stores:
        class metadata
        method metadata

    👉 Difference:
        PermGen → fixed size
        Metaspace → grows automatically (uses native memory)


What is Anonymous?

    An anonymous class is a class without a name that is created and used at the same time.

    Runnable r = new Runnable() {
        public void run() {
            System.out.println("Hello");
        }
    };


What is functional interface?

	A Functional Interface in Java is an interface that has exactly one abstract method (SAM — Single Abstract Method).
	It can have any number of default methods, static methods, and private methods, but only one abstract method.
    It used to support lambda expressions.

    Example:
        @FunctionalInterface
        interface Calculator {
            int add(int a, int b);
        }

    
Why do we use @FunctionalInterface annotation?

    It is used for compile-time safety.
    It ensures that the interface contains only one abstract method.
    If we add another abstract method, compiler gives error.

    @FunctionalInterface
    interface Test {
        void show();
        // void test();  ❌ compile-time error
    }


Difference between normal interface and functional interface ?

    | Normal interface               | Functional interface         |
    | ------------------------------ | ---------------------------- |
    | Can have many abstract methods | Only **one abstract method** |


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


Common methods in Optional?

    of()
    ofNullable()
    isPresent()
    ifPresent()
    orElse()
    orElseGet()
    orElseThrow()
    map()
    flatMap()


What is default method in interface?

		Declared in an interface using the default keyword.		
		Have a method body (unlike normal abstract methods).		
		Can be overridden in implementing classes.

    Example:-
        interface MyInterface {
            default void show() {
                System.out.println("Default method");
            }
        }

        class MyClass implements MyInterface {
            // can override show() if needed
        }


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


How does lambda expression relate to functional interfaces?

    Lambda expression is the implementation of the single abstract method of a functional interface.

    Example:
        Runnable r = () -> System.out.println("Run");
        r.run();
    Here:
        Runnable is a functional interface
        run() is implemented by lambda


What is Method Reference?

        A method reference is a shorthand for writing a lambda expression that simply calls an existing method.
            Instead of writing:
                list.forEach(item -> System.out.println(item));
            You can write:
                list.forEach(System.out::println);

        Syntax pattern:
            ClassName(or object reference)::methodName


What is Stream API & why do we use it?

        The Stream API (introduced in Java 8, in java.util.stream) is a functional programming tool for processing data in a declarative, pipeline-based way.

        A Stream is not a collection — it’s a sequence of data elements supporting aggregate operations like map, filter, reduce, collect.

        Example in one line:
            list.stream().filter(x -> x > 5).map(x -> x * 2).forEach(System.out::println);

**Key points:**
    * Can be **sequential** or **parallel** 
    * Operations are either **intermediate** (return another stream) or **terminal** (produce a result)

    Example:
    list.stream()
        .filter(n -> n > 10)
        .forEach(System.out::println);

    
Tell me the 3 terminal operators in Stream?

        forEach()
        list.stream().forEach(System.out::println);
        collect()
        List<Integer> lists = list.stream().collect(Collectors.toList());
        reduce()
        int sum = list.stream().reduce(0, Integer::sum);


What is java.time Package?

    java.time is a modern Date and Time API introduced in Java 8 to replace the old java.util.Date and java.util.Calendar classes.
    It is immutable, thread-safe, and much easier to use

    Frequently used Date & Time API in projects:-

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


Difference between Intermediate and Terminal Operations?

    | Feature   | Intermediate    | Terminal             |
    ------------------------------------------------------
    | Return    | Stream          | Result               |
    | Execution | Lazy            | Immediate            |
    | Example   | map(), filter() | forEach(), collect() |


Difference between Lambda Expression and Method Reference?

    | Lambda          | Method Reference      |
    -------------------------------------------
    | More flexible   | More readable         |
    | Custom logic    | Existing method       |
    | `(x)->print(x)` | `System.out::println` |


What are Predefined Functional Interfaces in java 8?

    Common ones from java.util.function:-

        1. Predicate<T> - Takes input, returns boolean
            Predicate<Integer> p = x -> x > 10;
            System.out.println(p.test(15));   // true

        2. BiPredicate - Takes two inputs, returns boolean
            BiPredicate<Integer, String> bp = (n, s) -> n > s.length();
            System.out.println(bp.test(10, "Java"));   // true

        3. Function<T,R> - Takes input, returns output
            Function<String, Integer> f = s -> s.length();
            System.out.println(f.apply("Java"));   // 4

        4. BiFunction - Takes two inputs, returns output
            BiFunction<Integer, Integer, Integer> bf = (a, b) -> a + b;
            System.out.println(bf.apply(5, 10));   // 15

        5. Consumer<T> - Takes input, returns nothing
            Consumer<String> c = s -> System.out.println(s);
            c.accept("Hello");

        6. BiConsumer<T> — Takes two inputs, returns nothing
            BiConsumer<String, Integer> bc = (s, n) -> System.out.println(s + " " + n);
            bc.accept("Age", 30);

        7. Supplier<T> - Takes no input, returns output
            Supplier<Double> s = () -> Math.random();
            System.out.println(s.get());


Default methods in predefined interfaces ?

    Examples:-
        Iterable.forEach()
        Collection.stream()
        List.sort()
        Map.forEach()

    👉 Used to add methods without breaking existing code


Difference between Collection and Stream API?

    | Collection  | Stream         |
    --------------------------------
    | Stores data | Processes data |
    | Reusable    | Single-use     |
    | Eager       | Lazy           |


In which scenario will you use parallel stream?

    Use parallel stream when:

        Large data set
        Independent operations
        CPU-intensive processing

    Example:
            list.parallelStream()
                .forEach(System.out::println);


Have you used parallel streams as well?

    Yes, I have used parallel streams for processing large collections where operations are independent.

    Example:
            list.parallelStream()
                .map(x -> x * 2)
                .forEach(System.out::println);


Difference between Stream and Parallel Stream?

    | Stream        | Parallel Stream  |
    ------------------------------------
    | Sequential    | Parallel         |
    | Single thread | Multiple threads |
    | Safe          | Use carefully    |


Difference between findFirst and findAny?

    | findFirst     | findAny            |
    --------------------------------------
    | First element | Any element        |
    | Ordered       | Unordered          |
    | Slower        | Faster in parallel |


Difference between allMatch and anyMatch?

    | allMatch       | anyMatch     |
    ---------------------------------
    | All must match | At least one |
    | Strict         | Flexible     |


Difference between map and flatMap?

        | map           | flatMap          |
        ------------------------------------
        | One-to-one    | One-to-many      |
        | Nested stream | Flattened stream |

    list.stream().flatMap(l -> l.stream());


Difference between of() and ofNullable()

        | of()                | ofNullable() |
        --------------------------------------
        | Does not allow null | Allows null  |
        | Throws NPE          | Safe         |


Static, Instance & Constructor Method References ?

        | Type        | Example               |
        ---------------------------------------
        | Static      | `Class::staticMethod` |
        | Instance    | `obj::method`         |
        | Constructor | `Class::new`          |


What is Effectively Final?

    A variable is effectively final if:
            Not declared final
            But value is never changed

    Example:
        int x = 10;
        Runnable r = () -> System.out.println(x);
        
    👉 Required for lambda expressions



--------------------------------------------------------------------------------------------------------------------------------------------------


                                                                     *Collections*

                    🔹 1. List (Interface)

Name: ArrayList

* Parent Interface: Collection → List
* Secondary Interface: RandomAccess, Cloneable, Serializable
* Best Suited Operations : : Retrieval
* Properties:

  * Heterogeneous – ✅ Yes
  * Duplicate – ✅ Yes
  * Null Acceptance – ✅ Yes (multiple nulls)
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
  * Duplicate Capacity – 10
* Version: JDK 1.2
* Package: java.util


Name: LinkedList

* Parent Interface: Collection → List, Deque, Queue
* Secondary Interface: Serializable, Cloneable
* Best Suited Operations : : Insertion and Deletion

* Properties:

    * Heterogeneous – ✅ Yes
    * Duplicate – ✅ Yes
    * Null Acceptance – ✅ Yes (multiple nulls)
    * Insertion Order – ✅ Maintains
    * Sorted Order – ❌ No
    * Duplicate Capacity – 10
    * Version: JDK 1.2
    * Package: java.util


Name: Vector

* Parent Interface: Collection → List
* Secondary Interface: Serializable, Cloneable, RandomAccess
* Best Suited Operations: Retrieval

* Properties:

    * Heterogeneous – ✅ Yes
    * Duplicate – ✅ Yes
    * Null Acceptance – ✅ Yes (multiple nulls)
    * Insertion Order – ✅ Maintains
    * Sorted Order – ❌ No
    * Duplicate Capacity – 10
    * Version: JDK 1.0 (Legacy)
    * Package: java.util


Name: Stack

* Parent Interface: Collection → List → Vector
* Secondary Interface: Serializable, Cloneable
* Best Suited Operations : : LIFO ( Last In First Out )

* Properties:

    * Heterogeneous – ✅ Yes
    * Duplicate – ✅ Yes
    * Null Acceptance – ✅ Yes
    * Insertion Order – ✅ Maintains
    * Sorted Order – ❌ No
    * Duplicate Capacity – ✅ Allowed
    * Version: JDK 1.0 (Legacy)
    * Package: java.util


    
	✅ Comparison Table

| Feature                   | **ArrayList**     | **LinkedList**     | **Vector**               | **Stack**                     |
| ------------------------- | ----------------- | ------------------ | ------------------------ | ---------------------------   |
| Implements `List`         | ✅ Yes            | ✅ Yes            | ✅ Yes                   | ❌ No (inherits from Vector) |
| Inheritance               | Implements `List` | Implements `List`  | Implements `List`        | Extends `Vector`              |
| Internal data structure   | Dynamic array     | Doubly linked list | Dynamic array            | Dynamic array                |
| Thread-safe               | ❌ No             | ❌ No             | ✅ Yes (synchronized)    | ✅ Yes (synchronized)        |
| Access by index `get(i)`  | ✅ Fast           | ❌ Slow           | ✅ Fast                  | ✅ Fast                      |
| Insert / delete in middle | ❌ Slow           | ✅ Fast           | ❌ Slow                  | ❌ Slow                      |
| Allows duplicates         | ✅ Yes            | ✅ Yes            | ✅ Yes                   | ✅ Yes                       |
| Allows null values        | ✅ Yes            | ✅ Yes            | ✅ Yes                   | ✅ Yes                       |
| Special behavior          | Normal List       | Normal List        | Legacy synchronized list | LIFO (stack behavior)         |
| Modern usage              | ✅ Very common    | ✅ Common         | ❌ Rare (legacy)         | ❌ Rare (legacy)             |



                    🔹 2. Set (Interface)

Name: HashSet

* Parent Interface: Collection → Set
* Secondary Interface: Serializable, Cloneable
* Best Suited Operations : : Searching

    * Properties:

    * Heterogeneous – ✅ Yes
    * Duplicate – ❌ No
    * Null Acceptance – ✅ Yes (only 1 null)
    * Insertion Order – ❌ No
    * Sorted Order – ❌ No
    * Duplicate Capacity – 16
    * Version: JDK 1.2
    * Package: java.util


Name: LinkedHashSet

* Parent Interface: Collection → Set → HashSet
* Secondary Interface: Serializable, Cloneable
* Best Suited Operations : : Cache Based Application

    * Properties:

    * Heterogeneous – ✅ Yes
    * Duplicate – ❌ No
    * Null Acceptance – ✅ Yes (only 1 null)
    * Insertion Order – ✅ Maintains
    * Sorted Order – ❌ No
    * Duplicate Capacity – 16
    * Version: JDK 1.4
    * Package: java.util


Name: TreeSet

    1.stores unique elements
    2.keeps them in sorted order

* Parent Interface: Collection → Set → SortedSet → NavigableSet
* Secondary Interface: Serializable, Cloneable
* Best Suited Operations : : Sorting

* Properties:

    * Heterogeneous – ❌ No (only homogeneous & Comparable objects)
    * Duplicate – ❌ No
    * Null Acceptance – ❌ No (NullPointerException)
    * Insertion Order – ❌ No
    * Sorted Order – ✅ Yes (natural/comparator)
    * Duplicate Capacity – 16  
    * Version: JDK 1.2
    * Package: java.util

    Set<Integer> set = new TreeSet<>();
    set.add(5);
    set.add(1);
    set.add(3);

    System.out.println(set); // [1, 3, 5]



	✅ Comparison Table

| Feature                               | **HashSet**                                   | **LinkedHashSet**                          | **TreeSet**                          |
| ------------------------------------- | --------------------------------------------- | ------------------------------------------ | ------------------------------------ |
| Internal data structure               | Hash table (HashMap based)                    | Hash table + doubly linked list            | Red-Black Tree                       |
| Maintains insertion order             | ❌ No                                         | ✅ Yes                                    | ❌ No                               |
| Sorted order                          | ❌ No                                         | ❌ No                                     | ✅ Yes (natural / comparator order) |
| Allows duplicate elements             | ❌ No                                         | ❌ No                                     | ❌ No                               |
| Allows one `null` element             | ✅ Yes                                        | ✅ Yes                                    | ❌ No                               |
| Performance (add / remove / contains) | ✅ Fast (O(1) average)                        | ✅ Slightly slower than HashSet           | ❌ Slower (O(log n))                |
| How elements are stored               | Based on hash code                            | Based on hash + insertion order            | Based on sorting rules               |
| Can use `Comparator`                  | ❌ No                                         | ❌ No                                     | ✅ Yes                              |
| Thread-safe                           | ❌ No                                         | ❌ No                                     | ❌ No                               |
| Best use case                         | When you only care about uniqueness and speed | When you need uniqueness + insertion order | When you need sorted unique elements |




                    🔹 3. Queue (Interface)

Name: PriorityQueue

* Parent Interface: Collection → Queue
* Secondary Interface: Serializable
* Best Suited Operations : : Priority Based Service

* Properties:
    * Heterogeneous – ❌ No (must be comparable)
    * Duplicate – ✅ Yes
    * Null Acceptance – ❌ No (NullPointerException)
    * Insertion Order – ❌ No
    * Sorted Order – ✅ Yes (priority based)
    * Duplicate Capacity – 11
    * Version: JDK 1.5
    * Package: java.util


Name: ArrayDeque

* Parent Interface: Collection → Queue → Deque
* Secondary Interface: Serializable, Cloneable
* Properties:

  * Heterogeneous – ✅ Yes
  * Duplicate – ✅ Yes
  * Null Acceptance – ❌ No
  * Insertion Order – ✅ Maintains
  * Sorted Order – ❌ No
* Version: JDK 1.6
* Package: java.util


Name: LinkedList (also works as Queue/Deque, already covered under List)


	✅ Comparison Table

| Feature                   | **PriorityQueue**                                                   | **ArrayDeque**                                       |
| ------------------------- | ------------------------------------------------------------------- | ---------------------------------------------------- |
| Internal structure        | Heap (priority heap)                                                | Resizable circular array                             |
| Ordering of elements      | ✅ Based on **priority** (natural order / Comparator)               | ❌ **No sorting** – keeps normal queue order        |
| Processing order          | Element with **highest priority** (smallest by default) comes first | **FIFO** (First In First Out)                        |
| Allows duplicate elements | ✅ Yes                                                              | ✅ Yes                                              |
| Allows `null`             | ❌ No                                                               | ❌ No                                               |
| Thread-safe               | ❌ No                                                               | ❌ No                                               |
| Main purpose              | To process elements by **priority**                                 | To use as a fast **normal queue / deque**            |
| Typical operations        | `offer()`, `poll()`, `peek()` return priority element               | `offer()`, `poll()`, `peek()` follow insertion order |
| Can use Comparator        | ✅ Yes                                                              | ❌ No                                               |
| Performance (poll / add)  | O(log n)                                                            | O(1) (amortized)                                     |
| Can be used as Stack      | ❌ No                                                               | ✅ Yes (`push()` / `pop()`)                         |





                    🔹 4. Map (Interface)

Name: HashMap

* Parent Interface: Map
* Secondary Interface: Serializable, Cloneable
* Best Suited Operations : : Searching

    * Properties:

    * Duplicate Keys – ❌ No
    * Duplicate Values – ✅ Allowed
    * Null Key – ✅ Yes (only 1)
    * Null Values – ✅ Yes (multiple)
    * Insertion Order – ❌ No
    * Sorted Order – ❌ No
    * Duplicate Capacity – 16
    * Version: JDK 1.2
    * Package: java.util


Name: LinkedHashMap

* Parent Interface: Map → HashMap
* Secondary Interface: Serializable, Cloneable
* Best Suited Operations : : Cache Based Application

    * Properties:

    * Duplicate Keys – ❌ No
    * Duplicate Values – ✅ Allowed
    * Null Key – ✅ Yes (1)
    * Null Values – ✅ Yes (multiple)
    * Insertion Order – ✅ Maintains
    * Sorted Order – ❌ No
    * Duplicate Capacity – 16
    * Version: JDK 1.4
    * Package: java.util


Name: Hashtable

* Parent Interface: Map (legacy)
* Secondary Interface: Serializable, Cloneable

    * Properties:

    * Duplicate Keys – ❌ No
    * Duplicate Values – ✅ Allowed
    * Null Key – ❌ No
    * Null Values – ❌ No
    * Insertion Order – ❌ No
    * Sorted Order – ❌ No
    * Version: JDK 1.0
    * Package: java.util


Name: TreeMap

* Parent Interface: Map → SortedMap → NavigableMap
* Secondary Interface: Serializable, Cloneable
* Best Suited Operations : : Sorting Based on Keys

    * Properties:

        * Duplicate Keys – ❌ No
        * Duplicate Values – ✅ Allowed
        * Null Key – ❌ No
        * Null Values – ✅ Yes (multiple)
        * Insertion Order – ❌ No
        * Sorted Order – ✅ Yes (keys sorted)
        * Duplicate Capacity – 16
        * Version: JDK 1.2
        * Package: java.util


	✅ Comparison Table

| Feature                   | **HashMap**                   | **LinkedHashMap**                   | **Hashtable**                     | **TreeMap**                  |
| ------------------------- | ----------------------------  | ----------------------------------  | --------------------------------  | ---------------------------- |
| Ordering of keys          | ❌ No order                   | ✅ Insertion order (by default)    | ❌ No order                       | ✅ Sorted order of keys       |
| Internal structure        | Hash table                    | Hash table + doubly linked list     | Hash table                         | Red-Black Tree               |
| Thread-safe               | ❌ No                         | ❌ No                              | ✅ Yes (all methods synchronized) | ❌ No                         |
| Allows one `null` key     | ✅ Yes                        | ✅ Yes                             | ❌ No                             | ❌ No                         |
| Allows `null` values      | ✅ Yes                        | ✅ Yes                             | ❌ No                             | ✅ Yes                        |
| Performance (get/put)     | ✅ Fast – O(1) average        | ✅ Slightly slower than HashMap    | ❌ Slower (synchronization)       | ❌ Slower – O(log n)          |
| Maintains insertion order | ❌ No                         | ✅ Yes                             | ❌ No                             | ❌ No (sorted, not insertion) |
| Sorted by key             | ❌ No                         | ❌ No                              | ❌ No                             | ✅ Yes                        |
| Can use Comparator        | ❌ No                         | ❌ No                              | ❌ No                             | ✅ Yes (for key ordering)     |
| Legacy class              | ❌ No                         | ❌ No                              | ✅ Yes                            | ❌ No                         |
| Best use case             | Fast lookup, no order needed   | Need fast lookup + insertion order | Thread-safe old code               | Need sorted keys             |


Difference between Stack and Queue?

    Stack follows LIFO, Queue follows FIFO.

    | Stack      | Queue        |
    | ---------- | ------------ |
    | LIFO       | FIFO         |
    | push / pop | offer / poll |

    Example:
            Stack → undo operation
            Queue → task processing


How does BlockingQueue work?

    BlockingQueue is a queue used in producer–consumer scenarios.

        put() → waits if queue is full
        take() → waits if queue is empty

    Example:

        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(2);

        q.put(10);     // blocks if full
        q.take();      // blocks if empty


Which is faster – LinkedList or ArrayList?

    For access (get by index) → ✅ ArrayList is faster
    For insert/delete in middle → ✅ LinkedList is better


What is the difference between ArrayList and LinkedList?

    | Feature                 | ArrayList          | LinkedList         |
    ---------------------------------------------------------------------
    | Data structure          | Dynamic array      | Doubly linked list |
    | Access                  | Fast (index based) | Slow               |
    | Insert/Delete in middle | Slow               | Fast               |


When do you prefer LinkedList and when ArrayList?

    ✅ Prefer ArrayList when:
            Frequent read operations
            Index based access

    ✅ Prefer LinkedList when:
            Frequent insertions and deletions
            No need for random access


What is HashMap in Java?

	Key-value pair storage.
	Allows one null key, multiple null values.
	Not synchronized.


Difference between HashMap and Hashtable?

    | Feature        | HashMap     | HashTable        |
    ------------------------------------------------
    | Thread-safe    | ❌ No      | ✅ Yes         |
    | Performance    | Fast       | Slow             |
    | Null key/value | ✅ Allowed | ❌ Not allowed |
    | Introduced     | Java 1.2   | Legacy (1.0)     |


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


What is fail-fast and fail-safe ?

    Fail-fast:-
        Collections that throw ConcurrentModificationException if modified while iterating.

    Fail-safe:-
        Collections that work on a cloned copy and do not throw ConcurrentModificationException.


What is Iterator and ListIterator?

    Iterator
        Works for all collections
        Unidirectional (forward only)
        Methods: hasNext(), next(), remove()

    ListIterator
        Works for List collections
        Bidirectional (forward and backward)
        Methods: hasNext(), next(), hasPrevious(), previous(), add(), set()


How to remove duplicates from ArrayList?

    Using HashSet:
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);

    Using Java 8 Streams:
        list = list.stream().distinct().collect(Collectors.toList());


Difference between HashSet and TreeSet?

    | Feature        | HashSet     | TreeSet           |
    ----------------------------------------------------
    | Ordering       | ❌ No order  | ✅ Sorted order |
    | Null values    | One allowed | ❌ Not allowed    |
    | Performance    | Faster      | Slower            |
    | Data structure | Hash table  | Red-Black Tree    |

    Set<Integer> hs = new HashSet<>();
    Set<Integer> ts = new TreeSet<>();


Difference between ConcurrentHashMap and SynchronizedMap?

    | Feature        | ConcurrentHashMap    | SynchronizedMap |
    -----------------------------------------------------------
    | Thread safety  | High                 | Low             |
    | Locking        | Segment/Bucket level | Whole map       |
    | Performance    | Fast                 | Slow            |
    | Null key/value | ❌ Not allowed      | Depends on map   |

    Map m1 = new ConcurrentHashMap();
    Map m2 = Collections.synchronizedMap(new HashMap());


Difference between HashMap and IdentityHashMap?

    | Feature        | HashMap         | IdentityHashMap    |
    ---------------------------------------------------------
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


What is hash collision?

    Hash collision happens when two different keys produce the same hash index in a HashMap.


What is the use of CopyOnWriteArrayList ?

    👉 It is a thread-safe list.

    👉 Best when:-
            reads are very frequent
            writes are very less

    Example:-
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    ✔ No ConcurrentModificationException while iterating.






----------------------------------------------------------------------------------------------------------------------------------------------------

                                                ******Spring Boot*****


                                *****Spring Core Questions*****


What is Spring Framework?

    Spring Framework is a Java framework used to build enterprise and web applications easily by managing objects and their dependencies.
    Spring helps us write loosely coupled, clean and maintainable Java applications.

    Example:-
        Instead of creating objects using new keyword:-
            Car car = new Car();

    Spring creates and manages the object for us.


What are the features of Spring Framework?

    Dependency Injection (DI)
    Inversion of Control (IoC)
    Aspect Oriented Programming (AOP)
    Transaction management
    Easy integration with other frameworks
    Lightweight

    Example:-
        Spring injects required objects automatically instead of manual creation.


New features in Spring Framework 4.0 and 5.0?

    ### ✔ Spring 4.0
        * Improved Java 8 support
        * Better REST support
        * Improved Web MVC features

    ### ✔ Spring 5.0
        * Reactive programming support (WebFlux)
        * Supports Java 8+ baseline
        * Supports new HTTP client
        * Functional programming style APIs

    👉 Very important interview point:
            **Spring 5 introduced reactive stack.**


Why is Spring preferred / core benefits of Spring Framework?

    Spring is preferred because:-

        Reduces boilerplate code
        Supports loose coupling
        Easy testing
        Good transaction support
        Modular and flexible

    Example:-
        You can replace a class without changing other classes because of DI.


How to create a stateful bean in Spring?

    By default, Spring beans are **stateless singletons**.

    To make a bean stateful, we usually use:
        👉 `prototype` scope
                    or
        👉 `session` scope (for web apps)

    ### ✔ Prototype bean (new object every time)

        @Component
        @Scope("prototype")
        public class CartBean {
            private List<String> items = new ArrayList<>();
        }
    👉 Each request for this bean gets a new instance.

    ### ✔ Session scoped bean (per user session)

        @Component
        @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
        public class UserSessionBean {
        }
    👉 This is commonly used for stateful web data.

                            
What are different modules available in Spring Framework?

        Core Container
        Spring AOP
        Spring JDBC
        Spring ORM
        Spring Web / MVC
        Spring Test

    Example
        If you build a web application, you mainly use:
            👉 Core + MVC + JDBC / ORM


Explain the bean scopes supported by Spring?

    Spring supports mainly these scopes:

        🔹 singleton (default)

            Only one object per container

            Example
                One service object shared everywhere.

        🔹 prototype

            New object created every time.

            Example
                Each request creates a new object.

        🔹 request (web)

            One object per HTTP request.

        🔹 session (web)

            One object per user session.

        🔹 application

            One object per application.

        Example
            @Scope("prototype")
            @Component
            public class ReportService {
            }


How to define the scope of a bean?

    We define bean scope using @Scope annotaion.

    Example:-
        @Component
        @Scope("prototype")
        public class ReportService {
        }
    This creates a new object every time the bean is requested.


Which is the default scope of bean in Spring? Are they synchronized?

    👉 Default scope is singleton.
    👉 No, Spring singleton beans are NOT thread-safe by default.

    If multiple threads access the same bean, we must handle synchronization ourselves.


Explain Spring Bean Life Cycle?

    Spring bean life cycle steps:-
        1. Bean(Object) created
        2. Dependencies injected  
        3. Initialization method called (`@PostConstruct` or `init-method`)  
        4. Bean is ready to use  
        5. Destruction method called (`@PreDestroy` or `destroy-method`)  

    Example:-
        @PostConstruct
        public void init() {
            System.out.println("Bean initialized");
        }

        @PreDestroy
        public void destroy() {
            System.out.println("Bean destroyed");
        }

        
What is ApplicationContext and how is it created?

    ApplicationContext is the Spring container that:

        creates beans
        manages lifecycle
        injects dependencies

    It is an advanced version of BeanFactory.

    Example (Java configuration)
        ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);

    Spring will:-
        scan configuration
        create beans
        inject dependencies
        keep beans ready to use


Difference between BeanFactory and ApplicationContext?

    | Feature        | BeanFactory   | ApplicationContext         |

    | Initialization | Lazy loading  | Eager loading (by default) |
    | Features       | Basic DI only | Events, AOP, i18n, etc     |
    | Usage          | Rare          | Most commonly used         |


Difference between Tight Coupling and Loose Coupling?

    🔴 Tight Coupling
            One class directly depends on another concrete class.

    Example:-
        PaymentService ps = new PaymentService();

    🟢 Loose Coupling
            Dependency is provided by Spring.

    Example:-
        @Autowired
        PaymentService paymentService;

    👉 Loose coupling is better for maintenance and testing.


What is Inversion Of Control (IOC) ?

    IOC means Spring creates and manages objects instead of us.
    We don’t create objects using new.

        @Autowired
        private UserService userService;


What are the benefits of IoC?

    Benefits are:-
        Loose coupling
        Better maintainability
        Easy testing (mock objects)
        Centralized object management

    Example:-
        You can test one service by mocking its dependency without creating real objects.


What is bean wiring in Spring?

    👉 Bean wiring means connecting one bean with another bean  (Dependency Injection).

    Example:-
        @Autowired
        private OrderService orderService;


What is Spring AOP ?

    👉 AOP = Aspect Oriented Programming

    It is used to handle cross-cutting concerns like:
            ✔ logging
            ✔ security
            ✔ transactions

    Example:-
        @Around("execution(* com.app.service.*.*(..))")

    👉 Logging applied without changing business code.


What are Join Point and Pointcut?

    ▶ Join Point
        A join point is:
            👉 a point where advice can be applied (usually a method execution).

        Example:-
            public void save() {
                // this method is a join point
            }

    ▶ Pointcut
        Pointcut is:
            👉 an expression that selects which methods should be intercepted.

        Example:-
            @Pointcut("execution(* com.app.service.*.*(..))")
            public void serviceMethods() {}
        👉 All methods in service package are selected.


Explain Advice in Spring AOP?

    Advice is:
        👉 the code that runs at a specific point during method execution.

    Types of advice:
        @Before
        @After
        @AfterReturning
        @AfterThrowing
        @Around

    Example:-
        @Before("execution(* com.app.service.*.*(..))")
        public void logBefore() {
            System.out.println("Method started");
        }


How can we inject beans in Spring?

    There are three ways:-
        Constructor Injection
        Setter Injection
        Field Injection

    Example (Constructor Injection):-
        @Autowired
        public OrderService(PaymentService paymentService) {
            this.paymentService = paymentService;
        }


Which is the best way of injecting beans?

    👉 Constructor Injection is the best way.

    Because:-
        Makes dependency mandatory
        Supports immutability
        Easy for testing

    Example:-
        @Service
        public class OrderService {

            private final PaymentService paymentService;

            public OrderService(PaymentService paymentService) {
                this.paymentService = paymentService;
            }
        }


Difference between constructor injection and setter injection?

    ✅ Constructor injection

            Dependency is provided through constructor
            Mandatory dependency

            public Service(Repo repo) {
                this.repo = repo;
            }

    ✅ Setter injection

            Dependency is provided using setter
            Optional dependency

            public void setRepo(Repo repo) {
                this.repo = repo;
            }




                                                            *****Dependency Injection & Bean Management*****


How does Dependency Injection work in Spring Boot?

    Spring Boot uses Spring IoC container.
    Objects are created and injected by the container.

    #Example

        @Service
        public class UserService {
        }

        @RestController
        public class UserController {
            @Autowired
            private UserService userService;
        }
    So, spring injects UserService automatically.


What is @Autowired?

    👉 It is used for dependency injection in Spring.
    Spring automatically injects the object.


What are different types of autowiring?

    Spring supports these autowiring types:-

            byType
            byName
            constructor
            no (default – manual wiring)

    Example:-
        If only one PaymentService bean exists, Spring injects it by type.


Why use @Autowired when we can use new operator?

    Because:-
        "new" creates tight coupling
        Spring cannot manage lifecycle
        Dependencies cannot be injected automatically

    Bad:-
        OrderService service = new OrderService();

    👉 With @Autowired, Spring manages:-
            object creation
            dependency injection
            lifecycle
            testing support
    
    Good:-
        @Autowired
        private OrderService service;


When to use @Component annotation vs @Bean annotation ?

    👉 @Component
        Used on class → auto detected by component scan.

            @Component
            public class EmployeeService { }

    👉 @Bean
        Used on method inside configuration class.

            @Bean
            public ModelMapper modelMapper() {
                return new ModelMapper();
            }

    ✔ Use @Bean mainly when:
        class is from third-party library
        we cannot modify the class


Why do we use @Qualifier annotation ?

    👉 When multiple beans of the same type are available, @Qualifier tells Spring which bean to inject.

    Example:-

        @Component
        class SmsService implements NotificationService {}

        @Component
        class EmailService implements NotificationService {}

        @Autowired
        @Qualifier("emailService")
        private NotificationService service;

    ✔ Without @Qualifier → ambiguity error.


Why do we use @Primary annotation ?

    👉 When multiple beans of the same type are available, @Primary marks one as the default to be injected.

    Example:-

        @Component
        @Primary
        class EmailService implements NotificationService {}

        @Component
        class SmsService implements NotificationService {}

    ✔ EmailService will be injected by default without needing @Qualifier.



                                            *****Spring Boot Core Questions*****


What is Spring Boot and why do we use it?

    Spring Boot is a framework built on top of Spring that helps us create production-ready applications quickly with **minimum configuration**.

    The main problems in traditional Spring were:
        * Too much XML / configuration
        * Manual dependency management
        * External server configuration
        * Complex project setup

    Advantages of Spring Boot applications
        * No XML configuration
        * Auto configuration
        * Embedded servers
        * Opinionated defaults
        * Production-ready features (actuator)
        * Faster development

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


What is the main difference between Spring and Spring Boot?

    | Spring                     | Spring Boot               |
    ----------------------------------------------------------
    | Needs manual configuration | Auto configuration        |
    | XML / Java config needed   | Almost zero configuration |
    | External server needed     | Embedded server           |
    | More setup time            | Faster development        |

    Spring Boot = Spring + Auto configuration + Embedded server + Starters


What is Spring vs Spring MVC vs Spring Boot?

    🔹 Spring
            Core framework
            Provides DI, IoC, AOP, transactions
            Base for everything

    🔹 Spring MVC
            Web layer framework
            Used to build web applications
            Handles controllers, views and requests

        Example:-
            @Controller
            public class UserController {
            }

    🔹 Spring Boot
            Built on top of Spring
            Removes configuration burden
            Auto-configuration and embedded server


How does a Spring Boot application bootstrap?

    👉 Bootstrapping happens using:
            SpringApplication.run(Application.class, args);

    Internally it:-
            ✔ creates ApplicationContext
            ✔ starts embedded server
            ✔ loads beans
            ✔ applies auto-configuration


What is @SpringBootApplication and what happens internally?

    @SpringBootApplication is a combination of **three annotations**:

        @Configuration
        @EnableAutoConfiguration
        @ComponentScan

    #1️⃣ @Configuration
            defines beans using Java config.

    #2️⃣ @EnableAutoConfiguration
            tells Spring Boot to auto-configure beans.
            Automatically configures beans based on:
                * classpath
                * dependencies
                * properties

    #3️⃣ @ComponentScan
            Scans components in the package and sub-packages for @Component, @Service, @Repository, @Controller.

    #Example:-

        If spring-boot-starter-web is present, Spring Boot will automatically:
            * create DispatcherServlet
            * configure Tomcat
            * setup MVC beans


Difference between @SpringBootApplication and @EnableAutoConfiguration?

    | Feature  | @SpringBootApplication                | @EnableAutoConfiguration        |

    | Purpose  | Main boot annotation                  | Enables auto configuration only |
    | Includes | Auto config + component scan + config | Only auto configuration         |

    @SpringBootApplication internally uses @EnableAutoConfiguration.


What is Auto-Configuration in Spring Boot?

        Spring Boot automatically creates required beans based on:
            * dependencies
            * environment
            * properties

    Internally it uses - @EnableAutoConfiguration

    Example

        If you add this dependency:
            spring-boot-starter-data-jpa

        Spring Boot automatically configures:
            * EntityManagerFactory
            * DataSource
            * TransactionManager

    We don’t define them manually.


How does Spring Boot decide which beans to create?

    Spring Boot uses **conditional annotations** to decide which beans to create.

    Important ones:
        @ConditionalOnClass
        @ConditionalOnMissingBean
        @ConditionalOnProperty

    #Example
            @ConditionalOnClass(DataSource.class)

        Means:
            This bean is created only if DataSource class is present.


What are Spring Boot starters?

    Starters are dependency bundles.
    They group multiple dependencies required for a feature.

    #Example
        spring-boot-starter-web

    Contains:
        * Spring MVC
        * Jackson
        * Validation
        * Embedded Tomcat


Examples of commonly used Spring Boot starters?

    ✔ spring-boot-starter-web
    ✔ spring-boot-starter-data-jpa
    ✔ spring-boot-starter-security
    ✔ spring-boot-starter-test
    ✔ spring-boot-starter-actuator


What are Spring Boot components?

    ✔ Starter dependencies
    ✔ Auto-configuration
    ✔ Embedded server (Tomcat)
    ✔ Spring Boot CLI(Command Line Interface) but optional
    ✔ Actuator

    In real projects, mainly:
        starter + auto configuration + embedded server


How to disable a specific auto-configuration class ?

    👉 Using exclude in @SpringBootApplication.

    Example:-
        @SpringBootApplication(
            exclude = DataSourceAutoConfiguration.class
        )
    ✔ That auto-configuration will not be applied.


Why do we need spring-boot-maven-plugin?

    It is used to:
        👉 create an executable Spring Boot jar
        👉 package all dependencies together
        👉 run the app using Maven

    Example:-
        mvn spring-boot:run
    Without this plugin, you cannot easily create a bootable JAR.


How do you deploy Spring Boot application?

    Spring Boot applications can be deployed as standalone JARs or WARs.

    Steps:-
        1. Build the application using Maven or Gradle
        2. Run the JAR file using java -jar app.jar
    
    It includes an embedded server, so no external server configuration is needed.


What is Embedded server in Spring Boot?

    We do not deploy WAR files manually to external servers.

    Spring Boot provides built-in servers like:
        * Tomcat (default)
        * Jetty
        * Undertow

    #Example
        When you run:
            java -jar app.jar

    Tomcat runs inside our application.


Employee Service class will be annotated with which annotation ?

    ✅ Use @Service annotation.

    Example:
        @Service
        public class EmployeeService {
        }

    👉 @Service is used for business logic layer.


Spring Boot Annotations — List of 50?

    @SpringBootApplication
    @Component, @Service, @Repository, @Controller, @RestController
    @Autowired, @Qualifier, @Primary
    @Value
    @Bean, @Configuration
    @EnableAutoConfiguration
    @RequestMapping, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping
    @PathVariable, @RequestParam, @RequestBody, @ResponseBody
    @Valid, @Validated
    @Transactional
    @Entity, @Table, @Id, @Column, @GeneratedValue
    @OneToMany, @ManyToOne, @ManyToMany, @OneToOne
    @JoinColumn, @JoinTable
    @Cacheable, @CachePut, @CacheEvict
    @Scheduled
    @Async
    @RestControllerAdvice, @ExceptionHandler
    @CrossOrigin
    @Profile
    @EnableScheduling
    @EnableAsync
    @SpringBootTest
    @MockBean


Difference between @Component, @Service, @Repository

    All three are stereotype annotations.
    But their purposes differ.

    | Annotation    | Used for                 |

    | `@Component`  | Generic spring bean      |
    | `@Service`    | Service / business logic |
    | `@Repository` | DAO / database layer     |


How do you handle file upload in Spring Boot?

    We use MultipartFile to handle file uploads.

    Example:-
        @PostMapping("/upload")
        public String upload(@RequestParam MultipartFile file) {
            return file.getOriginalFilename();
        }


How do you consume REST API from Spring Boot?

    We use RestTemplate or WebClient to consume REST APIs.

    #Example
        restTemplate.getForObject(url, String.class);


How is security managed in your application ?

    * Using Spring Security
    * JWT based authentication
    * Role based authorization
    * Endpoints protected using security configuration


What are the Bean scopes available in Spring Boot ?

    singleton (default)
    prototype
    request (web)
    session (web)
    application (web)
    websocket


How to handle cross-cutting concerns in Spring Boot?

    We use **Aspect-Oriented Programming (AOP)**.

    AOP allows us to separate cross-cutting concerns like:
        * logging
        * security
        * transactions

    Example:-
        @Before("execution(* com.app.service.*.*(..))")
        public void log() {
            System.out.println("Before method call");
        }
    👉 This avoids duplicate code in every class.


How to create and use custom annotations in Spring Boot?

    ✔ Yes, we can create and use our own annotations.

    Example:-
        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.METHOD)
        public @interface MyLog {
        }


In Spring Boot, how would you optimize data access ?

    ✔ use pagination
    ✔ proper indexes in DB
    ✔ lazy / fetch joins carefully
    ✔ projections instead of full entities
    ✔ caching (if needed)

    Example:-
        Page<Employee> page = repo.findAll(PageRequest.of(0,10));


Difference between XML configuration and Annotation configuration?

    | Feature      | XML Configuration | Annotation Configuration |

    | Style        | External XML file | Inside Java code         |
    | Readability  | More verbose      | Cleaner and simple       |
    | Modern usage | Rare now          | Mostly used today        |

    XML
        <bean id="orderService" class="com.app.OrderService"/>

    Annotation
        @Service
        public class OrderService { }


What do you mean by Spring Batch?

    Spring Batch is a framework used to build batch processing applications
    (like large file processing, bulk database operations, scheduled jobs).

    👉 It is mainly used for offline, bulk and long-running jobs.

    Example use case:-
        Read 10 lakh records from a file → process → store into database.


What is the main use of the Spring Batch framework?

    large file processing, bulk database operations, scheduled jobs
    ETL jobs (Extract – Transform – Load)
    repeatable jobs
    Fault-tolerant batch processing

    Example:-
        👉 Bank statement generation for all customers at night.


How is an event handled in Spring?

    Spring uses:
        👉 Application events and listeners.

    Example:-
        Event publisher
            applicationEventPublisher.publishEvent(new MyEvent(this));

    Listener
        @EventListener
        public void handle(MyEvent event) {
            System.out.println("Event received");
        }
    👉 When event is published, the listener method is called automatically.


How to implement caching in Spring Boot?

    Steps:
        1. Enable caching using @EnableCaching annotation at configuration class
        2. Use @Cacheable annotation on methods

    Example:-
        @EnableCaching
        @SpringBootApplication
        public class App { }

        @Cacheable("users")
        public User getUser(Long id) {
            return repository.findById(id).get();
        }
    👉 Next call with same id is returned from cache.


How to implement messaging in Spring Boot?

    Messaging is used for asynchronous communication between services.

    Common approach:
        We use message broker like Kafka / RabbitMQ.

    Simple idea in Spring:
        👉 producer sends message
        👉 consumer listens and processes message

    Example (listener method):-
        @KafkaListener(topics = "order-topic")
        public void consume(String msg) {
            System.out.println(msg);
        }

   
Explain the purpose of Spring WebFlux?

    Spring WebFlux is a reactive and non-blocking web framework.

    It is used when:
        high number of concurrent users
        real-time applications
        streaming applications

    👉 It uses event-loop and non-blocking I/O instead of one thread per request.

    Simple difference idea

        Spring MVC → blocking, thread per request
        WebFlux → non-blocking, reactive

    Example
        @GetMapping("/data")
        public Mono<String> getData() {
            return Mono.just("Hello");
        }


How to implement reactive programming in a Spring Boot application?

    👉 Reactive programming is **non-blocking** and suitable for high-concurrency apps.
    We use **Spring WebFlux** and reactive types.

    Main classes:
        * `Mono<T>` → 0 or 1 value only allowed
        * `Flux<T>` → multiple values allowed

    Example:-
        @GetMapping("/hello")
        public Mono<String> hello() {
            return Mono.just("Hello");
        }


How to implement real-time communication in Spring Boot?

    Mainly by using:
        👉 WebSocket or Server-Sent Events (SSE)

    **Example (WebSocket concept)**
        Clients stay connected and receive messages instantly from server.

    👉 Used in:
        * chat apps
        * live notifications
        * dashboards


How to handle WebSocket communication in Spring Boot?

    We use Spring WebSocket support with STOMP.

    Example:-
        @Configuration
        @EnableWebSocketMessageBroker
        public class WebSocketConfig
                implements WebSocketMessageBrokerConfigurer {
        }

    Controller:
        @MessageMapping("/chat")
        @SendTo("/topic/messages")
        public String send(String msg) {
            return msg;
        }
    👉 Clients subscribe to `/topic/messages` and receive messages in real time.


What are the latest specifications supported by Spring Boot?

    Latest Spring Boot versions support:
            Jakarta EE (instead of old Java EE)
            JPA (Jakarta Persistence API)
            Servlet (Jakarta Servlet)
            Java 17+


Best practices for optimizing Spring Boot applications?

    Main practical points:
        * Use proper logging level (avoid DEBUG in prod)
        * Use connection pool (HikariCP – default)
        * Use caching where needed
        * Avoid loading unnecessary beans
        * Use pagination for large data
        * Use async for long-running tasks

    👉 Keep startup and memory usage low.


How do you configure logging in Spring Boot?

    Spring Boot uses Logback by default.

    #Example
        properties file:
            logging.level.org.springframework=INFO


How to implement logging in Spring Boot?

    We use SLF4J with Logback by default.
    
    Example:-
        private static final Logger log =  LoggerFactory.getLogger(UserService.class);

        public void save() {
            log.info("Saving user");
        }

    👉 Logging level is configured in:-
            properties file:
                logging.level.root=INFO
                


                                                    *****Spring Boot Configuration Questions*****


What is application.properties / application.yml?

    These files are used to configure application level settings such as:
        * database
        * ports
        * logging
        * profiles

    #Example
        In properties files:-
            spring.datasource.url=jdbc:mysql://localhost:3306/test
            spring.datasource.username=root
            spring.datasource.password=1234


How can we read properties from a properties file?

    We can read properties using:
        * @Value annotation
        * @ConfigurationProperties

    @Value("${app.name}")
    private String appName;

    This value comes from application.properties.


How to manage application properties in Spring Boot?

    We manage them using:
        * application.properties
        * application.yml
        * profile-based property files

    Examples
        In properties file:
            server.port=8081
            app.name=MyApp

        Access in code:
            @Value("${app.name}")
            private String appName;


What is the use of @Value annotation?

    @Value is used to inject values from property files or expressions.

    Example:-
        @Value("${server.port}")
        private int port;


What are Profiles in Spring Boot?

    Profiles are used to load environment-specific configurations.

    Typical environments:
        * dev
        * test
        * prod

    #Example:-
        Files:
            application-dev.properties
            application-prod.properties

        Activate profile:
            properties
                spring.profiles.active=dev


How do you externalize configuration in Spring Boot?

    Using:
        * properties/yml
        * environment variables
        * command line args

    #Example
        @Value("${app.name}")
        private String appName;


What is CommandLineRunner?

    It runs logic after application startup.

    #Example
        @Bean
        CommandLineRunner run() {
            return args -> {
                System.out.println("Started");
            };
        }


How do you change default server port?

    In `application.properties`:

            server.port=8081



                                            *****Spring Boot Web / REST API Questions*****

Explain Spring Boot request flow?

    1. Client sends request
    2. Embedded server receives
    3. DispatcherServlet handles request
    4. Finds matching controller
    5. Calls method
    6. Converts return value to JSON using HttpMessageConverters


How can I create a Spring REST application from scratch ?

        1. Create a Spring Boot project using Spring Initializr
        2. Add dependencies: spring-boot-starter-web
        3. Create a REST controller with @RestController annotation
        4. Define request mappings using the annotations @GetMapping, @PostMapping, etc.
        5. Run the application and test the endpoints

    Example:-
        @RestController
        @RequestMapping("/api")
        public class EmployeeController {

            @GetMapping("/hello")
            public String hello() {
                return "Hello";
            }
        }


How do you create RESTful APIs using Spring Boot?

    We use:-
        * @RestController
        * Mapping annotations

    **Example**

        @RestController
        @RequestMapping("/users")
        public class UserController {

            @GetMapping("/{id}")
            public User getUser(@PathVariable Long id) {
                return service.getUser(id);
            }
        }
    👉 `@RestController` automatically returns JSON.


What is @RestController and how is it different from @Controller?

    @RestController =  @Controller + @ResponseBody
    It returns JSON directly.

    #Example:-
            @RestController
            public class TestController {

                @GetMapping("/hello")
                public String test() {
                    return "Hello";
                }
            }
    No view resolver is involved.


What is the difference between @Controller and @RestController?

    | @Controller        | @RestController              |

    | Used for MVC views | Used for REST APIs           |
    | Returns view       | Returns JSON / response body |


What is the role of @RestController and @RequestMapping?

    👉 @RestController
            Used to create REST APIs
            Returns JSON / response body

    👉 @RequestMapping
            Maps URL to a controller / method

    Example:-
        @RestController
        @RequestMapping("/api")
        public class TestController {

            @GetMapping("/hello")
            public String hello() {
                return "Hi";
            }
        }


What is the difference between @RequestMapping and @GetMapping?

    | Feature  | @RequestMapping  | @GetMapping      |

    | Supports | All HTTP methods | Only GET         |
    | Style    | Generic mapping  | Shortcut for GET |


Role of DispatcherServlet in Spring MVC?

    `DispatcherServlet` is the **frontend controller**.
    👉 All HTTP requests first come to `DispatcherServlet`.

    Flow:
        Client → DispatcherServlet → Controller → Service → Response

    👉 It decides which controller method should handle the request.


What is the difference between @PathVariable and @RequestParam?

    | @PathVariable       | @RequestParam        |

    | URL path variable   | Query parameter      |
    | /user/10            | /user?id=10          |
    | Required by default | Optional             |


Do you know the use of @ModelAttribute?

    @ModelAttribute is used to:
        👉 bind form data or request parameters to a model object.

    Example:-
        @PostMapping("/save")
        public String saveUser(@ModelAttribute User user) {
            service.save(user);
            return "success";
        }
    👉 All form fields are automatically mapped to User.


What is ResponseEntity and its benefit ?

    ResponseEntity represents the full HTTP response.

    It contains:-
        body
        status code
        headers

    Example:-
        return ResponseEntity.ok(employee);




                                                        *****REST API & HTTP Concepts*****


REST API best practices?

    Use correct HTTP methods like GET, POST, PUT, DELETE
    Use proper HTTP status codes like 200, 201, 400, 404, 500
    Use nouns in URLs like /users, not verbs like /getUsers
    Version your APIs like /api/v1/users
    Use proper request / response formats (JSON)
    Use pagination and filtering for large data
    Secure APIs (JWT / OAuth)

    GET    /api/users/10
    POST   /api/users


Objectives of GET, POST, PUT, DELETE methods?

    | Method | Purpose     |

    | GET    | Read data   |
    | POST   | Create data |
    | PUT    | Update data |
    | DELETE | Delete data |

    GET    /users/1   -> fetch user
    POST   /users     -> create user
    PUT    /users/1   -> update user
    DELETE /users/1   -> delete user

        
If insert can be done using PUT, why do we have POST?

    ✅ POST
        POST is mainly for creation
        Not idempotent
    
    ✅ PUT
        PUT is mainly for update/replace.
        Idempotent

    POST   /users   → create user
    PUT    /users/1 → update user 1


Can we fetch data using POST?

    Data should be fetched using GET, but POST can be used when request body is complex or secure filters are required.

    But ❌ it is not recommended in REST.


Difference between PUT and PATCH methods?

    PUT updates entire resource.
    PATCH updates only partial fields.


Can we use GET method to create resources ?

    ❌ No (not recommended).
    GET should only be used for reading data.

    Creating resource using GET breaks:-
        REST standards
        caching behavior
        security rules

    ✔ Resource creation must be done using POST.

    Correct way:
        POST /users


Explain HTTP status codes?

    - 1xx: Informational (100 Continue, 101 Switching Protocols)
    - 2xx: Success (200 OK, 201 Created)
    - 3xx: Redirect (301 Moved Permanently, 302 Found)
    - 4xx: Client errors (404 Not Found, 400 Bad Request)
    - 5xx: Server errors (500 Internal Server Error)


If REST API cannot find the requested resource, what should you return?

    👉 Return HTTP 404 – Not Found

    Example:-
        return ResponseEntity.notFound().build();


                                                                *****Spring Boot Monitoring & Actuator*****


What is Spring Boot Actuator?

    Spring Boot Actuator provides production-ready monitoring and management endpoints.
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


How to monitor and manage a Spring Boot application?

    We use:-
        👉 Spring Boot Actuator

    It provides endpoints like:-
            /actuator/health
            /actuator/metrics
            /actuator/info

    👉 Used for health check and monitoring in production.


How to monitor and troubleshoot performance issues in Spring Boot?

    We use:
        👉 Spring Boot Actuator

    Important endpoints:
            * /actuator/metrics
            * /actuator/health
            * /actuator/threaddump
            * /actuator/heapdump

    Also:
        * logs
        * application metrics
        * slow query logs

    👉 Helps to find memory, thread and performance problems.


How can you customize Spring Boot Actuator endpoints?

    Main ways:

        Expose specific endpoints
            management.endpoints.web.exposure.include=health,info,metrics

        ✔ Change base path
            management.endpoints.web.base-path=/manage

        Access:
            /manage/health

        ✔ Enable or disable endpoint
            management.endpoint.health.enabled=true


                                                        *****Spring Data JPA / Hibernate Questions*****


What is JPA in Spring Boot?

    JPA stands for Java Persistence API.
    JPA is a specification for ORM (Object-Relational Mapping).
    Spring Boot provides integration through Spring Data JPA.

    #Example

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


How do you use JPA in Spring Boot?

    We use Spring Data JPA to perform database operations without writing SQL.

    Steps:-
        Add JPA dependency
        Create Entity class
        Create Repository interface

    #Example

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


Difference between JPA and Hibernate in Spring Boot?

    JPA is only a specification for ORM (Object-Relational Mapping).
    Hibernate is an implementation of JPA(Java Persistence API).
    Spring Boot uses Hibernate internally when we use Spring Data JPA.


How does Spring Data JPA work with Hibernate for ORM ?

    👉 Spring Data JPA provides repository abstraction.

    👉 Hibernate is the JPA implementation which does:-
            SQL generation
            mapping
            persistence

    Flow:-
        Controller → Repository → JPA → Hibernate → Database

    Example:
        employeeRepository.save(emp);


Advantages of Hibernate over JDBC

    No need to write SQL for most operations
    Automatic mapping between class and table
    Database independent
    Built-in caching
    Transaction management


What is Session in Hibernate? Is it thread-safe?

    Session represents a connection between application and database.

    It is used to:-
        fetch entities
        save
        update
        delete

    👉 Is it thread safe?
        ❌ No.


Difference between Hibernate first level cache and second level cache?

    | First Level Cache  | Second Level Cache           |

    | Session level      | SessionFactory level         |
    | Enabled by default | Not enabled by default       |
    | One session only   | Shared across sessions       |
    | Faster             | Improves overall performance |


How does Spring Boot support data access?

    Spring Boot supports data access using:-
            JDBC
            JPA / Hibernate
            Spring Data repositories

    Main benefit:
        👉 Auto-configuration + repository abstraction

    Example (JPA Repository)

        public interface UserRepository
            extends JpaRepository<User, Long> {
        }

    Without writing implementation code, Spring Boot automatically provides:-
        save()
        findById()
        findAll()
        delete()


What is JpaRepository and why do we use it?

    JpaRepository provides ready-made CRUD and paging methods.

    #Example
        employeeRepository.findAll();
        employeeRepository.save(emp);
        employeeRepository.findById(1L);

    No implementation class is required.


Difference between findById() and getOne() (or getReferenceById())

    | findById()                | getOne() / getReferenceById() |

    | Hits database immediately | Returns proxy                 |
    | Returns actual entity     | Loads data only when used     |
    | Returns Optional          | No Optional                   |

    Example
        userRepository.findById(1L);
        userRepository.getReferenceById(1L);


What is one-to-one mapping and how to set it using JPA?

    One-to-one mapping means one record is associated with exactly one record.

    @Entity
    class User {
        @Id
        private Long id;

        @OneToOne
        @JoinColumn(name = "profile_id")
        private Profile profile;
    }

    @Entity
    class Profile {
        @Id
        private Long id;
    }


What is Lazy loading and Eager loading in JPA?

    * Lazy → Related objects are loaded only when we access them, not immediately.
    
    Example
        @ManyToOne(fetch = FetchType.LAZY)
        private Department dept;
    
    * Eager → data loaded immediately

    Example
        @ManyToOne(fetch = FetchType.EAGER)
        private Department dept;


How do you implement pagination and sorting ?

    Spring Data provides Pageable interface for pagination and sorting.

    #Example
        Pageable p = PageRequest.of(0, 10);
        employeeRepository.findAll(p);


How do you write custom query in Spring Data JPA?

    We can write custom queries using:
        * method naming convention
        * @Query annotation

    #Example
        List<Employee> findByName(String name);

            Or:

        @Query("select e from Employee e where e.name = :name")
        List<Employee> getByName(String name);


What is DTO and why is it used in Spring Boot?

    DTO stands for Data Transfer Object and is used to transfer data without exposing entity directly.

    Benefits:
        * security
        * performance
        * API stability

    #Example
        public class EmployeeDTO {
            private String name;
        }


What is ModelMapper or mapping strategy?

    It converts entity to DTO and vice versa.

    Example logic:
        dto.setName(emp.getName());


Difference between JDBC and Spring JDBC?

    | JDBC                       | Spring JDBC                 |

    | More boilerplate code      | Less boilerplate            |
    | Manual connection handling | Automatic resource handling |
    | More error-prone           | Cleaner and safer           |


Difference between Entity object and Value object?

    Entity Object
        Has its own identity (id)
        Represents a table row

    Value Object
        No identity
        Defined only by its values
        Usually immutable


In DB we use UNION / INTERSECTION. How to apply the same in JPA ?

    👉 In JPA, there is no direct standard JPQL support for UNION / INTERSECT.

    You usually do:
        ✅ Use native query

    Example (Native SQL in JPA):
        @Query(value = "select name from emp1 union select name from emp2", nativeQuery = true)
        List<String> getNames();

    👉 For intersection, also use native query.




                                                                        *****Transactions & Database*****


What is @Transactional and why is it important?

    @Transactional manages database transactions automatically.

    #Example
        @Transactional
        public void createOrder() {
            saveOrder();
            savePayment();
        }

    If payment save fails, order save is rolled back.


How does @Transactional work internally?

    Internally, Spring uses AOP (proxy mechanism) to manage transactions.

    Flow:-
        A proxy is created around your bean
        Before the method runs → transaction starts
        Method executes
        If success → commit
        If runtime exception → rollback

    👉 The real method is wrapped by a transaction interceptor.

    Example
        @Transactional
        public void saveOrder() {
            repo.save(order);
        }

    When saveOrder() is called → Spring proxy opens and closes the transaction automatically.


What is Transaction Management in Spring? Explain different types.?

    Transaction management ensures:
        👉 data is either fully saved or fully rolled back.

    Two types:-
        ✔ Programmatic transaction
            We manually control transactions in code.

        ✔ Declarative transaction (mostly used)
            We use @Transactional annotation.

    Example:-
        @Transactional
        public void saveOrder() {
            repo.save(order);
        }


How do you handle database transactions in Spring Boot?

    We use @Transactional annotation at service layer.

    Example:-
        @Service
        public class PaymentService {
            @Transactional
            public void pay() {
                debit();
                credit();
            }
        }
        👉 If any method fails → rollback happens automatically.


How to call a stored procedure from Java using Spring?

    We can use:
        👉 JdbcTemplate
        or
        👉 JPA @Procedure

    Example using JPA:-
        public interface UserRepository extends JpaRepository<User, Long> {
            @Procedure("get_users_count")
            int getUsersCount();
        }
    👉 This calls the stored procedure get_users_count.


What is JdbcTemplate and how to use it?

    JdbcTemplate is a Spring helper class that:
        👉 simplifies JDBC code
        👉 removes boilerplate (connection, statement, closing, etc.)

    Example:-
        @Autowired
        private JdbcTemplate jdbcTemplate;

        public List<User> getUsers() {
            return jdbcTemplate.query(
                "select * from users",
                (rs, rowNum) -> new User(rs.getLong("id"), rs.getString("name"))
            );
        }


What is the difference between Statement and PreparedStatement in JDBC?

    | Statement                 | PreparedStatement      |

    | SQL is created every time | SQL is precompiled     |
    | Not secure                | Prevents SQL Injection |
    | Slower                    | Faster                 |


                                                            *****Exception Handling & Validation*****


What are exceptions using Springboot?

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
    👉 This handles exceptions for all controllers.
  

Usage of @ControllerAdvice in Spring MVC ?

    @ControllerAdvice is used to handle exceptions globally across all controllers.

    Example:-
        @ControllerAdvice
        public class GlobalExceptionHandler {

            @ExceptionHandler(Exception.class)
            public ResponseEntity<?> handleAllExceptions(Exception e) {
                return ResponseEntity.status(500).body(e.getMessage());
            }
        }
    This will catch exceptions from any controller and return a 500 response.


Usage of @ExceptionHandler in Spring MVC ?

    @ExceptionHandler is used to handle exceptions thrown from controller methods.

    Example:-
            @Controller
            public class UserController {
                @GetMapping("/user")
                public String getUser() {
                    throw new RuntimeException("Error");
                }

                @ExceptionHandler(RuntimeException.class)
                public String handleError() {
                    return "error";
                }
            }
    Whenever RuntimeException occurs in this controller, handleError() is executed.


What is validation in Spring Boot?

    Spring Boot integrates Bean Validation.

    #Example:-

    Entity:
        @NotNull
        @Size(min=3)
        private String name;

    Controller:
        public ResponseEntity save(@Valid @RequestBody User user)




                                                    *****Performance, Async & Scheduling*****


What is asynchronous processing in Spring Boot?

    It allows method to run in separate thread.

    Example:-
        @Async
        public void sendMail() { }


How to handle long-running tasks in Spring Boot?

    We use asynchronous processing with @Async annotation.

    Example:-
        @Async
        public void processReport() {
            // long running job
        }

    Enable it:
        @EnableAsync
        @SpringBootApplication

    👉 The request thread is not blocked.


How do you implement asynchronous processing in Spring Boot?

    1. Enable async support using @EnableAsync annotation on configuration class   
            @EnableAsync
            @SpringBootApplication
            public class MyApp {
            }        
        
    2. Use @Async annotation on method
            @Async
            public void sendMail() {
                System.out.println("Running in background");
            }


Explain the usage of the @Async annotation?

    @Async makes a method run in a separate thread.
    The caller will not wait for the method to finish.

    Example:-
        @Async
        public void generateReport() {
            // long running task
        }

    👉 Used for:-
            sending emails
            background jobs
            long processing tasks


How to implement scheduling in Spring Boot?

    Steps:
        1. Enable scheduling using @EnableScheduling annotation at configuration class
        2. Use `@Scheduled` annotation on methods

    Example:-
        @EnableScheduling
        @SpringBootApplication
        public class App { }

        @Scheduled(fixedRate = 60000)
        public void runJob() {
            System.out.println("Job running every minute");
        }





                                                            *****Spring Security Questions*****


What is Spring Security?

    Spring Security is a framework that provides:
            👉 Authentication
            👉 Authorization
            👉 Protection against common attacks

    It secures:
        * REST APIs
        * web applications
        * microservices


How do you secure a Spring Boot application?

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


How do you implement security in a Spring Boot application?

    Steps:
        1. Add Spring Security dependency - spring-boot-starter-security
        2. Configure security filter chain

    Example:-
        @Bean
        SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

            http
            .authorizeHttpRequests(auth ->
                    auth.anyRequest().authenticated())
            .httpBasic();

            return http.build();

                
How does Spring Boot support OAuth 2.0?

    Spring Boot provides built-in support using Spring Security OAuth2.

    It supports:
        * OAuth2 login
        * OAuth2 resource server
        * JWT token validation


Explain the concept of Spring Security OAuth?

    Spring Security OAuth helps to implement OAuth2 based authentication and authorization.

    It supports:
        * authorization server
        * resource server
        * token validation

    👉 It is used when authentication is handled by a central identity server.


How do you configure Basic Authentication in Spring Security?

    Example:-
        @Bean
        SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
            .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
            .httpBasic();

            return http.build();
        }
    👉 Username and password are sent in HTTP header.


What is CSRF protection and how is it implemented?

    CSRF = Cross Site Request Forgery.
    It prevents malicious websites from performing actions on behalf of a user.

    👉 Spring Security enables CSRF protection by default for web apps.
    👉 In browser-based apps, Spring uses a CSRF token internally.

    **Example (disable for REST APIs)**
        http.csrf(csrf -> csrf.disable());


What is CORS and how do you handle it in Spring Boot?

    CORS stands for Cross-Origin Resource Sharing and it allows cross-domain requests using @crossOrigin annotation.

    #Example
        @CrossOrigin(origins="http://localhost:3000")


What is JWT and how does JWT authentication work in Spring Boot?

    JWT (JSON Web Token) is a stateless authentication token used to securely transmit user information between client and server.

    It contains three parts:
        Header
        Payload
        Signature

    Example:
        Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...

    Authentication Flow:
        1. User logs in 
        2. Server generates token 
        3. Client sends token in every request 
        4. Server validates JWT

    Spring Boot Implementation (concept):
        Configure Spring Security
        Add JWT authentication filter
        Validate token in SecurityFilterChain

    👉 No session is stored on the server (stateless authentication).


Do you know what is JWT 2.0 and JWT token?

    👉 There is no standard called JWT 2.0.

        There is:
            OAuth 2.0 (authorization framework)
            JWT (token format)

        JWT Token
            JWT is a compact token used to securely transfer user information.

            It contains:-
                Header
                Payload
                Signature




                                                                *****Testing in Spring Boot*****


Common Spring Boot test annotations?

        @Test
        @SpringBootTest
        @MockBean
        @AutoConfigureMockMvc
        @WebMvcTest
        @DataJpaTest

        Example:-
            @SpringBootTest
            class UserServiceTest {
            }


How do you write unit tests for Spring Boot applications?

    We use:
        JUnit
        @SpringbootTest annotations
        Mockito

    Example – service test
    ----------------------
        @SpringBootTest
        class UserServiceTest {
            @Autowired
            private UserService userService;

            @Test
            void testUser() {
                userService.getUsers();
            }
        }

    Example – controller test
    -------------------------
        @WebMvcTest(UserController.class)
        class UserControllerTest {
        }

    For mocking
    -----------
        @MockBean
        private UserRepository userRepository;


Difference between @Mock and @MockBean?

    | Feature                 | @Mock      | @MockBean                |
    -------------------------------------------------------------------
    | From                    | Mockito    | Spring Boot              |
    | Added to Spring context | ❌ No      | ✅ Yes                  |
    | Used in                 | Unit tests | Spring integration tests |


How are mock frameworks like Mockito / EasyMock used in Spring Boot?

    They are used to **mock dependencies** during testing so that we test only one layer.
    In Spring Boot we mostly use **Mockito with `@MockBean`**.

    Example:-
        @SpringBootTest
        class UserServiceTest {
            @MockBean
            private UserRepository userRepository;
            @Autowired
            private UserService userService;
        }
    👉 The real `UserRepository` is replaced with a mock.


Difference between @SpringBootTest and @WebMvcTest?

    @SpringBootTest → loads entire application
    @WebMvcTest → loads only controller layer


How do you perform (or write) integration testing in Spring Boot?

    Integration testing means testing multiple layers together such as:
            Controller
            Service
            Repository
            Database
            Configuration

    In Spring Boot, integration testing is commonly done using:
            @SpringBootTest
            @AutoConfigureMockMvc (for API testing)
            Real Spring Application Context
            Optional test database

    Example:-
            @SpringBootTest
            class UserIntegrationTest {
                @Autowired
                private UserService userService;

                @Test
                void testSaveUser() {
                    userService.saveUser(new User("Mohan"));
                }
            }
    👉 @SpringBootTest loads the entire Spring Boot application context, allowing testing of multiple components together.


When and where do you use @Transactional in testing?

    👉 We want the database changes to be rolled back after each test.

    Example:-
            @SpringBootTest
            @Transactional
            class UserRepositoryTest {
                @Test
                void testSave() {
                    repository.save(user);
                }
            }
    👉 After the test finishes, Spring automatically rolls back the data.




            

--------------------------------------------------------------------------------------------------------------------------------------------------



                                            *****Microservices (Java – Spring Boot)*****


### 1. What are Microservices?

    **Answer:**
    Microservices architecture is a design approach where an application is broken into **small, independent, loosely-coupled services**, each responsible for a single business capability.
    Each service:

    * Has its **own database**
    * Can be **deployed independently**
    * Communicates via **REST / Messaging**

---

### 2. Difference between Monolithic and Microservices

    | Monolithic         | Microservices                 |
    | ------------------ | ----------------------------- |
    | Single codebase    | Multiple independent services |
    | Tight coupling     | Loose coupling                |
    | Single deployment  | Independent deployment        |
    | One DB             | One DB per service            |
    | Scaling entire app | Scale individual services     |

---

### 3. Advantages of Microservices

    * Independent deployment
    * Easy scalability
    * Fault isolation
    * Technology flexibility
    * Faster development cycles

---

### 4. Challenges of Microservices

    * Distributed system complexity
    * Network latency
    * Data consistency
    * Monitoring & logging
    * Service communication failures

---

### 5. How do microservices communicate?

    1. **Synchronous** – REST APIs (HTTP calls)
    2. **Asynchronous** – Messaging systems (Kafka, RabbitMQ)

---

### 6. What is Service Discovery?

    Service discovery allows services to **automatically find other services** without hardcoding URLs.

    Example: **Eureka Server**
        - Services register with Eureka Server
        - Clients fetch service locations dynamically

    eureka:
        client:
            register-with-eureka: true
---

### 7. What is Eureka Server & Client?

    * **Eureka Server** → Service registry
    * **Eureka Client** → Registers service with the registry

    @EnableEurekaServer
    public class EurekaServerApp {}

---

### 8. What is API Gateway?

    API Gateway is the **single entry point for all client requests**.

    Responsibilities:

    * Routing
    * Authentication
    * Rate limiting
    * Load balancing

    Example: **Spring Cloud Gateway**
        yaml file:
            routes:
            - id: user-service
                uri: lb://USER-SERVICE
                predicates:
                - Path=/users/**

---

### 9. Why do we need an API Gateway?

    * Hide internal services
    * Centralized security
    * Reduce client complexity
    * Cross-cutting concerns handled in one place

---

### 10. What is Load Balancing?

    Load balancing distributes traffic across multiple service instances.

    Uses **Ribbon / Spring Cloud LoadBalancer**

    Example:
        yaml file:
            routes:
            - id: order-service
                uri: lb://ORDER-SERVICE
                predicates:
                - Path=/orders/**

---

### 11. What is Circuit Breaker?

    Prevents cascading failures when a service is down.

    ### Example: Resilience4j
        @CircuitBreaker(name = "orderService", fallbackMethod = "fallback")
        public String callOrderService() { }

    Fallback method executes if service fails.

---

### 12. What is a Fallback Method?

    Fallback method executes when a service fails.

    Example:
        public String fallback(Exception e) {
            return "Service unavailable";
        }

---

### 13. What is Config Server?

    Centralized configuration management system.

    Example:
        - Config Server reads from Git
        - Services fetch config at runtime

    spring:
        cloud:
            config:
            uri: http://localhost:8888
            
---

### 14. Why use centralized configuration?

    - No redeployment for config changes
    - Environment-specific configs
    - Consistency across services

---

### 15. What is Distributed Tracing?

    Tracking request flow across multiple services.

    Tools:
        * Sleuth
        * Zipkin

    Flow:
    Client → API Gateway → Order Service → Payment Service

---

### 16. Why Distributed Tracing important?

    Helps identify:
            * performance bottlenecks
            * service failures

---

### 17. What is Saga Pattern?

    Pattern for managing **distributed transactions** across microservices.
    Each service performs local transaction.

    Types:
        1. **Choreography** – Event-based, Less coupling
        2. **Orchestration** – Central controller, Easier control

    Example:
        Order → Payment → Inventory  
        If payment fails → rollback order

---

### 18. How do you maintain data consistency?

    * Saga pattern
    * Eventual consistency
    * Asynchronous messaging

---

### 19. What is Event-Driven Microservices?

    Services communicate using **events** instead of direct calls.

    Example:
        - OrderPlacedEvent
        - PaymentCompletedEvent

    Improves scalability & decoupling.

---

### 20. What is Idempotency?

    Same request executed multiple times gives **same result**.

    Example:
        ```http
        POST /payments (same transactionId)
    Payment API retry should not charge twice.

---

### 21. What is Statelessness in Microservices?

    Services do not store session state.

    Session stored in:
        * JWT
        * Redis

---

### 22. Why each microservice should have its own DB?

    - Avoid tight coupling
    - Independent scaling
    - Prevent shared failures
---

### 23. What is Docker in Microservices?

    Docker packages application with dependencies into a **container**.

    Packages microservice with:
        - Code
        - Dependencies
        - Runtime

    ```dockerfile
        FROM openjdk:17
        COPY app.jar app.jar
        ENTRYPOINT ["java","-jar","app.jar"]

---

### 24. What is Kubernetes?

    Container orchestration platform used to manage containers.

    Features:
        * Auto scaling
        * Self healing
        * Load balancing
        * Deployment management

---

### 25. How do you secure microservices?

    * JWT authentication
    * OAuth2
    * HTTPS
    * API Gateway security
    * Role based access control

---

### 26. What is OAuth2?

    Authorization framework using **access tokens**.s

    Flow:
        Client → Auth Server → Access Token → Resource Server

---

### 27. What is JWT?

    JSON Web Token used for **stateless authentication**.

    Contains:
        * Header
        * Payload
        * Signature

---

### 28. What is Blue-Green Deployment?

    Two environments:
        * Blue (current)
        * Green (new)

    Switch traffic after testing → **Zero downtime**

---

### 29. What is Canary Deployment?

    Deploy new version to **small % of users** first.

    If stable → rollout fully.

---

### 30. What is Versioning in Microservices?

    API versioning example:
        /api/v1/users
        /api/v2/users

---

### 31. Real-Time Microservices Example?

    Banking System:
        * Customer Service
        * Account Service
        * Transaction Service
        * Notification Service

    Flow:
        Customer → API Gateway → Account → Transaction → Notification
---

### 32. How does Eureka based discovery work in Spring Boot?

    1. Service starts
    2. Registers with Eureka server
    3. Other services request the service name
    4. Eureka provides service instance
---

### 33. How is routing handled in Spring Cloud Gateway?

    Routing is configured using **path predicates**.

    Example:
        /api/orders → order-service

---

### 34. What is client-side load balancing?

    The client chooses which service instance to call.
    Spring Cloud LoadBalancer selects one instance automatically.

---

### 35. What is configuration refresh in microservices?

    Allows configuration updates **without restarting services**.

    Example:-
        /actuator/refresh

---

### 36. How do you implement asynchronous communication in microservices?

    Using message brokers:-
                            * Kafka
                            * RabbitMQ

---

### 37. What is database per service pattern?

    Each microservice manages its own database.
    Other services cannot access it directly.

---

### 38. How do you containerize Spring Boot microservices?

    Using Dockerfile:-
       
                FROM openjdk:17
                COPY app.jar app.jar
                ENTRYPOINT ["java","-jar","app.jar"]

---

### 39. Why do we need container orchestration in microservices?

    To manage hundreds of containers efficiently.

---

### 40. How is JWT propagated across services in microservices?

    JWT token passed via HTTP header.

            Authorization: Bearer token

---

### 41. What is Fault Tolerance in microservices?

    System continues functioning even if one service fails.

---

### 42. What do you understand by Domain Driven Design?

    Designing services based on **business domains**.

    Example:
        Order Service, Payment Service.

---

### 43. What is bounded context in microservices?

    Clear boundary for domain models.
    Each service owns its domain.

---

### 44. Suppose there are 10 microservices. How will you debug an issue?

    Using:
            * distributed tracing
            * traceId
            * centralized logging

---

### 45. When serviceA calls serviceB how is session maintained?

    Using **JWT token forwarding**.

---

### 46. Huge load logs many users. How to identify one user logs in microservices?

    Using:
        * traceId
        * userId
        * correlationId

---

### 47. Have you worked on event sourcing in microservices?

    Event sourcing stores **events instead of current state**.

---

### 48. How do you maintain scalability in microservices?

    * Stateless services
    * Horizontal scaling
    * Container orchestration

---

### 49. What is health check and readiness probe in microservices?

    Health check: Service is alive.
    Readiness probe: Service is ready to accept traffic.

    Example:
        /actuator/health
        /actuator/ready

---

### 50. What is centralized logging in microservices?

    Collecting logs from all services into one system.

    Example:
        ELK stack.

---

### 51. How do you monitor microservices?

    Using monitoring tools:

            * Prometheus
            * Grafana

---

### 52. What is contract testing in microservices?

    Ensures API compatibility between services.

    Example: Pact testing.

---

### 53. How do you avoid cascading failures in microservices?

    Using:
        * circuit breaker
        * timeout
        * retry
        * fallback

---

### 54. What is timeout and retry strategy in microservices?

    Timeout defines waiting time.
    Retry attempts call again if failure occurs.

---

### 55. What is schema evolution in microservices?

    Safe database schema changes without breaking services.

---

### 56. What is sidecar pattern in microservices?

    Helper container running alongside service.

    Example:
        Logging proxy container.

---

### 57. What is the strangler pattern in microservices?

    Used to migrate monolith to microservices gradually.

---

### 58. How do you test microservices?

    Testing levels:-
        * Unit tests
        * Integration tests
        * Contract tests
        * End-to-end tests

---

### 59. What is service mesh in microservices?

    Infrastructure layer for service communication.

    Example:-
        Istio.



-----------------------------------------------------------------------------------------------------------------------------------------------------



                                        *****MySQL*****



What is MySQL and how is it typically used in real projects?

    MySQL is an open-source relational database management system (RDBMS).
    It stores data in tables and uses SQL to manage and query that data.

    In real applications (like your Spring Boot or MERN projects), MySQL is mostly used for:

        * transactional systems
        * CRUD APIs
        * reporting queries
        * authentication & user data
        * business data storage

    It follows the relational model and enforces:

        * structured schema
        * data integrity
        * relationships between tables

    ### Real example

    In your Spring Boot application:

        Employee → employee table  
        Department → department table

    REST APIs read/write data into MySQL.


What are SQL datatypes?

    ### 1. Numeric Types
        | Data Type         | Storage | Range (Signed)                    | Range (Unsigned)                       |
        | ----------------- | ------- | --------------------------------- | -------------------------------------- |
        | **TINYINT**       | 1 byte  | -128 to 127                       | 0 to 255                               |
        | **SMALLINT**      | 2 bytes | -32,768 to 32,767                 | 0 to 65,535                            |
        | **MEDIUMINT**     | 3 bytes | -8,388,608 to 8,388,607           | 0 to 16,777,215                        |
        | **INT / INTEGER** | 4 bytes | -2,147,483,648 to 2,147,483,647   | 0 to 4,294,967,295                     |
        | **BIGINT**        | 8 bytes | -2^63 to 2^63-1                   | 0 to 2^64-1                            |
        | **DECIMAL(p,s)**  | Varies  | Exact fixed-point                 | e.g., DECIMAL(5,2) → -999.99 to 999.99 |
        | **FLOAT**         | 4 bytes | Approximate, ~7 digits precision  |                                        |
        | **DOUBLE / REAL** | 8 bytes | Approximate, ~15 digits precision |                                        |

    ### 2. Character (String) Types
        | Data Type      | Storage         | Notes                                                                                 |
        | -------------- | --------------- | ------------------------------------------------------------------------------------- |
        | **CHAR(n)**    | Fixed (0–255)   | Always uses n characters (pads with spaces if shorter)                                |
        | **VARCHAR(n)** | 0–65535         | Variable length, max depends on row size (commonly up to 65535, but practical ~65532) |
        | **TEXT**       | 0–65,535        | Large text (65 KB)                                                                    |
        | **TINYTEXT**   | 0–255           | Small text                                                                            |
        | **MEDIUMTEXT** | 0–16,777,215    | Medium text (16 MB)                                                                   |
        | **LONGTEXT**   | 0–4,294,967,295 | Very large text (4 GB)                                                                |

    ### 3. Date & Time Types
        | Data Type     | Storage | Format              | Range                                      |
        | ------------- | ------- | ------------------- | ------------------------------------------ |
        | **DATE**      | 3 bytes | YYYY-MM-DD          | 1000-01-01 to 9999-12-31                   |
        | **TIME**      | 3 bytes | HH:MM:SS            | -838:59:59 to 838:59:59                    |
        | **DATETIME**  | 8 bytes | YYYY-MM-DD HH:MM:SS | 1000-01-01 00:00:00 to 9999-12-31 23:59:59 |
        | **TIMESTAMP** | 4 bytes | YYYY-MM-DD HH:MM:SS | 1970-01-01 UTC to 2038-01-19 UTC           |
        | **YEAR**      | 1 byte  | YYYY                | 1901 to 2155                               |

    ### 4. Binary Types
        | Data Type        | Storage         | Notes                       |
        | ---------------- | --------------- | --------------------------- |
        | **BLOB**         | 0–65,535        | Binary data (images, files) |
        | **TINYBLOB**     | 0–255           | Very small binary           |
        | **MEDIUMBLOB**   | 0–16,777,215    | Medium binary               |
        | **LONGBLOB**     | 0–4,294,967,295 | Very large binary           |
        | **BINARY(n)**    | Fixed           | Stores exactly n bytes      |
        | **VARBINARY(n)** | Variable        | Up to n bytes               |

    ### 5. Boolean Type
        * **BOOLEAN / BIT(1)** → TRUE or FALSE (stored as 0 or 1 in MySQL)


What are the different types of SQL types?

    1. DDL (Data Definition Language) – Defines the database structure.

        Commands:
            CREATE → create database objects (tables, views, etc.)
            ALTER → modify existing objects
            DROP → delete objects 
            TRUNCATE → remove all records from a table (faster than DELETE)

        Example:
            CREATE TABLE employees (
                id INT PRIMARY KEY,
                name VARCHAR(50),
                salary DECIMAL(10,2)
            );

    2. DML (Data Manipulation Language) – Manipulates data inside tables.

        Commands:
            INSERT → add data
            UPDATE → modify existing data
            DELETE → remove data

        Example:
            INSERT INTO employees (id, name, salary) VALUES (1, 'John', 50000);

    3. DQL (Data Query Language) – Fetches data.

        Commands:
            SELECT → retrieve data from tables

        Example:
            SELECT name, salary FROM employees WHERE salary > 40000;

    4. DCL (Data Control Language) – Controls access/permissions.

        Commands:
            GRANT → give access rights
            REVOKE → remove access rights

        Example:
            GRANT SELECT, INSERT ON employees TO 'user1'@'localhost';

    5. TCL (Transaction Control Language) – Manages transactions (used with DML).

        Commands:
            COMMIT → save changes permanently
            ROLLBACK → undo changes
            SAVEPOINT → mark a point to roll back to
            SET TRANSACTION → set transaction properties

        Example:
            START TRANSACTION;
            UPDATE employees SET salary = salary + 1000 WHERE id = 1;
            ROLLBACK; -- undo if mistake
        

What is SQL Keys?

    Keys are attributes (columns) or a set of attributes used to uniquely identify rows in a table or to establish relationships between tables.


What is SQL Constraints

    Rules applied on table columns to maintain accuracy, integrity, and reliability of the data in a database.

    PRIMARY KEY → Unique identifier for each row.
        CREATE TABLE Students (
                student_id INT PRIMARY KEY,
                name VARCHAR(100) NOT NULL
        );

    FOREIGN KEY → Link between two tables.
        CREATE TABLE Orders (
            order_id INT PRIMARY KEY,
            student_id INT,
            FOREIGN KEY (student_id) REFERENCES Students(student_id)
        );

    UNIQUE → Ensures all values in a column are different.
        CREATE TABLE Employees (
            emp_id INT UNIQUE,
            email VARCHAR(100) UNIQUE
        );

    NOT NULL → Column cannot have NULL values.
        CREATE TABLE Users (
            id INT NOT NULL,
            name VARCHAR(100) NOT NULL
        );

    CHECK → Adds conditions (e.g., age > 18).
        CREATE TABLE Accounts (
            acc_id INT PRIMARY KEY,
            balance DECIMAL(10,2) CHECK (balance >= 0)
        );

    DEFAULT → Assigns a default value if none is provided.
        CREATE TABLE Products (
            product_id INT PRIMARY KEY,
            price DECIMAL(10,2) DEFAULT 100.00
        );


What are the main storage engines in MySQL and why does it matter?

    MySQL supports multiple storage engines.

    The two most important are:
        * InnoDB (default and recommended)
        * MyISAM (older, rarely used now)

    ### Key differences

    | Feature          | InnoDB | MyISAM          |
    -----------------------------------------------
    Transactions       | Yes    | No              |
    Row level locking  | Yes    | No (table lock) |
    Foreign keys       | Yes    | No              |
    Crash recovery     | Yes    | Weak            |

    ### Example
                CREATE TABLE orders (
                id INT PRIMARY KEY,
                amount DECIMAL(10,2)
                ) 
                ENGINE=InnoDB;


Explain primary key, unique key and foreign key with examples?

    ### Primary key

        * uniquely identifies each row
        * cannot be NULL

        CREATE TABLE users(
        id INT PRIMARY KEY,
        email VARCHAR(100)
        );

    ### Unique key

        * enforces uniqueness
        * allows NULL

        ALTER TABLE users ADD UNIQUE(email);

    ### Foreign key

        * enforces relationship between two tables

        CREATE TABLE orders(
        id INT PRIMARY KEY,
        user_id INT,
        CONSTRAINT fk_user
        FOREIGN KEY(user_id) REFERENCES users(id)
        );

    This prevents inserting orders for a non-existing user.


What is the difference between primary key and unique key?

    | Primary Key             | Unique Key              |
    | ----------------------- | ----------------------- |
    | Only one per table      | Can be many             |
    | Cannot be NULL          | Can be NULL             |
    | Uniquely identifies row | Only ensures uniqueness |


What is normalization and why is it important?

    Normalization is the process of organizing data to:

        * remove duplication
        * reduce anomalies(update anomaly, insert anomaly, delete anomaly)
        * improve data consistency

    ### Example (not normalized)

        order_id | user_name | user_phone | product

    User data is repeated for every order.

    ### Normalized design

        users(id, name, phone)
        orders(id, user_id, product)


What is Subqueries?

    A subquery is a query written inside another SQL query.
    The result of the subquery is used by the main query.

    Subquery in WHERE clause (most common)
        SELECT name
            FROM Students
                WHERE marks > (SELECT AVG(marks) FROM Students);


 How different subquery from a join?

    For large datasets:
        joins are usually faster and more readable than subqueries.

    ### Difference

        Subquery:
            * executed logically inside outer query

        Join:
            * combines tables directly
            

What is Joins?

    A JOIN is used to combine rows from two or more tables based on a related column (usually primary key ↔ foreign key).

    1. INNER JOIN
        Returns only the matching rows between two tables.

            SELECT Students.name, Orders.order_id
            FROM Students
            INNER JOIN Orders ON Students.student_id = Orders.student_id;

    2. LEFT JOIN (LEFT OUTER JOIN)
        Returns all rows from the left table + matching rows from right table.
        If no match, right side will be NULL.

            SELECT Students.name, Orders.order_id
            FROM Students
            LEFT JOIN Orders ON Students.student_id = Orders.student_id;

    3. RIGHT JOIN (RIGHT OUTER JOIN)
        Returns all rows from the right table + matching rows from left table.
        If no match, left side will be NULL.

            SELECT Students.name, Orders.order_id
            FROM Students
            RIGHT JOIN Orders ON Students.student_id = Orders.student_id;

    4. FULL JOIN (FULL OUTER JOIN)
        Returns all rows when there is a match in either left or right table.
        Not supported directly in MySQL (but can be achieved with UNION).

            SELECT Students.name, Orders.order_id
            FROM Students
            LEFT JOIN Orders ON Students.student_id = Orders.student_id
                UNION
            SELECT Students.name, Orders.order_id
            FROM Students
            RIGHT JOIN Orders ON Students.student_id = Orders.student_id;

    5. CROSS JOIN
        Returns cartesian product (every row from table A with every row from table B).

            SELECT Students.name, Courses.course_name
            FROM Students
            CROSS JOIN Courses;


What is the difference between WHERE and HAVING?

    WHERE filters rows **before grouping**.
        SELECT * FROM orders WHERE user_id = 10;

    HAVING filters rows **after aggregation**.
        SELECT user_id, COUNT(*) AS cnt
        FROM orders
        GROUP BY user_id
        HAVING COUNT(*) > 3;

    We cannot use WHERE for aggregate conditions.



What is the difference between DELETE, TRUNCATE and DROP?

    ### DELETE
        * row by row
        * can be rolled back (inside transaction)
        * slower

        DELETE FROM tableName WHERE column = 5;

    ### TRUNCATE
        * removes all rows in a table
        * very fast
        * cannot be rolled back
        * resets auto-increment

        TRUNCATE TABLE tableName;

    ### DROP
        * removes table itself
        * Auto Commit
        * Fast


What is Aggregate Functions?

    Aggregate functions perform calculations on a set of rows and return a single value.
    Used for summarizing data in reports and analytics.

    | Function     | Purpose                         |
    | ------------ | ------------------------------- |
    | **COUNT()**  | Count rows                      |
    | **SUM()**    | Add values                      |
    | **AVG()**    | Average value                   |
    | **MIN()**    | Smallest value                  |
    | **MAX()**    | Largest value                   |
    | **GROUP BY** | Group rows for aggregate        |
    | **HAVING**   | Filter groups after aggregation |


What is Indexes?

    An index is like a shortcut / pointer in a database that helps queries run faster.
    Works like an index in a book → instead of reading every page, you jump directly to the right page.

    Create Index
        CREATE INDEX idx_name ON Students(name);

    Without index → full table scan
    With index → fast lookup

    Index helps in:

            * WHERE
            * JOIN
            * ORDER BY
            * GROUP BY

    But index also:

        * increases storage
        * slows down INSERT/UPDATE slightly


What are composite indexes and when should we use them ?

    Composite index is an index on multiple columns.

    ### Example

        CREATE INDEX idx_user_status ON orders(user_id, status);

    This is efficient for:
        WHERE user_id = ?
        AND status = ?

    ### Important rule
        Index follows left-most prefix.

    This index works well for:
        (user_id)
        (user_id, status)

    But not efficiently for:
        (status only)


How does EXPLAIN help in query optimization?

    EXPLAIN shows how MySQL executes a query.

    ### Example

        EXPLAIN
        SELECT * FROM orders WHERE user_id = 10;

    Important columns to observe:
        * type
        * possible_keys
        * key
        * rows

    ### Interview note
        If you see:
            type = ALL

    It usually means full table scan → performance issue.


What are transactions and why are they important?

    A transaction is a sequence of one or more SQL statements executed as a single unit of work.
    Either all statements succeed (COMMIT) or none of them apply (ROLLBACK).

    ### Example

        START TRANSACTION;

        INSERT INTO orders VALUES(1,100);
        INSERT INTO payments VALUES(1,100);

        COMMIT;

    If something fails:

        ROLLBACK;

    This ensures data consistency.


Explain ACID properties with MySQL example?

    Transactions follow ACID to ensure reliability:

        Atomicity → All or nothing.
        Consistency → Must keep DB valid.
        Isolation → Transactions don’t interfere with each other.
        Durability → Once committed, changes are permanent.

    ### Example
        START TRANSACTION;

        UPDATE Accounts SET balance = balance - 500 WHERE acc_id = 1;
        UPDATE Accounts SET balance = balance + 500 WHERE acc_id = 2;

        COMMIT;

    👉 If the second update fails, a ROLLBACK ensures no money is lost.

    | Command               | Purpose             |
    | --------------------- | ------------------- |
    | **START TRANSACTION** | Begin a transaction |
    | **COMMIT**            | Save all changes    |
    | **ROLLBACK**          | Undo all changes    |
    | **SAVEPOINT**         | Rollback partially  |


What are isolation levels in MySQL?

    Isolation levels control how transactions see each other’s data.

    ### Main levels
        * READ UNCOMMITTED
        * READ COMMITTED
        * REPEATABLE READ (default in MySQL InnoDB)
        * SERIALIZABLE

    ### Example problem
        Dirty read, non-repeatable read and phantom read occur depending on isolation level.


What is locking in MySQL and how does InnoDB handle it?

    Locking protects data during concurrent access.

    InnoDB supports:

        * row level locking

    ### Example

        If one transaction updates a row:

            Another transaction cannot update the same row until commit.

        This gives better concurrency compared to table level locking.


What are views and why are they used?

    A view is a virtual table created from a SELECT query.
    It doesn’t store data itself, it just shows data from one or more tables.

    ### Example
                CREATE VIEW student_info AS
                SELECT student_id, name, age
                FROM Students
                WHERE age >= 18;

    Used for:
                * simplifying complex queries
                * security (limit visible columns)


What are stored procedures and functions?

    A stored procedure is a set of SQL statements stored in the database and executed by calling its name.
    Think of it like a function in programming, but inside MySQL.

    Benefits:
        Reusable SQL code
        Improves performance (compiled once)
        Helps with modular programming
        Better security (users can execute without knowing SQL details)

    ### Example
                    DELIMITER $$

                    CREATE PROCEDURE GetAllEmployees()
                    BEGIN
                        SELECT * FROM Employees;
                    END $$

                    DELIMITER ;

    Call:
        CALL GetAllEmployees();

    ### Difference
        Functions return a value.
        Procedures may return multiple result sets.


What are triggers and when should we use them?

    Triggers automatically execute when an event occurs on a table(like INSERT, UPDATE, or DELETE).

    ### Example

                CREATE TRIGGER trigger_name
                {BEFORE | AFTER} {INSERT | UPDATE | DELETE}
                ON table_name
                FOR EACH ROW
                BEGIN
                -- SQL statements
                END;

    BEFORE → Trigger runs before the operation.
    AFTER → Trigger runs after the operation.
    INSERT | UPDATE | DELETE → Event that activates the trigger.


What is SQL Pivot & Unpivot?

    Pivot transforms rows into columns.
    Useful for creating summary reports where categories become column headers.

    Example:-
        SELECT Product,
            SUM(CASE WHEN Month='Jan' THEN Amount ELSE 0 END) AS Jan,
            SUM(CASE WHEN Month='Feb' THEN Amount ELSE 0 END) AS Feb
        FROM Sales
        GROUP BY Product;
        

What is partitioning in MySQL?

    Partitioning splits a large table into smaller logical parts.
    Each partition is stored separately but behaves like a single table.

    ### Example

    Partition by year:

        PARTITION BY RANGE (YEAR(order_date))

    Benefits:
        * faster queries on filtered partitions
        * easier data management


How does MySQL replication work?

    Replication is the process of copying data from one MySQL server (master) to one or more servers (slaves).
    Ensures that data is synchronized across multiple servers.

    ### Architecture
        * Primary (source)
        * Replica (slave)

    ### Use cases
        * read scaling
        * backups
        * reporting

    Writes go to primary.
    Reads can go to replicas.


How do you take backup and restore in MySQL?

    Backup is usually taken using:

        mysqldump -u root -p dbname > db.sql

    Restore:

        mysql -u root -p dbname < db.sql

    This is very common in production and migration tasks.


What are window functions in MySQL and when do we use them?

    Window functions perform calculations across a set of rows without collapsing them into groups.

    ### Example

        SELECT user_id, amount,
            SUM(amount) OVER (PARTITION BY user_id) AS total
        FROM orders;

    This keeps individual rows while still computing totals.


What are Common Table Expressions (CTE)?

    CTE allows writing temporary named result sets.
    A CTE is a temporary result set that you can reference within a SELECT, INSERT, UPDATE, or DELETE statement.
    It improves readability and modularity of complex queries.

    ### Example

        WITH recent_orders AS (
        SELECT * FROM orders WHERE order_date >= CURDATE()-7
        )
        SELECT * FROM recent_orders;

    CTEs improve:

        * readability
        * maintainability
        * recursive queries


How is JSON handled in MySQL?

    MySQL supports native JSON type.

    ### Example

        CREATE TABLE logs(
        data JSON
        );

    Query JSON:

        SELECT data->'$.user.name'
        FROM logs;

    This is useful for semi-structured data.


What is full-text search in MySQL?

    Full-text search allows text-based searching.

    ### Example
        CREATE FULLTEXT INDEX idx_desc ON products(description);

        SELECT * FROM products
            WHERE MATCH(description) AGAINST('mobile');

    This is better than:
        LIKE '%mobile%'

    for large text columns.


How do you handle performance issues in MySQL in real projects?

    Typical steps:
        1. Identify slow queries
        2. Use EXPLAIN
        3. Add or improve indexes
        4. Rewrite queries
        5. Avoid SELECT *
        6. Reduce joins where possible
        7. Check transaction and lock contention

    In production, slow query log is heavily used.


What is deadlock and how does MySQL handle it?

    Deadlock happens when two transactions wait for each other.

    ### Example
        Transaction A locks row 1
        Transactio0n B locks row 2
        A waits for row 2
        B waits for row 1

    MySQL detects deadlock automatically and rolls back one transaction.

    Application should retry the transaction.


What are common mistakes developers make with MySQL?

    Common mistakes:
        * missing indexes on foreign keys
        * using SELECT *
        * using functions on indexed columns in WHERE
        * sharing database between services
        * long running transactions
        * ignoring isolation and locking behavior


Email field has NOT NULL constraint. How to remove NOT NULL constraint?
    
    Use ALTER TABLE to modify the column.

    ALTER TABLE employee
    MODIFY email NULL;


What are Set Operations?

    Set operations allow you to combine results of two or more queries into a single result set.
    Useful when we want union, intersection, or difference of query results.

    UNION → Combines results of two queries and removes duplicates
        SELECT name FROM Students
        UNION
        SELECT name FROM Alumni;

    UNION → Combines results of two queries and removes duplicates
        SELECT name FROM Students
        UNION ALL
        SELECT name FROM Alumni;

    INTERSECT → Returns rows common to both queries (MySQL 8+ supports via INNER JOIN workaround)
        SELECT name FROM Students
        INTERSECT
        SELECT name FROM Alumni;

    EXCEPT / MINUS → Returns rows in first query not in second (MySQL 8+ uses NOT IN workaround)
        SELECT name FROM Students
        EXCEPT
        SELECT name FROM Alumni;




-----------------------------------------------------------------------------------------------------------------------------------------------------------

                                                        ***** CI & CD *****


What is CI and CD? Why is it important?

    CI/CD helps in faster, reliable and automated releases.

    CI – Continuous Integration

        Automatically build and test code after every commit

    CD – Continuous Delivery / Deployment

        Automatically deploy the application





-----------------------------------------------------------------------------------------------------------------------------------------------------------

                                                        ***** Docker *****


What is Docker, Docker image and Docker container ?

    Docker
        👉 A tool to package and run applications with all dependencies.

    Docker Image
        👉 A ready-to-run template (like a snapshot).

    Docker Container
        👉 A running instance of an image.

    Simple meaning:
        Image → blueprint
        Container → running app







-----------------------------------------------------------------------------------------------------------------------------------------------------------

                                                        ***** Unit test *****


Difference between unit test and integration test ?

    | Unit test                    | Integration test                   |
    | ---------------------------- | ---------------------------------- |
    | Tests single class or method | Tests multiple components together |
    | Very fast                    | Slower                             |
    | Uses mocks                   | Uses real DB / services usually    |

    Example:-
        Unit test → test only UserService
        Integration test → test controller + service + DB


What is Test Driven Development (TDD) and your opinion ?

    👉 TDD means:-
        Write test first
        Then write code
        Then refactor

    Cycle:
        Red → Green → Refactor

    👉 My opinion:
        It improves code quality and reduces bugs, but it takes little extra time initially.

*/
