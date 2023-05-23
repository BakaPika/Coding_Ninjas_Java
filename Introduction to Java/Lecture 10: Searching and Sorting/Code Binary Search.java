// Sample Input 1:
// 7
// 1 3 7 9 11 12 45
// 3
// Sample Output 1:
// 1

public class Solution {
    public static int search(int []nums, int target) 
    {
        int s = 0;
        int e = nums.length - 1;
        int t = target;
        
        for(; s <= e;)
        {
            int mid = (s + e)/ 2;


            if (s == e)
            {
                if(nums[s] == t)
                {
                    return mid;
                }
            }

            if(nums[mid] > t)
            {
                e = mid - 1;
            }

            else if(nums[mid] < t)
            {
                s = mid + 1;
            }

            else
            {
                return mid;
            }
        }
        return -1;
    }

}
