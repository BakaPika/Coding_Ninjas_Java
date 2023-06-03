// You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
// Sample Input 1:
// 1
// 7
// 1 2 3 4 5 6 7
// 2
// Sample Output 1:
// 3 4 5 6 7 1 2


public class Solution 
{  

    public static void r(int arr[], int n, int d)
    {
        d--;
        int len = (d-n)/2;
        for(int i = 0; i <= len; i++)
        {
            int temp = arr[n];
            arr[n] = arr[d];
            arr[d] = temp;
            n++;
            d--;
        }
    }
    public static void rotate(int[] arr, int n, int d)
    {
        r(arr, 0, n);
        r(arr, 0, n-d);
        r(arr, n-d, n);
    }

    public static void rotate(int[] arr, int d) 
    {
        int n = arr.length;

        if(n > 0)
        {
            d = d % n;
        }

        if(d > 0)
        {
            rotate(arr, n, d);
        }
    }

}
