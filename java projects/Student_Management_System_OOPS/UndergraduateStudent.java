
public class UndergraduateStudent extends Student {

    private final String major;

    public UndergraduateStudent(int id, String name, int age, String major) {
        super(id, name, age);
        this.major = major;
    }

    @Override
    public void displayStudent() {
        System.out.println("Id : " + getId() + ", name : " + getName() + ", age : " + getAge() + ", Major " + major);
    }
}
