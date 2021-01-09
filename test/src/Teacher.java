import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human {

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    void getInfo() {
        System.out.println("teacher " + this.name);
    }

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        System.out.println();
        Student student = new Student("Ngo Quang Hieu");
        Teacher teacher = new Teacher("Luong Quynh Thu");
        humans.add(student);
        humans.add(teacher);
        for (Human h : humans
        ) {
            h.getInfo();

        }
    }
}
