
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial 
{
	    private int data[];


	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/

	Polynomial()
    {
        data = new int[10];

    }

	public void setCoefficient(int degree, int coeff)
	{
		while(degree > data.length-1)
        {
           doubleCapacity();
        }
        data[degree] = coeff;
	}

	private void doubleCapacity()
	{
		int temp[] = data;
        	data = new int[2 * temp.length];
        	for(int i = 0; i < temp.length; i++)
        	{
            	data[i] = temp[i];
        	}
	}


	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print()
	{
			for(int i = 0; i < data.length; i++)
       	 	{
            	if(data[i] != 0)
            	{
               	 	System.out.print(data[i] + "x" + i + " ");
            	}
        	}	
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p)
	{
		Polynomial p_new = new Polynomial();
		int min = 0;
		if(this.data.length > p.data.length)
		{
			min = p.data.length;
		}
		else
		{
			min = this.data.length;
		}
        int i;
        for(i = 0; i < min; i++)
        {
            p_new.setCoefficient(i, this.data[i] + p.data[i]);
        }

        while(i < this.data.length)
        {
            p_new.setCoefficient(i, this.data[i]);
            i++;
        }

        while(i < p.data.length)
        {
			while(p.data.length > p_new.data.length)
            p_new.setCoefficient(i, p.data[i]);

            i++;
        }

        return p_new;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p)
	{
		Polynomial p_new = new Polynomial();
		int min = 0;
		if(this.data.length > p.data.length)
		{
			min = p.data.length;
		}
		else
		{
			min = this.data.length;
		}
        int i;
        for(i = 0; i < min; i++)
        {
			p_new.setCoefficient(i, this.data[i] - p.data[i]);
        }

        while(i < this.data.length)
        {
            p_new.setCoefficient(i, this.data[i]);
            i++;
        }

        while(i < p.data.length)
        {
			p_new.setCoefficient(i, p.data[i]);
            i++;
        }

        return p_new;
	}
	


	public int getCoeff(int degree){
        if(degree < this.data.length)
        {
                return data[degree];
        }
        else
		{
                return 0;
        }
    }


	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p)
	{
		Polynomial s_new = new Polynomial();

        for(int i = 0; i < data.length; i++)
        {
            for(int j = 0; j < p.data.length; j++)
            {
                int temp = i + j;
				int value = this.data[i] * p.data[j];
				int old_value = s_new.getCoeff(temp);
				s_new.setCoefficient(temp, value + old_value);
            }
        }

        return s_new;	
	}

}
