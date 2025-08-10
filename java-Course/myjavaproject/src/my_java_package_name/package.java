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




//                              Specific class
// import java.util.Scanner;
// public class practice {
//     public static void main(String[] args){
//         Scanner string = new Scanner(System.in);
//         System.out.println("Enter your name ");
//         String str = string.nextLine();
//         System.out.println("Entered name is " + str);
//     }
// }

//                          All classes in package
// import java.util.*;
// public class practice{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         String str = scan.nextLine();
//         System.out.println(str);
//     }
// }


//                              Specific class
// import java.lang.Math;
// public class practice{
//     public static void main(String[] args){
//         System.out.println(Math.sqrt(2));
//     }
// }


//                                      Static Import
// public class practice{
//     public static void main(String[] args){
//         System.out.println(Math.sqrt(2));
//     }
// }


//                                      Static Import
// import static java.lang.Math.sqrt;
// public class practice{
//     public static void main(String[] args){
//         System.out.println(sqrt(2));
//     }
// }