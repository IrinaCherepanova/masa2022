package lesson10.person;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isJewish;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isJewish() {
        return isJewish;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age, boolean isJewish) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isJewish = isJewish;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isJewish=" + isJewish +
                '}';
    }

    public void whatIsYourName(){
        //System.out.println("My name is " + firstName + " " + lastName);
        System.out.println("It is too general question. I'm just a person");
    }

    public abstract void whoAreYou();
}
