// For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
// Input format:
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'N' column values separated by a single space.
  
// Sample input 1:
// 1
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1:
// 45


public class Solution {

	public static void totalSum(int[][] mat) {
		
		int n = mat.length;

        if(n == 0)
        {
            System.out.print(0);
            return;
        }

        int m = mat[0].length;

        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum = sum + mat[0][i];
            sum = sum + mat[n-1][i];
        }

        for(int i = 1; i < n - 1; i++)
        {
            sum = sum + mat[i][0];
            sum = sum + mat[i][n-1];
        }

        for(int i = 1; i < n - 1; i++)
        {
            sum = sum + mat[i][i];
            sum = sum + mat[i][n-1-i];
        }

        if(n % 2 != 0)
        {
            sum = sum - mat[n/2][n/2];
        }

        System.out.print(sum);
	}

}
