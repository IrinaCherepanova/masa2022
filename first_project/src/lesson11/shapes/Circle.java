package lesson11.shapes;

import java.util.Scanner;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your color:");
        setColor(input.nextLine());
        System.out.println("Enter radius:");
        this.radius = input.nextDouble();
        System.out.println("WOW! Thank you!");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ' '+ super.toString();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
