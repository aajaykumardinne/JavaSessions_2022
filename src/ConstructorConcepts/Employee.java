package ConstructorConcepts;

public class Employee {

	// Advantages of the constructor
	// restrict the users to create the objects
	
	// can not access the private constructor outside the other class
	// can be accessed in the class it is defined.

	String name;
	int age;
	int id;
	double salary;
	boolean isPerm;
	char gender;

	// constructor
	// name of the constructor will be same as the class name
	// const, can not have return type, no void , no return
	// constuctor will be called when you create the object of the class

	// We can overload the connstructor

// function may or may not return the value
// function name can be anything , but constrcutor name will be same as the
// class name
// function will have the business logic/ feature logic, but constrcutor will be
// helping to create the object
// to call the non-static function we need to create the object and use object
// reference variable
// but to call the constructor just create the object and supply values.

	public Employee() {
		System.out.println("default constructor");
	}

	// this keyword refers to current class object
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int age, int id, double salary, boolean isPerm, char gender) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}
	
	
}
