
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Students added successfully");
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No Student found..");
        } else {
            System.out.println("\n... Students List ...");
            for (Student s : students) {
                s.displayStudent();
            }
        }
    }
}
