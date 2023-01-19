package lesson10.chessmate;

public abstract class Figure {
    private String name;

    public String getName() {
        return name;
    }

    public Figure(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract boolean canYouMove();

    public abstract void introduceYourSelf();
}
