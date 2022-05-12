package ConstructorConcepts;

public class Customer {

	// Constructor and Encapsulation concept
	private String name;
	private int age;
	private String company;
	
	public Customer() {
		System.out.println("default constructor");
	}
	
	public Customer(String name, int age, String company) {
		this.name = name;
		this.age = age;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCustomerInfo() {
		return name + " " + age + " " + company;
	}
	
}
