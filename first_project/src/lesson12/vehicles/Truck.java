package lesson12.vehicles;

public class Truck extends Vehicle{
    public Truck(String brand, int year) {
        super(brand, year);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void whoAreYou() {
        System.out.println("I'm a truck " + getBrand() + " " + getYear());
    }
}
