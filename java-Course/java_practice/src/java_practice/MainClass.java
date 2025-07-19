//		11 - Jun - 2025
//	Runnable thread

package java_practice;

class A implements Runnable{
	public void run() {
		System.out.println("Runnable thread");
	}
}

public class MainClass {
	
	public static void main(String[] args) {
		Runnable a1 = new A();
		
		Thread t1 = new Thread(a1);
		t1.start();
	}
}