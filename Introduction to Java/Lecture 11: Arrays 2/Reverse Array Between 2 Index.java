// Given an array ‘ARR’ of size ‘N’. You are also given two indices ‘L’ and ‘R’.
// Your task is to reverse the ‘ARR’ from index ‘L’ to ‘R’ inclusive.
  
// Sample Input 1:
// 2
// 3
// 0 1
// 1 2 3
// 2
// 0 1 
// 1 2
// Sample Output 1:
// 2 1 3
// 2 1

public class Solution {
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        
        int mid = (r-l)/2;

        for(int i = 0; i <= mid; i++)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return arr;
    }
}
