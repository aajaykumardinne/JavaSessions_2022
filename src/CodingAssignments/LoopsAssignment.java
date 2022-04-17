package CodingAssignments;

public class LoopsAssignment {

	public static void main(String[] args) {
	
		
		// part 1
		for(int i=1; i<6; i++) {
			System.out.println("I am Batman");
		}
		
		// part 2 
		System.out.println("#####");
		for(int i=1; i<10; i++) {
			System.out.println("I am Batman " +i);
		}
		
		//part 3 
		System.out.println("Using for loop");
		for(int k=10; k>=1 ;k--){
			System.out.println(k);
		}
		
		System.out.println("Using while loop");
		int k=10;
		while (k>=1) {
			System.out.println(k);
			k--;
		}
		
		System.out.println("Using do-while loop");
		int r=10;
		do {
			System.out.println(r);
			r=r-1;
		} while (r>=1);
		
		
		//part-4
		System.out.println("$$$");
		int y=1;
		String s="Hello World";
		while (y<=10) {
			System.out.println(s);
			y++;
		}
		
		//part-5
		System.out.println("$$$");
		int z=1;
		while (z<=10) {
			System.out.println(z);
			z++;
			if(z%7==0) {
				z++;
			}
		}
	}

}
