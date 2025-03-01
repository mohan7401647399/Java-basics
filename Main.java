//  01-Mar-2025

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hi, I'm a Java program!");
//         System.out.println(5*5);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         String name = "Mohan";
//         System.out.println(name);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int age = 29;
//         System.out.println(age);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         String name = "Mohan";
//         int age = 29;
//         System.out.println("My name is " + name + " and I am " + age + " years old");
//     }
// }

//          ***** Function / Methods *****

// public class Main {
//     public static String greet(String name) {
//         return "Hello , " + name + " !";
//     }
//     public static void main(String[] args) {
//         System.out.println(greet("Mohan"));
//     }
// }

//         ***** conditional statements *****

//  if-else
// public class Main {
//     public static void main(String[] args) {
//         int age = 20;
//         if (age >= 19) {
//             System.out.println("Eligible for vote");
//         } else {
//             System.out.println("Not eligible for vote");
//         }
//     }
// }

// else if
// public class Main {
//     public static void main(String[] args) {
//         int age = 80;
//         if (age >= 19) {
//             System.out.println("Eligible for vote");
//         } else if (age >= 60) {
//             System.out.println("retired for vote");
//         } else {
//             System.out.println("Not eligible for vote");
//         }
//     }
// }

//  nested if
// public class Main {
//     public static void main(String args[]) {
//         int age = 20;
//         boolean hasId = true;
//         if (age >= 18) {
//             if (hasId) {
//                 System.out.println("You are allowed to enter");
//             } else {
//                 System.out.println("You are not allowed to enter");
//             }
//         } else {
//             System.out.println("You are too young too enter");
//         }
//     }
// }

//      switch

// public class Main {
//     public static void main(String args[]) {
//         int day = 3;
//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//         }
//     }
// }

//  Ternary Operator

// public class Main {
//     public static void main(String args[]) {
//         int age = 20;
//         String status = (age >= 18) ? "Adult" : "minor";
//         System.out.println(status);
//     }
// }

//   Combining Conditions

// public class Main {
//     public static void main(String args[]) {
//         int age = 5;
//         boolean isStudent = true;
//         if (age >= 18 && isStudent) {
//             System.out.println("You are eligible for a student discount");
//         } else {
//             System.out.println("You are not eligible for a student discount");
//         }
//     }
// }




// ***** Loops *****

// public class Main {
// public static void main(String args[]){
// for (int i = 0; i < 5; i++) {
// System.out.println(i);
// }
// }
// }

// ***** Arrays *****

// public class Main {
// public static void main(String args[]) {
// String[] fruits = { "apple", "banana", "cherry" };
// System.out.println(fruits[0]);
// }
// }

// public class Main {
// public static void main(String args[]) {
// String[] fruits = { "apple", "banana", "cherry" };
// for (int i = 0; i < fruits.length; i++) {
// System.out.println(fruits[i]);
// }
// }
// }

// ***** Lists *****

// import java.util.ArrayList;

// public class Main {
// public static void main(String args[]) {
// ArrayList<String> fruits = new ArrayList<>();
// System.out.println(fruits);
// fruits.add("apple");
// fruits.add("banana");
// fruits.add("mango");
// System.out.println(fruits);
// }
// }

// ***** Error / Exception Handling *****

// public class Main {
// public static void main(String args[]) {
// try {
// throw new Exception("Something went wrong!");
// } catch (Exception err) {
// System.err.println(err.getMessage());
// }
// }
// }

// ***** mini problems *****

// Problem 2: Add Two Numbers
// public class Main {
// public static void main(String args[]) {
// int a = 10, b = 5, sum = a + b;
// System.out.println("Sum -> " + sum);
// }
// }

// Problem 3: Check if a Number is Even or Odd

// public class Main {
// public static void main(String args[]) {
// int num = 7;
// if(num %2 == 0){
// System.out.println(num + " is even number");
// } else {
// System.out.println(num + " is odd number");
// }
// }
// }

// Problem 4: Print Numbers from 1 to 5 Using a Loop

// public class Main {
// public static void main(String args[]) {
// for (int i = 1; i <= 5; i++) {
// System.out.println(i);
// }
// }
// }

// Problem 5: Find the Largest of Two Numbers

// public class Main {
// public static void main(String args[]) {
// int a = 10, b = 5;
// if (a > b) {
// System.out.println(a + " is larger");
// } else {
// System.out.println(b + " is larger");
// }
// }
// }

// Problem 6: Create a Function/Method to Multiply Two Numbers

// public class Main {
// public static int Multiply(int a, int b) {
// return a * b;
// }
// public static void main(String args[]) {
// System.out.println("Multiply number is " + Multiply(10,2));
// }
// }

// Problem 7: Swap Two Numbers

// public class Main {
// public static void main(String args[]) {
// int a = 5, b = 10, temp = a;
// a = b;
// b = temp;
// System.out.println("Swap num " + a + " and " + b);
// }
// }

// Problem 8: Check if a String is Empty

// public class Main {
// public static void main(String args[]) {
// String str = "";
// if (str.length() == 0) {
// System.out.println("String is empty");
// } else {
// System.out.println("String is empty");
// }
// }
// }

// or

// public class Main {
// public static void main(String args[]) {
// String str = "";
// if (str.isEmpty()) {
// System.out.println("String is empty");
// } else {
// System.out.println("String is empty");
// }
// }
// }

// Problem 9: Reverse a String

// public class Main {
// public static void main(String args[]) {
// String str = "hello";
// String reversed = new StringBuilder(str).reverse().toString();
// System.out.println("reversed string is " + reversed);
// }
// }

// Problem 10: Find the Factorial of a Number

// public class Main {
// public static int Factorial(int n) {
// if (n == 0 || n == 1)
// return 1;
// return n * Factorial(n - 1);
// }
// public static void main(String args[]) {
// System.out.println("Factorial number is " + Factorial(5));
// }
// }