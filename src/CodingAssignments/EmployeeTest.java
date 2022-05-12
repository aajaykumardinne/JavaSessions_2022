package CodingAssignments;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setName("Aajay");
		e1.setAge(27);
		e1.setSalary(15.78);
		e1.setActive(true);
		e1.setGender('M');

		String s1 = e1.getEmployeeInfo();
		System.out.println(s1);

		
		Employee e2 = new Employee();

		e2.setName("Ramesh");
		e2.setAge(30);
		e2.setSalary(25.78);
		e2.setActive(true);
		e2.setGender('M');

		String s2 = e2.getEmployeeInfo();
		System.out.println(s2);
	}

}
