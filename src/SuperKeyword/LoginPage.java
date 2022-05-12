package SuperKeyword;

public class LoginPage extends Page{
	
	// super keyword is used to access the parent class properties: variables,methods,constructor
	// super keyword should be the first statement in child class constructor
	// super represents parent class objects
	
	public  LoginPage() {
		super(10,30);
		System.out.println("Hi");
	}
	
	int timeOut = 200;
	
	public void loginInfo() {
		System.out.println("login info methods");
		super.display();   // parent 
		display();   // child
	}
	
	@Override
	public void display() {
		System.out.println("loginPage Display");
		super.display();
//		display();
	}
	
	public void gettimeOut() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);
	}

}
