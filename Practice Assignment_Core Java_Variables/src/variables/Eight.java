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
		subTotal = coffee * 3;
		
		// 4 items of the 2nd product
		subTotal = subTotal + (tea *4);
		
		// 2 items of the 3rd product
		subTotal = subTotal + (cookie *2);
		
		System.out.println("Subtotal : " + subTotal);
		
		DecimalFormat df = new DecimalFormat ("#,###.00");
		System.out.println("Subtotal : " +  df.format(subTotal)); // can use a decimal formatter to shorten the result

	}

}
