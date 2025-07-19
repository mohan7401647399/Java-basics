package abc;
//Constructor->default, no para, para
public class Constructor {
	int id;
	String name;
//	access modifier, non acc mod, return type methodN, parameters
//	public static void m2() {
//	for constructor no non access modifier and return type 
//	constructor name should be classname
//	by default we have default constructor

	public Constructor() {//no parameter constructor
			
	}
	public Constructor(int id, String n) {//parameter constructor
//		this.id = id;
		name = n;
//		int id=1;
//		String name="abc";
//		System.out.println(id);//first preference L.V
//		System.out.println(this.id);//call instance variable
	}

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		//c1 LV or object reference
		//CN objref = new CN();
		Constructor c1 = new Constructor();
		System.out.println(c1.id);
		System.out.println(c1.name);
		c1.id = 123;
		c1.name = "java";
		System.out.println(c1.id);
		System.out.println(c1.name);
		Constructor c2 = new Constructor();
		System.out.println(c2.id);
		System.out.println(c2.name);
		c2.id = 1000;
		System.out.println(c2.id);
		Constructor c3 = new Constructor(100,"spring");
		System.out.println(c3.id);
		System.out.println(c3.name);
		Constructor c4 = new Constructor(200,"oops");
	}
}
