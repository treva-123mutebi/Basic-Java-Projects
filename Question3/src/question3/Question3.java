package question3;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    
    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.sumofthreevalues();
        q3.productofoddnumbers();
        q3.differencebetweenhighestandlowest();
        q3.averageofthreevalues();
        q3.quotientoftwovalues();
        q3.remainderafterdivisionoftwovalues();
    }
    
    public void sumofthreevalues(){
        Scanner scan = new Scanner(System.in);     
        System.out.print("SUM OF THREE VALUES \n");
        System.out.print("Enter first value:");
        double val1 = scan.nextDouble();
        System.out.print("Enter second value:");
        double val2 = scan.nextDouble();
        System.out.print("Enter third value:");
        double val3 = scan.nextDouble();
        double sum = val1 + val2 + val3;       
        System.out.print("Sum of the three values is: " + sum + "\n\n");   
    }
    
    public void productofoddnumbers(){
        System.out.print("PRODUCT OF ODD NUMBERS \n");
        System.out.print("Odd numbers from 1 to 15 are: ");
        int oddnumbers;
        int product = 0;
        int startingvalue = 1;
        int stoppingvalue = 15; 
	for (oddnumbers = startingvalue; oddnumbers <= stoppingvalue; oddnumbers++) {
	   if (oddnumbers % 2 != 0) {
               System.out.print(oddnumbers + ", ");
               //product = product + oddnumbers;
               //System.out.print("\nThe product of odd numbers from 1 to 15 is: " + product + "\n");
	   }
        }
    }
    
    public void differencebetweenhighestandlowest(){
        Scanner scan = new Scanner(System.in);     
        System.out.print("\n\nDIFFERENCE BETWEEN HIGHEST AND LOWEST \n");
        System.out.print("Enter range of numbers:");
        double[] rangeofnumbers = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
        System.out.print("\nThe range of numbers is: " + Arrays.toString(rangeofnumbers) + "\n");
        double highestnumber = rangeofnumbers[0];
        double lowestnumber = rangeofnumbers[0];
        int difference;
        for(difference = 1; difference < rangeofnumbers.length; difference++){
            if(rangeofnumbers[difference] > highestnumber)
                highestnumber = rangeofnumbers[difference];
            else if(rangeofnumbers[difference] < lowestnumber)
                lowestnumber = rangeofnumbers[difference];
        }
        System.out.print("Difference between the highest and lowest is: " + (highestnumber - lowestnumber) + "\n\n");
    }
    
    public void averageofthreevalues(){
        Scanner scan = new Scanner(System.in);     
        System.out.print("AVERAGE OF THREE VALUES \n");
        System.out.print("Enter first value:");
        double val1 = scan.nextDouble();
        System.out.print("Enter second value:");
        double val2 = scan.nextDouble();
        System.out.print("Enter third value:");
        double val3 = scan.nextDouble();
        double sum = val1 + val2 + val3;   
        double average = sum / 3;
        System.out.print("Average of the three values is: " + average + "\n\n");
    }
    
    public void quotientoftwovalues(){
        Scanner scan = new Scanner(System.in);     
        System.out.print("QUOTIENT OF TWO VALUES \n");
        System.out.print("Enter first value:");
        double val1 = scan.nextDouble();
        System.out.print("Enter second value:");
        double val2 = scan.nextDouble();
        double quotient = val1 / val2;
        System.out.println("Quotient of the two values is: " + quotient + "\n\n");
    }
    
    public void remainderafterdivisionoftwovalues(){
        Scanner scan = new Scanner(System.in);     
        System.out.print("REMAINDER AFTER DIVISION OF TWO VALUES \n");
        System.out.print("Enter first value:");
        double val1 = scan.nextDouble();
        System.out.print("Enter second value:");
        double val2 = scan.nextDouble();
        double remainder = val1 % val2;
        System.out.println("Remainder after division the two values is: " + remainder + "\n\n");
    }
    
}
