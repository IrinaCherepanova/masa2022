package lesson10.vehicles;

import java.util.ArrayList;

public class MyVehicles {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles= new ArrayList<>();
        vehicles.add(new Bus("BusManufacturer", 2022, 1111, "white"));
        vehicles.add(new Car("CarManufacturer", 2020, false, "black"));
        vehicles.add(new Truck("TruckManufacturer", 2021, "type1", "green"));

        vehicles.forEach(vehicle -> vehicle.whoAreYou());

    }
}
