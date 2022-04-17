package CodingAssignments;

public class ConditionalOperators {

	public static void main(String[] args) {
	
		int x = 25;
		int y = 78;
		int z = 87;
		
		// Part 1
		if(x>y & x>z) {
			System.out.println("The greatest: " +x);
			
		}
		else if(y>z) {
			System.out.println("The greatest: " +y);
		}
		else {
			System.out.println("The greatest: " +z);
		}	

		
		// Part 2;
		int num=-11;
		
		if(num>0 ) {
			System.out.println("The Positive number");
		}
		
		else if(num<0) {
			System.out.println("The negative number");
		}
		
		
	}

}