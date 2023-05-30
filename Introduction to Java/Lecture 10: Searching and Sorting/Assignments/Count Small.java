// You are given two arrays of integers. Let's call the first array A and the second array B. A finds the number of elements in array B that are smaller than or equal to that element for every array element.
//   Sample Input 1:
// 2
// 3
// 2 3 0
// 2
// 5 1
// 2
// 2 4
// 3 
// 1 3 5
// Sample Output 1:
// 1 1 0
// 1 2

public class Solution {
    public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            int count = 0;

            for(int j = 0; j < m; j++)
            {
                if(b[j] <= a[i])
                {
                    count++;
                }
            }

            arr[i] = count;
        }

        return arr;
    }
}
