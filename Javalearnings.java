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

// import java.util.Scanner;

// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int num1 = scan.nextInt(), num2 = scan.nextInt();
//         if ( num1 > num2) {
//             System.out.println("num1 is greater than num2");
//         } else if (num1 < num2) {
//             System.out.println("num2 is greater than num1");
//         } else {
//             System.out.println("num1 is equal to num2");
//         }
//     }
// }

//      16 - Mar - 2025
//  How to compare two strings

// class hello {
//     public static void main(String args[]) {
//         String str1 = "hello";
//         String str2 = "hello";
//         String str3 = new String("hello");
//         String str4 = new String("hello");
//         System.out.println(str1 == str2);
//         System.out.println(str3 == str4);
//     }
// }

// class hello {
//     public static void main(String args[]) {
//         String str3 = new String("hello");
//         String str4 = new String("hello");
//         System.out.println(str3.equals(str4));
//     }
// }

// class hello {
//     public static void main(String args[]) {
//         String a = "one";
//         String b = "one";
//         String c = b;
//         System.out.println(a == c);
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String a = scan.nextLine();
//         String b = scan.nextLine();
//         System.out.println(a == b);
//         System.out.println(a.equals(b));
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String a = scan.nextLine();
//         if (a.equals("won")) {
//             System.out.println("You won");
//         } else {
//             System.out.println("You lost");
//         }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String a = scan.nextLine();
//         if (a.equals("dead")) {
//             System.out.println("Surya meets ramya");
//         } else {
//             System.out.println("Surya weds meghana");
//         }
//     }
// }

//      24 - Mar - 2025

// import java.util.Scanner;
// class hello{
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int input = scan.nextInt();
//         if (input > 35) {
//             System.out.println("Pass");
//         } else {
//             System.out.println("Fail");
//         }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int income = scan.nextInt();
//         if (income > 7000) {
//             System.out.println("Scholarship is available");
//         } else {
//             System.out.println("Scholarship is not available");
//         }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         if(num % 3 == 0 && num % 5 == 0){
//             System.out.println("num is divisible by 3 and 5");
//         } else {
//             System.out.println("num is not divisible by 3 and 5");
//         }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         if(num % 2 == 0){
//             System.out.println("even number");
//         } else {
//             System.out.println("odd number");
//         }
//     }
// }

//      25 - Mar - 2025
//  Else if and nested if

// import java.util.Scanner;

// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int score = scan.nextInt();
//         if (score > 30 && score < 60) {
//             System.out.println("C Grade");
//         } else if (score > 60 && score < 90) {
//             System.out.println("B Grade");
//         } else if (score > 90) {
//             System.out.println("A Grade");
//         }
//     }
// }

// import java.util.Scanner;

// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String score = scan.nextLine();
//         boolean kfc = true;
//         boolean chicken = true;
//         boolean pepsi = true;
//         if(kfc){
//             System.out.println("Enter into kfc");
//             if(chicken){
//                 System.out.println("Eat chicken");
//                 if(pepsi){
//                     System.out.println("Drink pepsi");
//                 }
//             }
//         }
//     }
// }

//  26-Mar-2025
//  Ternary Operator

// class hello {
//     public static void main(String args[]) {
//         System.out.println(true ? "Hello" : "Bye");
//         System.out.println(5 > 2 ? "Five is greater than two" : "Five is less than two");
//         Boolean rain = true;
//         System.out.println(rain ? "It is raining" : "It is not raining");
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int first = scan.nextInt();
//         int second = scan.nextInt();
//         System.out.println(first > second ? "First is greater than second" : "First is less than second");
//     }
// }

//      02-Apr-2025

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int input = scan.nextInt();
//         if (input < 50) {
//             System.out.println("Need to improve");
//         } else if (input >= 50 && input < 75) {
//             System.out.println("Good");
//         } else {
//             System.out.println("Excellent");
//         }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int subject1 = scan.nextInt();
//         int subject2 = scan.nextInt();
//         int subject3 = scan.nextInt();
//         int subject4 = scan.nextInt();
//         int subject5 = scan.nextInt();
//         int sum = subject1 + subject2 + subject3 + subject4 + subject5;
//         int input = sum / 5;
//         if (input < 35) {
//             System.out.println("Additional class is required" + " " + input);
//         } else {
//             System.out.println("you are good to go" + " " + input);
//         }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         String light = scan.nextLine();
//         if (light == "red") {
//             System.out.println("Stop" + " " + light);
//         } else if (light == "yellow") {
//             System.out.println("Ready" + " " + light);
//         } else if(light == "green") {
//             System.out.println("Go" + " " + light);
//         }
//     }
// }

//      03-Apr-2025
//  for loop
// class hello{
//     public static void main(String args[]) {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("for loop"+ " " + i);
//         }
//     }
// }

//      06-Apr-2025
//  for loop
// import java.util.Scanner;

