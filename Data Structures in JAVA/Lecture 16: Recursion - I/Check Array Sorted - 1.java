public class factorial
{
    public static boolean fact(int[] n)
    {

        if(n.length == 1)
        {
            return true;
        }
        if(n[0] > n[1])
        {
            return false;
        }

        int[] smallArray  = new int[n.length - 1];

        for(int i = 1 ; i < n.length; i++)
        {
            smallArray[i - 1] = n[i];
        }
        return fact(smallArray);


    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 5, 6};
        System.out.println(fact(arr));
    }
}
