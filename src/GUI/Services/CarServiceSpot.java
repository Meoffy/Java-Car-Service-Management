package GUI.Services;

import GUI.Vehicle.Vehicle;

import java.util.LinkedList;

public class CarServiceSpot extends ServiceWarehouse{

    private LinkedList<Vehicle> vehicles = new LinkedList<>();

    public CarServiceSpot(double surface) {
        super(surface);
    }

    public Vehicle addVehicleForRepair(Vehicle vehicle) {
        System.out.println(vehicle.getName() + " was added.");
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Vehicle: " + vehicles;
    }
}

