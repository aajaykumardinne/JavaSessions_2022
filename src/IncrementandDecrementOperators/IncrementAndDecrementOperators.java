package IncrementandDecrementOperators;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
	
		//++ -> increase the value by 1 
		//-- -> decrease the value by 1
		
		// 1. post-increment
		
		// first assign the value of a to b  and 
		// then increase the value of a
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int x = -100;
		int y = x++;
		System.out.println(x);
		System.out.println(y); 
		
		// 2. pre-increment 
		int m = -97;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);
		
		int c = 5;
		int d = ++c;
		System.out.println(c);
		System.out.println(d);
		
		int z=3;
		System.out.println(z++);
		System.out.println(z);
		
		int f=4;
		System.out.println(++f);
		System.out.println(f);
		
		

	}

}
