// Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
// Print all the leader elements separated by space and in the same order they are present in the input array.
  
// Sample Input 1 :
// 6
// 3 12 34 2 0 -1
// Sample Output 1 :
// 34 2 0 -1



public class Solution {

	public static void leaders(int[] input) 
	{

		int count = 0;

        for(int i = 0; i < input.length; i++)
        {
            for(int j = i+1; j <input.length; j++)
            {
                if(input[i] >= input[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }

            if(count == input.length - i - 1)
            {
                System.out.print(input[i] + " ");
            }
            count = 0;
        }
	
		
	}
	
}
