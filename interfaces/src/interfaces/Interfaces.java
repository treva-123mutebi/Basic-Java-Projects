package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        if(args.length==3){
            TwoWheeler objBike = new TwoWheeler(args[0],args[1]);
            objBike.displayDetails();
            objBike.start();
            objBike.accelerate(Integer.parseInt(args[2]));
            objBike.brake();
            objBike.stop();
        }
        else{
            System.out.println("Usage: java TwoWheeler <ID> <Speed>");
        }
    }
}
