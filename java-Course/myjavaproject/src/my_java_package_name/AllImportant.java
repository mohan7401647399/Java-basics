/*

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
 */