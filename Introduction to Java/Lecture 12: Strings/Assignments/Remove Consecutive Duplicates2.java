
public class Solution {

	public static String removeConsecutiveDuplicates(String str) 
    {
		String str1 = "";
        int start = 0;

        while(start < str.length())
        {
            char unique = str.charAt(start);
            int next = start+1;

            while(next < str.length() && str.charAt(next)==unique)
            {
                next++;
            }
            str1 = str1 + unique;
            start = next;
        }

        return str1;
	}

}
