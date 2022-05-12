package StaticAndNonStaticConcepts;

public class Persons {

	// non-static methods can call the other non-static methods
	// use the debugger to understand the program flow execution
	public void m1() {
		System.out.println("m1");
		m2();
		p2();
	}
	
	
	public void m2() {
		System.out.println("m2");
		m3();
	}
	
	public void m3() {
		System.out.println("m3");
	}
	
	public static void p1() {
		System.out.println("p1");
		p2();
		Persons p2 = new Persons();
		p2.m1();
	}
	
	public static void p2() {
		System.out.println("p2");
		p3();
	}
	
	public static void p3() {
		System.out.println("p3");
	}
	
	public static void main(String[] args) {

		Persons p = new Persons();
		p.m1();

		p1();
	}

}
