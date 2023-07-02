public class factorial
{

    public static String replaceChar(String s, char a, char b)
    {
        if(s.length() == 0)
        {
            return s;
        }

        String smallString = replaceChar(s.substring(1), a, b);

        if(s.charAt(0) == a)
        {
            return b + smallString;
        }
        else
        {
            return s.charAt(0) + smallString;
        }

    }
    public static void main(String[] args)
    {
        System.out.println(replaceChar("abxcxdx", 'x', 'y'));

    }
}
