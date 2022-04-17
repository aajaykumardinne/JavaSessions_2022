package ClassAndObjects;

public class Employee {

	String name;
	int age;
	String city;
	double salary;
	boolean isPerm;
	char gender;
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		// e1 -> Object reference name
		// RHS ->new Employee(); -- is Object
		// Employee -> class / type of e1
		// class is a non primitive data type
		
		e1.name = "aajay";
		e1.age = 27;
		e1.city = "Hyderabad";
		e1.salary = 15.34;
		e1.isPerm = true;
		
		System.out.println(e1.name +" "+ e1.age +" "+ e1.city);
		
		// we can any no of objects for the class
		Employee e2 = new Employee();
		System.out.println(e2.name +" "+ e2.age +" "+ e2.city +" "+ e2.salary +" "+ e2.isPerm);
		
		System.out.println(e2.gender);
		
		

	}

}
