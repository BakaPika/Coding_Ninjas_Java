// Sample Input 1 :
// 3
// Sample Output 1 :
// ***
//  ***
//   ***

import java.util.*;
public class Main {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;

        while(i < n)
        {
            int spaces = 0;
            while(spaces < i)
            {
                System.out.print(" ");
                spaces++;
            }

            int j = 0;
            while(j < n)
            {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }


	}
}

