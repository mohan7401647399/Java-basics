// This is a basic Java program
// class hello{

//     // The main method is the entry point of any Java program
//     public static void main(String args[]) {
//         // Print a message to the console
//         System.out.print("Hello, World!");
//     }
// }

// // This is a basic Java program
// public class hello{

//     // The main method is the entry point of any Java program
//     public static void main(String[] args) {
//         // Print a message to the console
//         System.out.println("Hello, World!");
//     }
// }

//              Variables
// public class myFun{
//     public static void main(String[] args){
//         int myNum = 5;                                   // integer (whole number)
//         float floatNum = 5.99f;                          // floating point number
//         char letter = 'D';                               // character
//         boolean isTrue = true;                          //  boolean
//         String site = "www.google.com";                 //  string
//         System.out.print(myNum);
//         System.out.print(floatNum);
//         System.out.print(letter);
//         System.out.print(isTrue);
//         System.out.print(site);
//     }
// }

//  01-Jan-2025
// class hello{
//     public static void main(String args[]){
//         int container = 50;
//         System.out.print(container);
//     }
// }

// class hello{
//     public static void main(String args[]){
//         int a = 1;
//         int b = 2;
//         System.out.print(a+b);
//     }
// }

//      09 - Mar - 2025
//  ***** input method

// import java.util.Scanner;

// class Hello {
//     public static void main(String args[]) {
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         int b = input.nextInt();
//         int total = a + b;
//         System.out.print("UserInput is " + total);
//     }
// }

// import java.util.Scanner;

// class Hello {
//     public static void main(String args[]) {
//         Scanner input = new Scanner(System.in);
//         String a = input.nextLine();
//         System.out.print("UserInput is " + a);
//     }
// }

//      13 - Mar - 2025
//  input methods

// import java.util.Scanner;

// class Hello {
//     public static void main(String args[]) {
//         Scanner input = new Scanner(System.in);
//         String name = input.nextLine();
//         int age = input.nextInt();
//         System.out.println("My name is " + name);
//         System.out.print("My age is " + age);
//     }
// }

// import java.util.Scanner;

// class Hello {
//     public static void main(String args[]) {
//         Scanner input = new Scanner(System.in);
//         String name = input.nextLine();
//         int age = input.nextInt();
//         input.nextLine();
//         String address = input.nextLine();
//         System.out.println("My name is " + name);
//         System.out.println("My age is " + age);
//         System.out.print("My address is " + address);
//     }
// }

// import java.util.Scanner;

// class Hello {
//     public static void main(String args[]) {
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         int b = input.nextInt();
//         int c = input.nextInt();
//         int d = a * b * c;
//         int e = a + b + c;
//         System.out.print(d / e);
//     }
// }

// import java.util.Scanner;

// class Hello {
//     public static void main(String args[]) {
//         Scanner input = new Scanner(System.in);
//         String name = input.nextLine();
//         double score = input.nextDouble();
//         input.nextLine();
//         String address = input.nextLine();
//         System.out.println("My name is " + name);
//         System.out.println("My age is " +  score/10 + "/10");
//         System.out.print("My address is " + address);
//     }
// }

//      14 - Mar - 2024
//  Data types

//  ***** Primitive data types
// int

// class hello {
//     public static void main(String args[]) {
//         int a = 10;
//         System.out.print(a);
//     }
// }

// float

// class hello {
//     public static void main(String args[]) {
//         float a = 10.0f;
//         System.out.print(a);
//     }
// }

// double

// class hello {
//     public static void main(String args[]) {
//         double a = 10.123456789;
//         System.out.print(a);
//     }
// }

// char

// class hello {
//     public static void main(String args[]) {
//         char a = 'm';
//         System.out.print(a);
//     }
// }

// boolean

// class hello {
//     public static void main(String args[]) {
//         boolean a = true;
//         System.out.print(a);
//     }
// }

// byte

// class hello {
//     public static void main(String args[]) {
//         byte a = 127;
//         System.out.print(a);
//     }
// }

// short

// class hello {
//     public static void main(String args[]) {
//         short a = 32767;
//         System.out.print(a);
//     }
// }

// long

// class hello {
//     public static void main(String args[]) {
//         long a = 327671212;
//         System.out.print(a);
//     }
// }

//  ***** Reference data types
// String

// Object

// Array

//      15-Mar-2025
//  if-else statements

// class hello {
//     public static void main(String args[]) {
//         if (true) {
//             System.out.println(true);
//         } else {
//             System.out.println(false);
//         }
//     }
// }

// class hello {
//     public static void main(String args[]) {
//         boolean rain = true;
//         if (rain) {
//             System.out.println("Rain is there");
//         } else {
//             System.out.println("Rain is not there");
//         }
//     }
// }

// class hello {
//     public static void main(String args[]) {
//         int num1 = 40, num2 = 50;
//         boolean value = num1 > num2;
//         if (value) {
//             System.out.println("num1 is greater than num2");
//         } else {
//             System.out.println("num2 is greater than num1");
//         }
//     }
// }

// class hello {
//     public static void main(String args[]) {
//         int num1 = 50, num2 = 50;
//         if ( num1 > num2) {
//             System.out.println("num1 is greater than num2");
//         } else if (num1 < num2) {
//             System.out.println("num2 is greater than num1");
//         } else {
//             System.out.println("num1 is equal to num2");
//         }
//     }
// }


import java.util.Scanner;

class hello {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        if ( num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else if (num1 < num2) {
            System.out.println("num2 is greater than num1");
        } else {
            System.out.println("num1 is equal to num2");
        }
    }
}