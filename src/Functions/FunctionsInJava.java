package Functions;

public class FunctionsInJava {

	// 1. no input and no return
	// void - no return
	public void test() {
		System.out.println("test method");
		int i = 10;
		System.out.println(i);
	}

	public void getPrintPaper() {
		System.out.println("print paper");
	}

	// 2. no input but some return
	// return type int
	public int getBalance() {
		System.out.println("get the balance");
		int fee = 100;
		int tax = 30;
		int total = fee + tax;
		return total;
	}

	public String getTrainerName() {
		String name = "Naveen";
		return name;

	}

	public boolean isEmpActive() {
		System.out.println("Emp active");
		return true;
	}

	// 3. some input and some return
	public int multiply(int x, int y) { // x,y are called the method parameters
		System.out.println("multiplication method");
		int mul = x * y;
		return mul;
	}

	public int getCourseFee(String courseName) {
		System.out.println("The course name is: " + courseName);

		if (courseName.equals("Selenium")) {
			return 100;
		} else if (courseName.equals("API")) {
			return 70;
		} else if (courseName.equals("Mobile")) {
			return 50;
		} else {
			System.out.println("course not found");
			return -1;
		}

	}

	public static void main(String[] args) {

		// can not create a function inside a function
		// can call the functions from the other functions

		FunctionsInJava fobj = new FunctionsInJava();
		// test is a non-static methods and can only be accessed by the object reference
		// name
		fobj.test();
		fobj.getPrintPaper();

		int b = fobj.getBalance();
		System.out.println(b);

		String t = fobj.getTrainerName();
		System.out.println(t);

		boolean y = fobj.isEmpActive();
		System.out.println(y);

		int d = fobj.multiply(10, 20);
		// 10, 20 are called the method arguments when passing to the function
		System.out.println(d);

		int cfee = fobj.getCourseFee("Selenium");
		System.out.println(cfee);

		int c = fobj.getCourseFee("C#");
		System.out.println(c);

		if (c == -1) {
			System.out.println("this not part of the training");
		}

	}

}
