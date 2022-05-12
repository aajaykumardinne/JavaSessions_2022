package AbstractClassConcepts;

public class LoginPage extends Page{

	// deafult constructor ... hidden constructor  by Java
	
	public LoginPage() {
		System.out.println("LP-- default constructor");
	}
	
	
	@Override
	public void title() {
		System.out.println("LP-title");
	}

	@Override
	public void url() {
		System.out.println("LP-url");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with: " + un + ":" + pwd);
	}

	public void doLogin(String un, String pwd, long phno) {
		System.out.println("login with: " + un + ":" + pwd + ":" + phno);
	}
	
}
