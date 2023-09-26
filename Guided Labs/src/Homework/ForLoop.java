package Homework;

public class ForLoop {

	public static void main(String[] args) {
		// use letters.split(",") to make an array of letters
		// loop over the array and count the number of letters that are not vowels

		String Letters = ("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z");
		String[] arrSplit = Letters.split(",");
		for (int i = 0; i < arrSplit.length; i++) { // array split
		System.out.println(arrSplit[i]);
		}

	}

}
