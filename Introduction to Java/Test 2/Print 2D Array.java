// Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
  
// Sample Input 1:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1 :
// 1 2 3
// 1 2 3
// 1 2 3
// 4 5 6
// 4 5 6
// 7 8 9

public class solution {
	public static void print2DArray(int input[][]) 
	{
		int n = input.length;
		int m = input[0].length;

		for(int i = 0; i < n; i++)
		{
			int k = n-i;
			while(k > 0)
			{
				for(int j = 0; j < m; j++)
				{
					System.out.print(input[i][j] + " ");
				}
				System.out.println();
				k--;
			}
		}

	}
}
