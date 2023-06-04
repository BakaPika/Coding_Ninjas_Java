// For a given input string(str), find and return the total number of words present in it.
// It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.
  
// Sample Input 1:
// Coding Ninjas!
// Sample Output 1:
// 2


public class Solution {

	public static int countWords(String str)
	{
		if(str.length() == 0)
        {
            return 0;
        }
        int count = 1;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                count++;
            }
        }
        return count;	
		
	}

}
