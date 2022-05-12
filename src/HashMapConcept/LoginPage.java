package HashMapConcept;

import java.util.HashMap;

public class LoginPage {

	// RBAC - role based access control - roles/users
	
	public static String getUserCred(String role){
			
		HashMap<String,String > credMap = new HashMap<String,String>();
		credMap.put("admin", "admin@yahoo.com;adimin234");
		credMap.put("customer", "cust@gmail.com;cust123");
		credMap.put("seller", "seller@az.com;seller123");
		credMap.put("partner", "partner@az.com;partner123");
		credMap.put("distributor", "dist@az.com;dist123");
		credMap.put("catmanager", "cat@az.com;cat123");
		
		return credMap.get(role);
	}
	
	public static void doLogin(String username, String password) {
		System.out.println("login with: " + username + ":" + password);
	}
			
	public static void main(String[] args) {
		
		String[] cred = getUserCred("admin").split(";");
		String un = cred[0].trim();
		String pwd = cred[1].trim();
		
		doLogin(un, pwd);

	}

}
