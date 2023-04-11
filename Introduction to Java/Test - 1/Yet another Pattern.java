// Ninja was playing with her sister to solve a puzzle pattern. However, even after taking several hours, they could not solve the problem.
// A value of N is given to them, and they are asked to solve the problem. Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem?
// Example : Pattern for N = 4

// ****
//  ***     
//   **
//    *

import java.util.* ;
import java.io.*; 
public class Solution {

	public static void ninjaPuzzle(int n) {

		// Write your code here.

		Scanner scan = new Scanner(System.in);

        // int n = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            int spaces = 0;
            for(spaces = 0; spaces < i; spaces++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j < n - spaces; j++)
            {
                System.out.print("*");
            }


            System.out.println();
        }
	}
}
