// Sample Input 1:
// 1
// 7
// 1 2 3 4 5 6 7 
// 12
// Sample Output 1:
// 5


public class Solution {
    
    public static int findTriplet(int[] arr, int x) 
    {
        int value1 = 0;
        int value2 = 0;
        int count = 0;
    	for(int i = 0; i < arr.length; i++)
        {
            value1 = arr[i];

            for(int j = i + 1; j < arr.length; j++)
            {
                value2 = arr[j];

                for(int k = j + 1; k < arr.length; k++)
                {
                    if(value1 + value2 + arr[k] == x)
                    {
                        count++;
                    }
                }
            }
        }

        return count;
    }

}
