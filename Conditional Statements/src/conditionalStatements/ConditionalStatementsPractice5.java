package conditionalStatements;

import java.util.Scanner;

public class ConditionalStatementsPractice5 {

	public static void main(String[] args) {
		// Write a program that uses if-else-if statements to print out grades A, B, C,
		// D, & F  according to the following criteria:
		// A: 90-100
		// B: 80-89
		// C: 70-79
		// D: 60-69
		// F: <60

		
		Scanner input = new Scanner(System.in);  // Use the Scanner class to accept a number score 
		System.out.println("Enter your grade: "); // from the user to determine the letter grade.
		
		int grade = input.nextInt(); // Method for reading an integer. Method for calling String is " input.nextLine "
		input.close();
		

		if (grade >= 90 && grade <= 100) {
			System.out.println("A");
		} else if (grade >= 80 && grade <= 89) {
			System.out.print("B");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("C");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("D");
		} else if (grade < 60 && grade >= 0){
			System.out.println("F");
		}	else if (grade <0 || grade >100) { 
			System.out.println("Score out of range"); // Print out “Score out of range” if the score is less than 0 or greater than 100.
		}
		
	}

}
