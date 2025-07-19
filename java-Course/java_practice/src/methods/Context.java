//				context

/*
//	Static context
package methods;

public class Context {
	 int x = 10;
	public static void main(String[] args) {
		System.out.println(x);	//	Error: Cannot access instance variable in static context
	}
}
*/


//	 Instance context
package methods;

class Context {
	 int x = 10;
	 static int y = 20;
	void show() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Context c1 = new Context();
		System.out.println(c1.x);
		System.out.println(c1.y);
		c1.show();
	}
}