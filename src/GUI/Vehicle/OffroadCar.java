package GUI.Vehicle;

import GUI.Enums.EngineType;

public class OffroadCar extends Vehicle {

    boolean is4x4;

    public OffroadCar(String name, GUI.Enums.vehicleType vehicleType, EngineType engineType, double vehicleWeight, double vehicleLength, double vehicleWidth, boolean is4x4) {
        super(name, vehicleType, engineType, vehicleWeight, vehicleLength, vehicleWidth);
        this.is4x4 = is4x4;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", is4x4 = " + is4x4;
    }
}
