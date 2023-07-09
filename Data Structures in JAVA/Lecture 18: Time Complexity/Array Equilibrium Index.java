// For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.
// Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.
// If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.


// Sample Input 1 :
// 1
// 5
// 1 4 9 3 2
// Sample Output 1 :
// 2
// Sample Input 2 :
// 2
// 3
// 1 4 6
// 3
// 1 -1 4
// Sample Output 2 :
// -1
// 2



public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i < arr.length; i++)
        {
            sum2 += arr[i];
        }


        for(int i = 1; i < arr.length; i++)
        {
            sum1 += arr[i-1];
            sum2 -= arr[i];

            if(sum1 == sum2)
            {
                return i;
            }
        }



        return -1;
	}
}
