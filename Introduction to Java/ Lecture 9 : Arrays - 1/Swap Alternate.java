// Sample Input 1:
// 1
// 6
// 9 3 6 12 4 32
// Sample Output 1 :
// 3 9 12 6 32 4


public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	int size = arr.length;

        if(arr.length % 2 != 0)
        {
            size--;
        }
        for(int i = 0; i < size; i++)
        {

            if(i % 2 == 0)
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
    }
}
