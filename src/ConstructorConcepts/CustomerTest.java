package ConstructorConcepts;

public class CustomerTest {

	public static void main(String[] args) {

		// constructor -- to construct the values of the class variables
		Customer c1 = new Customer("Gowtham", 29, "IBM");

		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCompany());

		c1.setName("Hari");
		c1.setCompany("Microsoft");
		c1.setAge(40);

		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCompany());
		
		Customer c2 = new Customer();
		c2.setName("Poornima");
		c2.setAge(35);
		c2.setCompany("CGI");
		

		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getCompany());
		

	}

}
