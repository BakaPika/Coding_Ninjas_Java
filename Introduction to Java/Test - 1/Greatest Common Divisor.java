// You are given two numbers, ‘X’ and ‘Y’. Your task is to find the greatest common divisor of the given two numbers.
// The Greatest Common Divisor of any two integers is the largest number that divides both integers.
  
// Sample Input 1:
// 2
// 20 15
// 8 32
// Sample Output 1:
// 5
// 8
// Explanation:
// For the first test case, the greatest common divisor which divides both 15 and 20 is 5. Hence the answer is 5.

// For the second test case, the greatest common divisor which divides both 8 and 32 is 8. Hence the answer is 8.
  
import java.util.* ;
import java.io.*; 

public class Solution {
	public static int findGcd(int x, int y) 
	{
		// Write your code here
		int value = 0;
        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x % i == 0 && y % i == 0)
            {
                value = i;
            }
        }

       return value;
	}
}
