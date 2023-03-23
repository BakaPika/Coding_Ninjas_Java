//   *
//  ***
// *****
//*******

import java.util.*;
public class Solution {


	public static void main(String[] args)
	{
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while(i <= n)
        {
            int spaces = 1;

            while(spaces <= n - i)
            {
                System.out.print(" ");
                spaces++;
            }

            int num = 1;
            while(num <= i)
            {
                System.out.print("*");
                num++;
            }

            int dec = i - 1;
            while(dec >= 1)
            {
                System.out.print("*");
                dec--;
            }

            System.out.println();
            i++;

        }
	

		
	}

}
