package carrental;

public class Garage {
    String Vehicle;
    
    public void setVehicle(){
        Vehicle  = "Nissan Sentra";
        System.out.println(Vehicle + " is parked");
        System.out.println("Description of the parked vehicle:");
    }  
    
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.setVehicle();
                
        Vehicle vehicle = new Vehicle();
        vehicle.getColor();  
        
        Truck truck = new Truck();
        truck.hasTrailer();       
    }
}
