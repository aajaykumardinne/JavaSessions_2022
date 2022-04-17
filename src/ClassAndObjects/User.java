package ClassAndObjects;

public class User {

	// Important Interview Question.
	String name;
	int age;
	String city;
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name= "Rohit";
		u1.age = 34;
		u1.city = "Newyork";
		
		User u2 = new User();
		u2.name= "Ramu";
		u2.age = 30;
		u2.city = "Delhi";
		
		User u3 = new User();
		u3.name= "Aajay";
		u3.age = 27;
		u3.city = "Gadwal";
		
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		u1=u2;
		System.out.println("******");
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		u2=u3;
		System.out.println("%%%%%");
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		u3=u1;
		System.out.println("&&&&");
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		

	}

}
