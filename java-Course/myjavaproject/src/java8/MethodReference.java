/*

    1. What are Method References?
        A method reference is a shorthand for writing a lambda expression that simply calls an existing method.
            Instead of writing:
                list.forEach(item -> System.out.println(item));
            You can write:
                list.forEach(System.out::println);

        Syntax pattern:
            ClassName(or object reference)::methodName


    2. Why use Method References?

        Benefits:
            Less code → More concise than lambda expressions.
            More readable → Directly points to the method that will be executed.
            No boilerplate → No need to write parameter forwarding manually.

        Basically, if your lambda just calls another method with the same parameters, use a method reference.

        Example:
                        
            names.forEach(name -> printName(name)); // Lambda
            
            names.forEach(MyClass::printName); // Method reference


    3. When to Use Method References?

        Use them when:
            The lambda body only calls one method and does nothing else.
            You want cleaner, shorter code.
            You want to make code easier to read for other developers.

        Avoid them when:
            You need extra logic inside the lambda.
            The method name is not descriptive enough (sometimes explicit lambda is clearer).


    Summary Table
        | Type                      | Syntax                    | Example               |
        | ------------------------- | ------------------------- | --------------------- |
        | Static Method             | `ClassName::staticMethod` | `Math::max`           |
        | Instance Method of Object | `instance::method`        | `System.out::println` |
        | Instance Method of Class  | `ClassName::method`       | `String::toLowerCase` |
        | Constructor               | `ClassName::new`          | `ArrayList::new`      |



        
    4. Types of Method References (and How They Work)

        There are four types:

            A. Reference to a static method

                Format:
                    ClassName::staticMethod

package java8;

import java.util.List;

class StaticReference{
    public static void greet(String name){
        System.out.println("Hello " + name);
    }
}

public class MethodReference {
    public static void main(String[] args){
        List<String> list = List.of("john", "jack", "james");
        list.forEach(StaticReference::greet);
    };
};




import java.util.List;

class StaticMethodReference {
    public static void printer(String name) {
        System.out.println(name.toUpperCase());
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = List.of("mohan", "john", "jack");

        names.forEach(name -> StaticMethodReference.printer(name));     //  Lambda expression

        names.forEach(StaticMethodReference::printer);                  //  Method Reference
    }
}



            B. Reference to an instance method of a particular object

                Format:
                    instance::instanceMethod


package java8;

import java.util.List;

class InstanceReference {
    public void greet(String name) {
        System.out.println("Hello " + name);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> list = List.of("john", "jack", "james");
        InstanceReference ref = new InstanceReference();
        list.forEach(ref::greet);
    };
};



import java.util.List;

class StaticMethodReference {
    public void printer(String name) {
        System.out.println(name.toUpperCase());
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = List.of("mohan", "john", "jack");

        StaticMethodReference s1 = new StaticMethodReference();

        names.forEach(name -> s1.printer(name)); // Lambda expression

        names.forEach(s1::printer); // Method Reference
    }
}



            C. Reference to a constructor

                Format:
                    ClassName::new


interface FunctionalInterface {
    Person get(String name);
}

class Person {
    Person(String name) {
        System.out.println("Created by " + name);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        FunctionalInterface creator = Person::new;
        creator.get("Mohan");
    }
}





interface FunctionalInterface {
    StaticMethodReference printer(String name);
}

class StaticMethodReference {
    StaticMethodReference(String name) {
        System.out.println("Created by " + name);
    }
}

public class MethodReference {
    public static void main(String[] args) {


        FunctionalInterface f1 = name -> new StaticMethodReference(name); // Lambda expression

        FunctionalInterface f2 = StaticMethodReference::new; // Method Reference
        f2.printer("Mohan");
        f2.printer("jack");
    }
}



interface FunctionalInterface {
    StaticMethodReference printer(String name);
}

class StaticMethodReference {
    StaticMethodReference(String name) {
        System.out.println("Created by " + name);
    }
}

public class MethodReference {
    public static void main(String[] args) {


        FunctionalInterface f1 = name -> new StaticMethodReference(name); // Lambda expression

        FunctionalInterface f2 = StaticMethodReference::new; // Method Reference
        f2.printer("Mohan");
        f2.printer("jack");
    }
}
*/

import java.util.ArrayList;

class First {
    public void method(String name) {
        System.out.println("name is : " + name);
    }
}

class MethodReference {
    public static void main(String[] args){
        First f1 = new First();
        ArrayList<String> list = new ArrayList<>();
        list.add("mohan");
        list.add("john");
        list.add("kevin");
        list.add("james");
        list.forEach(f1::method);
    }
}