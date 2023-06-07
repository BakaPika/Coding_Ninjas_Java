// Given a matrix, ‘A’ of size ‘N’ * ‘M’, you must traverse the matrix column-wise.
// You must return an integer array of size ‘N’ * ‘M’ denoting the column-wise traversal of the matrix.
// For example:
// Input :
// A = [ [1, 2, 3], [4, 5, 6] ]

// Output :
// 1 4 2 5 3 6

// Explanation: 
// For the given matrix, the first column is [1, 4], the second is [2, 5] and the third is [3, 6].
// For column-wise traversal, you must traverse the first column, the second column, and then the third.

// Sample Input 1 :
// 2
// 2 2 
// 4 3
// 2 1
// 5 1
// 1 
// 2 
// 3 
// 4 
// 5
// Sample Output 1 :
// 4 2 3 1
// 1 2 3 4 5 

public class Solution {
    public static int[] printColWise(int [][]a) 
    {
        int n = a.length * a[0].length;

        int[] arr1 = new int[n];

        int k = 0;

        for(int i = 0; i < a[0].length; i++)
        {
            for(int j = 0; j < a.length; j++)
            {
                arr1[k] = a[j][i];
                k++;
            }
        }    

        return arr1;
    }
}
