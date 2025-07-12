// 11-Jun-2025 -> class

/*
class Variables{
		  static int b = 20;
		 int c = 30;
		
		static{
			//static block
		}
public static void main(String[] args){
		
		Variables v = new Variables();
		v.m2();
	
 }
  public static void  m2(){
		int a=10;
		System.out.println(a);
		//System.out.println(b);
		//System.out.println(Variables.b);
		Variables v = new Variables();
		System.out.println(v.b);
		}
}
*/



//	We cannot use the (global) instance variables or methods in main static methods
//	instance methods -> main static
/* class Variable{
	int a = 10;
	int b = 20;
	public static void main(String[] args) {
		Variable f = new Variable();					//	create object
		f.f1();											//	call non-static method using object
	}
	
	public void f1(){
		int c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
} */




//	We cannot use the (global) instance variables in static methods
//	global instance variables -> static methods
/* class Variable{
	int a = 10;
	int b = 20;
	public static void main(String[] args) {
		f1();
	}
	
	public static void f1(){
		int c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
} */



//	We can use the (global) static variables in static methods only.
//	global static variables -> static methods
/*class Variable{
	static int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		f1();
	}
	
	public static void f1(){
		int c = 30;
		System.out.println(a);						call directly
		System.out.println(b);						call directly
		System.out.println(c);
	}
} */



//	We can use the (global) static variables in static methods only.
//	global static variables -> static methods
class Variable{
	static int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		f1();
	}
	
	public static void f1(){
		int c = 30;
		System.out.println(Variable.a);						//call with className
		System.out.println(Variable.b);						//call with className
		System.out.println(c);
	}
}



//	We access the static instance use in global then className use to call
/* class Variable{
	static int a = 10;
	int b = 20;
	public static void main(String[] args) {
		Variable f = new Variable();
		f.f1();
	}
	
	public void f1(){
		int c = 30;
		System.out.println(Variable.a);					//	call className
		System.out.println(b);
		System.out.println(c);
	}
} */



//	We access the global instance variables use in global then create new object for execute
/* class Variable{
	static int a = 10;
	int b = 20;
	public static void main(String[] args) {
		f1();
	}
	
	public static void f1(){
		int c = 30;
		System.out.println(a);
		Variable v1 = new Variable();					//	create new object
		System.out.println(v1.b);
		System.out.println(c);
	}
} */




//	We can use the local variables in method then call directly
//	local variables -> methods
/* class Variable{
	static int a = 10;
	int b = 20;
	public static void main(String[] args) {
		f1();
	}
	
	public static void f1(){
		int c = 30;
		System.out.println(a);
		Variable v1 = new Variable();
		System.out.println(v1.b);
		System.out.println(c);					//	local variable call directly
	}
} */