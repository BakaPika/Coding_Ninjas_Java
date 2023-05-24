// Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.

// Sample Input 1:
// 1
// 7
// 2 13 4 1 3 6 28
// Sample Output 1:
// 1 2 3 4 6 13 28


public class Solution {  

    public static void insertionSort(int[] arr) {
    	for(int i = 0; i < arr.length; i++)
        {
            int j = i - 1;

            int temp = arr[i];

            while(j>=0 && arr[j] > temp)
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = temp;
        }
    }

}
