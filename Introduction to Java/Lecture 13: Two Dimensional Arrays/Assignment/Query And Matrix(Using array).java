// You are given a binary matrix with ‘M’ rows and ‘N’ columns initially consisting of all 0s. 'Q' queries follow. The queries can be of 4 types:
// Query 1: 1 R index
// Query 2: 1 C index 
// Query 3: 2 R index
// Query 4: 2 C index

// In each query, the first input is the type of the query, the second input is whether we have to consider the row ('R') or the column ('C') and the third input is the index of the row/column. 

// For each type 1 query, we need to flip the elements of the row/column having the given index. 

// For each type 2 query, we have to output the number of zeros present in the row/column having the given index. 
  
// Sample Input 1:
// 2
// 3 3
// 3
// 1R1
// 1R2
// 2C1
// 2 2
// 1
// 2R1
// Sample Output 1:
// 1
// 2


public class Main
{

    public static void main(String[] args)
    {
        int m = 3;
        int n = 3;

        String[] q = {"1R1", "1R2", "2C1"}; // array holding the queries

        int[][] mat = new int[m][n]; // creating an element where the elements will be manipulated

        int r_size = 0;

        for(int i = 0; i < q.length; i++)  //created a for loop to find the required size for creating the resultant array
        {
            if(q[i].charAt(0) == '2')
            {
                r_size++;
            }
        }

        int[] result = new int[r_size]; //array which will store the TYPE 2 result

        int k = 0;
        int temp = 0;

        while(k < q.length) // outer for loop which will work for the number of queries that exist
        {

            String value = q[k];
            char type = value.charAt(0);

            if(type == '1')
            {
                if(q[k].charAt(1) == 'R')
                {
                    int i = 0;
                    while(i < mat[0].length)
                    {
                        int row = (value.charAt(2) - 48);
                        int element = mat[row][i];
                        if(element == 0)
                        {
                            element = 1;
                        }
                        else
                        {
                            element = 0;
                        }
                        mat[row][i] = element;
                        i++;
                    }
                }

                else if(q[k].charAt(1) == 'C')
                {
                    int i = 0;
                    while(i < mat.length)
                    {
                        int col = (value.charAt(2) - 48);
                        int element = mat[i][col];
                        if(element == 0)
                        {
                            element = 1;
                        }
                        else
                        {
                            element = 0;
                        }
                        mat[i][col] = element;
                        i++;
                    }
                }

            }

            else if(type == '2')
            {
                if(q[k].charAt(1) == 'R')
                {
                    int count = 0;
                    int i = 0;
                    while(i < mat[0].length)
                    {
                        int row = (value.charAt(2) - 48);
                        int element = mat[row][i];
                        if(element == 0)
                        {
                            count++;
                        }
                        i++;
                    }
                    result[temp] = count;
                }

                else if(q[k].charAt(1) == 'C')
                {
                    int count = 0;
                    int i = 0;
                    while(i < mat.length)
                    {
                        int col = (value.charAt(2) - 48);
                        int element = mat[i][col];
                        if(element == 0)
                        {
                            count++;
                        }
                        i++;
                    }
                    result[temp] = count;
                }
                temp++;
            }
            k++;
        }

        for(int i = 0; i < temp; i++)
        {
            System.out.println(result[i]);
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }

}
