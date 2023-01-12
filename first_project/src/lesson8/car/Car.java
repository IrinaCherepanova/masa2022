package lesson8.car;

public class Car {

    String color;
    int year;
    String manufacturer;
    String model;
    boolean isElectrical;
    int created = 0;
    static int wasCreated = 0;


    public Car(String сolor){
        this.color = сolor;
    }

    public Car(){
        created++;
        System.out.println("created = " + created);
        wasCreated++;
        System.out.println("wasCreated = " + wasCreated);
    }

    public Car(String color, int year, String manufacturer, String model, boolean isElectrical) {
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.isElectrical = isElectrical;
        created++;
        System.out.println("created = " + created);
        wasCreated++;
        System.out.println("wasCreated = " + wasCreated);
    }

    public Car(String manufacturer, int year){
        this.manufacturer = manufacturer;
        this.year = year;
        created++;
        System.out.println("created = " + created);
        wasCreated++;
        System.out.println("wasCreated = " + wasCreated);
    }
    public void carIsReady(){
        System.out.println("I'm ready!");
    }

    public void printCarInfo(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", isElectrical=" + isElectrical +
                '}';
    }

    public static void classOccerrencies(){
        System.out.println("wasCreated = " + wasCreated);
    }
}
