package StaticAndNonStaticConcepts;

public class Car {

	String name;
	String color;
	int price;
	static int wheels=4;

	// when every object has the same value then define the variable as
	// static
	// applicable for the class vars only
	// object will never hold the static variables.
	// object will take only the class properties i.e class vars
	
	// static class vars should be the common value of the class vars/properties

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "Honda";
		c1.price = 15;
		c1.color = "white";
		c1.wheels = 4;

		Car c2 = new Car();
		c2.name = "BMW";
		c2.price = 60;
		c2.color = "yellow";
		

		Car c3 = new Car();
		c3.name = "Hyundai";
		c3.price = 20;
		c3.color = "red";
		
		
		// how to access static vars:
		// no need to create the object
		// 1. within the same class, you can access them directy.
		System.out.println(wheels);

		// 2. you can call by the class name -- best way
		System.out.println(Car.wheels);
		
		// 3. by object ref name  -----  memory wastage
		System.out.println(c1.wheels);
	}

}
