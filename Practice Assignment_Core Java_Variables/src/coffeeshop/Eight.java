package variables;

import java.text.DecimalFormat;

public class Eight {

	public static void main(String[] args) {
		
		// the value in each product is the price
		double coffee = 5.43;
		double tea = 4.33;
		double cookie = 6.76;
		
		double subTotal = 0;
		
		// 3 items of the first product
		subTotal = coffee * 1;
		
		// 4 items of the 2nd product
		subTotal = subTotal + (tea *0);
		
		// 2 items of the 3rd product
		subTotal = subTotal + (cookie *2);
		
		System.out.println("Subtotal : " + subTotal);
		
		DecimalFormat df = new DecimalFormat ("#,###.00");
		System.out.println("Subtotal : " +  df.format(subTotal)); // can use a decimal formatter to shorten the result

		double salesTax = subTotal * 0.0825;
		System.out.println("Sales Tax : " + df.format(salesTax));
		
		double totalSale = subTotal + salesTax;
		System.out.println("Total : " + df.format(totalSale));

	}

}
