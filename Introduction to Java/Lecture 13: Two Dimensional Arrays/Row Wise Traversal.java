// Given a matrix, ‘A’ of size ‘N’ * ‘M’, you must traverse the matrix row-wise.
// You must return an integer array of size ‘N’ * ‘M’ denoting the row-wise traversal of the matrix.
// For example:
// Input :
// A = [ [1, 2, 3], [4, 5, 6] ]

// Output :
// 1 2 3 4 5 6

// Explanation: 

// For the given matrix, the first row is [1, 2, 3], and the second is [4, 5, 6].
// For row-wise traversal, you must traverse the first row and then the second.
  
// Sample Input 1 :
// 2
// 2 2 
// 4 3
// 2 1
// 1 5
// 1 2 3 4 5
// Sample Output 1 :
// 4 3 2 1
// 1 2 3 4 5 

public class Solution {
    public static int[] printRowWise(int [][]a) {
        
        int n = a.length * a[0].length;

        int[] arr1 = new int[n];

        int k = 0;

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                arr1[k] = a[i][j];
                k++;
            }
        }

        return arr1;
    }
}