// class hello{
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the start number");
//         int start = scan.nextInt();
//         System.out.println("Enter the end number");
//         int end = scan.nextInt();
//         for (int i = start; i <= end; i++) {
//             System.out.println("for loop"+ " " + i);
//         }
//     }
// }

// import java.util.Scanner;
// class hello{
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the start number");
//         int start = scan.nextInt();
//         for (int i = 0; i <= start; i++) {
//             if(i % 2 == 0) System.out.println("for loop"+ " " + i);
//         }
//     }
// }

// import java.util.Scanner;
// class hello{
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the start number");
//         int start = scan.nextInt();
//         for (int i = 0; i <= start; i++) {
//             if (i % 2 == 0)
//                 System.out.println("Even Number are" + " " + i);
//              else
//                 System.out.println("Odd Number are" + " " + i);
//         }
//     }
// }

// import java.util.Scanner;
// class hello {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the start number");
//         int start = scan.nextInt();
//         int oddCount = 0, evenCount = 0;
//         for (int i = 0; i < start; i++) {
//             if (i % 2 == 0) {
//                 System.out.println("Even Number are" + " " + i);
//                 evenCount++;
//             } else {
//                 System.out.println("Odd Number are" + " " + i);
//                 oddCount++;
//             }
//         }
//         System.out.println("Total Even Number are" + " " + evenCount);
//         System.out.println("Total Odd Number are" + " " + oddCount);
//     }
// }


//      06-Apr-2025
//      array

// class hello {
//     public static void main(String args[]){
//         String[] playlist = new String[3];
//         playlist[0] = "Song 1";
//         System.out.println(playlist[0]);
//         playlist[1] = "Song 2";
//         System.out.println(playlist[1]);
//         playlist[2] = "Song 3";
//         System.out.println(playlist[2]);
//     }
// }

// class hello {
//     public static void main(String args[]){
//         String[] playlist = {"song 1", "song 2", "song 3"};
//         System.out.println(playlist[0]);
//     }
// }



// class hello {
//     public static void main(String args[]){
//         int[] playlist = {1, 2, 3};
//         System.out.println(playlist[0]);
//     }
// }

// import java.util.Scanner;

// class hello {
//     public static void main(String args[]){
//         int[] playlist = new int[5];
//         Scanner input = new Scanner(System.in);
//         playlist[0] = input.nextInt();
//         playlist[1] = input.nextInt();
//         playlist[2] = input.nextInt();
//         playlist[3] = input.nextInt();
//         System.out.println(playlist[0] + playlist[1] + playlist[2] + playlist[3]);
//     }
// }


//          26 - Apr - 2025
//  practice

// import java.util.Scanner;
// class hello{
//     public static void main(String args[]){
//         int[] playlist = new int[5];
//         Scanner input = new Scanner(System.in);
//         for(int i = 0; i < playlist.length; i++){
//             playlist[i] = input.nextInt();
//         }
//         for(int i = 0; i < playlist.length; i++){
//             System.out.println(playlist[i]);
//         }
//     }
// }


// import java.util.Scanner;
// class hello{
//     public static void main(String args[]){
//         Scanner input = new Scanner(System.in);
//         for (int i = 1; i <= input.nextInt(); i++) {
//             System.out.println(i + "*2 = " + i*2);
//         }
//     }
// }


// import java.util.Scanner;
// class hello{
//     public static void main(String args[]){
//         Scanner input  = new Scanner(System.in);
//         int[] array = new int[input.nextInt()];
//         for (int i = 0; i <= input.nextInt() - 1; i++) {
//             System.out.println(array[i]);
//         }
//     }
// }

//  nested loop
// class hello{
//     public static void main(String args[]){
//         for (int i = 0; i < 1; i++) {
//             System.out.println(i + "Mohan");
//             for (int j = 0; j < 2; j++) {
//                 System.out.println(j + "Mohan");
//             }
//         }
//     }
// }

// class hello{
//     public static void main(String args[]){
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) System.out.print("*");
//             System.out.println();
//         }
//     }
// }

// class hello{
//     public static void main(String args[]){
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 0; j < i; j++) System.out.print("*");
//             System.out.println();
//         }
//     }
// }


//          27 - Apr - 2025
//  while loop

// class hello{
//     public static void main(String args[]){
//         int j = 1;
//         while (j <= 2) {
//             System.out.println("step j = " + j);
//             j++;
//         }
//     }
// }

// import java.util.Random;
// class hello{
//     public static void main(String args[]){
//         Random rand = new Random();
//         int randNum = 0;
//         while (randNum != 5) {
//             randNum = rand.nextInt(6);
//             System.out.println(randNum);
//         }
//     }
// }

//  do-while loop

// class hello{
//     public static void main(String args[]){
//         int i = 1;
//         do{
//             System.out.println("i = " + i);
//             i++;
//         } while(i <= 3);
//     }
// }

import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        do{
            System.out.println("Please enter the number above 10");
            count = scan.nextInt();
        } while(count < 10);
    }
}