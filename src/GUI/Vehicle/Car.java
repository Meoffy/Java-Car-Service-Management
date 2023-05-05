package GUI.Vehicle;

import GUI.Enums.CarBodyType;
import GUI.Enums.EngineType;

public class Car extends Vehicle {

    private CarBodyType carBodyType;

    public Car(String name, GUI.Enums.vehicleType vehicleType, EngineType engineType, double vehicleWeight, double vehicleLength, double vehicleWidth, CarBodyType carBodyType) {
        super(name, vehicleType, engineType, vehicleWeight, vehicleLength, vehicleWidth);
        this.carBodyType = carBodyType;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", CarBodyType = " + carBodyType;
    }
}


