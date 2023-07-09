// Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
// a. The string begins with an 'a'
// b. Each 'a' is followed by nothing or an 'a' or "bb"
// c. Each "bb" is followed by nothing or an 'a'
// If all the rules are followed by the given string, return true otherwise return false.

// Sample Input 1 :
// abb
// Sample Output 1 :
// true
// Sample Input 2 :
// abababa
// Sample Output 2 :
// false


public class Solution 
{

	public static boolean checkAB(String input) 
	{
			if(input.length() == 0)
        {
            return true;
        }

        if(input.charAt(0) == 'a')
        {
            if(input.substring(1).length() > 1 && input.substring(1, 3).equals("bb"))
            {
                return checkAB(input.substring(3));
            }
            else
            {
                return checkAB(input.substring(1));
            }
        }
        return false;

	}
}
