// Sample Input 1 :
// 1
// 6
// Sample Output 1 :
// 1 3 5 6 4 2

public class Solution
{
    
    public static void arrange(int[] arr, int n)
    {
        int count = 0;

    	for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                arr[count] = i;
                count++;
            }
        }

        if(n % 2 != 0)
        {
            n = n - 1;
        }

        for(int i = n; i > 0; i--)
        {
            if(i % 2 == 0)
            {
                arr[count] = i;
                count++;
            }
        }

        // for(int i = 0; i < n; i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
    }
}
