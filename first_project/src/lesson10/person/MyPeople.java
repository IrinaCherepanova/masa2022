package lesson10.person;

public class MyPeople {
    public static void main(String[] args) {

//    Person person = new Person("Irina", "Cherepanova", 32, true);
//    person.whatIsYourName();
    Person person;

    Student student = new Student("Ira", "Cherepanova", 32, true, 99);
    student.whatIsYourName();
    student.whoAreYou();

    Child child = new Child("child", "child", 12, false);
    child.whoAreYou();

    Person childPerson = new Child("person", "person", 45, true);
    childPerson.whoAreYou();

    }

}
