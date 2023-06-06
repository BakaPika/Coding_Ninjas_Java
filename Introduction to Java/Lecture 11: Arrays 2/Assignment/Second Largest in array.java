// You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
  
// Sample Input 1:
// 5
// 4 3 10 9 2
// Sample Output 1:
// 9

public class Solution 
{  
    public static int secondLargestElement(int[] arr, int n)
    {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] > largest)
            {
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest)
            {
                if(largest != arr[i])
                {
                    second_largest = arr[i];
                }
            }
        }
        return second_largest;
    }

}
