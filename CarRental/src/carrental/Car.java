package carrental;

public class Car extends Vehicle {
    boolean wintertires = true;
    
    public void hasWinterTires(){
        System.out.println("has winter tires:" + wintertires);
    }
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.getColor();
        
        Car car = new Car();
        car.hasWinterTires();
    }
}
