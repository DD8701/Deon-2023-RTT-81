package homework;

import java.util.Scanner;

public class Calulator2 {
	// when something is static, there can only be one of them. i.e. class, variable, etc.
	public static void main(String[] args) {

		
		Scanner number = new Scanner(System.in);// Create scanner obj to accept first&second number choices
//------------------------------------------------------------------------------------------------------------------------------
		// I want to check if the choice is between 1-4
		// if choice is between 1-4, inclusive, proceed on.
		// if not between 1-4, print invalid and display menu again.
		int choice;
		do { // do the following (in-between {}) once unconditionally.
			//System.out.println("Which operation do you want to perfom?: "); // prints "Menu" or options
			System.out.println("Which operation do you want to perfom?: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide"); // prints "Menu" or options


			choice = number.nextInt(); // takes input and stores for now
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
// add method
// divide method
// multiply method
// subtract method