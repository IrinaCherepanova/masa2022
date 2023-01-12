package lesson8.student;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("Alex", 32);
        System.out.println("alex.getName() = " + student.getName());
        System.out.println("alex.getAge() = " + student.getAge());

        student.setAge(25);
        student.setName("Donald");
        System.out.println(student);

        student.setAge(3);
        System.out.println("student = " + student);
    }
}
