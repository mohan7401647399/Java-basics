// Great! Let’s start with ** very basic problems ** in Java and compare them with JavaScript.This will help you understand the syntax and structure of Java while leveraging your existing JavaScript knowledge.

// ---

// ### ** Problem 1: Print "Hello, World!" **
// #### ** JavaScript **:
// ```javascript
// console.log("Hello, World!");
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }
// ```

//     ** Explanation **:
// - In Java, every program starts with a`class`(here, `Main`).
// - The`main` method is the entry point of the program.
// - `System.out.println` is used to print to the console(similar to`console.log` in JavaScript).

// ---

// ### ** Problem 2: Add Two Numbers **
// #### ** JavaScript **:
// ```javascript
// let a = 5;
// let b = 10;
// let sum = a + b;
// console.log("Sum:", sum);
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
//         int sum = a + b;
//         System.out.println("Sum: " + sum);
//     }
// }
// ```

//     ** Explanation **:
// - In Java, you must declare the type of variables (`int` for integers).
// - The`+` operator works the same way in both languages.

// ---

// ### ** Problem 3: Check if a Number is Even or Odd **
// #### ** JavaScript **:
// ```javascript
// let num = 7;
// if (num % 2 === 0) {
//     console.log(num + " is even.");
// } else {
//     console.log(num + " is odd.");
// }
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static void main(String[] args) {
//         int num = 7;
//         if (num % 2 == 0) {
//             System.out.println(num + " is even.");
//         } else {
//             System.out.println(num + " is odd.");
//         }
//     }
// }
// ```

//     ** Explanation **:
// - The`%` operator(modulus) works the same way in both languages.
// - In Java, use`==` for comparison(not`===` as in JavaScript).

// ---

// ### ** Problem 4: Print Numbers from 1 to 5 Using a Loop **
// #### ** JavaScript **:
// ```javascript
// for (let i = 1; i <= 5; i++) {
//     console.log(i);
// }
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i);
//         }
//     }
// }
// ```

//     ** Explanation **:
// - The`for` loop syntax is almost identical in both languages.
// - In Java, declare the type of the loop variable(`int i`).

// ---

// ### ** Problem 5: Find the Largest of Two Numbers **
// #### ** JavaScript **:
// ```javascript
// let a = 10;
// let b = 20;
// if (a > b) {
//     console.log(a + " is larger.");
// } else {
//     console.log(b + " is larger.");
// }
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         if (a > b) {
//             System.out.println(a + " is larger.");
//         } else {
//             System.out.println(b + " is larger.");
//         }
//     }
// }
// ```

//     ** Explanation **:
// - The logic is the same in both languages.
// - Java requires explicit type declarations (`int`).

// ---

// ### ** Problem 6: Create a Function / Method to Multiply Two Numbers **
// #### ** JavaScript **:
// ```javascript
// function multiply(a, b) {
//     return a * b;
// }
// console.log("Result:", multiply(5, 3));
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static int multiply(int a, int b) {
//         return a * b;
//     }
//     public static void main(String[] args) {
//         System.out.println("Result: " + multiply(5, 3));
//     }
// }
// ```

//     ** Explanation **:
// - In Java, methods must have a return type(`int` in this case).
// - The`main` method is where the program starts execution.

// ---

// ### ** Problem 7: Swap Two Numbers **
// #### ** JavaScript **:
// ```javascript
// let a = 5;
// let b = 10;
// [a, b] = [b, a]; // Swapping using destructuring
// console.log("a:", a, "b:", b);
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a: " + a + " b: " + b);
//     }
// }
// ```

//     ** Explanation **:
// - Java does not support destructuring, so you need a temporary variable(`temp`) to swap values.

// ---

// ### ** Problem 8: Check if a String is Empty **
// #### ** JavaScript **:
// ```javascript
// let str = "";
// if (str.length === 0) {
//     console.log("String is empty.");
// } else {
//     console.log("String is not empty.");
// }
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static void main(String[] args) {
//         String str = "";
//         if (str.isEmpty()) {
//             System.out.println("String is empty.");
//         } else {
//             System.out.println("String is not empty.");
//         }
//     }
// }
// ```

//     ** Explanation **:
// - In Java, use the `isEmpty()` method to check if a string is empty.

// ---

// ### ** Problem 9: Reverse a String **
// #### ** JavaScript **:
// ```javascript
// let str = "Hello";
// let reversed = str.split("").reverse().join("");
// console.log("Reversed:", reversed);
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello";
//         String reversed = new StringBuilder(str).reverse().toString();
//         System.out.println("Reversed: " + reversed);
//     }
// }
// ```

//     ** Explanation **:
// - In Java, use`StringBuilder` to reverse a string.

// ---

// ### ** Problem 10: Find the Factorial of a Number **
// #### ** JavaScript **:
// ```javascript
// function factorial(n) {
//     if (n === 0 || n === 1) return 1;
//     return n * factorial(n - 1);
// }
// console.log("Factorial:", factorial(5));
// ```

// #### ** Java **:
// ```java
// public class Main {
//     public static int factorial(int n) {
//         if (n == 0 || n == 1) return 1;
//         return n * factorial(n - 1);
//     }
//     public static void main(String[] args) {
//         System.out.println("Factorial: " + factorial(5));
//     }
// }
// ```

//     ** Explanation **:
// - The logic for recursion is the same in both languages.

// ---

// ### ** Next Steps **
//     1. Practice these basic problems in Java.
// 2. Gradually move to more complex problems(e.g., arrays, loops, OOP concepts).
// 3. Build small projects(e.g., a calculator, to -do list).

// Let me know if you need further clarification or more examples! 😊