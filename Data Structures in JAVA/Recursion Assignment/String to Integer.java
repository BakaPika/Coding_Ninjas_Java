// Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.

// Sample Input 1 :
// 00001231
// Sample Output 1 :
// 1231
// Sample Input 2 :
// 12567
// Sample Output 2 :
// 12567



public class solution {

	public static int convertStringToInt(String input){
		if(input.length() == 1)
        {
            return input.charAt(0) - '0';
        }

        double x = input.charAt(0) - '0';
        double y = convertStringToInt(input.substring(1));

        return (int) (x * Math.pow(10, input.length()-1) + y);

	}
}
