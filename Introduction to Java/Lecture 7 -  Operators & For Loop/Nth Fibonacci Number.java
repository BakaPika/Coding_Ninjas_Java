// [0, 1, 1, 2, 3, 5, 8, 13, 21]

// Sample Input 1:
// 6
// Sample Output 1:
// 8

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f1 = 0;
        int f2 = 1;
        int result = 0;
        for(int i = 1; i <= n; i++)
        {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }

        System.out.println(f1);

		
	}

}
