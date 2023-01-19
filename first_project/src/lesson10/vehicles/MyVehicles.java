package lesson10.vehicles;

import java.util.ArrayList;

public class MyVehicles {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles= new ArrayList<>();
        vehicles.add(new Bus("BusManufacterer", 2022, 1111, "white"));
        vehicles.add(new Car("CarManufacterer", 2020, false, "black"));
        vehicles.add(new Truck("TruckManufacterer", 2021, "type1", "green"));

        vehicles.forEach(vehicle -> vehicle.whoAreYou());

    }
}
