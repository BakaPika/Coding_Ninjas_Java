// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
  
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// Ninjas Coding to Welcome


public class Solution {
	public static String reverseWordWise(String input) 
	{
		String reverse = "";
        int start = 0;
        int i = 0;
        for(; i < input.length(); i++)
        {
            if(input.charAt(i) == ' ')
            {
                int end = i-1;
                reverse = " " + input.substring(start, end+1)+ reverse;
                start = i+1;
            }
        }
        int end = i;
        reverse = input.substring(start, end)+reverse;
        return reverse;


	}
}
