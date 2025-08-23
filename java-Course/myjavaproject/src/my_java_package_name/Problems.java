/*
1.Reverse a string
	Method 01

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		String[] splitStr = name.split("");
		String str = "";
		for(int i = 0; i < splitStr.length; i++) {
			str = splitStr[i] + str;
		}
		System.out.println(str);
	}
}


	Method 02
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		String[] splitStr = name.split("");
		String str = "";
		for(int i = splitStr.length - 1; i >= 0; i--) {
			str += splitStr[i];
		}
		System.out.println(str);
	}
}



	Method 03
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		String[] splitStr = name.split("");
		String str = "";
		for(int i = splitStr.length - 1; i >= 0; i--) {
			String temp = splitStr[i];
			splitStr[i] = splitStr[splitStr.length - 1];
			splitStr[splitStr.length - 1] = temp;
		}
		System.out.println(str);
	}
}


	Method 04
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		String str = "";
		for(int i = name.length() - 1; i >= 0; i--) {
			str += name.charAt(i);
		}
		System.out.println(str);
	}
}



	Method 05
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		StringBuilder sb = new StringBuilder(name);
		String reverseStr = sb.reverse().toString();
		System.out.println(reverseStr);
	}
}



	Method 06
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan";
		char[] chars = name.toCharArray();
		for(int i = chars.length - 1; i >= 0; i--) {
			System.out.println(chars[i]);
		}
	}
}



	Method 07
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		String name = "Mohan";
		String reverse = m1(name);
		System.out.println(reverse);
	}
	public static String m1(String str) {
		if(str.isEmpty()) return str;
		return m1(str.substring(1)) + str.charAt(0);
	}
}


	Method 08
package my_java_package_name;

import java.util.Stack;

public class Problems {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		String name = "Mohan";
		Stack<Character> stack = new Stack<>();
		
		for(char c : name.toCharArray()) {
			stack.push(c);
		}
		
		String str = "";
		
		while(!stack.isEmpty()) {
			str += stack.pop();
		}
		
		System.out.println(str);
	}
}


______________________________________________________________________


2.Get a value in the string

	Method 01

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a Java developer";
	
		if(name.contains("Java")) {
			System.out.println("Word found");
		} else {
			System.out.println("word is not found");
		}
	}
}



	Method 02

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a Java developer";
		
		int index = name.indexOf("Java");
	
		if(index != -1) {
			System.out.println("Word found");
		} else {
			System.out.println("word is not found");
		}
	}
}



	Method 03

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a Java developer";
		
		char ch = name.charAt(2);
		System.out.println("character at index is " + ch);
	}
}



	Method 04
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a /Java developer";
		
		if(name.matches(".*Java.*")) {
			System.out.println("Word matched");
		} else {
			System.out.println("Word is not matched");
		}
	}
}




	Method 05
package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		String name = "Mohan is a Java developer";
		char target = 'g';
		boolean found = false;
		
		for(int i = 0; i < name.length(); i++) {
			if(name.indexOf(i) == target) {
				found = true;
				System.out.println("word found");
				break;
			} 
		}
		if(!found) {
			System.out.println("word is not found");
		}
	}
}
___________________________________________________________________



3.Duplicate character value in the string

	Method 01

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		String name = "apple";
		char[] chars = name.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					System.out.println("Duplicate words is " + chars[i]);
				}
			}
		}
	}
}
 

package my_java_package_name;

public class Problems {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		String name = "apple";
		char[] chars = name.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					System.out.println("Duplicate words is " + chars[i]);
				}
			}
		}
	}
}






String Occurance, second min and max, using object type data stored, comparable and comparators


*/