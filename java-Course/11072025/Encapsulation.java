/*
package oops;

class Laptop {
	// we can hide the data using Encapsulation
	public String name;
	public int price;
	private int batteryCapacity;
	private String chipName="snapdragon";// security others cannot access directly

	public void display() {
		// fields
	}
	//helper methods
	//getter
	public String getChipName() {
		return this.chipName;	
	}
	public int getBatteryCapacity() {
		return this.batteryCapacity;
	}
	//setter
	public void setChipName(String cn) {
		this.chipName = cn;
	}
}

public class Encap {
	public static void main(String[] args) {
			Laptop l1 = new Laptop();
			System.out.println(l1.name);
//			System.out.println(l1.chipName);we cannot access the private data directly
			System.out.println(l1.getChipName());
			l1.setChipName("new chip");
			System.out.println(l1.getChipName());
	}
}
*/


/*

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
