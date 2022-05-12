package Encapsulation;

public class Employee {

	public static void main(String[] args) {
		
		// creating the object of Company Class
		Company c2 = new Company();
		c2.name = "Google";
		c2.hq = "Hyd";
		
		// set the value and get the value
		c2.setsharePrice(10000);
		
		int p1 = c2.getSharePrice();
		System.out.println(p1);
		
		

	}

}
