import java.io.IOException;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        String str="abc def ghi";
        Scanner scan = new Scanner(str);
        int count = 1;

        if(str.length() == 0)
        {
            count = 0;
        }
        else
        {
            for(int i  = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == ' ')
                {
                    count++;
                }
            }
        }

        String ans = "";

        for(int i = 0; i < count; i++)
        {
            String str1 = scan.next();
            String reverseString = "";

            for(int j = 0; j < str1.length(); j++)
            {
                reverseString = str1.charAt(j) + reverseString;
            }

            if(count == i + 1)
            {
                ans = ans + reverseString;
            }
            else
            {
                ans = ans + reverseString + " ";
            }
        }

        System.out.print(ans);

    }
    
}
