package conditionalStatements;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter a Year :: ");
		Scanner sc = new Scanner(System.in); //What does this mean?
		year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) //Why use the % here
			System.out.println("Specified year is a leap year");
		else
			System.out.println("Specified year is not a leap year");
	}
}