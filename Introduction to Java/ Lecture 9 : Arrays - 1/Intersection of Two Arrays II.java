// Sample Input 2 :
// 1
// 4
// 2 6 1 2
// 5
// 1 2 3 4 2
// Sample Output 2 :
// 2 1 2


public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) 
    {
        int value = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            value = arr1[i];

            for(int j = 0; j < arr2.length; j++)
            {
                if(arr2[j] == 0)
                {
                    continue;
                }

                if(value == arr2[j])
                {
                    System.out.print(value + " ");
                    arr2[j] = 0;
                    break;
                }
            }
        }
    	
    }
}
