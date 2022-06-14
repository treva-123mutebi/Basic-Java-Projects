package looping;
public class Looping {
    public static void main(String[] args) {
        Looping l = new Looping();
        l.tr(4);
        l.forloop();
        l.forloopwithIF();
        l.dowhileloop();
        l.dowhileloop2();
    }
    public void tr(int n){
        int a = n + 1;
        int b = n * a;
        int c = b / 2;
        System.out.println(c);
    }
    public void forloop(){
        int x;
        for(x=1; x<20; x++){
            int a = x+1;
            int b = x*a;
            int c = b/2;
            System.out.println(c);
        }
    }
    public void forloopwithIF(){
        int n;
        for(n=1; n<=20; n++){
            System.out.println(n);
            if(n%2==0){
                System.out.println("is an even number");
            }
            else{
                System.out.println("is an odd number");
            }
        }
    }
    public void dowhileloop(){
        int num=1,sum=0;
        do{
            sum=sum+num;
            if(num%2==0){
                System.out.println(num);
            }
            num++;
        }
        while(num<20);
        System.out.printf("Sum of 10 numbers: %d\n",sum);
    }
    public void dowhileloop2(){
        int num=1,sum=0;
        int n=1;
        do{
            n++;
            int a=(n*(n+1)/2);
            
            sum=sum+num;
            if(num%2==0){
                System.out.println(num);
            }
            num++;
        }
        while(num<20);
    }
}
