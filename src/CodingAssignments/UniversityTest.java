package CodingAssignments;

import java.util.ArrayList;

public class UniversityTest {

	public static void main(String[] args) {

		ArrayList<String> courselist = new ArrayList<String>();
		courselist.add("Java");
		courselist.add("Javascript");
		courselist.add("python");

		University uni = new University("Hari", "India");
		
		System.out.println(uni.getUniversityInfo());
		
		for(String e : courselist) {
			System.out.println(e);
		}
}
	
}
