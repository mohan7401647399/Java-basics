package core_java;

public class NamingConverntion_TypeCasting {
		int age = 10;
	public static void main(String[] args) {
		m1();
			//for return type means we have 2 ways
		m2();
		System.out.println(m2());//1 store in print stmt
		int result = m2();//2 store in variable
		System.out.println(result);
	}
	private static void typeCasting() {
		//type casting is used to convert one datatype into another datatype
		//we have primitive typecasting and non primitive typecasting
		//primitive typecasting  - widening and narrowing
		//non primitive typecasting - upcasting and downcasting
		
		short i1 = 10;
		int i2 = i1;//widening (implicit typecasting) automatic
		
		long l1 = 123;
//		int l2 = l1;//narrowing (implicit typecasting not possible)
		int l2 =(int) l1;//narrowing (explicit typecasting is possible) manual
		byte l3 =(byte) l1;//narrowing (explicit typecasting is possible)
		
	}
	private static void m1() {
		
	}
	private static int m2() {
		return 10;
	}
	private static void naming() {
		/*
		 * keywords - reserved keywords like int, class, new etc..
		 * variables - hold or store the data/values/elements
		 * identifiers - like class, method, variables
		 	
		 	Rules of identifiers :
		 	1. identifiers cannot start with number, in between or end possible
		 	2. identifiers cannot accept space in between
		 	3. identifiers cannot allow special characters except $ and _.
		 	4. identifiers cannot allow reserved keywords.
		 */
		
		/*
		 Naming Convention / Developer standard rule

		 ProjectName : Each Word first letter should be capital - PascalCase
		 ClassName : Each Word first letter should be capital - PascalCase
		 MethodName : first letter only lowercase then Each word first letter should be uppercase - camelCase
		 VariableName : first letter only lowercase then Each word first letter should be uppercase - camelCase
		 PackageName : All the letter should be lowercase
		 FINAL : All the letter should be UPPERCASE
		 
		 */
	}
	private static void myFirstMethodName() {
		
	}
}
