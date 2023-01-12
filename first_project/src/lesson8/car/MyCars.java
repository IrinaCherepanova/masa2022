package lesson8.car;

public class MyCars {
    public static void main(String[] args) {

        Car bmw = new Car("Red");
        bmw.carIsReady();
        Car.classOccerrencies();
        System.out.println("bmw.color = " + bmw.color);
        bmw.color = "Black";
        System.out.println("bmw.color = " + bmw.color);
        System.out.println("bmw.isElectrical = " + bmw.isElectrical);

        bmw.year = 2023;
        bmw.color = "White";
        bmw.isElectrical = true;
        bmw.model = "model 7";
        bmw.manufacturer = "BMW";

        Car tesla = new Car();
        tesla.color = "White";
        tesla.year = 2022;

        Car car = new Car("Toyota", 2022);

        Car ford = new Car("Dark blue", 2022, "ford", "mustang", false);
        //ford.printCarInfo();
        System.out.println(car);
    }
}
