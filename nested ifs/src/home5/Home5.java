package home5;
public class Home5 {
    public static void main(String[] args) {
        Home5 h5 = new Home5();
        h5.ni(30, 4);
    }
    public void ni(int num1, int num2){
        if(num1>=10)
        {
            if(num2>=5)
            {
                System.out.println("Classified as MVS");
            }
            else
            {
                System.out.println("A little bit more effort required 2");
            }
        }
        else
        {
            System.out.println("A little bit more effort required 1");
        }
    }
}
