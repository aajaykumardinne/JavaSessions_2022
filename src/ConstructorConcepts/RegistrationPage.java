package ConstructorConcepts;

public class RegistrationPage {

	// page class
	// private class vars: fn,ln,email etc
	// construct with all fields
	// getter/ setter
	
	// test class
	// create object of page class
	// try to get some values using getter
	// try to update email, ph fields -- again get them using the getter
	
	
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private String password;
	private String confirmPassword;
	
	public RegistrationPage(String firstName, String lastName, String email, long phoneNumber, String password,
			String confirmPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
	
	
}
