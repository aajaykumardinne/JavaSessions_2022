package AbstractClassConcepts;

public class AmazonTest {

	public static void main(String[] args) {
		
		// Constructor will be called when you create the object
		LoginPage lp = new LoginPage();
		lp.title();       // overridden method 
		lp.url();        // overridden method
		lp.header();    // inherited method
		lp.logo();      // inherited method
		lp.doLogin("admin", "admin"); // individual method 

		HomePage hp = new HomePage();
		hp.title();       // overridden method
		hp.url();        // overridden method
		hp.header();    // overridden method 
		hp.logout();    // individual method
		
		
		// top-casting
		// child class object can be referred by parent class ref name/variable
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		p.logo();
		
		
		// downcasting: CompileTime not allowed for the Abstract class and Interface
		// LoginPage lp1 = new Page();
		
	}

}
