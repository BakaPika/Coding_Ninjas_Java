// Given a string, determine if it is a palindrome, considering only alphanumeric characters.
// Palindrome
// A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.

// Sample Input 1 :
// abcdcba
// Sample Output 1 :
// true 


public class Solution {

	public static boolean isPalindrome(String str) 
	{
		int j = str.length()-1;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            j--;
        }
        return true;
	}

}
