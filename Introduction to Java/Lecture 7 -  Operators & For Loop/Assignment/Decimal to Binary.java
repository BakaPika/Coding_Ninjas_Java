// Given a decimal number (integer N), convert it into binary and print.
// Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.
// Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.

// Sample Input 1 :
// 12
// Sample Output 1 :
// 1100

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        long placeValue = 1;
        long binaryValue = 0;
        while(n > 0)
        {
            long lastValue = n % 2;
            binaryValue = binaryValue + (lastValue * placeValue);
            placeValue = placeValue * 10;
            n = n / 2;
        }
        System.out.println(binaryValue);

	}
}
