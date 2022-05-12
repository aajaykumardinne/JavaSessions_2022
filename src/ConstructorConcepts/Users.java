package ConstructorConcepts;

public class Users {

	String firstName;
	int userId;
	boolean IsActive;
	String city;
	
	
	public Users(String firstName, String city) {
		super();
		this.firstName = firstName;
		this.city = city;
	}


	public Users(String firstName, boolean isActive) {
		super();
		this.firstName = firstName;
		IsActive = isActive;
	}


	public Users(String firstName, int userId, boolean isActive, String city) {
		super();
		this.firstName = firstName;
		this.userId = userId;
		IsActive = isActive;
		this.city = city;
	}
	
	
	
}
