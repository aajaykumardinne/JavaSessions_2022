package ConditionalOperators;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		String browser = "chrome";

		// break statement is used in loops and switch case statement
		// main purpose : to come out of the loop.
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;

		case "safari":
			System.out.println("launch safari");
			break;

		case "IE":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("please pass the right browser");
			break;
		}
		
		
		int marks=100;
		switch (marks) {
		case  100:
			System.out.println("GRADE A");
			break;
		case  90:
			System.out.println("GRADE B");
			break;
		case 80:
			System.out.println("GRADE C");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		
		//switch-case is not applicable for the boolean expressions.
//		int num=10; 
//		switch (num) {
//		case (num<=10):
//			
//			break;
//
//		default:
//			break;
//		}
		
		double d1= 12.56;
		double d2= 15.78;
		if(d1==d2) {

		
	}
		
		// <= >= == < > !=
		boolean flag = false;
		
		if(!flag) {
			System.out.println("bye");
		}
		else {
			System.out.println("pass");
		}
		
	}

}
