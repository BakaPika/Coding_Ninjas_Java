// Sample Input 1:
// 1
// 7
// 2 3 1 6 3 6 2
// Sample Output 1:
// 1


public class Solution
{  

    public static int findUnique(int[] arr)
    {
      int value = 0;
        int unique = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            count = 0;
            if(arr[i] == 0)
            {
                continue;
            }
            value = arr[i];

            for(int j = i + 1; j < arr.length; j++)
            {
                if(value == arr[j])
                {
                    arr[j] = 0;
                    count++;
                }
            }

            if(count == 0)
            {
                return arr[i];
            }
        }
        return 0;
    }
}
