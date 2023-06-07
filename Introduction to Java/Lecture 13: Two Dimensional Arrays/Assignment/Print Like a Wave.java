// For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
  
// Sample Input 1:
// 1
// 3 4 
// 1  2  3  4 
// 5  6  7  8 
// 9 10 11 12
// Sample Output 1:
// 1 5 9 10 6 2 3 7 11 12 8 4


public class Solution {

	public static void wavePrint(int mat[][])
	{

		if(mat.length == 0)
        {
            return;
        }
		
		for(int i = 0; i < mat[0].length; i++)
        {
            for(int j = 0; j < mat.length; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(mat[j][i] + " ");

                }
                else
                {
                    System.out.print(mat[mat.length - j - 1][i] + " ");
                }
            }
        }
	}

}
