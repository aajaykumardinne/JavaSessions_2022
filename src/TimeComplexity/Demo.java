package TimeComplexity;

public class Demo {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		// Big O
		// O(1) -- constant time 
		
		
		int j = 15 ;
		int sum = i + j;  //O(1)
		System.out.println(sum);
		
		
		for(int k=1 ; k<=10 ; k++) {
			System.out.println(k);
		}

		// 1+n+n+n = 1+3n ~ 3n = O(n)
		// 3n+1 -- linear equation
		
		for(int a=1; a<10; a++) {
			for(int b=1; b<10; b++) {
				System.out.print(a + "" + b + " ");
			}
			System.out.println();
		}
		
		// 1+n+n+n  = 3n+1 * 3n+1 = 9n*2 + 6n+ 1 = 9n*2 + 6n = 3n(3n+2)
		// 3n(3n) = 9n*2 = n*2 = O(n*2) 
		
		for(int a=1; a<10; a++) {
			for(int b=1; b<10; b++)
				for(int c=1 ; c<10 ; c++){
				System.out.print(a + "" + b + "" + c + " ");
			}
			System.out.println();
		}
		
		// (1+n+n+n) (1+n+n+n) (1+n+n+n)
		// 3n * 3n* 3n
		// O(n*3)
		
		
	}

}
