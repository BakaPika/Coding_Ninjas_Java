// For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
// Permutations of each other
// Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

// Example: 
// str1= "sinrtg" 
// str2 = "string"

// The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.

// Sample Input 1:
// abcde
// baedc
// Sample Output 1:
// true



public class Solution {

	public static boolean isPermutation(String str1, String str2) 
	{
		
        if(str1.length() != str2.length())
        {
            return false;
        }

        int frequency[] = new int[256];
        for(int i=0;i<256;i++){
            frequency[i] = 0;
        }
 
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            frequency[ch]++;
        }
    
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            frequency[ch]--;
        }
        
        for(int i=0;i<256;i++){
            if(frequency[i] != 0){
                return false;
            }
        }
        return true;


	}

}
