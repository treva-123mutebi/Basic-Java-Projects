package carrental;

public class Truck extends Vehicle { 
    boolean trailer;
    
    public void hasTrailer(){
        System.out.println("has trailer:" + trailer);
    }
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.getColor();  
        
        Truck truck = new Truck();
        truck.hasTrailer();     
    }
}
