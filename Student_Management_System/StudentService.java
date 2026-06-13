
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully");
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Student not found...");
        } else {
            System.out.println("\n...Student List...");
            for (Student s : students) {
                s.displayStudent();
            }
        }
    }
}
