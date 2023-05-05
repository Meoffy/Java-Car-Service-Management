package GUI.Vehicle;

import GUI.Enums.EngineType;

public class Amphibian extends Vehicle {

    private boolean isWaterVehicle;

    public Amphibian(String name, GUI.Enums.vehicleType vehicleType, EngineType engineType, double vehicleWeight, double vehicleLength, double vehicleWidth, boolean isWaterVehicle) {
        super(name, vehicleType, engineType, vehicleWeight, vehicleLength, vehicleWidth);
        this.isWaterVehicle = isWaterVehicle;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", IsWaterVehicle = " + isWaterVehicle;
    }
}
