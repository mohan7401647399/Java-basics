package oopsPractice;

public class Encap {
	public int price;
	private String name = "john";
	public String getName() {
		 return this.name;
	}
	public void setName(String name) {
		 this.name = name;
	}
	
	public static void main(String[] args) {
		Encap e1 = new Encap();
		System.out.println(e1.name);
		System.out.println(e1.getName());
		e1.setName("mick");
		System.out.println(e1.getName());
	}
}
