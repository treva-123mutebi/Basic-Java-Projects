package trafficlights;

public class Driver {
    Car c = new Car();
    
    public void startEngine(){
        c.start();
    }
    public void pressAccelerator(){
        c.move();
    }
    public void pressBrakes(){
        c.stop();
    }
    
}
