package LoopsConcepts;

public class ForLoop {

	public static void main(String[] args) {

		// typical for loop : index based for loop
		// use cases: we have to use while loop when we are  sure about 
		// number of cycles/iterations.
		// Examples in selenium : 
		// menuitems, total no of links/images on the page
		// dropdown, webtable
		for (int w = 1; w <= 10; w++) { // prefered
			System.out.println(w);
		}

//		int w=1;
//		for(; w<=10 ; w++) {
//			System.out.println(w);
//		}

//		int w=1;
//		for(; w<=10 ; ) {
//			System.out.println(w);
////			w++;
////			++w;
//			w=w+1;
//		}

//		for(;;) {
//			System.out.println("Hi");
//		}

		// even numbers
		System.out.println("*****");
		for (int even = 2; even <= 10; even = even + 2) {
			System.out.println(even);
		}

		// print numbers from 10 to 1
		System.out.println("*****");
		for (int k = 10; k >= 1; k--) {
			System.out.println(k);
		}

		// odd numbers
		System.out.println("*****");
		for (int odd = 1; odd <= 9; odd = odd + 2) {
			System.out.println(odd);
		}

		// for loop can print double values also
		System.out.println("*****");
		for (double g = 15.1; g <= 20.0; g++) {
			System.out.println(g);
		}

		// print the aplhabets from a to z(*** interview question)
		System.out.println("*****");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
		}

		System.out.println("*****");
		for (int as = 97; as <= 122; as++) {
			System.out.println((char) as);
		}

		// print the even numbers using %
		System.out.println("*****");
		for (int p = 1; p <= 100; p++) {
			if (p % 2 == 0) {
				System.out.println(p);
			}
		}

		// print the odd numbers using %
		System.out.println("*****");
		for (int e = 1; e <= 100; e++) {
			if (e % 2 != 0) {
				System.out.println(e);
			}
		}

	}

}
