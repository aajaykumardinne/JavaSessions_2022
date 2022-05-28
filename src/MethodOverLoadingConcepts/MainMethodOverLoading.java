package MethodOverLoadingConcepts;

public class MainMethodOverLoading {

	// We can over load main method 
	// String args[], String[] args both are right	
	// args is variable name
	// JVM passes the array parameter to the main method
	
	public static void main(String a[]) {
		System.out.println("Main 1:" +a[0]);

	}
	
	public void main(int a) {
		System.out.println("Main 2:" +a);
	}
	
	public void main(int a, int b) {
		System.out.println("Main 3	:" + a + b);
	}
	
	

}
