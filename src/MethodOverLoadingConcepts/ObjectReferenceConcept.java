package MethodOverLoadingConcepts;

public class ObjectReferenceConcept {

	// class data members
	
	// class variables
	String name;
	int age;
	
	//methods
	public void get() {
		System.out.println("get method");
	}

	public static void main(String[] args) {
		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		
//		obj = null; // null referenc objects
		
//		obj.name="Aajay";
//		obj.age = 25;
//		
//		System.out.println(obj.name);
		
		// no reference objects
		new ObjectReferenceConcept().name = "Aajay";
		new ObjectReferenceConcept().age = 30;
		new ObjectReferenceConcept().get();
		
		ObjectReferenceConcept obj1 = new ObjectReferenceConcept();
		
	}

}
