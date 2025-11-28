public class Scenario1 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Ali");
        s1.setAge(19);
        s1.printStudentInfo();
        //the values assigned to name and age are "Ali" and 19 respectively.
        //I didn't get any errors, ı just followed the week 10 slides  while writing the code.
    }
        //After defining a parameterized constructor while the default constructor stands it expect me to put parameters in the default constructor and gives an error
        // I will now delete the parameterized constructor as it's causing an error and preventing me from testing other scenarios
}
