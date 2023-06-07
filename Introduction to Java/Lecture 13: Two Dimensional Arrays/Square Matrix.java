// You are given a 2D array of integers ‘A’ of length ’N’x’M’, where ‘N’ is the number of rows and ‘M’ is the number of columns. Check if the given array forms a square matrix and returns its diagonal elements.
// A Square matrix is one that has an equal number of rows and columns.
// Example:
// Input:
// 3 3
// 1 2 3
// 4 5 6 
// 7 8 9

// Output: 
// YES
// 1 5 9

// Explanation:
// The number of rows and columns is equal, so the given array forms a square matrix.
  
// Sample Input 1:
// 2
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 2 3
// 1 3 2 
// 4 5 5
// Sample Output 1:
// YES
// 1 5 9
// NO


import javafx.util.Pair;
public class Solution {
    public static Pair< String, int[] > sqrMat(int [][]mat, int n, int m) 
    {
        int[] arr1 = new int[n];

        String str = "YES";

        if(n != m)
        {
            str = "NO";
        }

        if(str.equals("YES"))
        {
            for(int i = 0; i < n; i++)
            {
                for(int j = i; j <= i; j++)
                {
                    arr1[i] = mat[i][j];
                }
            }
        }

        return new Pair(str, arr1);

    }
}
