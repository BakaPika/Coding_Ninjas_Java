// You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
// Note : We say that x is strictly larger than y when x > y.
// So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.


// That is, in the sequence if numbers are decreasing, they can start increasing at one point. Thereafter, they cannot decrease at any point further

// Sample Input 1 :
// 5
// 9
// 8
// 4
// 5
// 6
// Sample Output 1 :
// true



import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int prev = scan.nextInt();
        int current = 0;
        boolean dec = true;
        for(int i = 2; i <= n; i++)
        {
            current = scan.nextInt();

            if(current == prev)
            {
                System.out.print("false");
                return;
            }

            else if(current < prev)
            {
                if(dec == false)
                {
                    System.out.print("false");
                    return;
                }
            }

            else
            {
                if(dec == true)
                {
                    dec = false;
                }
            }

            prev = current;
        }

        System.out.print("true");

	}
}
