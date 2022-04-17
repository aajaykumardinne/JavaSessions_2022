package LoopsConcepts;

public class WhileLoop {
	
	public static void main(String[] args) {

		// use cases for while loop:
		// we have to use while loop when we are not sure about 
		// number of cycles/iterations.
		
		// 1 to 20
		int i = 1; // start
		while (i <= 20) { // conditional part
			System.out.println(i);
			i = i + 1; // incremental or decremental part
//			++i;
//			i++;
		}
		
		int k=1;
		while(true) {
			System.out.println(k);
			k++;
			if(k==21) {
				break;
			}
		}
		
		// facebook/linkedin app/swiggy app --- lazy page loading
		
	
		
		// Example in selenium : pagination, carousel, calender
		

	}

}
