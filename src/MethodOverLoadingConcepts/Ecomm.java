package MethodOverLoadingConcepts;

public class Ecomm {

	// duplicate methods are not allowed in java
	// Def: same method name with the same number of input parameters are not
	// allowed.

	// Method Overloading Concept
	// Within the same class , when you have number of methods
	// 1. with the same name
	// 2. different parameters
	// 3. different types of the parameters
	// 4. sequence of the parameters should be different

	public void login() { // 0
		System.out.println("default login");
	}

	public void login(String username, String pwd) { // 2
		System.out.println("login with: " + username + " : " + pwd);
	}

	public void login(String username, int otp) { // 2
		System.out.println("login with: " + username + " : " + otp);
	}

	public void login(int otp, String username) { // 2
		System.out.println("login with: " + username + " : " + otp);
	}

	public void login(int otp, String username, String pwd) { // 2
		System.out.println("login with: " + username + " : " + otp + " : " + pwd);
	}

	public void login(long phoneno, int otp) {
		System.out.println("login with:" + phoneno + " : " + otp);

	}

	// use cases
	// search feature in the ecommerce appn
	// login feature   in the ecommerce appn
	// payment feature in the ecommerce appn
	
	// feature name: search
	// filters
	// 1. name
	// 2. name , price
	// 3. seller, name , price
	
	public void doSearch(String name) {
		
	}
	
	public void doSearch(String name, int price) {
		
	}
	
	public void doSearch(String name, int price , String seller) {
		
	}
	
	
	// payment feature
	
	public void doPayment(String cc, int otp) {
		
	}
	
	public void doPayment(String debit, int otp, String pwd) {
		
	}
	
	public void doPayment(long phoneno, int opt) {
		
	}
	
	public void soPayment(long phoneno, int opt, String upi) {
		
	}
	
	
	// Uber
	// Booking a cab
	
	public void doBooking(String sp, String dest) {
		
	}
	
	public void doBooking(String sp, String dest, String carType) {
		
	}
	
	public void doBooking(String sp, String dest, String carType, int voucherCode) {
		
	}
	
	public static void main(String[] args) {
		Ecomm ecom = new Ecomm();
		ecom.login("Aajay", "Monday");

	}
}
