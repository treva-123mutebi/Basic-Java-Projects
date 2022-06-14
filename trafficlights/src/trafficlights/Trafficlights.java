package trafficlights;

public class Trafficlights {

    public static void main(String[] args) {
        Lights l = new Lights();
        l.red();
        
        LightsusingIF luIF = new LightsusingIF();
        luIF.lights("green");
    }
}
