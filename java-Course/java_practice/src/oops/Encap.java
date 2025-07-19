/*
package oops;

class Laptop {
	// we can hide the data using Encapsulation
	public String name;
	public int price;
	private int batteryCapacity;
	private String chipName="snapdragon";			// security others cannot access directly

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
	private String name;
	private int memory;
	private String button;
	private String display;
	
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
	public Laptop(String display) {
		this.display = display;
	}
}

public class Encap {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("touch");
		System.out.println(l1.getName());
		System.out.println(l1.getPrice());
//		System.out.println(l1.memory);				//	we cannot call the private variable
		System.out.println(l1.setPrice());
		System.out.println(l1.setName("Mohan"));
		System.out.println(l1.setMemory(100));
		System.out.println(l1.display);
	}
}
*/


package oops;
		// we can hide the data using Encapsulation
		//Encapsulation names are - bean, pojo(plain java old Object), entity, fully encapsulation
class Laptop {								
	public int price;									//	access anywhere
	private String name;								//	access inside the class only
	private int memory;									//	access inside the class only
	private String button;								//	access inside the class only
	private String display;								//	access inside the class only
	
	public Laptop(String display) {						//	constructor()
		this.display = display;							//	this used inside a constructor or methods
	}
	// helper methods for accessing private var or methods
	public void setMemory(int memory) {					//	helper method - setter()
		this.memory = memory;
	}
	// helper methods for accessing private var or methods
	public int getMemory() {							//	helper method - getter()
		return this.memory;
	}
}

public class Encap {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("touch");				//	object reference
		l1.setMemory(100);
		System.out.println(l1.getMemory());
	}
}



//store a value via constructor or setter
