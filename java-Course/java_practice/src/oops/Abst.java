package oops;
/*
What is abstraction?
 The process of hidding the unneccesary details to the user 
 and providing the essential/important features is known as abstraction
 
 
 we can achieve abstraction in 2 ways
 abstract class 0 -100 % abstraction
 interface 100 % abstraction till java 8
 */
abstract class Watch {
	String name;
	int price;
	String brand;

	public Watch() {
		
	}
	public void spec() {
	}
//not possible to create static abstract method

//	public static abstract void spec() ;

	// with implementation/declaration/body for non abstract method
	public abstract void features();//here hidding the details/implementation
	
	// there is no implementation/declaration/body for abstract method
	// in a class having anyone abstract method then make a class as abstract class
	// possible to create a abstract class without abstract method

}

//any class extends the abstract class must give the implementation for abstract methods
//or else declare a subclass as abstract class
abstract class TitanWatch extends Watch {
	// additional features
	public void warrenty() {

	}
}

class FastrackWatch extends Watch {
	// additional features
	
	public void replacement() {

	}
	@Override
	public void spec() {

	}
	@Override
	public void features() {
	//abstract method implementation write here	
		System.out.println();
		//System - class
		//out - PrintStream object reference
		//println - PrintStream class method
	}
}

public class Abst {
public static void main(String[] args) {
//	Watch watch = new Watch();
	//we cannot create object for abstract class
	//then why the constructor is present inside the abstract class
	FastrackWatch fw = new FastrackWatch(); 
}
}
