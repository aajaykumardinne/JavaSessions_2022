package InterfaceConcepts;

public interface USMedical extends WHO{

	public int min_fee = 100;
	// interface variables are default static and final in nature
	
	// can not have method body
	// only method prototype --- abstract methods(non static)
	// no method body , only method declaration
	// interface can not have the business logic
	
	// final and static methods can not be overridden
	public void physioServices();
	
	public void cardioServices();
	
	public void oncologyServices();
	
	public void emergencyServices();
	
	// after jdk 1.8
	// 1. you can have static methods with the body
	
	public static void billing() {
		System.out.println("US Medical--billing");
	}
	
	// 2. can have default method with method body(non static)
	default void  medInsurance() {
		System.out.println("US Medical--medInsurance");
	}
}
