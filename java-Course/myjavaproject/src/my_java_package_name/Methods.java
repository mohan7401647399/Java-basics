/*
	In Java, a method is a block of code that performs a specific task.
	Methods are fundamental to object-oriented programming in Java as they define the behavior of objects
		and allow for code reusability and organization. 


Key components of a Java method:
	*Access Specifier*:
		Defines the visibility of the method (e.g., public, private, protected, or default).
	*Return Type*:
		Specifies the data type of the value the method returns. If the method does not return a value, void is used. 
	*Method Name*:
		An identifier that uniquely names the method, following Java naming conventions.
	*Parameters (Optional)*:
		Input values that the method accepts. These are declared with their data type and name within parentheses ().
	*Method Body*:
		The set of statements enclosed in curly braces {} that define the task the method performs. 

		*bacis-method syntax/structure*:-
		returnType methodName(parameters){
			//	code to execute
		}
		*method syntax/structure*:-
		access-modifier non-access-modifier returnType methodName(formal parameter) -> Header/signature
		{
			//	code to execute
		}
		* returnType – What type of value the method returns (e.g., int, String, void)
		* methodName – Name of the method (you choose)
		* parameters – Optional inputs (like int a, int b)
		* void – Means the method doesn't return anything

*/

package my_java_package_name;

public class Methods {
	
	public String name = "Mohan";									//	instance variable
	private int age = 29;											//	instance variable
	
	public void withOutParaMethod() {								//	without para method
		System.out.println("Without parameter method");
	}
	public void addition(int a, int b) {							//	with para method
		int result = a + b;
		System.out.println("addition value is " + result);
	}
	public int square(int num) {									//	return method
		return num * num;
	}
	public static void main(String[] args) {
		Methods m1 = new Methods();									//	create object
		System.out.println(m1.name);								//	print instance variable
		System.out.println(m1.age);									//	print instance variable
		m1.withOutParaMethod();										//	call method
		m1.addition(5, 50);											//	call method
		System.out.println("squared value is " + m1.square(5));		//	call method
	}
}
