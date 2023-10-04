package guidedlabs;

import java.util.Scanner;

public class GuessTheNumber {

// A while loop will continually process a statement or given code block while its evaluation expression is true.
	public static void main(String[] args) {
	       // Generate a random number to be guessed
	       int number = (int) (Math.random() * 101); // What is the " * 101 " for? 
	       Scanner input = new Scanner(System.in);
	       System.out.println("Guess a magic number between 0 and 100");
	       int guess = -1;
	       while (guess != number) {
	           // Prompt the user to guess the number
	           System.out.print("\nEnter your guess: ");
	           guess = input.nextInt();
	           if (guess == number)
	               System.out.println("Yes, the number is " + number);
	           else if (guess > number)
	               System.out.println("Your guess is too high");
	           else
	               System.out.println("Your guess is too low");
	       } // End of loop
	   }
	}


// int getRandomValue = (int) (Math.random()*(max-min)) + min;
// (Remember that Math.random() will never return exactly 1, so Math.random()*10 will never return exactly 10. 
// This means that after rounding down, the result will always be 9 or less.)