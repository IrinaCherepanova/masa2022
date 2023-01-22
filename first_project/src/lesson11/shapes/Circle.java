package lesson11.shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ' ';
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
