// Sample Input 1:
// 7
// 2 13 4 1 3 6 28
// Sample Output 1:
// 1 2 3 4 6 13 28

public class Solution {  

    public static void selectionSort(int[] arr, int n) 
    {
        for(int i = 0; i < (arr.length-1); i++)
        {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int j = i; j< arr.length; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }   

}
