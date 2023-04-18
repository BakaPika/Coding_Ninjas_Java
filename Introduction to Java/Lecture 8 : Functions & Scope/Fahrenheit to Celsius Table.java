// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
// Input Format :
// 3 integers - S, E and W respectively
// Output Format :
// Fahrenheit to Celsius conversion table. One line for every Fahrenheit and Celsius Fahrenheit value. Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")

// Sample Input 1:
// 0 
// 100 
// 20
// Sample Output 1:
// 0   -17
// 20  -6
// 40  4
// 60  15
// 80  26
// 100 37


import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
public class Main1
{
    public static void printFahrenheitTable(int start, int end, int step)
    {
        int i = start;
        while(i <= end)
        {
            int f_value = (i - 32) * 5/9;
            System.out.println(i + " " + f_value);
            i = i + step;
        }
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt(); // F start
        int E = scan.nextInt(); // F end
        int W = scan.nextInt(); // F increment size

        printFahrenheitTable(S, E, W);
    }
}

