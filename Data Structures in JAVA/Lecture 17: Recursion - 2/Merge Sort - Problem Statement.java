// Given the starting 'l' and the ending 'r' positions of the array 'ARR', your task is sorting the elements between 'l' and 'r'.

// Sample Output 1:
// 1 2 3 4 6 13 28
// Explanation of Sample Output 1:
// After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
// Sample Input 2:
// 5
// 9 3 6 2 0
// Sample Output 2:
// 0 2 3 6 9

public class Solution {


    public static void merge(int[] s1, int[] s2, int[] d)
    {
        int i = 0;
        int j = 0;
        int k = 0;
         while(i < s1.length && j < s2.length)
         {
             if(s1[i] <= s2[j])
             {
                d[k] = s1[i];
                i++;
                k++;
             }

             else
             {
                 d[k] = s2[j];
                 k++;
                 j++;
             }
         }

         if(i < s1.length)
         {
             while(i < s1.length)
             {
                 d[k] = s1[i];
                 i++;
                 k++;
             }
         }
         if(j < s2.length)
         {
             while(j < s2.length)
             {
                 d[k] = s2[j];
                 j++;
                 k++;
             }
         }
    }
    public static void mergeSort(int[] arr, int l, int r)
    {
         if(arr.length <= 1)
        {
            return;
        }

        int mid = arr.length / 2;

        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - arr1.length];

        for(int i = 0; i < arr.length/2; i++)
        {
            arr1[i] = arr[i];
        }

        for(int i = arr.length/2; i < arr.length; i++)
        {
            arr2[i - arr.length/2] = arr[i];
        }

        mergeSort(arr1, l, r);
        mergeSort(arr2, l, r);
        merge(arr1, arr2, arr);


    }
}
