package StaticAndNonStaticConcepts;

public  class Customers {

	// static keyword is defined for the 
	// class variables and methods only
	String name;
	int id;
	static String city = "Hyderabad";
	static String paymentMethod = "CreditCard";
	
	public void getInfo() {
		System.out.println("get info....");
	}
	
	public static void sendMail() {
		System.out.println("send mail");
	}
	public static void main(String[] args) {

		Customers obj = new Customers();
		
		// main method is void- as it does not return any value
		// it is static - we do not have to creat the object to access,
		// we can access them directly if it is static
		// static variables and methods are present in the common
		// memory location or metaspace in the memory allocation in java
		
		// how to access static methods
		// 1. call directly
		sendMail();
		
		// 2. by using class name       --- best way
		Customers.sendMail();
		
		// 3. using obj refe
		obj.sendMail();
		
		

	}

}
