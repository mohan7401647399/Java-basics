package java_practice;

public class Teacher {
	
	String myName = null;
	
	Teacher(){
		System.out.println("Hello");
	}
	
	void setName(String myName) {
		this.myName = myName;
	}

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setName("Mohan");
		System.out.println(t1.myName);
	}
	
}
