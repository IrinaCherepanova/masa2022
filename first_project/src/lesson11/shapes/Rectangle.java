package lesson11.shapes;

import java.util.Scanner;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your color:");
        setColor(input.nextLine());
        System.out.println("Enter rectangle width:");
        this.width = input.nextDouble();
        System.out.println("Enter rectangle height:");
        this.height = input.nextDouble();
        System.out.println("Brilliant! Thank you!");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ' '+ super.toString();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
