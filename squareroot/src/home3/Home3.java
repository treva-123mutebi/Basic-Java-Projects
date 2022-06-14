package home3;

import java.util.Scanner;

public class Home3 {
    public static void main(String[] args) {
        Home3 h3 = new Home3();
        h3.py(2, 4);
        h3.sq(1, 5, 4);
        h3.question();
    }
    public void py(int a, int b){
        int x = a * a;
        int y = b * b;
        int z = x + y;
        double w = Math.sqrt(z);
        System.out.println(w);
    }
    public void sq(int a, int b, int c){
        int e = b * b;
        int f = 4 * a * c;
        int d = 2 * a;
        int g = e - f;
        double h = Math.sqrt(g);
        double i = -b + h;
        double j = i/d;
        System.out.println(j);
    }
    
    public void question(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        int n =input.nextInt();
        System.out.print("Enter " + n + " integers: \n");
        
        System.out.print("Enter number 1:");
        int num1 = input.nextInt();
        System.out.print("Enter number 2:");
        int num2 = input.nextInt();
        System.out.print("Enter number 3:");
        int num3 = input.nextInt();
        System.out.print("Enter number 4:");
        int num4 = input.nextInt();
        System.out.print("Enter number 5:");
        int num5 = input.nextInt();
        
        int a = num1 + num2;
        int b = a - num3;
        int c = b + num4;
        int d = c - num5;
        
        System.out.print("Answer: " + d);      
    }
}
