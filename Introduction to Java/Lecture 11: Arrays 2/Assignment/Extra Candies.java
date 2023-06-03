// There are ‘N’ houses. Two persons ‘P1’ and ‘P2’ distribute some candies to all these houses.
// You are given an integer, ‘X’. If the total number of candies received by any house is more than ‘X’, it will pass the rest of the candies to the next house to the right. The rightmost house will just throw the extra candies.
// You must return an array of ‘N’ integers denoting the final number of candies for all the houses.
// Sample Input 1 :
// 2
// 4 7
// 2 3 4 7
// 6 2 6 1
// 2 4
// 1 1
// 1 1
// Sample Output 1 :
// 7 6 7 7
// 2 2

import java.util.*;
public class Solution {
    public static int[] extraCandies(int n, int x, int []p1, int []p2) {
        
        int[] arr3 = new int[n];
        int sum = 0;
        int extra = 0;

        for(int i =0; i < n; i++)
        {
            sum = p1[i] + p2[i]  + extra;
            extra = 0;

            if(sum > x)
            {
                int temp = sum - x;
                arr3[i] = x;
                extra = temp;
                continue;
            }

            arr3[i] = sum;
        }

        return arr3;
    }
}
