package lesson10.vehicles;

public class Car extends Vehicle{

    private boolean isElectrical;
    private String color;

    public Car(String manufacturer, int year, boolean isElectrical, String color) {
        super(manufacturer, year);
        this.isElectrical = isElectrical;
        this.color = color;
    }

    public boolean isElectrical() {
        return isElectrical;
    }

    public void setElectrical(boolean electrical) {
        isElectrical = electrical;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void whoAreYou() {
        System.out.println("Car");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm car");
    }
}
