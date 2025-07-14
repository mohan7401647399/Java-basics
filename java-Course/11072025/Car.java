//  In Java, an object is a runtime instance of a class that occupies memory and represents a real-world entity. 
//  Objects are the fundamental building blocks of object-oriented programming (OOP), encapsulating state (data) and behavior (methods)


//  Creating Objects: The new Keyword
//          Objects are instantiated using the new keyword, which:

//  ClassName objectName = new ClassName(arguments);                    //  example

public class Car {
    private String brand;

    //  Constructor
    Car(String brand){
        this.brand = brand;
    }

    //  Method(function) | behaviour
    public void Start(){
        System.out.println(brand + " started");
    }

    public static void main(String[] args){
        Car c1 = new Car("BMW");                    //  create an object
        System.out.println(c1.brand);
        c1.Start();                                         //  call method
    }

}
