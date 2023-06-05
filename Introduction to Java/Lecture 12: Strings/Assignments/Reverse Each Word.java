// Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
// Example:
// Input Sentence: "Hello, I am Aadil!"
// The expected output will print, ",olleH I ma !lidaA".
  
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// emocleW ot gnidoC sajniN


public class Solution {

	public static String reverseEachWord(String str) {
		String ans = "";
        int start = 0;
        int i = 0;
        for(; i < str.length(); i++)
        {

            if(str.charAt(i) == ' ')
            {
                int end = i;
                String reverse = "";
                for(int j = start; j < end; j++)
                {
                    reverse = str.charAt(j) + reverse;
                }

                ans = ans + reverse + " ";
                start = i + 1;
            }

        }

        int end = i;
        String reverse = "";
        for(int j = start; j < end; j++)
        {
            reverse = str.charAt(j) + reverse;
        }

        ans = ans + reverse;


        return ans;
	}

}
