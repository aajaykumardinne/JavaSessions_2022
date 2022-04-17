package CodingAssignments;

public class DataTypesAssignment {

	public static void main(String[] args) {

		// 1.
		String s1 = "Hello";
		String s2 = "Aajay Kumar Dinne";

		System.out.println(s1);
		System.out.println(s2);

		// 2.
		int num1 = 74;
		int num2 = 36;

		int sum = num1 + num2;
		System.out.println(sum);

		// 3.
		int num3 = 50;
		int num4 = 3;

		int div = num3 / num4;
		System.out.println(div);

		// 4.a
		int num5 = -5;
		int num6 = 8 * 6;
		int sum1 = num5 + num6;
		System.out.println(sum1);

		// 4.b
		int num7 = (55 + 9);
		int num8 = 9;
		int div1 = num7 % num8;
		System.out.println(div1);

		// 4.c
		int num9 = 20;
		int num10 = -3 * 5 / 8; // did not understand the output
		int sum2 = num9 + num10;
		System.out.println(sum2);

		// 4.d
		int num11 = 5;
		int num12 = 15 / 3 * 2 - 8 % 3;
		int sum3 = num11 + num12;
		System.out.println(sum3);

		// 5
		double exp1 = (25.5 * 3.5 - 3.5 * 3.5);
		double exp2 = (40.5 - 4.5);
		double div2 = (exp1 / exp2);
		System.out.println(div2);

		// 6
		String s3 = "Hello Selenium";
		char c1 = 't';
		System.out.println(s3 + c1);

		// 7
		int v1 = 100;
		int v2 = 200;
		int v3 = 3400;
		int sum4 = v1 + v2 + v3;

		System.out.println("Your Total Amount is: " + sum4);

		// 8.
		byte b3 = 065; // octal number
		System.out.println(b3);
		// 065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
	}

}
