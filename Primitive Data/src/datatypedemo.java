// This is a demo of data types

public class datatypedemo {

		public static void main(String[] args) {
			
		byte num;   //  -128 and 127.
		num = 113;
		System.out.println(num);
		
		short snum; //  -32,768 - 32,767 (inclusive)
		snum = 150;
		System.out.println(snum);
		
		int inum; //  -2,147,483,648 to 2,147,483,647
		 inum = 200;
		System.out.println(inum);
		
		long lnum = -12332252626L; // -9,223,372,036,854,775,808(-2^63) - 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
		System.out.println(lnum);
		
		double dnum = -42937737.9d; // 1.7976931348623157 x 10308 to 4.9406564584124654 x 10-324 (both positive and negative).
		System.out.println(dnum);
		
		float fnum = 19.98f; // 4 bytes, stores fractional numbers. Sufficient for storing 6 -7 decimal digits.
		System.out.println(fnum);
		
		boolean b = false; // 1 bit, stores true or false values
		System.out.println(b);
		
		char ch  =  'Z'; // 2 bytes, stores a single character/letter or ASCII values
		System.out.println(ch);		

	}

}
