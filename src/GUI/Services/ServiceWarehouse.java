package GUI.Services;

public abstract class ServiceWarehouse {
    public static int idCounter = 0;
    public double surface;
    public int id;


    public ServiceWarehouse(double surface) {
        this.id = idCounter++;
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "ID " + id +
                ", Surface " + surface;
    }
}
