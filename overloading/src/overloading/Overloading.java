package overloading;

public class Overloading {

    public static void main(String[] args) {
        Overloading ol = new Overloading();
        ol.add(3.14F,2);
        ol.add(4,5);
        ol.add(6,7,8);
    }
    public void add(float num1,int num2){
        System.out.println("Result after addition is: "+(num1+num2));
    }
    public void add(int num1,int num2){
        System.out.println("Result after addition is: "+(num1+num2));
    }
    public void add(int num1,int num2,int num3){
        System.out.println("Result after addition is: "+(num1+num2+num3));
    }
}
