public class Day2 {
    //inside the class outside the method -> global variables.
    //global variables -> static and instance
    int id = 25;//instance variable
    static int rollNo = 2;//static variable

    public static void main(String[] args) {
//        age is local variable
        int age;//variable declaration
        age = 20;//value assign
        age = 30;//value re-assign
//        int age = 40;//variable re-declaration not possible
//        method1();
        method2();//user defined method
        m2('c');
        System.out.println("".length());// pre defined method
    }

    public static void method1() {
        int age = 25;//local variable
        System.out.println(age);
        age = age + 5;//age+=5;assignment operator
        System.out.println(age);
        System.out.println(age % 2);// %-> remainder
        System.out.println(age / 2);// /-> quotient
        System.out.println(10 > 20);//f
        System.out.println(10 < 20 || 20 < 30);//t
        System.out.println(10 < 20 && 40 < 30);//f
        System.out.println(10 > 5);
        System.out.println(!(10 > 5));

    }

    public static void method2() {
        int id = 10;
        System.out.println(id);//10
        id++;   //id=id+1   ->id+=1;
        System.out.println(id);//11
        ++id;
        System.out.println(id);//12
        System.out.println(id++);//12?(post increment)
        System.out.println(id);//13
        System.out.println(++id);//14 (pre increment)
        System.out.println(id);//14
    }

    //Method-> user defined and predefined
    //AM -> public, protected, default, private
    //NAM -> static, final, abstract, synchronized
    //RT -> P-D.T, N.P-D.T, void(non return type)
    //parameters...
    public static void m1() {
    }//non-return type with no parameter

    public static void m2(char c) {
    }//non-return type with parameter

    public static int m3() {//return type with no parameter
        return 12345;
    }

    public static String m4(int b) {//return type with parameter
        return "string data";
    }
}