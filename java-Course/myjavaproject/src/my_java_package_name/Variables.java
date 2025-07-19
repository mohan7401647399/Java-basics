/*
		A variable is a name you give to a memory location where you store data 
			(like numbers, names, etc.).
		👉 Think of a variable like a box with a label. we can put something in it, 
			and use it later.
			
		*Variables syntax/structure*:
			dataType variableName = values;
			
		*Types of Variables in Java*
			| Type            | Where it's declared        | Scope                         |
			| --------------- | -------------------------- | ----------------------------- |
			| 1. **Local**    | Inside a method/block      | Only within that method       |
			| 2. **Instance** | Inside class (not static)  | Each object gets its own copy |
			| 3. **Static**   | Inside class with `static` | Shared across all objects     |


		*variables naming convention*
			camelCase - first letter only lowercase then next words first letter starts with uppercase
*/


/*
 									*****1. Local variables*****
 	 
		* Declared inside a method, constructor, or block.
		* Exists only while the method/block is running.
		* Must be initialized before use.

1. Local Variable in a Static Method

package my_java_package_name;

public class Variables {
	public static void main(String[] args) {				//	static method
		int x = 10;											//	local variable
		System.out.println(x);
	}
}	
 
 
2. Local Variable in an Instance Method

package my_java_package_name;

public class Variables {
	public void myShow() {									//	instance method
		int x = 10;											//	local variable
		System.out.println(x);
	}
	public static void main(String[] args) {
		Variables v1 = new Variables();						//	create an object
		v1.myShow();										//	call method
	}
}


3. Local Variable in a Block

package my_java_package_name;

public class Variables {
	public static void main(String[] args) {
		{												//	block
			int x = 10;									//	local variable can access inside the block
			System.out.println(x);
		}
//		System.out.println(x);							//	 Error: x not visible here
	}
}




 									*****2. Instance variables*****
 		* Is declared inside a class, but outside any method
 		* Belongs to the object (instance) of the class
		* Each object gets its own copy

		
1. Instance Variables in an Instance Method
		* Instance methods can directly access instance variables.

package my_java_package_name;

public class Variables {
	String name = "Mohan";							//	instance variable
	
	public void show() {							//	instance method
		System.out.println("name is " + name);		//	directly accessble
	}
	
	public static void main(String[] args) {
		Variables v1 = new Variables();				//	create an object
		v1.show();									//	call method
	}
}



2. Instance Variables in a Static Method
		* Not directly allowed.
		* Static methods cannot access instance variables directly — because they don’t belong to any object.
		* But you can access them using an object.
package my_java_package_name;

public class Variables {
	String name = "Mohan";							//	instance variable

	public static void main(String[] args) {		//	static method
//		System.out.println(name);					//	cannot access directly
		Variables v1 = new Variables();				//	create an object
		System.out.println(v1.name);				//	call variable using object
	}
}





3. Instance Variables in a Block
		* Only if the block is inside a method, and you're using an object or inside an instance method.


package my_java_package_name;

public class Variables {
	String name = "Mohan";							//	instance variable
	
	public void show() {
		{											//	block
			System.out.println("name is " + name);	//  can call directly
		}
	}

	public static void main(String[] args) {
		Variables v1 = new Variables();				//	create an object
		v1.show();									//	call method using object
	}
}




 									*****3. static variables*****
		* Belongs to the class, not to individual objects
		* Is shared across all objects
		* Is declared using the static keyword

 
1. Static Variables in a Static Method
		* Because static methods and static variables both belong to the class, 
				they can access each other directly.
				
package my_java_package_name;

public class Variables {
	static String name = "Mohan";											//	static variable

	public static void main(String[] args) {
		System.out.println("Static variable in static method " + name);		//can access direclty
	}
}



2. Static Variables in an Instance Method
		* Instance methods can also access static variables because they belong to the class,
		 		and the method belongs to an object.


package my_java_package_name;

public class Variables {
	static String name = "Mohan";											//	static variable
	
	public void show() {													//	static method
		System.out.println("Static variable in instance method called " + name); // can access directly
	}

	public static void main(String[] args) {
		Variables v1 = new Variables();
		v1.show();
	}
}



3. Static Variables in a Block
		* You can use static variables inside any block as long as you’re inside a method or constructor.

package my_java_package_name;

public class Variables {
	static String name = "Mohan";											//	static variable

	public static void main(String[] args) {
		{																	//	block
			System.out.println("static variable in block called " + name);	//	can access directly
		}
	}
}
 */