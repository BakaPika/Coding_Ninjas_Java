public class Main
{

    public static void main(String[] args)
    {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8,},
                {9,10,11,12},
                {13,14,15,16}
        };


        int n = mat.length;
        int m = mat[0].length;

        if(n == 0)
        {
            return;
        }

        int total = n*m;

        int u_row = 0, l_row = n - 1;
        int u_col = 0, l_col =  m - 1;

        int count = 0;

        while(count < total)
        {
            for(int i = u_col; i <= l_col; i++)
            {
                System.out.print(mat[u_row][i] + " ");
                count++;
            }
            u_row++;

            for(int i = u_row; i <= l_row; i++)
            {
                System.out.print(mat[i][l_col] + " ");
                count++;
            }
            l_col--;

            for(int i = l_col; i >= u_col; i--)
            {
                System.out.print(mat[l_row][i] + " ");
                count++;
            }
            l_row--;

            for(int i = l_row; i >= u_row; i--)
            {
                System.out.print(mat[i][u_col] + " ");
                count++;
            }
            u_col++;
        }

    }

}
