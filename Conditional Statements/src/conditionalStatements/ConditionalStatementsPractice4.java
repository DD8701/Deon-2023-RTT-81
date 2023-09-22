package conditionalStatements;

public class ConditionalStatementsPractice4 {

	public static void main(String[] args) {
		
		int x = 5; // Write a program that declares 1 integer variable x, and then assigns 15 to it. 
		if (x < 10 || x > 20) {
			System.out.print("Out of range"); //Write an if-else statement that prints “Out of range”...
		}else if (x >= 10 && x <= 20) {				
			System.out.print("In range");// ...if the number is less than 10 or greater than 20.
		}

	}

}
