//  A class in Java is a template or blueprint that defines the structure and behavior of objects. 
//  It encapsulates data (attributes) and functions (methods) into a single unit, forming the foundation of object-oriented programming (OOP).


/*
Access Modifier: public, default (package-private)
Keyword: class
ClassName: UpperCamelCase (e.g., BankAccount)
            public class ClassName {                            
                        1. Fields (Attributes)
                        private String field1;
                        protected int field2;

                        2. Static Block (Runs when class loads)
                        static {
                            Initialize static fields
                        }

                        3. Constructor (Initialize objects)
                        public ClassName() { 
                            Default constructor
                        }

                        4. Methods (Behavior)
                        public returnType methodName(parameters) {
                            Method logic
                        }

                        5. Nested Class
                        class NestedClass { ... }
                        }

                        public class class {
                            
            }
*/

/*

public class Car{
    private String brand;                           //  Fields(state) | instance variable
    private int year;                               //  Fields(state) | instance variable
    private boolean isRunning;                      //  Fields(state) | instance variable
    
    public static int totalCars = 0;                //  Static field (shared across all cars)
    
    public Car(String brand, int year){             // Constructor (initialize state)
        this.brand = brand;                         //  this keyword is used to call the current class instance
        this.year = year;                           //  this keyword is used to call the current class instance
        this.isRunning = false;                     //  this keyword is used to call the current class instance
        totalCars++;
    }
    
    public void StartEngine(){                      // Method: Start the car
        isRunning = true;
        System.out.println(brand +  "engine started");
    }    
    
    public int getAge(int currentYear){             // Method: Get car age
        return currentYear - year;
    }
    
    public static void printTotalCars(){                //  static method
        System.out.println("Total cars" + totalCars);
    }
    
    public static void main(String[] args){
        Car c1 = new Car("Toyota", 2015);
        System.out.println(c1.isRunning);
        System.out.println(c1.brand);
        printTotalCars();
        System.out.println(c1.getAge(2025));
        System.out.println(Car.totalCars);
        c1.StartEngine();
        System.out.println(c1.isRunning);
    }    
}
*/


/*
public class Hotel{
    int price = 1000;
    String items = "Tea";
    public static void main(String[] args){
        Hotel h1 = new Hotel();                             //  Creating an object for a class
        System.out.println(h1.items);
        System.out.println(h1.price);
    }
}
*/