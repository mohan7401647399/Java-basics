//  A class in Java is a template or blueprint that defines the structure and behavior of objects. It encapsulates data (attributes) and functions (methods) into a single unit, forming the foundation of object-oriented programming (OOP).


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
    //  Fields(state) | instance variable
    private String brand;
    private int year;
    private boolean isRunning;
    
    //  Static field (shared across all cars)
    public static int totalCars = 0;
    
    // Constructor (initialize state)
    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
        this.isRunning = false;
        totalCars++;
    }
    
    // Method: Start the car
    public void StartEngine(){
        isRunning = true;
        System.out.println(brand +  "engine started");
    }
    
    // Method: Get car age
    public int getAge(int currentYear){
        return currentYear - year;
    }
    
    //  static method
    public static void printTotalCars(){
        System.out.println("Total cars" + totalCars);
    }
}
*/


// public class testCar{
//     public static void main(String[] args){
//         Car car1 = new Car("Toyota", 2015);

//         car1.StartEngine();
//         System.out.println("Car1 age" + car1.getAge(2025));

//         car1.printTotalCars();
//     }
// }