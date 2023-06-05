
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		int sum1 = 0;
        int sum2 = 0;

        if(str1.length() != str2.length())
        {
            return false;
        }

        for(int i = 0; i < str1.length(); i++)
        {
            sum1 = sum1 + str1.charAt(i);
        }

        for(int i = 0; i < str1.length(); i++)
        {
            sum2 = sum2 + str2.charAt(i);
        }

        if(sum1 == sum2)
        {
           return true;
        }

        
        return false;


	}

}
