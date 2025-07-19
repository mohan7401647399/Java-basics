package pack2;

import pack1.PackageOne;

public class PackageTwo {
	public static void main(String[] args) {		
		PackageOne p1 = new PackageOne();
		System.out.println(p1.num);
		p1.disp();
	}
}
