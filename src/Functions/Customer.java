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

	public static void main(String[] args) {

		Customer c1 = new Customer();

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
