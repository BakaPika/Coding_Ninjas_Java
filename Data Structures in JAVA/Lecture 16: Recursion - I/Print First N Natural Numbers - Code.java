// Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.

// Sample Input 1 :
//  6
// Sample Output 1 :
// 1 2 3 4 5 6
// Sample Input 2 :
//  4
// Sample Output 2 :
// 1 2 3 4

public class Solution {

	public static void print(int n){
		
		if(n == 0)
        {
            return;
        }

        print(n-1);
        System.out.print(n + " ");
	}
}
