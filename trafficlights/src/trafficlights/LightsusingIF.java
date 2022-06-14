package trafficlights;

public class LightsusingIF {
    Driver d = new Driver();
    
    public void lights(String l){
        if(l=="red"){
            d.pressBrakes();
        }
        if(l=="orange"){
            d.startEngine();
        }
        if(l=="green"){
            d.pressAccelerator();
        }
    }
    
}
