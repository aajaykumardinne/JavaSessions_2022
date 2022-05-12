package SuperKeyword;

public class Page {
	
	public Page() {
		System.out.println("page -- default constructor");
	}
	
	public Page(int a) {
		System.out.println("page -- constructor: " + a);
	}
	
	public Page(int a , int b) {
		System.out.println("page -- constructor: " + (a+b));
	}
	
	int timeOut = 100;
	
	public void display() {
		System.out.println("Page Display");
	}

}
