
public class Student {

    private final int id;
    private final String name;
    private final int age;

    //  Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //  Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int age() {
        return age;
    }

    //  display all students details
    public void displayStudent() {
        System.out.println("Id : " + id + ", name : " + name + ", age : " + age);
    }
}
