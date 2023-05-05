package GUI.Vehicle;
import GUI.Enums.vehicleType;
import GUI.Enums.EngineType;

public abstract class Vehicle {

    public int id;
    protected static int idCounter = 1;
    protected String name;
    protected vehicleType vehicleType;
    protected EngineType engineType;
    protected double vehicleWeight;
    protected double vehicleLength;
    protected double vehicleWidth;

    public Vehicle(String name, vehicleType vehicleType, EngineType engineType, double vehicleWeight, double vehicleLength, double vehicleWidth) {
        this.id = idCounter++;
        this.name = name;
        this.vehicleType = vehicleType;
        this.engineType = engineType;
        this.vehicleWeight = vehicleWeight;
        this.vehicleLength = vehicleLength;
        this.vehicleWidth = vehicleWidth;
    }

    public double getVehicleSurface() {
        return vehicleLength * vehicleWidth;
    }

    public vehicleType getVehicleType(){
        return vehicleType;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return
                "ID = " + id +
                        ", Name = " + name +
                        ", VehicleType = " + vehicleType +
                        ", EngineType = " + engineType +
                        ", VehicleWeight = " + vehicleWeight +
                        ", VehicleLength = " + vehicleLength +
                        ", VehicleWidth = " + vehicleWidth;
    }
}



