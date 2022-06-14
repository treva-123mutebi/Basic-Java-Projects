package carrental;

public class Customer {
    String name = "Kisha Liana";
    String address = "Entebbe";
    
    public void name(){
        System.out.println(name);
    }
    
    public void address(){
        System.out.println(address);
    }
    
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name();
        customer.address();
    }
}
