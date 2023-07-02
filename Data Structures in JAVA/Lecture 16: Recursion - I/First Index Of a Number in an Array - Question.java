// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.

// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 1


public class Solution {


    public static int firstIndex(int[] n, int x)
    {
        return firstIndex(n, x, 0);
    }
    
	public static int firstIndex(int input[], int x, int index) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		if(index == input.length - 1)
        {
            if(input[index] == x)
            {
                return index;
            }
            else
            {
                return -1;
            }
        }
        if(input[index] == x)
        {
            return index;
        }

        return firstIndex(input, x , index+1);
		
	}
	
}
