//  The Scanner class in Java (from java.util package) is used to read input from various sources like the keyboard, files, or strings. 
//  It simplifies parsing primitive types and strings using regular expressions.


//  Key Features
            // Reads input from System.in (keyboard), files, strings, etc.
            // Parses input into primitives (int, double, etc.) or strings.
            // Tokenizes input using delimiters (default: whitespace).



//  1. Basic Setup & Usage

//  * Step 1: Import Scanner *
            // import java.util.Scanner;                // Required import

//  * Step 2: Create Scanner Object *
            // Scanner sc = new Scanner(System.in);     // Read from keyboard

//  * Step 3: Read Input *
            // System.out.print("Enter your name: ");
            // String name = sc.nextLine();             // Read entire line

            // System.out.print("Enter your age: ");
            // int age = sc.nextInt();                  // Read integer

//  * Step 4: Close Scanner *
//          sc.close();                                 // Prevent resource leaks


//  2. Common Input Methods

// Method	    |                Description             |	        Example Input → Output

// nextLine()	    Reads entire line (including spaces)	     "Java Rocks" → "Java Rocks"
// next()	        Reads single word (until whitespace)	     "Java Rocks" → "Java"
// nextInt()	    Reads int	                                 "25" → 25
// nextDouble()	    Reads double	                             "3.14" → 3.14
// nextBoolean()	Reads boolean (true/false)	                 "true" → true
// hasNextXxx()	    Checks if next token is of type Xxx	         sc.hasNextInt() → true/false


//  code

//                                          next()
// import java.util.Scanner;
// public class input{
//     public static void main(String[] args){
//         Scanner str = new Scanner(System.in);
//         System.out.println("Enter your name ");
//         String name = str.next();
//         System.out.println("Entered name is " + name);
//     }
// }


//                                              nextLine()
// import java.util.Scanner;
// public class input {
//     public static void main(String[] args){
//         Scanner inputScan = new Scanner(System.in);

//         System.out.println("Enter Your Name: ");
//         String name = inputScan.nextLine();
//         System.out.println("Entered name is "+ name);
//     }
// }


//                                              nextInt()
// import java.util.Scanner;
// public class input{
//     public static void main(String[] args){
//         Scanner numInput = new Scanner(System.in);
//         System.out.println("Enter your number ");
//         int num = numInput.nextInt();
//         System.out.println("Entered number is " + num);
//     }
// }


//                                              nextDouble()
// import java.util.Scanner;
// public class input{
//     public static void main(String[] args){
//         Scanner nums = new Scanner(System.in);
//         System.out.println("Enter your float num ");
//         double num = nums.nextDouble();
//         System.out.println("Entered num is " + num);
//     }
// }


//                                          nextBoolean()
// import java.util.Scanner;
// public class input{
//     public static void main(String[] args){
//         Scanner isTrue = new Scanner(System.in);
//         System.out.println("Enter your boolean value ");
//         boolean isTrueOrNot = isTrue.nextBoolean();
//         System.out.println("Entered boolean value is " + isTrueOrNot);
//     }
// }


//                                      char
// import java.util.Scanner;
// public class input{
//     public static void main(String[] args){
//         Scanner charStr = new Scanner(System.in);
//         System.out.println("Enter your word ");
//         char str = charStr.next().charAt(0);
//         System.out.println(str);
//     }
// }