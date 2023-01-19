package lesson10.vehicles;

public abstract class Vehicle {
    private String manufacturer;
    private int year;

    public void sayHello(){
        System.out.println("Hello!");
    }

    public abstract void whoAreYou();

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

}
