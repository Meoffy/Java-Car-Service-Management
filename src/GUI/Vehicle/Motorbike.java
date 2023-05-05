package GUI.Vehicle;

import GUI.Enums.EngineType;
import GUI.Enums.MotorcycleType;

public class Motorbike extends Vehicle {

    private MotorcycleType motorcycleType;

    public Motorbike(String name, GUI.Enums.vehicleType vehicleType, EngineType engineType, double vehicleWeight, double vehicleLength, double vehicleWidth, MotorcycleType motorcycleType) {
        super(name, vehicleType, engineType, vehicleWeight, vehicleLength, vehicleWidth);
        this.motorcycleType = motorcycleType;
    }

    @Override
    public String toString(){
        return super.toString() +
               ", MotorcykleType = " + motorcycleType;
    }
}
