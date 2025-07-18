/*
* constructor types are -> default, no para, para and copy constructor.
* In a class have a same constructor name but different parameters is called constructor overloading.

* In a class have a same method name but different parameters is called method overloading.

* calling one constructor inside another constructor is called constructor chaining.
* we can achieve by using this() and super()

this - keyword is used to call the current class instance
super = keyword is used to call the parent class instance
this() - method is used to call the same class constructor
super() - method is used to call the parent class constructor

  by default all class have a default constructor like this
  public Constructor(){
    super();
    }
*/


/*
package oops;

class ParentCons {
	String name;
	int sal = 10;
	//	Have a default constructor
	
	public ParentCons() {											//	no parameter
}

public ParentCons(String name) {									//	single parameter
this();																//	called same class constructor only
		System.out.println("1 para");
	}

	public ParentCons(String name, int sal) {						//	double parameter
    this.name = name;												//	called current class instance only
    this.sal = sal;													//	called current class instance only
    System.out.println("2 para");
}
}
*/


/*
package oops;

class ParentCons {
	String name;
	int sal = 10;
	//	Have a default constructor
	
	public ParentCons() {												//	no parameter
}

public ParentCons(String name) {									//	single parameter
this();															//	called same class constructor only
System.out.println("1 para");
}

public ParentCons(String name, int sal) {							//	double parameter
this.name = name;												//	called current class instance only
this.sal = sal;													//	called current class instance only
System.out.println("2 para");
}

public void n1() {
}
}

class Dummy {
	public void n1() {
	}
}

class ChildCons extends ParentCons, Dummy{					//	two classes should not be extends
	String name;
	int sal;

    //	public ChildCOns() {								by default like this
    //		super();
//	}
public ChildCons() {
		super();				//constructor ambiguity
	}
    
	public void details() {
        n1();					//method ambiguity
	}
    
	public void details(String user) {
        
}
}
*/



/*
public class ConstructorCall {
    public static void main(String[] args) {
        ParentCons pc1 = new ParentCons();
		ParentCons pc2 = new ParentCons("java", 123);
        
	}
    
}
*/