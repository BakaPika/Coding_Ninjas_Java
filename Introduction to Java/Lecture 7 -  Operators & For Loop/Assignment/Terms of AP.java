// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

// Sample Input 1 :
// 10
// Sample Output 1 :
// 5 11 14 17 23 26 29 35 38 41

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 1;
        int j = 1;

        while(i <= n)
        {
            int formula = (3*j+2);
            if(formula % 4 != 0)
            {
                System.out.print(formula + " ");
                i++;
            }
            j++;
        }

	}
}
