// Sample Input 1 :
// 3
// Sample Output 1 :
// 135
// 351
// 513

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while(i <= n)
        {
            int value = 2*i-1;
            int j = 1;
            while(j <= n)
            {
                System.out.print(value);
                value = value + 2;

                if(value > 2 * n - 1)
                {
                    value = 1;
                }
                j++;
            }
            System.out.println();
            i++;
        }
	}
}
