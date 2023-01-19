package lesson10.vehicles;

public class Bus extends Vehicle {

    private long capacity;
    private String color;

    public Bus(String manufacturer, int year, long capacity, String color) {
        super(manufacturer, year);
        this.capacity = capacity;
        this.color = color;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void whoAreYou() {
        System.out.println("Bus");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a bus");
    }

}
