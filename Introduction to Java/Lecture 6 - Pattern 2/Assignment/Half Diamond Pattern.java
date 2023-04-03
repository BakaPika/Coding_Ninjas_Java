// Sample Input 1 :
// 3
// Sample Output 1 :
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *



import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("*");

        int i = 0;
        while(i < n)
        {
            System.out.print("*");
            int j = 0;
            while(j < i + 1)
            {
                System.out.print(j+1);
                j++;
            }

            int k = j-1;
            while(k > 0)
            {
                System.out.print(k);
                k--;
            }
            System.out.print("*");

            System.out.println();
            i++;
        }

        i = n-1;
        while(i > 0)
        {
            System.out.print("*");
            int j = 0;

            while(j < i)
            {
                System.out.print(j+1);
                j++;
            }

            int k = j-1;
            while(k > 0)
            {
                System.out.print(k);
                k--;
            }
            
            System.out.print("*");

            System.out.println();
            i--;
        }

        System.out.print("*");


    }
}

        
