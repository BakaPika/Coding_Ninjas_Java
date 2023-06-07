// For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
// Note :
// If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
  

public class Solution {

	public static void findLargest(int mat[][])
	{
		int row_max = Integer.MIN_VALUE;
        int col_max = Integer.MIN_VALUE;
        int r_index = 0;
        int col_index = 0;
        int sum = 0;

		if(mat.length == 0)
        {
            System.out.print("row"+ " " + r_index + " " + row_max);
            return;
        }

        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                sum = sum + mat[i][j];
            }
            if(sum > row_max)
            {
                r_index = i;
                row_max = sum;
            }
            sum = 0;
        }

        for(int i = 0; i < mat[0].length; i++)
        {
            for(int j = 0; j < mat.length; j++)
            {
                sum = sum + mat[j][i];
            }

            if(sum > col_max)
            {
                col_index = i;
                col_max = sum;
            }
            sum = 0;
        }

        if(row_max >= col_max)
        {
            System.out.print("row"+ " " + r_index + " " + row_max);
        }
		else
		{
			System.out.print("column"+ " " + col_index + " " + col_max);
		}
	}

}
