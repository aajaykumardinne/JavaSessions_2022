package StaticAndNonStaticConcepts;

public class StaticBlock {

	// static block excutes before the main method
	static {
		System.out.println("static block");
	}
	
	public static void test() {
		System.out.println("test method");
	}

	public static void main(String[] args) {
		System.out.println("main");
		test();

	}

}
