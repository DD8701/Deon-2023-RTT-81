package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int sum = a + b;
		System.out.println(sum);

/*------------------------------------------------------------------*/
		
		double aa = 1.0;
		double bb = 2.0;
		double sum2 = aa + bb;
		System.out.println(sum2);

/*------------------------------------------------------------------*/
		
		int d = 1;
		double e = 2.0;
		double sum3 = d + e;
		System.out.println(sum3);//must print out as a double.
		
/*------------------------------------------------------------------*/
		
		/*int x = 1;
		int y = 2;//must change data type to a double to assign a decimal.
		int result = y/x;
		System.out.println(result);*/
		
/*------------------------------------------------------------------*/
		
		double m = 1.0;
		double n = 2.0;
		double result2 = n/m;
		System.out.println((int)result2); //cast the result to an integer.
		
/*------------------------------------------------------------------*/
		
		int x = 5; //declare int variable
		int y = 6; //declare int variable
		int q = y/x; //declare a variable q and assign y/x to it
		System.out.println(q); //print q
		//Now cast y to a double and assign it to q.
		
		 //cast y to a double and assign it to q.
		System.out.println(q); //print q again
		
/*------------------------------------------------------------------*/	
		
		final double PI = 3.14;
		int aaa = 1;
		int bbb = 2;
		double summ = PI * aaa;
		System.out.println(summ);
		
/*------------------------------------------------------------------*/
		
		// cafe
		
		double coffeePrice = 3.99;
		double teaPrice = 2.99;
		double frappePrice = 1.99;
		
		int coffeeQuantity = 3;
		int teaQuantity = 4;
		int frappeQuantity = 2;
		
		double subtotal = (coffeePrice * coffeeQuantity) + (teaPrice * teaQuantity) + (frappePrice * frappeQuantity);
		
		final double SALES_TAX = 0.0825; //8.25% sales tax
		
		double totalSale = subtotal * (1 + SALES_TAX);
		
		System.out.printf("%.2f",totalSale);
		
/*------------------------------------------------------------------*/
			
		int xx = 2;
		System.out.println(Integer.toBinaryString(xx));//prints the binary version.
		
/*------------------------------------------------------------------*/
				
		//Convert a total amount of seconds to the hour, minute, and seconds.
		int seconds = 86399;
		int p1 = seconds % 60; //Extracts full minutes. Returns remainder after division by 60.
		int p2 = seconds / 60; //Calculates total # minutes by dividing the total sec by 60.
		int p3 = p2 % 60; //Calculates remaining minutes after extracting full hours. Now contains 
		//remaining minutes and p3 will contain remaining minutes after removing full hours.
		p2 = p2 / 60; //Updates the value of p2 to represent the total # of hrs by dividing the remaining minutes by 60.
		System.out.print(p2 + ":" + p3 + ":" + p1); //
		System.out.print("\n"); //prints a newline character to move to the next line.
		
/*------------------------------------------------------------------*/
		
		
}
}