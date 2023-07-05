// Given k, find the geometric sum i.e.
// 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
// using recursion.


// Sample Input 1 :
// 3
// Sample Output 1 :
// 1.87500
// Sample Input 2 :
// 4
// Sample Output 2 :
// 1.93750



public class solution {

	public static double findGeometricSum(int k){
		
		if(k == 0)
        {
            return 1;
        }

        float value = (float) (1/Math.pow(2, k));
        return value + findGeometricSum(k-1);

	}
}
