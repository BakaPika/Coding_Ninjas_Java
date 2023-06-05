// For a given string(str), remove all the consecutive duplicate characters.
// Example:
// Input String: "aaaa"
// Expected Output: "a"

// Input String: "aabbbcc"
// Expected Output: "abc"
  
// Sample Input 1:
// aabccbaa
// Sample Output 1:
// abcba


public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		StringBuffer str1 = new StringBuffer(str);

        for(int i = 1; i < str1.length(); i++)
        {
            if(str1.charAt(i) == str1.charAt(i-1))
            {
                str1.deleteCharAt(i);
				i--;
            }
        }
		
		String val = String.valueOf(str1);
        return val;
	}

}
