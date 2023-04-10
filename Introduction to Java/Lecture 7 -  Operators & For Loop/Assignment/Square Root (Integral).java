// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.
  
//   Sample Input 1 :
// 10
// Sample Output 1 :
// 3

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 1;
        while(i * i <= n)
        {
            i++;
        }
        System.out.print(i-1);


	}
}
