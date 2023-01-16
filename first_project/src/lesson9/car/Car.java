package lesson9.car;

import java.util.Arrays;

public class Car {

    private String brand;
    private int year;

    private String model;
    private Engine engine;
    private Wheel[] wheels;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Car(String brand, int year, String model, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }

    public void sayHello(){
        System.out.println("The car " + brand + " " + model + "says hello!");
    }
}
