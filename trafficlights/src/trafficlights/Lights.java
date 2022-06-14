package trafficlights;

public class Lights {
    Driver d = new Driver();
   
    public void red(){
        d.pressBrakes();
    }
    public void orange(){
        d.startEngine();
    }
    public void green(){
        d.pressAccelerator();
    }

    
}
