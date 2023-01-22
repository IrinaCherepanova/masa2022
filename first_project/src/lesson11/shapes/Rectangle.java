package lesson11.shapes;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ' ';
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
