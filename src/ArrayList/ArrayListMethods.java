package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println(numbers);

		int i[] = { 10, 30, 60, 90 }; // array literals
		System.out.println(i);
		System.out.println(Arrays.toString(i));

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java", "Javascript", "Python"));
		System.out.println(names);

		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("Z", "T", "J", "R", "O", "F"));

		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);

		System.out.println(l1.equals(l2)); // to compare two arraylists

		// use case of eqauls method in selenium
		// webpage- dropdown - 10 elements - actualist
		// expectedlist

		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		l3.removeAll(l4); // removes the elements whcih are common in both the lists
		System.out.println(l3);

		// find out the common elements
		ArrayList<String> country1 = new ArrayList<String>(Arrays.asList("UK", "USA", "CAN", "IND", "FIN"));
		ArrayList<String> country2 = new ArrayList<String>(Arrays.asList("UK", "USA", "CAN", "IND", "NZ"));

		country1.retainAll(country2); // prints the common elements present in both the lists
		System.out.println(country1);

		// addAll
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("P", "Q", "R", "S", "T"));

		l5.addAll(l6);
		System.out.println(l5);
		System.out.println(l6);

//		l6.clear();
//		System.out.println(l6);

		ArrayList<String> l7 = (ArrayList<String>) l6.clone();
		System.out.println(l7);

		ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		l8.add(0, "Job");
		System.out.println(l8);
		l8.add(7, "Arya");
		System.out.println(l8);

	}
}
