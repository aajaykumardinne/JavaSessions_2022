package ExceptionHandlingConcepts;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		// THROW keyword is used to generate the exception
		
		try {
		throw new Exception("AAJAYEXCEPTION");
		}
	    catch(Exception e) {
	    	System.out.println("Some Exception is coimng");
	    	e.printStackTrace();
	    }
		
		String data = null;
		if(data == null) {
			try {
				throw new Exception("DATANOTFOUND EXCEPTION");
			}
			 catch(Exception e) {
			    	System.out.println("data found Exception is coimng");
			    	e.printStackTrace();
			 }
		}
		
		// web page
		// elment e1 is not present
		// e1 prop is missing -> throw new Exception("ELEMENTPROPNOTFOUNDEXCEPTION")
		
	}
}
