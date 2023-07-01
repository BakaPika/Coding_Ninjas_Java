// You have been given a number 'n'. Return the number of digits present in 'n' .
// Sample Input 1 :
//  156
// Sample Output 1 :
// 3
// Sample Input 2 :
//  7
// Sample Output 2 :
// 1

public class Solution {

	public static int count(int n)
	{
		
		if(n == 0)
        {
            return 0;
        }

        return count(n / 10) + 1;
	}
}
