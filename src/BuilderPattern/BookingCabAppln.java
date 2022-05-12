package BuilderPattern;

public class BookingCabAppln {
	
	
	public BookingCabAppln login() {
		System.out.println("default login");
		return this;
		
	}
	
	public BookingCabAppln login(String username, String password) {
		System.out.println("Login with : " + username + ":" + password);
		return this;
	}
	
	public BookingCabAppln searchStartingPointandDestination(String currentLocation) {
		System.out.println("The Current location is: " +currentLocation);
		return this;
	}
	
	public BookingCabAppln searchStartingPointandDestination(String location, String destination) {
		System.out.println("The pickup and drop location is: " + location + ":" + destination);
		return this;
	}
	

	public BookingCabAppln selectVehicelType(String sedan, String Mini) {
		System.out.println("The available vehicle types are: " + sedan + ":" + Mini );
		return this;
	}
	
	public BookingCabAppln makePayment(String upi) {
		System.out.println("The payment method is via:" + upi);
		return this;
	}
	
	public BookingCabAppln logout() {
		System.out.println("log out from the booking vehicle application");
		return this;
	}
}
