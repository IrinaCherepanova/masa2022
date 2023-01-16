package lesson9.car;

public class MyCar {
    public static void main(String[] args) {

        Car car = new Car(
                "Tesla",
                2023,
                "model X",
                new Engine(500, "electrical", true),
                new Wheel[]{
                        new Wheel(18, 2.4),
                        new Wheel(18, 2.4),
                        new Wheel(18, 2.4),
                        new Wheel(18, 2.4),
                        new Wheel(18, 2.4)
                }
        );

        System.out.println(car);
    }
}
