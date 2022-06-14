package question2;

import java.awt.Rectangle;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.radiusandcentralcoordintes();
    }
    
    public void radiusandcentralcoordintes(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1:");
        double x1 = scan.nextDouble();
        System.out.print("Enter y1:");
        double y1 = scan.nextDouble();
        System.out.print("Enter x2:");
        double x2 = scan.nextDouble();
        System.out.print("Enter y2:");
        double y2 = scan.nextDouble();
        System.out.print("Enter x3:");
        double x3 = scan.nextDouble();
        System.out.print("Enter y1:");
        double y3 = scan.nextDouble();
        double a = x2 - x1;
        double b = y2 - y1;
        double ab = (y2 * y2 - y1 * y1 + x2 * x2 - x1 * x1) / 2;
        double c = x3 - x1;
        double d = y3 - y1;
        double cd = (y3 * y3 - y1 * y1 + x3 * x3 - x1 * x1) / 2;
        double x = (d * ab - b * cd) / (a * d - b * c);
        double y = (a * cd - c * ab) / (a * d - b * c);
        double r = Math.sqrt(Math.pow(x - x1, 2.0) + Math.pow(y - y1, 2.0));
        System.out.println("Radius and the central coordinates:"); 
        System.out.printf("%.3f (%.3f, %.3f)", r, x, y);
    }
    
    //public Rectangle calcBoundRect(int centerX, int centerY, int diameter){
        //Rectangle r;      
                           
        //return(r);
    //}
}
