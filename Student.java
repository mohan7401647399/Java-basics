//          08 - May - 2025
//  Parameter

// public class Student {
//     int marks;
    
// 	public static void main(String[] args) {
// 		Student obj = new Student();
//         System.out.print(obj.marks);
// 	}
// }




// public class Student {
//     int marks;
//     Student(){
//         System.out.println("Hello");
//     }
//     Student(int a){
//         System.out.println(a);
//     }
// 	public static void main(String[] args) {
// 		Student obj = new Student(10);
// 		Student obj2 = new Student();
// 	}
// }



//      constructor overloading

// public class Student {
//     int marks;
//     String name;
// 	public static void main(String[] args) {
// 		Student obj = new Student();
// 		obj.name = "Mohan";
// 		obj.marks = 33;
// 		System.out.println(obj.marks);	
// 	}
// }


public class Student {
    int marks;
    String name;
    
    Student(String a, int b){
    	marks = b;
    	name = a;
    }
	public static void main(String[] args) {
		Student obj = new Student("Mohan",29);
		System.out.println(obj.name);
		System.out.println(obj.marks);
	}
}