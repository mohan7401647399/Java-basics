
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter Name: ");
                    String name = scan.nextLine();

                    System.out.println("Enter Age : ");
                    int age = scan.nextInt();

                    Student s = new Student(id, name, age);
                    service.addStudent(s);
                    break;

                case 2:
                    service.showAllStudents();
                    break;

                case 3:
                    System.out.println("Existing...");
                    scan.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice...Please try again");
            }
        }
    }
}
