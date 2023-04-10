// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
  
// Sample Input 1 :
// 1234
// Sample Output 1 :
// 4321


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int r = 0;
        int i = String.valueOf(n).length();
        while(i > 0)
        {
            int temp = n % 10;
            r = r * 10 + temp;
            n = n / 10;
            i--;
        }
        System.out.println(r);


    

	}
}
