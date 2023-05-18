// Sample Input 1:
// 1
// 3
// 9 8 9
// Sample Output 1:
// 26


public class Solution {
	

    public static int sum(int[] arr)
    {
		int tSum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            tSum = tSum + arr[i];
        }
        return tSum;

    }
}
  
  
