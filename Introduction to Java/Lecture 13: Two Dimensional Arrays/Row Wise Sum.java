// For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output Format :
// For each test case, print the sum of every ith row elements in a single line separated by a single space.

// Output for every test case will be printed in a seperate line.
  
// Sample Input 2:
// 2
// 2 5 
// 4 5 3 2 6 
// 7 5 3 8 9
// 4 4
// 1 2 3 4
// 9 8 7 6
// 3 4 5 6
// -1 1 -10 5
// Sample Output 2:
// 20 32 
// 10 30 18 -5 


public class Solution {

	public static void rowWiseSum(int[][] mat) {
		
		for(int i = 0; i < mat.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < mat[0].length; j++)
            {
                sum = sum + mat[i][j];
            }
            System.out.print(sum + " ");
        }
	}

}
