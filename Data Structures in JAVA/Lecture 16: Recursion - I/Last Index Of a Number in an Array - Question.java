// Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
// Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
// You should start traversing your array from 0, not from (N - 1).
// Do this recursively. Indexing in the array starts from 0.

// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 3

  
public class Solution {

	public static int lastIndex(int[] n, int x, int index, int value)
    {
        if(index == n.length)
        {
            return value;
        }
        if(n[index] == x)
        {
            value = index;
        }

        return lastIndex(n, x , index+1, value);
    }
    public static int lastIndex(int[] n, int x)
    {
        return lastIndex(n, x, 0, -1);
    }
	
}
