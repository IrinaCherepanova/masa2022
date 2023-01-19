package lesson10;

public class MyPeople {
    public static void main(String[] args) {

    Person person = new Person("Irina", "Cherepanova", 32, true);
    person.whatIsYourName();

    Student student = new Student("Ira", "Cherepanova", 32, true, 99);
    student.whatIsYourName();
    }
}
