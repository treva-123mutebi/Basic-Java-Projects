package interfaces;

public interface IVehicle {
    public final String STATEID="LA-09";
    public void start();
    public void accelerate(int speed);
    public void brake();
    public void stop();
}
