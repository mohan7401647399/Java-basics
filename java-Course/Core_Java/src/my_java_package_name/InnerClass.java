/*
	
	✅ What is an Inner Class?
        An inner class is a class defined inside another class.
        It is used to logically group classes, increase encapsulation, and sometimes to access members of the outer class more easily.
	
	
    🔹 Types of Inner Classes in Java
            | Type of Inner Class          | Description                                                      |
            | ---------------------------- | ---------------------------------------------------------------- |
            | 1. **Member Inner Class**    | Normal class inside another class (non-static)                   |
            | 2. **Static Nested Class**   | Static class inside another class                                |
            | 3. **Local Inner Class**     | Class defined inside a method                                    |
            | 4. **Anonymous Inner Class** | Class with no name (used for instant override or implementation) |



    🔸 1. Member Inner Class

class Outer{
    private int x = 10;

    class Inner{
        void show(){
            System.out.println("x value is " + x );
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        Outer o1 = new Outer();
        Outer.Inner o2 = o1.new Inner();
        o2.show();
    }
}




    🔸 2. Static Nested Class

class Outer{
    static int x = 10;

    static class Inner{
        void show(){
            System.out.println("x value is " + x );
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        Outer.Inner o2 = new Outer.Inner();
        o2.show();
    }
}



    🔸 3. Local Inner Class (inside method)

class Outer{
    void display(){
        class Local{
            void show(){
                System.out.println("Local inner inside method");
            }
        }
        Local obj = new Local();
        obj.show();
    }
}

public class InnerClass {
    public static void main(String[] args){
        new Outer().display();
    }
}





    🔸 4. Anonymous Inner Class
    Used mostly with interfaces or abstract classes to create objects on-the-fly without naming the class.

abstract class Outer {
    abstract void inner();
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o1 = new Outer() {
            void inner(){
                System.out.println("inner method using anonymous class");
            }
        };
        o1.inner();
    }
}


        package my_java_package_name;
 */

abstract class Outer {
    abstract void inner();
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o1 = new Outer() {
            void inner(){
                System.out.println("inner method using anonymous class");
            }
        };
        o1.inner();
    }
}