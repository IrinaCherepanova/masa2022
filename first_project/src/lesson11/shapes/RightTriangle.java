package lesson11.shapes;

import java.util.Scanner;

public class RightTriangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public RightTriangle(String color, double side1, double side2, double side3) {
        super(color);
        this.sideA = side1;
        this.sideB = side2;
        this.sideC = side3;
    }

    public RightTriangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your color:");
        setColor(input.nextLine());
        System.out.println("Enter side A:");
        this.sideA = input.nextDouble();
        System.out.println("Enter side B:");
        this.sideB = input.nextDouble();
        System.out.println("Enter side C:");
        this.sideC = input.nextDouble();
        System.out.println("Amazing! Thank you!");

    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ' ' + super.toString();
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB/2;
    }
}
