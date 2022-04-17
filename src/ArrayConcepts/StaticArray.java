package ArrayConcepts;

public class StaticArray {

	public static void main(String[] args) {
		
		// major limitations
		// 1. size is fixed(static array) -- to overcome this problem , use dynamic array-ArrayList
		// 2. similar type of data--to overcome this problem , use dynamic array-ArrayList/ Static Object Array.
		
		// use cases
		// static data
		// months 12 / days 31
		// no of days in a Week:7
		
		//1. int array
		int i[] = new int[4];
		i[0] = 34;
		i[1] = 20;
		i[2] = 5;
		i[3] = 8;
		
		System.out.println(i[3]);
//		System.out.println(i[4]); // ArrayIndexOutOfBoundsException
//		System.out.println(i[-1]); // ArrayIndexOutOfBoundsException
//		System.out.println(i);
		
		System.out.println(i[2]+i[0]);
		
		int len = i.length;
		System.out.println("The length of the array: " +len);
		System.out.println("Highest Index of the array: " +(len-1));
		System.out.println("Lowset index of the array:" +0);
		
		// print all the values from array: for loop
		for(int k=0; k<len; k++){
			System.out.println(i[k]);
		}
		
		for(int k=0; k<=len-1; k++) {
			System.out.println(i[k]);
		}
		
		for(int k=0; k<i.length ;k++) {
			System.out.println(i[k]);
		}
		
		// for each loop : enhanced for loop
		System.out.println("$$$");
		for(int e: i) { //for(typeofarray variablename: arrayname)
			System.out.println(e);
		}
		
		
		// 2. double array
		double d[] = new double[3];
		d[0] = 24.56;
		d[1] = 100;
		d[2] = 13.78;
//		d[3] = 122.90;// ArrayIndexOutOfBoundsException
//		System.out.println(d[3]);
		
		System.out.println("$$$");
		for(double aajay: d) {
			System.out.println(aajay);
		}
		
		// 3. char array
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '$';
		c[2] = '1';
		
		for(char twinkle: c) {
			System.out.println(twinkle);
		}
		
		// 4. string array
		String st[] = new String[4];
		st[0] = "JAVA";
		st[1] = "JAVASCRIPT";
		st[2] = "PYTHON";
		st[3] = "C#";
		
		System.out.println(st[2] +" "+st[0]);
		//for loop
		for(int p=0; p<st.length ;p++) {
			System.out.println(p+":"+st[p]);
		}
		
		// for each loop
		System.out.println("^^^^");
		for(String r: st) {
			System.out.println("p"+":"+r);
		}
		
		// Object Array
		Object emp[] = new Object[3];
		emp[0] = "Aajay";
		emp[1] = 25;
		emp[2] = "Aamzon";
		
		for(Object e : emp) {
			System.out.println(e);
		}

	}

}
