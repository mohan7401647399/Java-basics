//					polymorphism
//		In polymorphism we have compile time polymorphism and run time polymorphism
//  	compile time polymorphism -  Method overloading 
//		run time polymorphism - Method overriding

/*
package oops;

class Network {
	String networkType;											//	instance
	public Network() {}
	public Network(String networkType) {
		this.networkType = networkType;							//	called current class instance		
	}
	public void connection() {
		System.out.println("Network type : " + networkType);
	}
	public void connection(int networkPrice) {
		System.out.println("Network type : " + networkType);	//	method overriding(adding parameter)
	}
}

class Airtel extends Network{
	String networkType;
	public Airtel(String networkType) {
		super(networkType);										//	called parent class constructor
		System.out.println(super.networkType);					//	called parent class constructor
		System.out.println(this.networkType);					//	called current class instance
		
	}
	@Override //annotation										//	optional
	public void connection() {
		System.out.println("override Network type");
		System.out.println("Network type : " + networkType);	//	method overriding(adding additional codes)
	}
}

class Jio extends Network{
	String networkType;
	public Jio(String networkType) {
		super(networkType);										//	called parent class constructor
		this.networkType  = networkType;						//	called current class instance
	}
}

public class Poly {
	public static void main(String[] args) {
        con();
	}
	private static void con() {
		Network network = new Network("default network");
		Airtel airtel = new Airtel("airtel");
		Jio jio = new Jio("Jio");
		network.connection();
		airtel.connection();
		jio.connection();
	}
}
*/