package CodingAssignments;

public class Methods {

	// 1.
	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	
	// 2
	public double multiply(double x , double y) {
		double product = x*y;
		return product;
	}
	
	//3.1
	public double  getCircumferenceofCircle(int radius) {
		double circumference = 2 * 3.142 * radius;
		return circumference;
	}
	
	//3.2 
	public double areaofCircle(int r) {
		double area = 3.142 * r *r;
		return area;
	}
	
	// 4.1
	public int maximumNumber(int c, int d, int e) {
		
		if(c>d && c>e) {
			return c;
		}
		else if(d>e) {
			return d;
		}
		else {
			return e;
		}
	}
	
	// 4.2 
	public int minimumNumber(int f, int g, int h) {
		if( f<g && f<h) {
			return f;
		}
		else if(g<h) {
			return g;
		}
		else {
			return h;
		}
		
	}
	
	// 5
	public static boolean EvenorOdd(int  r) {
		if(r%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//6
	public static boolean voteEligibility(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//7
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2 ; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	//8
	public static String studentGrades(int marks) {
		if(marks>91 && marks<=100) {
			return "AA";
		}
		else if(marks>81 && marks<=90) {
			return "AB";
		}
		else if(marks>71 && marks<=80) {
			return "BB";
		}
		else if(marks>61 && marks<=70) {
			return "BC";
		}
		else if(marks>51 && marks<=60) {
			return "CD";
		}
		else if(marks>41 && marks<=50) {
			return "DD";
		}
		else {
			return "Fail";
		}
	}
	
	//9 
	public static int factorial(int num) {
		
		int fact=1;
		for(int i=1; i<=num ; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) {

		Methods   methd = new Methods();
		int sumofNumbers = methd.sum(35, 65);
		System.out.println("The sum of two numbers: " +sumofNumbers);
		
		double prodofnumbers = methd.multiply(23.78, 45.78);
		System.out.println("The product of two numbers: " +prodofnumbers);
		
		double circumf = methd.getCircumferenceofCircle(5);
		System.out.println("Circumference of a circle: " +circumf);
		
		double areaofcircle = methd.areaofCircle(3);
		System.out.println("Area of the circle: " +areaofcircle);
		
		int max = methd.maximumNumber(14, 45, 65);
		System.out.println("Maximum of three numbers : " +max);
		
		int min = methd.minimumNumber(100, 2345, 35);
		System.out.println("Minimum of three numbers: " +min);
		
		boolean b = EvenorOdd(23);
		System.out.println("Is the  number even?: " +b);
		
		boolean voteright = voteEligibility(19);
		System.out.println("Is the person to eligible to vote?:" +voteright);
		
		boolean primeorNot = isPrimeNumber(37);
		System.out.println("Is the given number prime or not: " +primeorNot);
		
		String  examstatus = studentGrades(55);
		System.out.println("The student grades are: " +examstatus);
		
		int factnumber = factorial(5);
		System.out.println("The factorial of a number: " +factnumber);
		

	}

}
