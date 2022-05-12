package DataConversionConcepts;

public class DataConversion {

	public static void main(String[] args) {

		// Wrapper classes : Integer , Double , Boolean
		String x = "100";
		System.out.println(x + 20);

		// String to int
		int j = Integer.parseInt(x);
		System.out.println(j + 20);
		
		String y = "150Test";
		String[] z= y.split("Test");
		String t = z[0];
		int k = Integer.parseInt(t);  // NumberFormatException:
		System.out.println(k);

		// String to Double
		String p = "12.45";
		System.out.println(p+20);      // concatenates 
		
		Double h = Double.parseDouble(p);
		System.out.println(h+20);
		
		// int to String
		int i = 100;
		String o = String.valueOf(i);
		System.out.println(o+20);
		
		// String to Boolean
		
		String u = "true";
		Boolean b = Boolean.parseBoolean(u);
		System.out.println(b);
		
		if(u.equals("true")) {
			System.out.println("PASS");
		}
	}

}
