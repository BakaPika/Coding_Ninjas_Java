   1
  12
 123
1234




import java.util.*;

public class Main
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = n;

        while(i > 0)
        {
            int j = 0;
            int k = 1;
            while(j < n)
            {
                if(j + 1 >= i)
                {

                    System.out.print(k);
                    k++;
                }
                else
                {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i--;

        }


    }
}
