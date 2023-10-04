package conditionalStatements;

import java.util.Scanner;

public class ConditionalStatementsPracticeSeven {

	public static void main(String[] args) {
		// Create a program that lets the users input their filing status and income.

		Scanner input = new Scanner(System.in);
		System.out.println(
				"(1-Single, 2-Married filing jointly, 3-Married filing separately, 4-Head of household) Enter filing status: ");

		int filingStatus = input.nextInt();

		System.out.println("Enter taxable income: ");
		double taxableIncome = input.nextDouble();

		double tax = 0;

		// " ? " means unknown type. // " : " a shortcut for iterating over a
		// collection.

		if (filingStatus == 1) {
			if (taxableIncome <= 8350)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 33950)
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			else if (taxableIncome <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
			else if (taxableIncome <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
			else if (taxableIncome <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (taxableIncome - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
			
		} else if (filingStatus == 2) {
			if (taxableIncome <= 16700)
				tax = taxableIncome * 0.10;
			else if (taxableIncome <= 67900)
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
			else if (taxableIncome <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
			else if (taxableIncome <= 208850)
				tax = 

		}
	}
}
