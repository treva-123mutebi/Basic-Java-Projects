package staticmembers;

public class Staticmembers {

    public static void main(String[] args) {
        System.out.println("I am the main method");
        Staticmembers.staticMethod();
        Staticmembers objStatic1 = new Staticmembers();
        objStatic1.displayCount();
        Staticmembers objStatic2 = new Staticmembers();
        objStatic2.displayCount();
        Staticmembers objStatic3 = new Staticmembers();
        objStatic3.displayCount();
    }
    public static int staticCounter=0;
    int instanceCounter=0;
    static{
        System.out.println("I am a static block");
    }
    public static void staticMethod(){
        System.out.println("I am a static method");
    }
    public void displayCount(){
        staticCounter++;
        instanceCounter++;
        System.out.println("Static counter is: "+staticCounter);
        System.out.println("Instance counter is: "+instanceCounter);
    }
}
