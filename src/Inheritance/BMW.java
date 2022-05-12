package Inheritance;

public class BMW extends Car{

	// Method Overloading -- only within the same class 
	// Poly(Many) + Morphism(forms) --> Static/Compile time Polymorphism
	
	// Method Overriding Def:Type of Poly(Many) + Morphism(forms) --> Dynamic/RunTime Polymorphism 
	// When you have a method in the parent class and the same method in the
	// child class with:
	// the same name
	// same number of parameters
	// with the same signatur	
	// can not override a private method
	
	// Multiple inheritance is not applicable for the classes
	
	// overridden method
	@Override
	public void  start() {
		System.out.println("BMW -- start");
		
	}
	
	public void autoParking() {
		System.out.println("BMW-- autoparking");
	}
	

	public static void drive() {
		System.out.println("BMW -- drive");
	}

}
