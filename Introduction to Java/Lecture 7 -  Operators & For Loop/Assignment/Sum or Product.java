// Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
// If C is equal to -
//  1, then print the sum
//  2, then print the product
//  Any other number, then print '-1' (without the quotes)
// Input format :
// Line 1 : Integer N
// Line 2 : Choice C
// Sample Input 1 :
// 10
// 1
// Sample Output 1 :
// 55

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();
        int sum = 0;
        int product = 1;

        if(C == 1)
        {
            for(int i = 1; i <= N; i++)
            {
                sum += i;
            }
            System.out.print(sum);
        }

        else if(C == 2)
        {
            for(int i = 1; i <= N; i++)
            {
                product *= i;
            }
            System.out.print(product);
        }

        else
        {
            System.out.print(-1);
        }

	}
}

