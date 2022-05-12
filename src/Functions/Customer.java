package Functions;

import java.util.ArrayList;

public class Customer {

	public ArrayList<String> doSearch(String categoryName) {
		ArrayList<String> productList = new ArrayList<String>();
		switch (categoryName) {
		case "Apple":
			productList.add("iPhone12ProMax");
			productList.add("iPhone12Pro");
			productList.add("iPhone12");
			break;
		case "Samsung":
			productList.add("Samsung S8");
			productList.add("Samsung Tablet");
			break;
		case "HP":
			productList.add("headphones");
			productList.add("HP Laptops");
			break;

		default:
			System.out.println("category name not found: " + categoryName);
			break;
		}

		return productList;

	}

	//WAF -- to launch the browser -- cross browser logic
	// input param - browserName (String)
	// return - void
	// Make sure that the method parameter you are passing should be 
	// implemented in the logic only it is mandatory
	// Assignment - write this code using switch case statement
	// 255 parameters can be passed to the method
	// but in Java you cannot pass more than 5 parameters
	// for more than 5 parameters pass it as class object
	
	public void launchBrowser(String browserName) {
		System.out.println("The browser name is: " +browserName);
		
		if(browserName.equals("chrome")) {
			System.out.println("launch the chrome");
		}
		else if(browserName.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if(browserName.equals("safari")) {
			System.out.println("launch safari");
		}
		
		else {
			System.out.println("please pass the right browser");
		}
	}
	
	
	// WAF - to register a user
	// params : fn , ln, email, address , country, phone, dob
	// we will pass the object reference name
	public void registerUser(String fn, String ln, String dob,String country, String email) {
		
	}
	
	
	
	public static void main(String[] args) {

		Customer c1 = new Customer();
		
		c1.launchBrowser("chrome");

		ArrayList<String> appleproductList = c1.doSearch("Apple");
		System.out.println(appleproductList.size());
		System.out.println(appleproductList);

		ArrayList<String> samsungproductList = c1.doSearch("HP");
		System.out.println(samsungproductList);
		System.out.println(samsungproductList.size());

		ArrayList<String> nokiaproductList = c1.doSearch("Nokia");
		System.out.println(nokiaproductList);
		System.out.println(nokiaproductList.size());

	}

}
