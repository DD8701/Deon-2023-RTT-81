// This is a demo of data types

public class datatypedemo {

		public static void main(String[] args) {
			
		byte num;   //  -128 and 127.
		num = 113;
		System.out.println(num);
		
		short snum; //  -32,768 - 32,767 (inclusive)
		snum = 150;
		System.out.println(snum);
		
		long lnum = -12332252626L; // -9,223,372,036,854,775,808(-2^63) - 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
		System.out.println(lnum);
		
		double dnum = -42937737.9d; // 1.7976931348623157 x 10308 to 4.9406564584124654 x 10-324 (both positive and negative).
		System.out.println(dnum);
		
		float fnum = 19.98f;
		System.out.println(fnum);
		
		boolean b = false;
		System.out.println(b);
		
		char ch  =  'Z';
		System.out.println(ch);		

	}

}
