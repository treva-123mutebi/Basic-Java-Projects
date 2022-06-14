package question4;

import java.util.Scanner;
import java.util.Calendar;

public class Question4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a,b;
        int c;
        System.out.println("Enter first name: ");
        a = scan.next();
        System.out.println("Enter last name: ");
        b = scan.next();
        System.out.println("Enter year of birth: ");
        c = scan.nextInt();
        heartrate(a,b,c);
       
    }
    
    public static void heartrate(String a, String b, int c){
        int age,year,maxheartrate;
        double t1,t2;
        year = Calendar.getInstance().get(Calendar.YEAR);
        age = year-c ;
        System.out.println("Age: "+age);
        maxheartrate = 240-age;
        System.out.println("Max heart rate: "+ maxheartrate);
        t1 = 0.6*maxheartrate;
        t2 = 0.85*maxheartrate;
        System.out.println("Target heart rate: " + t1 + " - " + t2);      
        
    }
    
}

