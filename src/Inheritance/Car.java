package Inheritance;

public class Car extends Vehicle {
	
	// final class -- can not be a parent
	// final method - can not be overridden
	
	// final keyword is used to prevent method overriding and inheritance
	
	// static methods can not be overridden
	
	public void start(){
		System.out.println("car -- start");
		
	}
	
	public void stop() {
		System.out.println("car -- stop");
	}
	
	public void refuel() {
		System.out.println("car -- refuel");
	}

	public static void drive() {
		System.out.println("Car --- Drive");
	}
}
