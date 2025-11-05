/*


    ✅ What is Upcasting?
        Upcasting means converting a child class object into a parent class reference.
        ✔ It's done automatically by Java (implicit).

            Animal a = new Dog();   // Upcasting

    ✅ What is Downcasting?
        Downcasting means converting a parent class reference back into a child class reference.
        ⚠ It must be done manually using casting, and it is risky.

            Animal a = new Dog();   // upcasting first
            Dog d = (Dog) a;        // downcasting


    ✅ How do they work?

        Up-casting (safe, automatic):
    
class Animal {
    void sound() {
        System.out.println("sound method in Animal class");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("bark method in Dog subclass extends Animal class");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meow method in Cat subclass extends Animal class");
    }
}

public class Upcasting_Downcasting {
    public static void main(String[] args) {
        Animal d1 = new Dog();      //  up-casting
        d1.sound();
        Animal c1 = new Cat();      //  up-casting
        c1.sound();
    }
}



        Down-casting:

class Animal {
    void sound() {
        System.out.println("sound method in Animal class");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("bark method in Dog subclass extends Animal class");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meow method in Cat subclass extends Animal class");
    }
}

public class Upcasting_Downcasting {
    public static void main(String[] args) {
        Animal d1 = new Dog(); // up-casting
        Dog d = (Dog) d1; // down-casting
        d.bark();
        d.sound();
        Animal c1 = new Cat(); // up-casting
        Cat c = (Cat) c1; // down-casting
        c.meow();
        c.sound();
    }
}


    ✅ Why do we need Upcasting and Downcasting?
        Why Up-casting?
            To write generalized code.
            Use parent type to refer to any child object.
            Useful in polymorphism (runtime polymorphism).
        Why Down-casting?
            To access child-specific methods after upcasting.
            Needed when a parent reference actually refers to a child object.


    ✅ When to use?
        | Operation       | When to use                                                                                              |
        | --------------- | -------------------------------------------------------------------------------------------------------- |
        | **Up-casting**   | When working with polymorphism, and you only need parent methods                                         |
        | **Down-casting** | When you need to access child-specific features and you are sure the object is actually a child instance |


    ⚠ Important Notes:

        Down-casting is dangerous if the object is not actually an instance of the child class. It can throw ClassCastException.
        Always check using instanceof before down-casting:

    if (a instanceof Dog) {
        Dog d2 = (Dog) a;
    }

 */


