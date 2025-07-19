package oopsPractice;

public class Method {
	String name;
	String name1;
	
	public Method(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName(String name) {
		return this.name;
	}
	
	public static void main(String[] args) {
		Method m1 = new Method("jack");
		m1.name1 = "John";
		System.out.println(m1.name1);
		
//		m1.setName("mickel");
		System.out.println(m1.name);
	}

}
