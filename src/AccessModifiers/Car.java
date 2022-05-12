package AccessModifiers;

public class Car {

	// Access modifiers are defined for the class variables only
	// final can used in the local variable
	String name;
	public String color;
	protected int price;
	private int licenseNumber;

	public static void main(String[] args) {

		Car c = new Car();
		c.name = "BMW";
		c.licenseNumber = 123;
		c.price = 1245000;
		c.color = "Yellow";
	}

}
