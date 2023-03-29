// Print the following pattern for the given number of rows.
// Pattern for N = 4
//    1
//   232
//  34543
// 4567654

import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;


        while(i < n)
        {
            int k = 1;
            int j = i;
            int space = n-i-1;
            while(space > 0)
            {
                System.out.print(" ");
                space--;
            }
            while(k <= i+1)
            {
                System.out.print(j+1);
                j++;
                k++;
            }

            int f = 0;
            j = i;

            while(f<i)
            {
                System.out.print(j+i);
                j--;
                f++;
            }


            System.out.println();
            i++;

        }
	}
}
