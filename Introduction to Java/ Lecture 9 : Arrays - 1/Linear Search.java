// Sample Input 1:
// 1
// 7
// 2 13 4 1 3 6 28
// 3
// Sample Output 1:
// 4



public class Solution {

    public static int linearSearch(int arr[], int x)
    {
      
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }

        return -1;  
    }
}
