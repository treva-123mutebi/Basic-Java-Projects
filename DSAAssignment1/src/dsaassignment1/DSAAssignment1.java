package dsaassignment1;

import java.util.Arrays;

public class DSAAssignment1 {

    public static int[] insertx(int a, int initialarray[], int x, int position)
    {
        int k; 
        int newarray[] = new int[a + 1];
        for (k = 0; k < a + 1; k++) {
            if (k < position - 1)
                newarray[k] = initialarray[k];
            else if (k == position - 1)
                newarray[k] = x;
            else
                newarray[k] = initialarray[k - 1];
        }
        return newarray;
    }
  
    public static void main(String[] args)
    { 
        int a = 10;
        int initialarray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };       
        System.out.println("Initial array:\n" + Arrays.toString(initialarray));
        int x = 70;
        int position = 5;
        initialarray = insertx(a, initialarray, x, position);
        System.out.println("\nArray with " + x + " inserted at position " + position + ":\n" + Arrays.toString(initialarray));
    }
}
