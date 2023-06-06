// Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
// Example:
// If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

// The string is compressed only when the repeated character count is more than 1.
  
// Sample Input 1:
// aaabbccdsa
// Sample Output 1:
// a3b2c2dsa

public class Solution {
	public static String getCompressedString(String str) 
	{
		String output = "" + str.charAt(0);
        int current = 1;

        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                current++;
            }
            else
            {
                if(current>1)
                {
                    output = output + current;
                    current = 1;
                }
                output = output + str.charAt(i);
            }
        }

        if(current>1)
        {
            output = output + current;
        }


        return output;
	}

}
