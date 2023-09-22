package conditionalStatements;

public class ConditionalStatementPractice3 {

	public static void main(String[] args) {

		int x = 19; // Write a program that declares 1 integer variable x, and then assigns 7 to it.
		if (x < 10) {
			System.out.print("Less than 10 ");// Write an if-else-if statement that prints out “Less than 10” if x is less than 10
												
		} else if (x > 10 && x < 20){ // “Between 10 and 20” if x is greater than 10 but less than 20
			
			System.out.print("Between 10 and 20 ");
		}
		if (x >= 20) {// “Greater than or equal to 20” if x is greater than or equal to 20
			;
		System.out.print("Greater than or equal to 20");

		}

	}
	
}