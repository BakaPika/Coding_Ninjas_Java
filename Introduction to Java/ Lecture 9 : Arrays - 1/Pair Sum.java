// Sample Input 1:
// 1
// 9
// 1 3 6 2 5 4 3 2 4
// 7
// Sample Output 1:
// 7

public class Solution {  

    public static int pairSum(int arr[], int x) {
    	int value = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            value = arr[i];

            for(int j = i + 1; j < arr.length; j++)
            {
                if(value + arr[j] == x)
                {
                    count++;
                }
            }
        }

        return count;
    }
}
