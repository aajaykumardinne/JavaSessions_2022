package HashMapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {

		// HashMap is a class implements Map Interface
		// extends AbstractMap
		// contains only unique elements
		// stores the values in key-value pair
		// it may have one null key and multiple null values
		// it maintains no order when we add and fetch the elements
		
		// collision threshold value is 8 for the HashMap
		// virtual segments  are allocated  15

		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("A", "Tom");
		empMap.put(null, "Aajay");
		empMap.put("B", "Tarun");
		empMap.put("C", "Rahul");
		empMap.put("f", null);

		System.out.println(empMap.get("A"));

		// print all the elements in the HashMap
		empMap.forEach((k, v) -> System.out.println(k + ":" + v));

		HashMap<String, Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("Aajay", 100);
		studentMap.put("Ramu", 600);
		studentMap.put("Ramu", 700);
		studentMap.put(null, 900);
		studentMap.put("Gowtham", null);

		System.out.println(studentMap.get("Gowtham"));
		System.out.println(studentMap.get(null));
		
		// for each loop with lambda
		studentMap.forEach((k,v) -> System.out.println(k + ":" + v));;
		
		HashMap<Integer , Integer>  numList = new HashMap<Integer,Integer>();
		numList.put(1, 200);
		numList.put(2, 400);
		
		System.out.println(numList.get(1));

	}

}
