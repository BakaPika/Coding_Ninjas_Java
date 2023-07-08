// Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.

// Sample Input 1 :
// 3 
// 5
// Sample Output 1 :
// 15
// Sample Input 2 :
// 4 
// 0
// Sample Output 2 :
// 0


public class solution {

	public static int multiplyTwoIntegers(int m, int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return m;
        }

        return m + multiplyTwoIntegers(m, n - 1);


    }

}
