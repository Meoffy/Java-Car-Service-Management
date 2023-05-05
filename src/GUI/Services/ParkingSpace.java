package GUI.Services;

import GUI.Exceptions.TooManyThingsException;
import GUI.Vehicle.Vehicle;

import java.util.LinkedList;

public class ParkingSpace extends ServiceWarehouse{
    private int occupiedParkingSpace = 0;
    LinkedList<Vehicle> vehicles = new LinkedList<>();

    public ParkingSpace(double surface) {
        super(surface);
    }

    public void isFreeSurface() {
        occupiedParkingSpace = 0;
        for(Vehicle vehicle : vehicles){
            occupiedParkingSpace += vehicle.getVehicleSurface();
        }
    }

    public void addVehicle(Vehicle vehicle) throws TooManyThingsException {
        if(occupiedParkingSpace + vehicle.getVehicleSurface() <= surface) {
            System.out.println(vehicle.getVehicleType() + " was parked in a parking spot.");
            vehicles.add(vehicle);
            isFreeSurface();
        } else  {
            try {
                throw new TooManyThingsException();
            }catch (TooManyThingsException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("This parking space is already occupied.");
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    @Override
    public String toString() {
        return
                super.toString() +
                " , Vehicle: " + vehicles;
    }
}
