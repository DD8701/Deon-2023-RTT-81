package conditionalStatements;

import java.util.Scanner;

public class ConditionalStatementsPractiveSix {

	public static void main(String[] args) {

		//

		Scanner input = new Scanner(System.in);
		System.out.println("Input day: ");

		int weekday = input.nextInt(); // Write a program that accepts an integer between 1 and 7 from the user.
		input.close();

		switch (weekday) { // Use a switch statement to print out the corresponding weekday.
		case 1:
			System.out.println("Monday");
			break; // Do not forget to include “break” statements in each of your cases.
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");

		default:
			System.out.println("Out of range"); // Print “Out of range” if the number is less than 1 or greater than 7.

		}

	}
}
