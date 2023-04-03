// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6

import java.util.*;
public class Main {
	
	public static void main(String[] args)
	{
		// Write your code here
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while(i <= n)
        {
            int k = 1;
            while(k < i)
            {
                System.out.print(k + "+");
                k++;
            }

            int j = 1;
            int sum = 0;
            while(j <= i)
            {
                int temp = j;
                sum = sum + temp;
                j++;
            }
            System.out.print(k + "=" + sum);
            System.out.println();
            i++;
		}
	}
}
