// Given a string S (that can contain multiple words), you need to find the word which has minimum length.
// Note : If multiple words are of same length, then answer will be first minimum length word in the string.
// Words are seperated by single space only.
  
// ample Input 1 :
// this is test string
// Sample Output 1 :
// is
// Sample Input 2 :
// abc de ghihjk a uvw h j
// Sample Output 2 :
// a


public class Solution {
	
	public static String minLengthWord(String input){
		
		String value = "";
        String smallest = "";
        int length = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int i = 0;

        for(; i < input.length(); i++)
        {
            if(input.charAt(i) == ' ')
            {
                end = i - 1;

                for(int j = start; j <= end; j++)
                {
                    value = value + input.charAt(j);
                }

                if(value.length() < length)
                {
                    length = value.length();
                    smallest = value;
                }
                value = "";
                start = i + 1;
            }

        }

        end = i - 1;
        for(int j = start; j <= end; j++)
        {
            value = value + input.charAt(j);
        }
        if(value.length() < length)
        {
            length = value.length();
            smallest = value;
        }

		return smallest;

	}
}
