// Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
// Fibonacci Series is defined by the recurrence
//     F(n) = F(n-1) + F(n-2)
// where F(0) = 0 and F(1) = 1
  
// Sample Input 1 :
// 5
// Sample Output 1 :
// true


import java.util.*;
public class Solution {

    public static boolean checkMember(int n){
        boolean exists = true;
        int f1 = 0;
        int f2 = 1;
        int fib_value = 0;

        for(int i = 0 ; i < n; i++)
        {
            fib_value = f1 + f2;
            f1 = f2;
            f2 = fib_value;

            if(fib_value <= n)
            {
                if(fib_value == n)
                {
                    return exists;
                }
            }   
            else
            {
                exists = false;
                return exists;
            }
        }
        return exists;
    }
}



