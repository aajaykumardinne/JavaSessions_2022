package Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.setPassword("admin123");
		lp.setUsername("aajaykumardinne");

		lp.login(lp.getUsername(), lp.getPassword());
		
		lp.setPassword("admin456");
		lp.login(lp.getUsername(), lp.getPassword());
		
		LoginPage lp1 = new LoginPage();
		lp1.login(lp1.getUsername(), lp1.getPassword());
		
	}

}
