
public class GraduateStudent extends Student {

    private final String researchTopic;

    public GraduateStudent(int id, String name, int age, String researchTopic) {
        super(id, name, age);
        this.researchTopic = researchTopic;
    }

    public void displayStudent() {
        System.out.println("Id : " + getId() + ", name : " + getName() + ", age : " + getAge() + ", researchTopic " + researchTopic);
    }
}
