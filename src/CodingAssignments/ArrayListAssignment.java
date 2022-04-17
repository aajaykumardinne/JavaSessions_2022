package CodingAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {

		// 1.
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Yellow");
		ar1.add("Green");
		ar1.add("Purple");
		ar1.add("Red");
		ar1.add("Orange");

		
		for (String e : ar1) {
			System.out.println(e);
		}

		// 2. removing the elements at the first and last index positions.
//		ar1.add(0, "Blue");
//		System.out.println("***");
//		for(String e: ar1) {
//			System.out.println(e);
//		}

		ar1.add(ar1.size(), "Black");
		System.out.println("***");
		for (String e : ar1) {
			System.out.println(e);
		}

		// 3. how to the element value from a specified index
		System.out.println("***");
		System.out.println(ar1.get(4));

		// 4. how to update the specific array element in the array list
		ar1.set(0, "White");
		System.out.println("@@@");
		for (String e : ar1) {
			System.out.println(e);
		}

		// 5. remove the third element from an arraylist
		System.out.println("***");
		ar1.remove(3);

		for (String e : ar1) {
			System.out.println(e);
		}

		// 6. search an element in the arraylist
		System.out.println("***");
		boolean b = ar1.contains("Red");
		System.out.println(b);

		// 7.reverse elements in a array list
		System.out.println("@@@@*");
		for (int i = ar1.size() - 1; i >= 0; i--) {
			System.out.println(ar1.get(i));
		}

		// 8.extract a portion of a array list.
		System.out.println("&&&&&&&");
		List<String> l2 = ar1.subList(2, 4);
		System.out.println(l2);

		// 9.swap two elements in an array list.

		System.out.println("######");
		for (String e : ar1) {
			System.out.println(e);
		}

		String temp = ar1.get(0);
		ar1.set(0, ar1.get(1));
		ar1.set(1, temp);
		System.out.println("#");
		for (String e : ar1) {
			System.out.println(e);
		}

		// 10. empty an arraylist
//		System.out.println("***");
//		ar1.clear();
//		System.out.println(ar1);
		
		
		
		// 11.trim the virtual capacity of an array list the current list size.
		System.out.println(ar1.size());
		ar1.trimToSize();
		System.out.println(ar1);

		// 12. print all the elements using the position of the elements
		System.out.println("***");
		System.out.println(ar1.get(0));
		System.out.println(ar1.get(1));
		System.out.println(ar1.get(2));
		System.out.println(ar1.get(3));
		System.out.println(ar1.get(4));
//		System.out.println(ar1.get(5)); //IndexOutOfBoundsException

	}

}
