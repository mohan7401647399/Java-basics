/*


 								*****Class + Main Method Structure*****

package core_java;

public class NamingConverntion_TypeCasting {

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





--------------------------------------------------------------------------------------------------------------------------------------

 									*****Methods (Void & Return Type)*****

Void Method
private static void m1() {
    // No return value
}

Return Type Method
private static int m2() {
    return 10;
}



--------------------------------------------------------------------------------------------------------------------------------------




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

	
	

--------------------------------------------------------------------------------------------------------------------------------------



				*****enum*****

	In Java, an enum (short for enumeration) is a special data type used to define a collection of constants (fixed set of values).

 ✅ When to use Enum?
		When you need a fixed set of related constants (like days of week, directions, status codes, colors, etc.).
		Makes code readable, type-safe, and organized.
 
 

enum Level { // Enum - class
	BEGINNER("beginner"), INTERMEDIATE("intermediate"), ADVANCED("advanced");

	private String abbr;

	Level(String ab) {
		abbr = ab;
	}
	public String display() {
		return abbr;
	}
}

class AllImportant {
	public static void main(String[] args) {
		Level levelBeginner = Level.BEGINNER;
		Level levelIntermediate = Level.INTERMEDIATE;
		Level levelAdvanced = Level.ADVANCED;
		System.out.println(levelBeginner);
		System.out.println(levelBeginner.ordinal());
		System.out.println(levelIntermediate);
		System.out.println(levelIntermediate.toString());
		System.out.println(levelAdvanced);

		System.out.println(levelBeginner.display());
	}
}





--------------------------------------------------------------------------------------------------------------------------------------


				*****Inner class*****


	In Java, an inner class is simply a class defined inside another class.
	It helps group classes that are only used in one place, making your code more readable, logical, and encapsulated.


✅ Why use Inner Classes?
	Encapsulation → Group logically related classes.
	Code readability → Keeps helper classes inside main class.
	Access private members → Inner class can access outer class’s private fields.
	Useful in GUI & multithreading → Anonymous inner classes often used with event listeners.


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




--------------------------------------------------------------------------------------------------------------------------------------



				*****Varargs - Variable Arguments*****


	Varargs in Java stands for Variable Arguments.
	It allows a method to accept zero or multiple arguments of the same type without explicitly defining them as an array.


class AllImportant {

	static int minValue(int... vals) {
		int min = Integer.MAX_VALUE;

		for (int num : vals) {
			if (num < min)
				min = num;
		}
		return min;
	}

	public static void main(String[] args) {
		int result = minValue(5, 7, 1, 6, 9);
		System.out.println(result);
		int result1 = minValue(5, 7, 1, 6, 9);
		System.out.println(result1);
		int result2 = minValue();
		System.out.println(result2);
	}
}



class AllImportant {

	static double minValue(double... vals) {
		double min = Double.MAX_EXPONENT;

		for (double num : vals) {
			if (num < min)
				min = num;
		}
		return min;
	}

	public static void main(String[] args) {
		double result = minValue(5.0, 7.1, 1.8, 6.5, 9.0);
		System.out.println(result);
		double result1 = minValue(5.9, 7.4, 1.0);
		System.out.println(result1);
		double result2 = minValue();
		System.out.println(result2);
	}
}






--------------------------------------------------------------------------------------------------------------------------------------



						*****Final*****


/*
		In Java, the final keyword is used to restrict modification. 
	It can be applied to:


1. Final Variable
	* A final variable’s value cannot be changed once assigned.
	* It becomes a constant.


package my_java_package_name;

public class Final {
	
	static String name = "Mohan";							//	static variable
	final String place = "Chennai";							//	final variable
//	String place = "madurai";								//	❌ Error: Cannot assign a value to final variable 'place'
		
	public static void main(String[] args) {
		System.out.println(name);							//	call static variable directly
		Final f1 = new Final();								//	create an object
		System.out.println(f1.place);						//	call final variable using object
	}
}




2. Final Method
	* A final method cannot be overridden by subclasses.

package my_java_package_name;

class Parent {
	final void show() {										//	final method
		System.out.println("This is a final method");
	}
}

class Child extends Parent{
	void show() {											// ❌ Error: Cannot override final method
		System.out.println("Trying to method override");
	}
}

public class Final {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.show();
	}
}



3. Final Class
	* A final class cannot be extended (no sub-classing).

package my_java_package_name;

final class Parent {
	void show() {										//	final method
		System.out.println("This is a final method");
	}
}

class Child extends Parent{								// ❌ Error: Cannot inherit from final class
	void show() {
		System.out.println("Trying to method override");
	}
}

public class Final {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.show();
	}
}






--------------------------------------------------------------------------------------------------------------------------------------




						***** Comparator vs Comparable *****


✅ Comparator (Custom Ordering)
	Defined in java.util package.
	Used to define multiple different sorting orders for objects.
	A separate Comparator class (or lambda) implements Comparator<T> and overrides compare().
	You can create multiple Comparators for different sort logics.

Syntax:
	class MyComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass a, MyClass b) {
        // return negative if a < b
        // return zero if a == b
        // return positive if a > b
    	}	
	}




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AllImportant {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(9);
		list.add(4);

		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if (i % 2 > j % 2) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, com);
		System.out.println(list);
	}
}








import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int age;	

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student Name is : " + name + " Student Age is : " + age;
	}
	
};

class AllImportant {
	public static void main(final String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Mohan", 29));
		list.add(new Student("john", 20));
		list.add(new Student("alen", 15));
		list.add(new Student("James", 30));

		final Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student i,  Student j) {
				if (i.age > j.age) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(list, com);

		for(Student s : list){
			System.out.println(s);
		}
	}
}







import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student Name is : " + name + " Student Age is : " + age;
	}

};

class AllImportant {
	public static void main(final String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Mohan", 29));
		list.add(new Student("john", 20));
		list.add(new Student("alen", 15));
		list.add(new Student("James", 30));

		Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

		Collections.sort(list, com);

		for (Student s : list) {
			System.out.println(s);
		}
	}
}






import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cars {
	String name;
	int year;

	Cars(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String display() {
		return " Car name is : " + name + " Year is : " + year;
	}
}

class AllImportant {
	public static void main(String[] args) {
		List<Cars> car = new ArrayList<>();
		car.add(new Cars("BMW", 2000));
		car.add(new Cars("Volvo", 2010));
		car.add(new Cars("Toyoto", 2005));
		car.add(new Cars("Suzuki", 2020));

		Comparator<Cars> cars = (i, j) -> i.year > j.year ? 1 : -1;

		Collections.sort(car, cars);

		for (Cars c : car) {
			System.out.println(c.display());
		}
	}
}







✅ Comparable (Natural Ordering)
	Defined in java.lang package.
	Used to define the default (natural) sorting order of objects.
	A class implements Comparable<T> and overrides the compareTo() method.
	Only one compareTo() method can be defined in a class.

Syntax:
	class MyClass implements Comparable<MyClass> {
    @Override
    public int compareTo(MyClass other) {
        // return negative if this < other
        // return zero if this == other
        // return positive if this > other
    	}
	}



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student Name is : " + name + " Student Age is : " + age;
	}

	@Override
	public int compareTo(Student that) {
		return this.age > that.age ? 1 : -1;
	}

	

};

class AllImportant {
	public static void main(final String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Mohan", 29));
		list.add(new Student("john", 20));
		list.add(new Student("alen", 15));
		list.add(new Student("James", 30));

		Collections.sort(list);

		for (Student s : list) {
			System.out.println(s);
		}
	}
}








import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cars implements Comparable<Cars> {
	String name;
	int year;

	Cars(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String display() {
		return " Car name is : " + name + " Year is : " + year;
	}

	public int compareTo(Cars y) {
		return this.year > y.year ? 1 : -1;
	}
}

class AllImportant {
	public static void main(String[] args) {
		List<Cars> car = new ArrayList<>();
		car.add(new Cars("BMW", 2000));
		car.add(new Cars("Volvo", 2010));
		car.add(new Cars("Toyoto", 2005));
		car.add(new Cars("Suzuki", 2020));

		Collections.sort(car);

		for (Cars c : car) {
			System.out.println(c.display());
		}
	}
}





--------------------------------------------------------------------------------------------------------------------------------------

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





--------------------------------------------------------------------------------------------------------------------------------------




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




--------------------------------------------------------------------------------------------------------------------------------------



 							*****Naming Conventions (Industry Standard)*****


| Element            | Convention | Example                       |
| ------------------ | ---------- | ----------------------------- |
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



--------------------------------------------------------------------------------------------------------------------------------------


 									*****Wrapper Class*****

    🔹 What is Wrapper Class in Java?
        Wrapper classes are used to wrap primitive data types (like int, char, boolean) into objects.
	
	For example:
        | primitive type | wrapper class |
        | -------------- | ------------- |
        | int            | Integer       |
        | char           | Character     |
        | boolean        | Boolean       |
        | double         | Double        |
        | byte           | Byte          |
        | float          | Float         |
        | short          | Short         |
        | long           | Long          |


    Why Wrapper Classes?
        Needed when working with collections (ArrayList, etc.)
        Provide utility methods (like parseInt())
        Used in serialization, synchronization, etc.

	
        Integer oldVersion = new Integer(5);       //  old version
        System.out.println(oldVersion);

        Integer newVersion = Integer.valueOf(1);       //  new version
        System.out.println(newVersion);


    ✅ Auto-boxing and Un-boxing
        🟩 Auto-boxing:
            Automatic conversion of primitive → Wrapper object.

            int a = 10;
            Integer obj = a;   // auto-boxing


        🟥 Un-boxing:
            Automatic conversion of Wrapper object → primitive.

            Integer newVersion = Integer.valueOf(1);
            int b = newVersion;	//	Un-boxing


    ✅ Summary
        | Term       | Meaning                                      |
        | ---------- | -------------------------------------------- |
        | Wrapper    | Object version of a primitive type           |
        | Boxing     | Primitive → Wrapper (manual or auto)         |
        | Autoboxing | Automatically converting primitive to object |
        | Unboxing   | Wrapper → Primitive                          |


    🔔 Small interview type points:
        Wrapper classes are found in java.lang package.
        Java 5 introduced autoboxing and unboxing.
        Prior to Java 5, you had to manually do: Integer i = new Integer(10); and int x = i.intValue();
        Useful methods: Integer.parseInt("123"), Double.parseDouble("4.5")



package core_java;

public class WrapperClass {
    public static void main(String[] args) {

        int i = 5; // primitive data type

        // auto-boxing(primitive to object)
        Integer i1 = i; // Same as Integer.valueOf(20) -> auto-boxing
        System.out.println("auto-boxing : " + i1);

        Integer i2 = Integer.valueOf(i); // Boxing or Wrapping
        System.out.println("boxing : " + i2);

        // un-boxing (object to primitive)
        int i4 = i2; // un-boxing
        System.out.println("un-boxing : " + i4);

        int i3 = i1.intValue(); // un-boxing
        System.out.println("un-boxing : " + i3);


        String s = "123"; // string to int
        System.out.println("Str to int : " + Integer.parseInt(s));
    }
}




--------------------------------------------------------------------------------------------------------------------------------------

 									*****Scanner*****

//  The Scanner class in Java (from java.util package) is used to read input from various sources like the keyboard, files, or strings. 
//  It simplifies parsing primitive types and strings using regular expressions.


//  Key Features
            // Reads input from System.in (keyboard), files, strings, etc.
            // Parses input into primitives (int, double, etc.) or strings.
            // Tokenizes input using delimiters (default: whitespace).



//  1. Basic Setup & Usage

//  * Step 1: Import Scanner *-
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



--------------------------------------------------------------------------------------------------------------------------------------


 									*****Inner Class*****


	✅ What is an Inner Class?
        An inner class is a class defined inside another class.
        It is used to logically group classes, increase encapsulation, and sometimes to access members of the outer class more easily.
	
	
    🔹 Types of Inner Classes in Java
            | Type of Inner Class          | Description                                                      |
            | ---------------------------- | ---------------------------------------------------------------- |
            | 1. **Member Inner Class**    | Normal class inside another class (non-static)                   |
            | 2. **Static Nested Class**   | Static class inside another class                                |
            | 3. **Local Inner Class**     | Class defined inside a method                                    |
            | 4. **Anonymous Inner Class** | Class with no name (used for instant override or implementation) |



    🔸 1. Member Inner Class

class Outer{
    private int x = 10;

    class Inner{
        void show(){
            System.out.println("x value is " + x );
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        Outer o1 = new Outer();
        Outer.Inner o2 = o1.new Inner();
        o2.show();
    }
}




    🔸 2. Static Nested Class

class Outer{
    static int x = 10;

    static class Inner{
        void show(){
            System.out.println("x value is " + x );
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        Outer.Inner o2 = new Outer.Inner();
        o2.show();
    }
}



    🔸 3. Local Inner Class (inside method)

class Outer{
    void display(){
        class Local{
            void show(){
                System.out.println("Local inner inside method");
            }
        }
        Local obj = new Local();
        obj.show();
    }
}

public class InnerClass {
    public static void main(String[] args){
        new Outer().display();
    }
}





    🔸 4. Anonymous Inner Class
    Used mostly with interfaces or abstract classes to create objects on-the-fly without naming the class.

abstract class Outer {
    abstract void inner();
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o1 = new Outer() {
            void inner(){
                System.out.println("inner method using anonymous class");
            }
        };
        o1.inner();
    }
}


package core_java;

abstract class Outer {
    abstract void inner();
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o1 = new Outer() {
            void inner(){
                System.out.println("inner method using anonymous class");
            }
        };
        o1.inner();
    }
}







--------------------------------------------------------------------------------------------------------------------------------------

 									*****memory*****



/*
	In Java, memory is managed through the **Java Memory Model (JMM)**. It divides memory into several regions, each with a specific purpose. 

### ✅ **Main Memory Areas in Java**

| Memory Area                       | Description                                                                 |
| --------------------------------- | --------------------------------------------------------------------------- |
| **Heap**                          | Stores objects and instance variables. Shared by all threads.               |
| **Stack**                         | Stores method calls, local variables, and references. One stack per thread. |
| **Method Area**                   | Stores class-level metadata (static variables, class info, constants).      |
| **Program Counter (PC) Register** | Stores the current instruction address of the thread. One PC per thread.    |
| **Native Method Stack**           | Used for native methods (written in C/C++ via JNI).                         |


### 🔹 **1. Heap Memory**

* **Stores:** Objects, class instances, arrays.
* **Garbage Collected:** Yes.
* **Example:**

  Student s = new Student();  // s is reference in stack, object is in heap


### 🔹 **2. Stack Memory**

* **Stores:** Local variables, method calls, object references.
* **Thread-specific:** Each thread has its own stack.
* **Example:**

  int a = 5;  // 'a' stored in stack


### 🔹 **3. Method Area (aka Metaspace in Java 8+)**

* **Stores:** Class definitions, static variables, method metadata, constant pool.
* **Shared:** Among all threads.
* **Note:** Pre-Java 8: Part of PermGen (deprecated). Java 8+: Moved to Metaspace.


### 🔹 **4. PC Register**

* **Stores:** Address of the JVM instruction being executed for the current thread.
* **Thread-specific**


### 🔹 **5. Native Method Stack**

* **Stores:** Information for native methods used in Java via **JNI (Java Native Interface)**.
* Used less frequently unless working with native libraries.


### 🧠 Summary Diagram

               +---------------------------+
               |      Method Area          | <- class metadata, static vars
               +---------------------------+
               |          Heap             | <- objects, arrays
               +---------------------------+
Thread 1 --->  |          Stack            | <- method calls, local vars
              |   PC Register (Thread 1)   |
              |   Native Method Stack      |
              +---------------------------+

Thread 2 --->  |          Stack            |
              |   PC Register (Thread 2)   |
              |   Native Method Stack      |
              +---------------------------+

### 🔍 Optional: JVM Internal Memory Breakdown

* **Young Generation (Eden + Survivor spaces)**
* **Old Generation (Tenured)**
* **Garbage Collector** works across these generations in the heap



--------------------------------------------------------------------------------------------------------------------------------------


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




--------------------------------------------------------------------------------------------------------------------------------------


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


    ✅ Why do we need Upcasting and Downcasting?
        Why Up-casting?
            To write generalized code.
            Use parent type to refer to any child object.
            Useful in polymorphism (runtime polymorphism).
        Why Down-casting?
            To access child-specific methods after upcasting.
            Needed when a parent reference actually refers to a child object.


    ✅ When to use?
        | Operation       | When to use                                                                                              |
        | --------------- | -------------------------------------------------------------------------------------------------------- |
        | **Up-casting**   | When working with polymorphism, and you only need parent methods                                         |
        | **Down-casting** | When you need to access child-specific features and you are sure the object is actually a child instance |


    ⚠ Important Notes:

        Down-casting is dangerous if the object is not actually an instance of the child class. It can throw ClassCastException.
        Always check using instanceof before down-casting:

    if (a instanceof Dog) {
        Dog d2 = (Dog) a;
    }


*/