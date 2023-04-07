// Sample Input 1:
// 20
// Sample Output 1:
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 2; i <= n; i++)
        {
            boolean isPrime = true;
            for(int j = 2; j < i; j++)
            {
                if(i%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(i);
            }
        }
        scan.close();

		
	}
}
