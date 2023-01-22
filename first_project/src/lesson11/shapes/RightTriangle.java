package lesson11.shapes;

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

    @Override
    public String toString() {
        return "RightTriangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ' ';
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
