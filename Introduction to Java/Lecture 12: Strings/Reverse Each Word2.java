import java.io.IOException;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        String str="abc def ghi";
        String ans = "";
        int start = 0;
        int i = 0;
        for(; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                int end = i - 1;
                String reverseString = "";
                for(int j = start; j <= end; j++)
                {
                    reverseString = str.charAt(j) + reverseString;
                }

                ans += reverseString + " ";
                start = i+1;
            }

        }
        int end = i - 1;
        String reverseString = "";
        for(int j = start; j <= end; j++)
        {
            reverseString = str.charAt(j) + reverseString;
        }

        ans += reverseString;
        System.out.print(ans);

    }

}
