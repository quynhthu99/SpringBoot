public class Student extends Human{
    public Student(String name){
        this.name = name;
    }


    @Override
    void getInfo() {
        System.out.println("day la hoc sinh "+ this.name);
    }
}
