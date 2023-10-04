package homework;

import java.util.Scanner;

public class Calculator3 {
//I want to make a new calculator project
	private Scanner scanner = new Scanner(System.in);
	// create a small calculator.. it will be able to do 4 operations - add,
	// subtract, multiply, and divide.
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.menu();
	}
	public void menu() {// A good way to make a new block of code
		// start writing your code here.
		System.out.println("1) Add");
		System.out.println("2) Subtract");
		System.out.println("3) Multiply");
		System.out.println("4) Divide");

		System.out.println("Enter the operation: ");

		int menu = scanner.nextInt();

		double n1 = input();
		double n2 = input();

		Double answer = null;
		if (menu == 1) {
			answer = sum(n1, n2);
		} else if (menu == 2) {
			answer = subtract(n1, n2);
		} else if (menu == 3) {
			answer = multiply(n1, n2);
		} else if(menu == 4) {
			answer = multiply(n1, n2);
		}else {
			System.out.println("Invalid menu entry");
		}
	}
	public double input() {
		System.out.println("Enter number: ");
		double input = scanner.nextDouble();
		return input;
	}
	public double sum(double n1, double n2) {
		return n1 + n2;
	}
	public double subtract(double n1, double n2) {
		return n1 - n2;
	}
	public double multiply(double n1, double n2) {
		return n1 * n2;
	}
	public double divide(double n1, double n2) {
		return n1 / n2;
	}
}