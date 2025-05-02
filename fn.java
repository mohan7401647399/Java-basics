//          01 - May - 2025
//  function

// public class fn{
//     void greeting(){
//         System.out.println("Welcome");
//         welcome();
//     }
//     void welcome(){
//         System.out.println("Home");
//     }
//     void addition(){
//         int a = 10;
//         int b = 10;
//         int sum = a + b;
//         System.out.println(sum);
//     }
//     public static void main(String args[]){
//         fn obj = new fn();
//         obj.greeting();
//         fn obj1 = new fn();
//         obj1.addition();
//     }
// }



//  function parameters

// public class fn{
//     void getShop(int money){
//         System.out.println( "money is " +money);
//     }
//     void chocolate(int money){
//         System.out.println("chocolate money is " + money);
//     }
//     void sum(int a, int b){
//         System.out.println(a + b);
//     }
//     public static void main(String[] args) {
//         fn shop = new fn();
//         shop.getShop(20);
//         fn chocolate = new fn();
//         chocolate.chocolate(50);
//         fn addition = new fn();
//         addition.sum(5, 10);
//     }
// }


//  return

// public class fn{
//     int getMoney(int money){
//         return money;
//     }
//     public static void main(String args[]){
//         fn obj = new fn();
//         int ans = obj.getMoney(10);
//         System.out.println(ans);
//     }
// }


// public class fn{
//     int sum(int a, int b){
//         int c = a + b;
//         return c;
//     }
//     public static void main(String args[]){
//         fn obj = new fn();
//         int ans = obj.sum(2,30);
//         System.out.println(ans);
//     }
// }


// public class fn{
//     String name(String name){
//         return name;
//     }
//     public static void main(String args[]){
//         fn obj = new fn();
//         String myName = obj.name("Mohan");
//         System.out.println(myName);
//     }
// }


//      02 - May - 2025

// import java.util.Scanner;
// public class fn{

//     void evenoradd(int num){
//         if(num % 2 == 0){
//             System.out.println("Even Num is " + num);
//         } else {
//             System.out.println("Odd Num is " + num);
//         }
//     }

//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         fn obj1 = new fn();
//         obj1.evenoradd(number);
//     }
// }


import java.util.Scanner;
public class fn{
    String passorfail(int num){
        if(num > 35){
            return "Pass";
        } else {
           return "Fail";
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        fn obj1 = new fn();
        String result =  obj1.passorfail(number);
        System.out.println(result);
    }
}