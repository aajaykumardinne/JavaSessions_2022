package BuilderPattern;

public class BookingCabApplnTest {

	public static void main(String[] args) {

		// can create method chanining by builder pattern with this keyword
		BookingCabAppln bc = new BookingCabAppln();
		bc.login("dinnekum@outlook.com", "dinne89").searchStartingPointandDestination("Hyd").logout();

		// usecase 1
		bc.login().searchStartingPointandDestination("LB Nagar", "Ameerpet")
				.selectVehicelType("Tata sedan", "Hyundai Elantra").makePayment("dinne@axis").logout();

		// use case 2
		bc.login("kumar@gmail.com", "kumar456").searchStartingPointandDestination("Madhapur")
				.selectVehicelType("Tata Safari", "Honda Amaze").logout();

		// use case 3
		bc.login().logout();

	}

}
