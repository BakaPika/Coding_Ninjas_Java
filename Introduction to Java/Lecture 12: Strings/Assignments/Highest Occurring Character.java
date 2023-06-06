// For a given a string(str), find and return the highest occurring character.
// Example:
// Input String: "abcdeapapqarr"
// Expected Output: 'a'
// Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
  
// Sample Input 1:
// abdefgbabfba
// Sample Output 1:
// b


public class Solution {

	public static char highestOccuringChar(String str) 
	{
		int n = str.length();
        if(n == 0)
        {
            return ' ';
        }

        int frequency[] = new int[256];

        for(int i = 0; i < frequency.length; i++)
        {
            frequency[i] = 0;
        }

        for(int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        char output = str.charAt(0);
        int max = frequency[output];

        for(int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);

            if(frequency[ch]>max)
            {
                max = frequency[ch];
                output = ch;
            }
        }

        return output;
	}

}
