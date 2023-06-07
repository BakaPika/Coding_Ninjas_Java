// You are given a matrix ‘MAT’. Print the transpose of the matrix. The transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, transpose of a matrix A[][] is obtained by changing A[i][j] to A[j][i].
// For example:
// Let matrix be : 
// 1 2
// 3 4

// Then transpose of the matrix will be: 
// 1 3
// 2 4
  
// Sample Input 1 :
// 2
// 2 2
// 1 2
// 3 4
// 3 2
// 1 2 
// 2 3
// 3 4
// Sample Output 1 :
// 1 3
// 2 4
// 1 2 3
// 2 3 4

import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int[][] transpose(int m, int n, int[][] mat) {
		

        int[][] mat1 = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                int temp = mat[j][i];
                mat1[i][j] = temp;
            }
        }

		return mat1;
	}

}
