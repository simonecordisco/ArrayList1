public class Student {


    private String name;
    private int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String name() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return null;
    }

    public int age() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
