package home2;
public class Home2 {
    public static void main(String[] args) {
        Home2 h2 = new Home2();
        int v = h2.tr(4);
        System.out.println(v);
    }
    public int tr(int n){
        int a = n + 1;
        int b = a * 2;
        int c = b / 2;
        return c;
    }
    
}
