// A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.

// Sample Input 1 :
// 4
// Sample Output 1 :
// 7
// Sample Input 2 :
// 5
// Sample Output 2 :
// 13



public class Solution {
	
		
     public static int staircase(int n)
	{
		
		if(n < 0)
        {
            return 0;
        }
        if(n == 0)
        {
            return 1;
        }

        int jump1 = staircase(n - 1);
        int jump2 = staircase(n - 2);
        int jump3 = staircase(n - 3);
        return jump1+jump2+jump3;

	}
	
}
