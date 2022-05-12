package CodingAssignments;

public class ArrayAssignment {

	public static void main(String[] args) {
		
		//3
		int i[] = new int[5];
		i[0] = 4;
		i[1] = 3;
		i[2] = 2;
		i[3] = 1;
		i[4] = 0;
		
		for(int k=0;k<i.length;k++) {
			System.out.println("n"+" = "+i[k]);
		}
		
		System.out.println("*****");
		for(int e:i) {
			System.out.println("n"+" = "+e);
		}
		
		//2 
		
		Object ar[] = new Object[7];
		ar[0] ="Virat";
		ar[1] = 27;
		ar[2] = "RCB";
		ar[3] = "18-Feb-1995";
		ar[4] = 'M';
		ar[5] =  123.56;
		ar[6] = true;
		
		System.out.println("*****");
		for(Object e: ar) {
			System.out.println(e);
		}
		
		System.out.println("*****");
		for(int k=0;k<ar.length;k++) {
			System.out.println(ar[k]);
		}

		//1

		System.out.println("@@@@");
		for(int p=0; p<=3; p++) {
			for(int q=0; q<=9; q++) {
				System.out.print(p +""+q+" ");
			}
			System.out.println();
		}

		
	}

}
