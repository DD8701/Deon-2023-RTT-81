package homework;

import java.util.Scanner;

public class Calulator2 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in); //Create a scanner obj to accept input from console
	Scanner number = new Scanner(System.in);// Create scanner obj to accept first&second number choices
	
		System.out.println("Which operation do you want to perfom?: "); //prints "Menu" or options
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        
        int choice = input.nextInt(); //takes input and stores for now
        
        System.out.println("Enter first number: "); //prints
        int firstNumber = number.nextInt(); // accepts and stores first input
        System.out.println("Enter second number: "); //prints
        int secondNumber = number.nextInt(); // accepts and stores second input
        
      
        
        
        
        
        
	}

	private static int calculate(int choice, int firstNumber, int secondNumber) {
		int answer = calculate (choice, firstNumber, secondNumber);
	}if (choice.equals(1)){
		answer = firstNumber + secondNumber;
		system.out.println()
		
		return answer;
	}
	
}