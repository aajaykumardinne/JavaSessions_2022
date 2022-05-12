package BuilderPattern;

public class EcommApp {
	
	
	public EcommApp login() {
		System.out.println("default login");
		return this;
	}
	
	public EcommApp login(String username, String password) {
		System.out.println("Login with: " + username + ":" + password);
		return this;
	}
	
	public EcommApp search() {
		System.out.println("Default search");
		return this;
	}
	
	public EcommApp search(String productName) {
		System.out.println("Search for the product: " + productName);
		return this;
	}
	
	public EcommApp search(String productName, int rating) {
		System.out.println("Search for the product: " +  productName + ":" + rating);
		return this;
	}
	
	
	public EcommApp addtoCart(String productName) {
		System.out.println("Add to the cart: " +  productName);
		return this;
	}
	
	public EcommApp doPayment(String upi) {
		System.out.println("Make the payment: " + upi);
		return this;
	}
	
	public EcommApp logout() {
		System.out.println("logout from the app");
		return this;
	}

}
