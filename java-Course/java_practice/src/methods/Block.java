//					1. Block
package methods;

public class Block {
	static {
		System.out.println("Static block executed");					// runs once when class loads
	}
	{
		System.out.println("Instance block executed");					// runs before constructor
	}
	public Block() {
		System.out.println("Constructor block executed");
	}
	public static void main(String[] args) {
		Block e1 = new Block();
	}
}
