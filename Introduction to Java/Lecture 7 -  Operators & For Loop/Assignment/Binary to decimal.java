// Given a binary number as an integer N, convert it into decimal and print.
  
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int placeValue = 1;
        int decimalValue = 0;
        while(n > 0)
        {
            int temp = n % 10;
            decimalValue = decimalValue + temp * placeValue;
            placeValue = placeValue * 2;
            n = n / 10;
        }
        System.out.println(decimalValue);

	}
}
