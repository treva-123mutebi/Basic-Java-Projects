package home4;
public class Home4 {
    public static void main(String[] args) {
        Home4 h4 = new Home4();
        h4.e(5);
    }
    public void e(int num){
        int r = num%2;
        if(r == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
       }
    }
    
}
