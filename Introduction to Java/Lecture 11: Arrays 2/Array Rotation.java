// There is an array ‘A’ of size ‘N’.
// You are also given an integer ‘X’ and direction ‘DIR’. You must rotate the array in the direction of ‘DIR’ by ‘X’ positions.
// You must return the rotated array.
  
// Sample Input 1 :
// 2
// 4 1 LEFT
// 1 2 3 4
// 6 2 RIGHT
// 1 2 4 3 5 6 
// Sample Output 1 :
// 2 3 4 1
// 5 6 1 2 4 3

public class Solution
{
   

    public static void reverseBetween(int[] a, int l, int r)
    {
        r--;
        int len = (r-l)/2;
        for(int i = 0; i <= len; i++)
        {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
    public static void rotateRight(int[] a, int n, int x)
    {
        reverseBetween(a, 0, n);
        reverseBetween(a, 0, x);
        reverseBetween(a, x, n);

    }

    public static void rotateLeft(int[] a, int n, int x)
    {
        reverseBetween(a, 0, n);
        reverseBetween(a, 0, n-x);
        reverseBetween(a, n-x, n);

    }
    public static int[] rotateArray(int []a, int x, String dir)
    {
        
        int n = a.length;
        x = x % n;

        if(x > 0 && dir.equals("LEFT"))
        {
            rotateLeft(a, n, x);
        }

        else if(x > 0 && dir.equals("RIGHT"))
        {
            rotateRight(a, n, x);
        }


        return a;
    }
}
