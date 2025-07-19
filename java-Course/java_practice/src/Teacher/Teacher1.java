//	Public - Access anywhere(same class, package, subclass and globally

//package Teacher;
//
//public class Teacher1 {
//
//	public static void main(String[] args) {
//		Teacher t1 = new Teacher();
//		System.out.println(t1.name);
//	}
//}




/*
					Default - Within the package only access
package Teacher;

public class Teacher1 {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.log("Welcome");
	}
}
*/


/*
		Private - Accessible only within the same class.
package Teacher;

public class Teacher1 {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.getBalance("Welcome");
	}
}
*/



/*
	Protected - Same package(any class), other packages(using extends keyword)

 package Teacher;

public class Teacher1 extends Teacher{
	public static void main(String[] args) {
		Teacher1 t1 = new Teacher1();
		t1.display();	
	}
}
*/