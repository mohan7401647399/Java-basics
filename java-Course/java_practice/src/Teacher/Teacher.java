//	Public - Access anywhere(same class, package, subclass and globally

//package Teacher;
//
//public class Teacher {
//	public String name = "arun";
//
//	public void School() {
//		System.out.println(name);
//	}
//}




/*
					Default - Within the package only access
package Teacher;

class Teacher{
	void log(String message) {
		System.out.println(message +  " to our class");
	}
}
*/


/*
		Private - Accessible only within the same class.		
package Teacher;
public class Teacher{
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) balance += amount;
	}
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.deposit(100.0);
		System.out.println(t1.getBalance());
	}
}
*/



/*
	Protected - Same package(any class), other packages(using extends keyword)
package Teacher;

public class Teacher{
	protected String name = "arun";
	protected void display() {
		System.out.println("Teacher name is " + name);
	}
}
*/