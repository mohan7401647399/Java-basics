package StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        List<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\t\tStudent Management System");
            System.out.println("=================================");
            System.out.println("1. Add Student \n2. Display Students \n3. Update Student \n4. Delete Student \n5. Exit");
            System.out.println("Enter your choice here: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 :
                    Student student = StudentUtility.addStudent();
                    students.add(student);
                    break;
                case  2 :
                    StudentUtility.getStudent(students);
                    break;
                case 3 :
                    StudentUtility.updateStudent(students);
                    System.out.println("Student has been updated");
                    break;
                case 4 :
                    StudentUtility.deleteStudent(students);
                    System.out.println("Student has been deleted");
                    break;
                case 5 :
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
