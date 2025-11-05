/*
					Exceptions in Java
	In Java, exceptions are unexpected events or
		errors that occur during the execution of a program,
			disrupting the normal flow of the program.


🔹 Types of Exceptions
	1. Checked Exceptions (Compile-Time)
		* Checked by the compiler.
		* Must be either caught using try-catch or declared using throws.
		* Example: IOException, SQLException, FileNotFoundException.
		
	2. Unchecked Exceptions (Runtime)
		* Not checked by the compiler.
		* Occur during program execution.
		* Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.

	3. Errors (Not typically handled)
 		* Serious problems like OutOfMemoryError, StackOverflowError.
 		* Usually not handled by the programmer.
 
🔹 Exception Hierarchy
		java.lang.Object
	    ↳ java.lang.Throwable
	        ↳ java.lang.Exception  (can be handled)
	            ↳ Checked Exceptions
	            ↳ Unchecked Exceptions (RuntimeException)
	        ↳ java.lang.Error      (cannot be handled)



| Exception                        | Type      | When it occurs             |
| -------------------------------- | --------- | -------------------------- |
| `ArithmeticException`            | Unchecked | Divide by zero             |
| `NullPointerException`           | Unchecked | Using null object          |
| `ArrayIndexOutOfBoundsException` | Unchecked | Invalid array index access |
| `FileNotFoundException`          | Checked   | File not found             |
| `IOException`                    | Checked   | Input/output failed        |
| `ClassNotFoundException`         | Checked   | Class not found at runtime |



🔹 Handling Exceptions:
						1. try-catch block
	* In Java, try-catch is used to handle exceptions (errors) without crashing our program.

package my_java_package_name;

public class Exceptions {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {				//	Runtime exception
			System.out.println("Cannot divide by zero");
		}
	}
}


🔹 			2. finally block
	* The finally block in Java is used to write code that should always run, whether an exception occurs or not.
	
package my_java_package_name;

public class Exceptions {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Cannot divide by zero");
		} finally {
			System.out.println("The block always runs");
		}
	}
}



🔹 			3. throw - Method 01
	* In Java, throw is a keyword used to manually throw an exception in your code.

package my_java_package_name;

public class Exceptions {
	public static void main(String[] args) {
		int age = 30;
		try {
			if(age < 10) {
				throw new Exception("Not eligible");
			}
		} catch (Exception e) {
			System.out.println("Age is lesser or greater than the " + age);
		}
	}
}


🔹 throw - Method 02

package my_java_package_name;

public class Exceptions {
	public static void main(String[] args) throws Exception {
		int age = 29;
		try {
			if(age < 30) {
				throw new Exception("Eligible");
			} else {
				System.out.println("Not eligible");
			}
		} catch (Exception e) {
			System.out.println("Exception caught : " + e.getMessage());
		}
	}
}



🔹 				4. throws
	* In Java, **throws** is a keyword used to declare that a method might throw one or more exceptions.
	* It tells the compiler and the caller:

package my_java_package_name;

public class Exceptions {
	public static void main(String[] args) throws Exception {
		int age = 29;
		try {
			if(age < 30) {
				throw new Exception("Eligible");
			} else {
				System.out.println("Not eligible");
			}
			
		} catch (Exception e) {
			System.out.println("Exception caught : " + e.getMessage());
		}
	}
}


 */
package core_java;


