package ExceptionHandlingConcepts;

public class ThrowsKeyword {

	// throws keyword will just throw an Exception it can not handle
	// try catch block will handle the exceptions.
	// (m2) consumer part will handle the exceptions.
	// producer will throw an Exception
	
	public void m1() {
		System.out.println("m1");
		m2();
	}
	

	public void m2(){
		System.out.println("m2");
		try {
		m3();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Hi Aajay");
		System.out.println("Be confident about your Skills");
	}
	

	public void m3() throws ArithmeticException {
		System.out.println("m3");
		int k=10/0;
	}
	
	public static void main(String[] Aajay) {
		
		ThrowsKeyword tr = new ThrowsKeyword();
		tr.m1();
		
		
	}
	

}
