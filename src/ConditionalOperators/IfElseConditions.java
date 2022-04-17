package ConditionalOperators;

public class IfElseConditions {

	public static void main(String[] args) {

		int a = 50;
		int b = 50;
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		if (a == b) {
			System.out.println("both are equal");
		}

		// dead code
		if (true) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

//		String browser = "Safari";
		// compare two strings by using the equals method
		// compare the primitive data types with == operator
//		if (browser.equals("chrome")) {
//			System.out.println("Launch the chrome browser");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("Launch the firefox browser");
//		}
//		if(browser.equals("Safari")) {
//			System.out.println("Launch the safari browser");
//		}
//		if(browser.equals("IE")) {
//			System.out.println("Launch the IE browser");
//		}
//		else {
//			System.out.println("please pass the right browser");
//		}

		String browser = "IE";

		if (browser.equals("chrome")) {
			System.out.println("Launch the chrome browser");
		} else if (browser.equals("firefox")) {
			System.out.println("Launch the firefox browser");

		} else if (browser.equals("Safari")) {
			System.out.println("Launch the safari browser");
		} else if (browser.equals("IE")) {
			System.out.println("Launch the IE browser");
		} else {
			System.out.println("please pass the right browser");
		}

		// Best statement to validate any condition in the java is switch case statement

	}

}
