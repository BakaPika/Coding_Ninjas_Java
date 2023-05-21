// Sample Input 1:
// 1
// 7
// 0 1 1 0 1 0 1
// Sample Output 1:
// 0 0 0 1 1 1 1

public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	int value = 0;

        int nextZero = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;

                nextZero++;
            }
        }
    }
}
