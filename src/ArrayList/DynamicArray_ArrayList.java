package ArrayList;

import java.util.ArrayList;

public class DynamicArray_ArrayList {

	public static void main(String[] args) {
		
		//ArrayList - default class
		//need to create the object of AL using the new keyword
		//it maintains the order/index
		ArrayList ar = new ArrayList();
		
		ar.add(12);
		ar.add(200);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		ar.add(600);
		
		System.out.println(ar.size());
		
		// get method to get the element value from a particular index
		System.out.println(ar.get(3));
		
//		System.out.println(ar.get(4)); // IndexOutOfBoundsException
//		System.out.println(ar.get(-1)); // IndexOutOfBoundsException
		
//		ar.remove(3);
//		System.out.println(ar.get(3));
//		
//		System.out.println(ar.size());
		
		// print all the values in the arraylist by using for loop
		for(int i=0; i<ar.size() ;i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println(ar);
		
		
	}

}
