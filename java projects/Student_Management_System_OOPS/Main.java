
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1. Add Undergraduate Student");
            System.out.println("2. Add Graduate Student");
            System.out.println("3. View All Students");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id: ");
                    int ugId = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Name: ");
                    String ugName = scan.nextLine();
                    System.out.println("Enter Age: ");
                    int ugAge = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Major: ");
                    String major = scan.nextLine();

                    Student ugStudent = new UndergraduateStudent(ugId, ugName, ugAge, major);
                    service.addStudent(ugStudent);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int pgId = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Name: ");
                    String pgName = scan.nextLine();
                    System.out.print("Enter Age: ");
                    int pgAge = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Research Topic: ");
                    String topic = scan.nextLine();

                    Student pgStudent = new GraduateStudent(pgId, pgName, pgAge, topic);
                    service.addStudent(pgStudent);
                    break;

                case 3:
                    service.showAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    scan.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
