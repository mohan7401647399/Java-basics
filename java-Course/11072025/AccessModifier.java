// Access modifiers in Java control the **visibility and accessibility** of classes, interfaces, variables, methods, and constructors. They enforce encapsulation and define how other parts of your code can interact with these elements. Java has **four** access modifiers:


// ### **1. Access Modifiers Overview**
// | Modifier       | Class | Package | Subclass (Same Pkg) | Subclass (Diff Pkg) | World |
// |----------------|-------|---------|---------------------|---------------------|-------|
// | **`private`**  | ✅    | ❌      | ❌                  | ❌                  | ❌    |
// | **`default`**  | ✅    | ✅      | ✅                  | ❌                  | ❌    |
// | **`protected`**| ✅    | ✅      | ✅                  | ✅                  | ❌    |
// | **`public`**   | ✅    | ✅      | ✅                  | ✅                  | ✅    |

// *(✅ = Accessible, ❌ = Not accessible)*


// ####                                         **(A) `private`**
// - **Accessible only within the declared class**.
// - Most restrictive; used for encapsulation.

// class BankAccount {
//     private double balance;                  // Only accessible in BankAccount
    
//     private void deductFee() { 
//         balance -= 5.0;
//     }
// }

// ####                                 **(B) `default` (Package-Private)**
// - **No explicit modifier** (e.g., `class MyClass`).
// - Accessible only within the **same package**.

// class Logger {
//     String logLevel;                         // Default access (package-only)
// }

// ####                                   **(C) `protected`**
// - Accessible within the **same package** + **subclasses (even in other packages)**.
// - Used for inheritance hierarchies.

// public class Vehicle {
//     protected String engineType;                                 // Accessible in Car (subclass)
// }

// public class Car extends Vehicle {
//     public void start() {
//         System.out.println(engineType + " engine started!");                 // ✅
//     }
// }

// ####                                         **(D) `public`**
// - Accessible **everywhere** (global access).
// - Used for APIs, constants, and critical methods.

// public class MathUtils {
//     public static final double PI = 3.14159;                 // Global constant
    
//     public static int add(int a, int b) {                    // Global method
//         return a + b;
//     }
// }


// ### **4. Practical Examples**
// #### **(A) Encapsulation with `private` + Getters/Setters**

// public class Student {
//     private String name; // Private field
    
//     // Public getter/setter
//     public String getName() { return name; }
//     public void setName(String name) { this.name = name; }
// }

// #### **(B) Package Utilities (`default` Access)**

// // File: com/utils/Logger.java
// package com.utils;

// class Logger { // Default access (package-only)
//     void log(String message) { ... }
// }

// // File: com/app/Main.java
// package com.app;
// import com.utils.Logger;

// public class Main {
//     public static void main(String[] args) {
//         Logger logger = new Logger(); // ❌ Error! Logger not accessible
//     }
// }

// #### **(C) Subclass Access (`protected`)**

// // File: com/shapes/Shape.java
// package com.shapes;

// public class Shape {
//     protected double area; // Accessible in subclasses
// }

// // File: com/shapes/Circle.java
// package com.shapes;

// public class Circle extends Shape {
//     public void printArea() {
//         System.out.println(area); // ✅ Accessible (same package)
//     }
// }

// // File: com/ui/ShapeInfo.java (Different package)
// package com.ui;
// import com.shapes.Circle;

// public class ShapeInfo {
//     public void display() {
//         Circle circle = new Circle();
//         System.out.println(circle.area); // ❌ Error! Not accessible
//     }
// }



// ### **5. When to Use Which Modifier**
            // | Scenario                                      | Recommended Modifier |
            // |-----------------------------------------------|----------------------|
            // | **Internal class implementation**             | `private`            |
            // | **Package-specific utilities**                | `default`            |
            // | **Fields/methods for subclass extension**     | `protected`          |
            // | **Constants (`public static final`)**         | `public`             |
            // | **API methods/classes**                       | `public`             |
            // | **Singleton constructors**                    | `private`            |



//          ### **7. Access Modifiers Cheat Sheet**
//          | Modifier       | Typical Use Cases                                      |
//          |----------------|--------------------------------------------------------|
//          | **`private`**  | Fields, helper methods, constructors (encapsulation) |
//          | **`default`**  | Package-only classes/methods (internal utils)         |
//          | **`protected`**| Fields/methods for inheritance                        |
//          | **`public`**   | Main classes, interfaces, APIs, constants            |


// ### **Key Takeaways**
// - **`private`**: Class-level encapsulation.  
// - **`default`**: Package-level organization.  
// - **`protected`**: Controlled inheritance access.  
// - **`public`**: Global accessibility.  
// - **Top-level classes**: Only `public` or `default`.  
// - **Method overriding**: Cannot reduce visibility.






//                      public - can be accessed from anywhere
// class Teacher{
//    public String t_name = "Aakash";
// }

// public class Student{
//     public static void main(String[] args){
//         Teacher t1 = new Teacher();
//         System.out.println(t1.t_name);
//     }
// }



//                   private - can be accessed only inside the class
// class Teacher{
//     private String t_name = "Aakash";
//     void display(){
//         System.out.println("teacher name is " + t_name);
//     }
// }

// public class Student{
//     public static void main(String[] args){
//         Teacher t1 = new Teacher();
//         t1.display();
//     }
// }



//      default - A class with no access modifier(package-private) is accessible only within the same package
// package Package_one;
// class Teacher{
//     String t_name = "Aakash";                   //  default
//     System.out.println(t_name);
// }



//                          protected
//      * Accessible within the same package
//      * it is accessible from other package only through a subclass

// package Package_one
// public class Teacher{
//     protected int salary = 10000;
// }


// package Package_two
//  import package_one.Teacher

// public class Student extends Teacher{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         System.out.println(s1.salary);
//     }
// }