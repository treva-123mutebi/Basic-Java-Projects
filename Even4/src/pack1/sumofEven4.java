package pack1;

import java.util.Scanner;

public class sumofEven4 {
    
    private static Scanner sc;
    
	public static void main(String[] args) 
	{
		int n;
                int i; 
                int evensum = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Enter n : ");
		n = sc.nextInt();	
		
		for(i = 1; i <= n; i++)
		{
			if(i % 4 == 0)
			{
				evensum = evensum + i; 
			}
		}
		System.out.println("\n The sum of even numbers up to (" + n + ") that are divisible by 4 = " + evensum);
	}    
}
