// For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
// The input string will remain unchanged if the given character(X) doesn't exist in the input string.
  
// Sample Input 1:
// aabccbaa
// a
// Sample Output 1:
// bccb


public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String result = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ch)
            {
                result = result + str.charAt(i);
            }
        }

		return result;
	}

}
