/*
Encapsulation is a fundamental OOP principle that bundles data (attributes) and methods (behavior) into a single unit (class) while restricting direct access to internal state. 
It acts as a protective shield, preventing external code from altering an object's data unexpectedly.
package oops;

class Laptop {												// we can hide the data using Encapsulation

	public String name;
	public int price;
	private int batteryCapacity;							//	Access in the current class only
	private String chipName = "snapdragon";					// security others cannot access directly

	public void display() {
		// fields
	}
	public String getChipName() {								//helper methods -> getter(get)
		return this.chipName;	
	}
	public int getBatteryCapacity() {							//helper methods -> getter(get)
		return this.batteryCapacity;
	}
	public void setChipName(String cn) {						//helper methods -> setter(edit)
		this.chipName = cn;
	}
}

public class Encap {
	public static void main(String[] args) {
			Laptop l1 = new Laptop();
			System.out.println(l1.name);
			System.out.println(l1.chipName);					// we cannot access the private data directly
			System.out.println(l1.getChipName());				//	we can access the private data using helper method only
			l1.setChipName("new chip");							//	we can change the private data using helper method only
			System.out.println(l1.getChipName());				//	we can access the private data using helper method only
	}
}
*/


/*						-> practice
package oops;

class Laptop {
	public int price;
	public String name;
	private int memory;
	
	public String getName() {						//	getter
    return this.name;
}
public int getPrice() {						//	getter
		return this.price;
	}
	public int setPrice() {
		return this.price = 10;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public int setMemory(int memory) {
		return this.memory = memory;
	}
}

public class Encap {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		System.out.println(l1.getName());
		System.out.println(l1.getPrice());
		System.out.println(l1.name);
        //		System.out.println(l1.memory);				//	we cannot call the private variable
		System.out.println(l1.setPrice());
		System.out.println(l1.setName("Mohan"));
		System.out.println(l1.setMemory(100));
	}
}
*/


//store a value via constructor or setter
