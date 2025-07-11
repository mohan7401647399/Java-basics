/*
method types
public class Practice{
	public static void main(String[] args){
		f1();
		f2(10);
		System.out.println(f3());
		System.out.println(f4(20));
	}
		public static void f1(){
			System.out.println("Non-return type with no parameter");
	}
		public static void f2(int num){
			System.out.println("Non-return type with parameter " + num);
	}
		public static String f3(){
			return "return type with no parameter";
	}
		public static String f4(int num){
			return "return type with parameter " + num;
	}
}
*/


/*
Data-types 
public class Practice{
	public static void main(String[] args) {
		byte bit = 1;
		System.out.println(bit);
		short sort = 30000;
		System.out.println(sort);
		int num = 10;
		System.out.println(num);
		long longNum = 20000000;
		System.out.println(longNum);
		float floatNum = 1.203f;
		System.out.println(floatNum);
		double doubleNum = 1.25252525;
		System.out.println(doubleNum);
		Boolean value = true;
		System.out.println(value);
		String str = "name";
		System.out.println(str);	
	}
}
*/


/* Variables */
/*Local-variable
public class Practice{
	public static void main(String[] args) {
		f1(10);
	}
	public static void f1(int num) {
		int nums;
		nums = 10;
		System.out.println(nums);
	}
}
*/


/* Global -> 1. Instance variable 

public class Practice{
	int nums = 20;						//	local variable
	static int nums = 10;				//	instance variable
	public static void main(String[] args) {
		System.out.println(nums);
	}
}
*/


/*Conditional statements */

// public class Practice {
// 	public static void main(String[] args) {
		// if(true){
		// 	System.out.println("if statments");
		// }

		// if(false){
		// 	System.out.println("true");
		// } else{
		// 	System.out.println("false");
		// }

		// int score = 10;
		// if(score < 35){
		// 	System.out.println("fail");
		// }else if(score >= 40) {
		// 	System.out.println("Just pass");
		// } else{
		// 	System.out.println("pass");
		// }

		// String day = "Wednesday";
		// switch (day) {
			// 	case "Monday":
			// 		System.out.println("Work day");
			// 		break;
			// 	case "Wednesday":
			// 		System.out.println("Midweek!");
			// 		break;
			// 	case "Saturday":
			// 		System.out.println("Weekend!");
			// 		break;
			// 	default:
			// 		System.out.println("Regular day");
			// }
			
		//	Java 14+
		// String day = "Wednesday";
		// switch (day) {
		// 	case "Monday" -> System.out.println("Work day");
		// 	case "Wednesday" -> System.out.println("Midweek!");
		// 	default -> System.out.println("Regular day");
		// }
// 	}
// }


//	Loops
//	for loop
//	Use Case: When iterations are known in advance (e.g., array traversal).
// for (initialization; condition; update) {  
//     // code to repeat
// }
/*
public class Practice {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
*/


// while Loop
//	Use Case: When iterations are unknown (e.g., reading input until valid).
//	*** Condition checked before entering the loop.
// ***Zero iterations possible if condition is initially false.

// while (condition) {  
//     // code to repeat
// }
/*
public class Practice {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}
}
*/


// do-while Loop
//	Use Case: When you need at least one iteration (e.g., menu systems).
//	*** Condition checked after each iteration.
//	*** Loop body executes at least once.

// do {  
//     // code to repeat
// } while (condition);
// public class Practice {
// 	public static void main(String[] args) {
// 			int i = 0;
// 			do {
// 				System.out.println(i);
// 				i++;
// 			} while (i < 5);
// 	}
// }



// public class Practice{
// 	public static void main(String[] args){
		
// 		int a=120,b=200,c=130,d=140;
		// int max=0,min=a;
		// if(a > max){
		// 	max = a;
		// } 
		//  if(a < min){
		// 	min = a;
		// } 
		// if(b > max){
		// 	max = b;
		// }
		// if(b < min){
		// 	min = b;
		// }
		// if(c > max){
		// 	max = c;
		// }
		// if(c < min){
		// 	min = c;
		// }
		// if(d > max){
		// 	max = d;
		// }
		// if(d < min){
		// 	min = d;
		// }
// 		System.out.println(max);
// 		System.out.println(min);
// 	}
// }



//	ternary operator
/*
public class Practice{
	public static void main(String[] args){
		int a = 5, b = 20, c = 30, d = 40;
		int max = (a < b) ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d )) : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));
		System.out.println("Max number is " + max);
		int min = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d )) : ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));
		System.out.println("Min number is " + min);
	}
}
*/


//	even or odd nums
// public class Practice{
// 	public static void main(String[] args){
// 		EvenNum(20);
// 		OddNum(20);
// 		EvenNumCount(20);
// 		OddNumCount(20);
// 		EvenNumSum(20);
// 		OddNumSum(20);
// 	}
// 	public static void EvenNum(int num){
// 			for(int i = 0; i < num; i++){
// 				if(i % 2 == 0) System.out.println("Even number is "+ i);
// 		}
// 	}
// 		public static void OddNum(int num){
// 			for(int i = 0; i < num; i++){
// 				if(i % 2 != 0) System.out.println("Odd number is "+ i);
// 		}
// 	}
// 		public static void EvenNumCount(int num){
// 			int count = 0;
// 			for(int i = 0; i < num; i++) if(i % 2 == 0) count++;
// 			System.out.println("Even numbers total count is "+ count);
// 	}
// 			public static void OddNumCount(int num){
// 			int count = 0;
// 			for(int i = 0; i < num; i++) if(i % 2 != 0) count++;
// 			System.out.println("Odd numbers total count is "+ count);
// 	}
// 			public static void EvenNumSum(int num){
// 			int count = 0;
// 			for(int i = 0; i < num; i++) if(i % 2 == 0) count += i;
// 			System.out.println("Even numbers total is "+ count);
// 	}
// 			public static void OddNumSum(int num){
// 			int count = 0;
// 			for(int i = 0; i < num; i++) if(i % 2 != 0) count += i;
// 			System.out.println("Odd numbers total is "+ count);
// 	}
// }


