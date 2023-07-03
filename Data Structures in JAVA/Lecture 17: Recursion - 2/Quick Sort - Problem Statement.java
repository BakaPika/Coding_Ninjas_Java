// Given the 'start' and the 'end'' positions of the array 'input', your task is to sort the elements between 'start' and 'end' using quick sort.

// Sample Input 1 :
// 6 
// 2 6 8 5 4 3
// Sample Output 1 :
// 2 3 4 5 6 8
// Sample Input 2 :
// 5
// 1 2 3 5 7
// Sample Output 2 :
// 1 2 3 5 7 




public class Solution {
	
	public static int partition(int[] arr, int si, int ei)
    {
        int pivotElement = arr[si];
        int count = 0;

        for(int i = si+1; i <= ei; i++)
        {
            if(pivotElement > arr[i])
            {
                count++;
            }
        }

        int temp = arr[si + count];
        arr[si + count] = pivotElement;
        arr[si] = temp;

        int i = si;
        int j = ei;

        while(i < j)
        {
            if(arr[i] < pivotElement)
            {
                i++;
            }
            else if (arr[j] >= pivotElement)
            {
                j--;
            }
            else
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return si + count;
    }
	public static void quickSort(int[] input,int startIndex, int endInedx) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(startIndex >= endInedx)
        {
            return;
        }

        int pivotElement = partition(input, startIndex, endInedx);
        quickSort(input, startIndex, pivotElement - 1);
        quickSort(input, pivotElement + 1, endInedx);
		
	}
	
}
