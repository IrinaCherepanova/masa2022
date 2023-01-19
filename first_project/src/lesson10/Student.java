package lesson10;

public class Student extends Person {

    double grade;

    public Student(String firstName, String lastName, int age, boolean isJewish, double grade) {
        super(firstName, lastName, age, isJewish);
        this.grade = grade;
    }

    public Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public Student(double grade) {
        this.grade = grade;
    }

    @Override
    public void whatIsYourName() {
        System.out.println("I'm student, my name is " + super.getFirstName() + " " + getLastName());
    }
}
