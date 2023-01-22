package lesson11.shapes;

public class Square extends Shape{

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
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
