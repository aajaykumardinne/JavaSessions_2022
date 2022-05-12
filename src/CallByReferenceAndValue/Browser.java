package CallByReferenceAndValue;

public class Browser {

	String name;
	double version;
	String vendor;
	
	public void getInfo(Browser br) {
		System.out.println(br.name + ":" + br.version + ":" +br.vendor);
	}
	
	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		Browser b = new Browser();
		b.name = "chrome";
		b.version = 100.01;
		b.vendor = "google";
		
		b.getInfo(b);  // call by reference/ pass by reference
		
		b.sum(30, 40);  //  call by value
		

	}

}
