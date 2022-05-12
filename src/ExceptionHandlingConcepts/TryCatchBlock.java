package ExceptionHandlingConcepts;

public class TryCatchBlock {

	
	// try catch block will handle the exception
	String name;

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		TryCatchBlock trycatch = new TryCatchBlock();
//		trycatch.name="Tarun";
//		System.out.println(trycatch.name);
		
		trycatch= null;
		
				
		try{
			System.out.println(trycatch.name);
			int j = 10/2;
			System.out.println("hii");
			System.out.println("hii");
			System.out.println("hii");
		}
		
//		catch(Throwable e) {
//		e.printStackTrace();
//	}
		
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
	
//		catch(Error e){
//			e.printStackTrace();
//		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming");
			e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			System.out.println("NullPointer Exception is coming");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

		
		
		
	}

}
