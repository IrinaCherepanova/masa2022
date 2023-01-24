package lesson12.vehicles;

import java.util.ArrayList;

public class MyVehicles {
    public static void main(String[] args) {

        ArrayList<Vehicle> myVehicles = new ArrayList<>();
        myVehicles.add(new Bus("Brand1", 2022));
        myVehicles.add(new Car("Brand2", 2020));
        myVehicles.add(new Truck("Brand3", 2021));

        myVehicles.forEach(vehicle -> vehicle.whoAreYou());

    }
}
