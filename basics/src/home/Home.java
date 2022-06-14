package home;
public class Home {
    public static void main(String[] args) {
        Home h = new Home();
        h.add();
        h.multilpy(2,3);
        h.trinum(3);
        h.mode(40,10,10,2);
    }
    public void add(){
        int x = 5;
        int y = 6;
        int c = x + y;
        System.out.println(c);
    }
    public void multilpy(int a, int b){
        int d = a  * b;
        System.out.println(d);
    }
    public void trinum(int n){
        int e = 2;
        int f = n +1;
        int g = n * f;
        int tr = g/e;
        System.out.println(tr);
    }
    public void mode(int lcb, int d1, int d2, int c){
        int i = d1 * c;
        int j = d1 + d2;
        int k = i/j;
        int m = lcb + k;
        System.out.println(m);
    }
}
