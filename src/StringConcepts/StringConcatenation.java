package StringConcepts;

public class StringConcatenation {

	public static void main(String[] args) {

		String s = "Hello World!";
		String s1 = "100";
		String ph = "99681213";
		String cc = "1245 8734 2324";

		String x = "Hello";
		String y = "Testing";

		int a = 600;
		int b = 100;

		System.out.println(a + b); // addition operator
		System.out.println(x + y); // concatenation operator

		System.out.println(x + a);
		System.out.println(a + x);
		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b); // HelloTesting600100
		System.out.println(x + y + (a + b));

		System.out.println(x + y + a + b + a + b); // HelloTesting600100600100
		
		System.out.println("the value of a: " + a);
		System.out.println("the value of b: " + b);
		System.out.println("the sum is: " +(a+b));
		
		System.out.println(x+" "+y);
		
		double d2 = 21.35;
		double d3 = 45;
		
		System.out.println(x+y+d2+d3);
		
		char c1 = 'c'; // 99
		char c4= 'd'; // 100
		System.out.println(c1+c4);
		//a-z: 97 to 122 ASCII range
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println(c1+""+c4); //"" means blank string
		
		byte b1 = 60;
		byte b2 = 50;
		System.out.println(b1+b2);
		int b3 = b1+b2;
		System.out.println(b3);
		
		int t=10;
		int q=3;
		System.out.println(t/q);
		
		System.out.println(10/2);
		System.out.println(10.0/2);
		System.out.println(10/2.0);
		System.out.println(10.0/2.0);
		
//		System.out.println(6/0); // ArithmeticException
		System.out.println(0/9);
//		System.out.println(0/0); // ArithmeticException
		
		System.out.println(12.89/0); //Infinity
		System.out.println(0.0/0); //NaN -- not a number
		System.out.println(0/0.0); //NaN
		System.out.println(5/0.0); //Infinity
		
		char z ='a';
		System.out.println((int)z);
		
		

	}

}
