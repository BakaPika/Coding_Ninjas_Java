// Sample Input 1:
// 1
// 9
// 0 7 2 5 4 7 1 3 6
// Sample Output 1:
// 7


public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	int value = 0;
        for(int i = 0; i < arr.length; i++)
        {
            value = arr[i];

            for(int j = i+1; j < arr.length; j++)
            {
                if(value == arr[j])
                {
                    return value;
                }
            }
        }
        return 0;//Your code goes here
    }
}
