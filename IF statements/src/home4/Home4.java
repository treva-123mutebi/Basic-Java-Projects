package home4;
public class Home4 {
    public static void main(String[] args) {
        Home4 h4 = new Home4();
        h4.ifelse(2);
        h4.elseif(13);
        h4.nestedif(3,1500,0);
    }
    public void ifelse(int num){
        int r = num%2;
        if(r == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
       }
    }
    public void elseif(int num){
        if(num<0){
            System.out.println("The number is negative");
        }
        else if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public void nestedif(int yearsofservice, int salary, int bonus){
        if(yearsofservice<5){
            System.out.println("Salary<1500");
            if(salary<500){
                System.out.println("Bonus=100");
            }
            else{
                System.out.println("Bonus=200");
            }
        }
        else{
            System.out.println("Bonus=700");
        }
    }
    
}
