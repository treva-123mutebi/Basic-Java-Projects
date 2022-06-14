package carrental;

public class Vehicle {
    String red = "red";
    
    public void getColor(){
        System.out.println("The vehicle is " + red);
    }
    
    public static void main(String[] args) {  
        Vehicle vehicle = new Vehicle();
        vehicle.getColor();
    }  
}
