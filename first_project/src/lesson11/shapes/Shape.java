package lesson11.shapes;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape(){

    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                '}';
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();

}
