package ConstructorConcepts;

public class EmployeeTest {

	public static void main(String[] args) {

		// We can limit the creating the objects of the users by defining the
		// constructor
		Employee e = new Employee();
		e.name = "Kumar";
		e.id = 127389;
		e.age = 27;
		e.salary = 30.89;
		e.isPerm = true;
		e.gender = 'M';

		Employee e1 = new Employee("Ram", 256);
		System.out.println(e1.name + ":" + e1.id);

		Employee e2 = new Employee("Rahul", 23, 28, 34.67, false, 'M');
		System.out.println(e2.name + ":" + e2.id + ":" + e2.age + ":" + e2.salary + ":" + e2.isPerm + ":" + e2.gender);

		Users u1 = new Users("Aajay", "Hyd");
		Users u2 = new Users("Anil", true);
		Users u3 = new Users("Tapan", 12, false, "Delhi");
		
//		MySystem my = new MySystem();

	}

}
