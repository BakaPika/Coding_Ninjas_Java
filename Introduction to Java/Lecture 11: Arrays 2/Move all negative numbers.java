// You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the array elements such that all negative numbers appear before all positive numbers.
  
// Sample Input 1:
// 2
// 5
// 1 -4 -2 5 3
// 2
// 2 1    
// Sample Output 1:
// Yes
// Yes

public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) 
    {
        int i = 0, j = 0;

        while(i < a.length)
        {
            if(a[i] < 0)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }

            i++;
        }

        return a;
    }
}
