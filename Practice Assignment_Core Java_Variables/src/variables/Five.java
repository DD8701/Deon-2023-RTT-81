package variables;

public class Five {

	public static void main(String[] args) {
		
		// declares 2 double variables
		double x;
		double y;
		
		// assigns a number to each
		x = 5.23;
		y = 6.87;
		
		// divides the larger number by the smaller number and assigns the result to a variable
		double z  = y / x;
		
		// cast the result to an integer ???
		System.out.println((int)z); // don't forget the extra set of parenthesis to complete the argument
	   // could also do: int q = (int)z instead of the System.out.println((int)z)
	
		
	}


}
