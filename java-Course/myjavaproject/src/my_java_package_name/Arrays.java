/*
 		Array linear data structure

	In Java, an array is a collection of elements of the same data type stored in contiguous memory locations.
	It allows you to store multiple values in a single variable, instead of declaring separate variables for each value.


🔹 Array Features:
	Fixed size (you can't change its length after creation)
	Zero-based indexing (first element is at index 0)
	Same data type for all elements (e.g., all int, or all String)



🔸 Array Declaration & Initialization
	1. Declare and then assign:
			int[] marks = new int[5];							//	declares an array of size 5
			marks[0] = 50;										//	assign values to index 0
			marks[1] = 20;										//	assign values to index 1

			String[] marks = new String[5];						//	declares an array of size 5
			marks[0] = "first";									//	assign values to index 0
			marks[1] = "second";								//	assign values to index 1

	2. Declare and initialize at the same time:
			int[] marks = {10,20,30,40};
			String[] marks = {"first", "second", "third"};


🔹 Accessing Array Elements
		System.out.println(marks[0]);  						// accessing by index only
		System.out.println(marks[3]);  						// accessing by index only


🔸 Looping Through an Array
		Using for loop:
				int[] marks = {10,20,30,40,50};
				for(int i = 0; i < marks.length; i++) {
					System.out.println(marks[i]);
				}
				
		Using for-each loop:
				int[] marks = {10,20,30,40,50};
				for(int mark : marks) {
					System.out.println(mark);
				}


🔸 Array Types
| Type             						| Example                               |
| ---------------- 						| ------------------------------------- |
| **One-Dimensional Array(1D) Array**   | `int[] nums = {1, 2, 3};`             |
| **Two-Dimensional Array(2D) Array**   | `int[][] matrix = {{1,2},{3,4}};`     |
| **String Array** 						| `String[] names = {"Mohan", "Amit"};` |



⚠️ Notes:
	* Accessing an invalid index (like marks[10] in a 5-size array) throws ArrayIndexOutOfBoundsException.
	* Arrays are objects in Java. You can access their length with .length (no parentheses).




🔹 1D Array Example (One-Dimensional Array)
			int[] marks = {10,20,30,40,50};
			for(int i = 0; i < marks.length; i++) {
				System.out.println(marks[i]);
			}
			for(int mark : marks) {
				System.out.println(mark);
			}


🔸 2D Array Example (Two-Dimensional Array)
			int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Declare & initialize a 2D array

			System.out.println("print all elements");
			for (int i = 0; i < matrix.length; i++) {					//	rows
				for (int j = 0; j < matrix[i].length; j++) {			//	columns
					System.out.println(matrix[i][j]);
				}
				System.out.println();									//	move to next line after each row(optional)
			}

 */

package my_java_package_name;

public class Arrays {

	public static void main(String[] args) {
		arrayClass();
	}

	public static void arrayClass() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Declare & initialize a 2D array

		System.out.println("print all elements");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
}
