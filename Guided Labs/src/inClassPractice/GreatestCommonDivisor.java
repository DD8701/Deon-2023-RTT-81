package inClassPractice;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n1 = readPositiveNumber(scanner);
		int n2 = readPositiveNumber(scanner);

		System.out.println("First number: " + n1);
		System.out.println("Second number: " + n2);
		
		// Check whether k (for k = 2, 3, 4, and so on) is a common 
		// divisor for n1 and n2, until k is greater than n1 or n2.
		
		// We are looking for where both numbers are divisible with  no remainder
		
		// 5 and 15 = Good!!
		// 5/1 = 5, 15/1 = 15;
		// 5/2 = x, = No
		// 5/3 = x, = No
		// 5/4 = x, = No
		// 5/5 = 1, 15/5 = 3,
		// So GCD = 5 = Good!!
		
		int gcd = 1; // We know ALL numbers have GCD of 1
		int min = Math.min(n1,  n2); // Java has a MATH library
		
			
		for ( int k = 1; k <= min; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}
		System.out.println("The gcd of " + n1 + " and " + n2 + " is " + gcd);
	}

	public static int readPositiveNumber(Scanner scanner) {
		int number = -1;
		while (number < 0) {
			System.out.println("Enter another positive integer ");
			number = scanner.nextInt();

			if (number < 0) {
				System.out.println("Must be a positive number");

			}

		}
		return number;
	}

}
