package carrental;

public class CarRentalContract {
    
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name();
        
        Vehicle vehicle = new Vehicle();
        vehicle.getColor();
        
        Car car = new Car();
        car.hasWinterTires();
    }
}
