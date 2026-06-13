package StudentManagement;

import java.util.List;
import java.util.Scanner;

public class StudentUtility {

    static Scanner input = new Scanner(System.in);

    public static Student addStudent() {
        Student student = new Student();
        System.out.println("Enter student id : ");
        student.setId(input.nextInt());
        System.out.println("Enter student name : ");
        student.setName(input.next());
        System.out.println("Enter student age : ");
        student.setAge(input.nextInt());

        return student;
    }

    public static void getStudent(List<Student> students) {
        for(Student s : students) {
            System.out.println(s);
        }
    }

    public static void updateStudent(List<Student> students) {
        System.out.println("Please enter the student id : ");
        int updateId = input.nextInt();
        for(Student s : students) {
            if(s.getId() == updateId){
                System.out.println("Enter the student name : ");
                s.setName(input.next());
                System.out.println("Enter the student age : ");
                s.setAge(input.nextInt());
            }
        }
    }

    public static void deleteStudent(List<Student> students) {
        System.out.println("Enter the student Id to delete : ");
        int deleteId = input.nextInt();
        students.removeIf(s -> s.getId() == deleteId);
    }
}
