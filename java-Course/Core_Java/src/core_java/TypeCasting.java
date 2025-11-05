/*
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
*/
package core_java;




