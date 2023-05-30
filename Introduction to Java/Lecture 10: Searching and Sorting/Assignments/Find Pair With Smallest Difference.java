// Given two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively. Your task is to find the pair of elements (one from each array), such that their absolute (non-negative) difference is the smallest, and return the difference.
  
// Sample input 1 :
// 2
// 3 3
// 12 7 5
// 4 4 6
// 3 2
// 10 20 30 
// 17 15
// Sample output 1 :
// 1
// 3

public class Solution {
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) 
    {
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                int temp = arr1[i] - arr2[j];

                if(temp < 0)
                {
                    temp = temp * (-1);
                }

                if(diff > temp)
                {
                    diff = temp;
                }
            }
        }

        return diff;
    }
}
