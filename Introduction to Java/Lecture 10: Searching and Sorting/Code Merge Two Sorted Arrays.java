// Sample Input 1 :
// 1
// 5
// 1 3 4 7 11
// 4
// 2 4 6 13
// Sample Output 1 :
// 1 2 3 4 4 6 7 11 13 


public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	int i = 0, j = 0, k = 0;
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] arr3 = new int[size1+size2];

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                arr3[k] = arr1[i];
                i++;
                k++;
            }

            else
            {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length || j < arr2.length)
        {
            if((arr1.length) - i != 0)
            {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        return arr3;//Your code goes here
    }

}
