package ConstructorConcepts;

public class RegistrationPageTest {

	public static void main(String[] args) {
		
		RegistrationPage  regpage = new RegistrationPage("Aajay", "Dinne", "dinnekumar@gmail.com", 8008985778L, "Selenium123", "Selenium123");
		
		System.out.println(regpage.getFirstName());
		System.out.println(regpage.getLastName());
		System.out.println(regpage.getEmail());
		System.out.println(regpage.getPhoneNumber());
		System.out.println(regpage.getPassword());
		System.out.println(regpage.getConfirmPassword());
		
		regpage.setEmail("dinneaajaykumar70@gmail.com");
		regpage.setPhoneNumber(7981503049L);
		
		System.out.println(regpage.getEmail());
		System.out.println(regpage.getPhoneNumber());
		
	}

}
