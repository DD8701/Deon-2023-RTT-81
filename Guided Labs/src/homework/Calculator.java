package homework;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		

	// start writing your code here			
		
		Scanner number = new Scanner(System.in);
		
		
		System.out.println();
        System.out.println("Enter first number: ");
	int firstNumber = number.nextInt();
	System.out.println("Enter second number: ");
	int secondNumber = number.nextInt();
		System.out.println("Enter operator: ");
		String operator = number.next();
	int answer = calculate (firstNumber, secondNumber, operator);
	System.out.println("Answer is: " + answer);
	
	}	
	

	public static int calculate (int firstNumber, int secondNumber, String operator) {
		
		int answer = 0;
		if (operator.equals("+")) {
			answer = firstNumber + secondNumber;
		}else if (operator.equals("-")) {
			answer = firstNumber - secondNumber;
		}else if (operator.equals("*")) {
			answer = firstNumber * secondNumber;
		}else if (operator.equals("/")) {
			answer = firstNumber / secondNumber;
		}else {
			System.out.println("Try again with valid input!");
		}
		return answer;
	}



		
	}





}

