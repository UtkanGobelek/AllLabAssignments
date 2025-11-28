public class Student {
    private String name;
    private int age;

    public void setName(String a) {name = a; }
    public void setAge(int b) {age = b; }

    public void printStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
