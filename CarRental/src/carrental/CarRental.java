package carrental;

public class CarRental {
    String carrentalcontract[];
    
    public void addContract(){
        String name1 = "Kisha Liana";
        String address1 = "Entebbe";
        String vehicle1 = "Nissan Sentra";
        
        String name2 = "John Doe";
        String address2 = "Wakiso";
        String vehicle2 = "Toyota Camry";
        
        String name3 = "Jane Doe";
        String address3 = "Bunga";
        String vehicle3 = "Honda Accord";
        
        carrentalcontract = new String[3];
        carrentalcontract[0]= name1 + ", " + address1 + ", " + vehicle1;
        carrentalcontract[1]= name2 + ", " + address2 + ", " + vehicle2;
        carrentalcontract[2]= name3 + ", " + address3 + ", " + vehicle3;
    }
    
    public void displayContracts(){
        System.out.println(carrentalcontract[0]);
        System.out.println(carrentalcontract[1]);
        System.out.println(carrentalcontract[2]);
    }
    
    public static void main(String[] args) {
        CarRental carrental = new CarRental();
        carrental.addContract();
        carrental.displayContracts();
    }  
}
