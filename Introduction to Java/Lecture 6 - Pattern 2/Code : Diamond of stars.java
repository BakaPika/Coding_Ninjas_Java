// Print the following pattern for the given number of rows.
// Note: N is always odd.
// Pattern for N = 5
  
//   *
//  ***
// *****
//  ***
//   *

import java.util.*;
public class Solution {
    
    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int first_half = (n+1)/2;
        int second_half = n - first_half;
        int i = 1;

        while(i<=first_half)
        {
            int j = 1;
            int space = first_half - i;
            while(space > 0)
            {
                System.out.print(" ");
                space--;
            }

            while(j <= i * 2 - 1)
            {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        i = second_half;

        while(i > 0)
        {
            int spaces = 1;
            while(spaces<=second_half-i+1)
            {
                System.out.print(" ");
                spaces++;
            }

            int j = 1;

            while(j<=2*i-1)
            {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;

        }

    }
}
