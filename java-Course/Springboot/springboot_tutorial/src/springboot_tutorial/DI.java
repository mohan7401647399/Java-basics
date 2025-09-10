/* 
// Constructor injection
package springboot_tutorial;

public class DI {
	public static void main(String[] args) {
		Constructor c1 = new Constructor(null);
		c1.handleRequest();
	}
}


class Constructor{
	private Service service;
	
	public Constructor(Service service) {
		this.service = service;
	}
	
	public void handleRequest() {
		service.doSomething();
	}
}

class Service {
	public void doSomething() {
		System.out.println("Doing some work");
	}
}








// Setter injection
package springboot_tutorial;

public class DI {
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		c1.handleRequest();
	}
}


class Constructor{
	private Service service;
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void handleRequest() {
		service.doSomething();
	}
}

class Service {
	public void doSomething() {
		System.out.println("Doing some work");
	}
}



*/





// Field injection
package springboot_tutorial;

public class DI {
	public static void main(String[] args) {
		Controller c1 = new Controller();
		c1.handleRequest();
	}
}


class Controller{
	private Service service;
	
	public void handleRequest() {
		service.doSomething();
	}
}

class Service {
	public void doSomething() {
		System.out.println("Doing some work");
	}
}