// Check whether a given String 'S' is a palindrome using recursion.


// Return true or false.

// Sample Input 1:
// abbba
// Sample Output 1:
// true
// Explanation Of Sample Input 1 :
// “abbba” is a palindrome
// Sample Input 2:
// abcd
// Sample Output 2:
// false


public class Solution {
    public static boolean isPalindrome(String str)
    {
        return isPalindrome(str, 0, str.length()-1);
    }
    public static boolean isPalindrome(String str, int start, int end)
    {
        if(start > end)
        {
            return true;
        }

        if(str.charAt(start) != str.charAt(end))
        {
            return false;
        }


        return isPalindrome(str, start+1, end-1);
    }
}
