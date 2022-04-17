package DataTypesConcepts;

public class DataTypes {

	public static void main(String[] args) {
		
		//DataTypes
		// strict type
		
		// declare the variables according to the range
		
		// 1.Primitive Data Types:Do not need to create the Object.
			//1 Boolean type: boolean (true/false)
			//2 Numeric Type:
					//1 character type : char
					//2 Integral type: 
							// 1 Integer: byte,short,int ,long
							// 2 floating point: float,double
		// 2. Non-primitive Data Types:need to create the Object.
		// String, Array,Interface,Classes
		
		
		// 1. byte
		// size : 1 byte = 8 bits
		// range : -128 to 127
		byte b = 10;
		b = 20;
		byte b3  = -128;
		System.out.println(b3);
		
		// 2. short
		// size : 2 byte = 16 bits
		// range : -32768 to 32767
		short s1 = 1234;
		System.out.println(s1);
		
		
		// 3. int
		// size : 4 byte = 32 bits
		// range : -2147483648 to 2147483647
		int i = 23450;
		int i1 = -190;
		int k = 1;
		
		System.out.println(k);
		
		// 4. long
		// size 8 bytes = 64 bits
		// range : -9223372036854775808 to 9223372036854775807
		long pop = 10000002345L;
		
		System.out.println(pop);
		
		// 5. float
		// size 4 byes = 32 bits
		// range: after . (upto 7 digits)
		float r = 12.4f;
		float f2 = (float)23.45;
		System.out.println(f2);
		
		float f5 = 100;
		System.out.println(f5);
		
		// 6.double
		// size: 8 bytes = 64 bits
		// range: after . (upto 16 digits)
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
		
		System.out.println(c1);
		
		// 8. boolean
		// size : ~1 bit(around 1bit)
		boolean flag = true;
		boolean flag1 = false;
		
		System.out.println(flag);
		
		
	}

}
