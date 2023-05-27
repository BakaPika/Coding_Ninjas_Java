// You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
// 'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
// Sample Input 1:
// 1
// 7
// 0 1 2 0 2 0 1
// Sample Output 1:
// 0 0 0 1 1 2 2   


public class Solution {

    public static void sort012(int[] arr)
    {
    	int i = 0;
        int nextZero = 0;
        int nextTwo = arr.length - 1;

        while(i <= nextTwo)
        {
            if(arr[i] == 0)
            {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                i++;    
                nextZero++;
            }
            else if(arr[i] == 2)
            {
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;
            }
            else
            {
                i++;
            }
        }

    
    }

}
