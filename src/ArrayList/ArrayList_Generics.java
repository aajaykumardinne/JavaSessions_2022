package ArrayList;

import java.util.ArrayList;

public class ArrayList_Generics {

	public static void main(String[] args) {

		// int AL
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(12);
		ar1.add(150);
		ar1.add(500);

		for (Integer e : ar1) {
			System.out.println(e);
		}

		System.out.println("##");
		for (int e : ar1) {
			System.out.println(e);
		}
		
		System.out.println("&&&");
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}

		// double AL
		ArrayList<Double> ar2 = new ArrayList<Double>();
		ar2.add(12.89);
		ar2.add(100.00);

		for (Double e : ar2) {
			System.out.println(e);
		}

		// String AL
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Amazon");
		ar3.add("Google");
		ar3.add("Facebook");

		for (String e : ar3) {
			System.out.println(e);
		}

		// Object AL
		ArrayList<Object> ar4 = new ArrayList<Object>();
		ar4.add("Aajay");
		ar4.add(12.45);
		ar4.add('m');
		ar4.add(true);

		System.out.println(ar4.size());
		for (Object e : ar4) {
			System.out.println(e);
		}

	}

}
