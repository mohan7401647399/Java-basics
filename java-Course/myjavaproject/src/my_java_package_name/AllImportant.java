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



*/

