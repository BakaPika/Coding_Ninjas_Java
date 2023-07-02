public class factorial
{
    public static boolean fact(int[] n, int x)
    {
        if(x == n.length - 1)
        {
            return true;
        }
        if(n[x] > n[x+1])
        {
            return false;
        }
        return fact(n, x + 1);
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 0;
        System.out.println(fact(arr, x));
    }
}
