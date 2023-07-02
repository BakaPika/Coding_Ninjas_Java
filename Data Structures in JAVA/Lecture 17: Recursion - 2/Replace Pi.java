public class factorial
{

    public static String replaceChar(String s)
    {
        if(s.length() <= 1)
        {
            return s;
        }

        if(s.charAt(0) == 'p' && s.charAt(1) == 'i')
        {
            String small =  replaceChar(s.substring(2));
            return 3.14 + small;
        }
        else
        {
            String small = replaceChar(s.substring(1));
            return s.charAt(0) + small;
        }

    }
    public static void main(String[] args)
    {
        System.out.println(replaceChar("apipi"));

    }
}
