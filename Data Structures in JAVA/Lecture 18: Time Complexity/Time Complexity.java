// You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

// Sample Input 1 :
// 2
// 6
// 2 6 8 5 4 3
// 4
// 2 3 4 7 
// 2
// 10 10
// 1
// 10
// Sample Output 1 :
// 2 3 4
// 10
// Sample Input 2 :
// 1
// 4
// 2 6 1 2
// 5
// 1 2 3 4 2
// Sample Output 2 :
// 1 2 2


import java.util.ArrayList;
public class Solution {

	public static int partition(int[] input, int si, int ei)
    {
        int pivotElement = input[si];
        int count = 0;

        for(int i = si+1; i <= ei; i++)
        {
            if(pivotElement > input[i])
            {
                count++;
            }
        }

        int temp = input[si + count];
        input[si + count] = pivotElement;
        input[si] = temp;

        int i = si;
        int j = ei;

        while(i < j)
        {
            if(input[i] < pivotElement)
            {
                i++;
            }
            else if (input[j] >= pivotElement)
            {
                j--;
            }
            else
            {
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }

        return si + count;
    }

    public static void quickSort(int[] input, int startIndex, int endIndex)
    {
        if(startIndex > endIndex)
        {
            return;
        }

        int pivotElement = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivotElement-1);
        quickSort(input, pivotElement+1, endIndex);

    }
    public static void intersection(int[] arr1, int[] arr2)
    {
        quickSort(arr1, 0, arr1.length - 1);
        quickSort(arr2, 0, arr2.length - 1);
        

        int i = 0;
        int j = 0;

        while(i < arr1.length&& j < arr2.length)
        {
            if(arr1[i] == arr2[j])
            {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if (arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }


    }

}
