// Given a string S, remove consecutive duplicates from it recursively.

// Sample Input 1 :
// aabccba
// Sample Output 1 :
// abcba
// Sample Input 2 :
// xxxyyyzwwzzz
// Sample Output 2 :
// xyzwz


public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		
		if(s.length() <= 1)
        {
            return s;
        }

        if(s.charAt(0) == s.charAt(1))
        {
            String small = removeConsecutiveDuplicates(s.substring(1));
            return small;
        }
        else
        {
            String small = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0) + small;
        }

	}

}
