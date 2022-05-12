package BuilderPattern;

public class EcommAppTest {

	public static void main(String[] args) {
		
		
		EcommApp ecom = new EcommApp();
		ecom.login("dinnekumar@outlook.com", "dinne123")
				.search("Macbook Air", 3)
					.addtoCart("Macbook Air")
						.doPayment("dinne@axis")
						.logout();
		
		// Use case 1 
		ecom.login()
				.search("iPhone 12")
					.addtoCart("iPhone 12")
						.logout();
				
		// Use case 2 
		ecom.login()
				.addtoCart("Tea powder")
					.doPayment("dinne@okicici")
						.logout();
		
		// Use case 3 
		ecom.login()
				.search("Hp Tablets")
					.logout();
		
		// Use case 4
		ecom.login()
				.logout();

	}

}
