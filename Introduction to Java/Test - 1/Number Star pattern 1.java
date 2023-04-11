// Print the following pattern for given number of rows.
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321


import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = n; i > 0; i--)
        {
            int j = 0;
            for(j = 1; j < i; j++)
            {
                System.out.print(n - j + 1);
            }

            if(j == i)
            {
                System.out.print("*");
            }

            for(int k = n; k > i; k--)
            {
                System.out.print(k - i);
            }

            System.out.println();
        }

	}
}
