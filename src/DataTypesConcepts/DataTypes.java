package DataTypesConcepts;

public class DataTypes {

	public static void main(String[] args) {
		
		// DataTypes
		// strict type
		
		// declare the variables according to the range
		
		// 1.Primitive Data Types:Do not need to create the Object.
			//1 Boolean type: boolean (true/false)
			//2 Numeric Type:
					//1 character type : char
					//2 Integral type: 
							// 1 Integer: byte,short,int,long
							// 2 floating point: float,double
		// 2. Non-primitive Data Types:need to create the Object.
		// String,Array,Interface,Classes
		
		
		// 1. byte
		// size : 1 byte = 8 bits
		// range : -128 to 127 or 
		// (-2^7 to 2^7-1)
		byte b = 10;
		b = 20;
		byte b3  = -128;
		System.out.println(b3);
		
		// 2. short
		// size : 2 bytes = 16 bits
		// range : -32768 to 32767 or
		// (-2^15 to 2^15-1)
		short s1 = 1234;
		System.out.println(s1);
		
		
		// 3. int
		// size : 4 bytes = 32 bits
		// range : -2147483648 to 2147483647 or 
		// (-2^31 to 2^31-1)
		int i = 23450;
		int i1 = -190;
		int k = 1;
		
		System.out.println(k);
		
		// 4. long
		// size 8 bytes = 64 bits
		// range : -9223372036854775808 to 9223372036854775807
		// range: (-2^63  to 2^63-1)
		long pop = 10000002345L;
		
		System.out.println(pop);
		
		// 5. float
		// size 4 bytes = 32 bits
		// range: after the decimal point . (upto 7 digits)
		float r = 12.45678899900f;
		float f2 = (float)23.45; // basic type casting
		System.out.println(r);
		
		float f5 = 100;
		System.out.println(f5);
		
		// 6.double
		// size: 8 bytes = 64 bits
		// range: after the decimal point . (upto 16 digits)
		double d = 12.33;
		double d2 = 34.56;
		double d3 = 1.1;
		
		System.out.println(d2);
		
		// 7.char
		// size : 2 bytes = 16 bits
		// single digit value
		char c1 ='a'; //a-z and A-Z
		char c2= '1'; // 0-9
		char c3= '#';
		// chinese, unicode
		System.out.println(c1);
		
		// 8. boolean
		// size : ~1 bit(around 1bit)
		boolean flag = true;
		boolean flag1 = false;
		
		System.out.println(flag);
		
		
	}

}
