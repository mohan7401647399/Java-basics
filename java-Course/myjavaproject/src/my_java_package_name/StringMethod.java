/*
	In Java, String is a class in the java.lang package used to represent sequences of characters
 */
package my_java_package_name;

public class StringMethod {
	public static void main(String[] args) {
		str1();
	}
	public static void str1() {
		
		//	String Literal vs. Object
		//		String Literal - Stored in the string pool.
					String stringLiteral = "Java";
					System.out.println(stringLiteral);
		//		Object - Stored in the string pool
					String stringObject = new String("Java");
					System.out.println(stringObject);
		
		String name = "Java Language";
		System.out.println(name.length());					//	total lengths
		System.out.println(name.toLowerCase());				//	small letter
		System.out.println(name.toUpperCase());				//	upper letter
		System.out.println(name.indexOf("a"));				//	index find
		System.out.println(name.charAt(2));					//	get char
		System.out.println(name.codePointAt(1));			//	unicode values
		System.out.println(name.equals("java"));			//	upper letter
		System.out.println(name.equalsIgnoreCase("java"));	//	upper letter
		System.out.println(name.contains("a"));				//	upper letter
	}
}
