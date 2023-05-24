// Sample Input 1:
// 7
// 2 13 4 1 3 6 28
// Sample Output 1:
// 1 2 3 4 6 13 28



public class Solution {
    public static void bubbleSort(int[] arr, int size){
        for(int j = 0; j < size; j++)
        {
            for(int i = 0; i < size - 1; i++)
            {
                if(arr[i] > arr[i + 1])
                {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
