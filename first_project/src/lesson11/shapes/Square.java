package lesson11.shapes;

import java.util.Scanner;

public class Square extends Shape{

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your color:");
        setColor(input.nextLine());
        System.out.println("Enter square side:");
        this.side = input.nextDouble();
        System.out.println("Nice choice! Thank you!");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ' ' + super.toString();
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
