package homework;

import java.util.Scanner;

public class Calulator2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Create a scanner obj to accept input from console
		Scanner number = new Scanner(System.in);// Create scanner obj to accept first&second number choices
//------------------------------------------------------------------------------------------------------------------------------
		// I want to check if the choice is between 1-4
		// if choice is between 1-4, inclusive, proceed on.
		// if not between 1-4, print invalid and display menu again.
		int choice;
		do { // do the following (in-between {}) once unconditionally.
			System.out.println("Which operation do you want to perfom?: "); // prints "Menu" or options
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");

			choice = input.nextInt(); // takes input and stores for now
			if (choice > 4 || choice < 1) { // check if invalid
				System.out.println("Input invalid. Please try again.");
			}
		} while (choice > 4 || choice < 1); // loop until valid input. if condition in () is true, execute loop again
											// (code in-between {} above) (i.e., jump to top of loop ('do{') ) again,
											// otherwise continue to line below this one.
//---------------------------------------------------------------------------------------------------------------------------------									

		System.out.println("Enter first number: "); // prints
		int firstNumber = number.nextInt(); // accepts and stores first input
		System.out.println("Enter second number: "); // prints
		int secondNumber = number.nextInt(); // accepts and stores second input

		if (choice == 1) {
			System.out.println(firstNumber + secondNumber);
		} else if (choice == 2) {
			System.out.println(firstNumber - secondNumber);
		} else if (choice == 3) {
			System.out.println(firstNumber * secondNumber);
		} else if (choice == 4) {
			System.out.println(firstNumber / secondNumber);
		} else if (choice > 4 || choice < 1) {
			System.out.println("Input invalid. Please try again.");
		}

	}
	
}