/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers 
{
	private int real;
	private int imaginary;

		ComplexNumbers(int real, int imaginary)
		{
			this.real = real;
			this.imaginary = imaginary;		
		}

		public void plus(ComplexNumbers c)
		{
			this.real = this.real + c.real;
			this.imaginary = this.imaginary + c.imaginary;
		}

		public void multiply(ComplexNumbers c)
		{
			int real = this.real * c.real;
			int imaginary = this.real * c.imaginary + this.imaginary * c.real;
			int imaginary_squared = - (this.imaginary * c.imaginary);

			this.real = real + imaginary_squared;
			this.imaginary = imaginary;
		}

		public void print()
		{
			System.out.println(this.real + " + i" + this.imaginary);
		}
	
	
}
