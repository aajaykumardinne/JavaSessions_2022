package StringConcepts;

public class StringManipulation {

	public static void main(String[] args) {

		// String is stored in String constant pool(SCP) memory location in the Heap.
		// String is internally uses array to store the values

		// After jdk 1.7 SCP is part of the Heap

		String r = "This is my java code and I am so happy java is the best";

		// length
		System.out.println(r.length());

		// charAt
		System.out.println(r.charAt(25));
		System.out.println(r.charAt(37));
//		System.out.println(r.charAt(38)); // StringIndexOutOfBoundsException
//		System.out.println(r.charAt(-1)); // StringIndexOutOfBoundsException

		// indexOf
		System.out.println(r.indexOf('j'));

		System.out.println(r.indexOf('i')); // 2 //1st occurence of i
		System.out.println(r.indexOf('i', r.indexOf('i') + 1));// d occurence of i

		// print the 3rd occurence of i
		System.out.println(r.indexOf('i', r.indexOf('i') + 4));

		System.out.println(r.indexOf("code"));
		System.out.println(r.indexOf("python"));

		String mesg = "Welcome Admin";
		if (mesg.indexOf("Admin") > 0) {
			System.out.println("PASS");
		}

		// toLowerCase and toUpperCase
		System.out.println(r.toLowerCase());
		System.out.println(r.toUpperCase());

		// trim
		String str = "   Hello World	";
		System.out.println(str.trim());

		// replace
		System.out.println(str.replace(" ", ""));

		String dob = "18-02-1995";
		System.out.println(dob.replace("-", "/"));

		// contains
		String s1 = "my name is aajaykumardinne";
		System.out.println(s1.contains("aajay"));
		if (s1.contains("aajay")) {
			System.out.println("PASS");
		}

		// comparison
		String t1 = "I love Java programming"; // string literals
		String t2 = "I love Java programming";
		System.out.println(t1.equals(t2)); // best way to compare two strings in java
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1 == t2);

		String t3 = new String("Hello C#"); // 2 objects will be created in the heap - SCP + Heap
		String t4 = "Hello C#"; // 0 objects will be created
		String t5 = new String("Hello C#"); // 1 object will be created

		System.out.println(t3 == t5);
		System.out.println(t3 == t4);

		// split
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String[] langary = lang.split("_");
		System.out.println(langary[2]);

		for (String ele : langary) {
			System.out.println(ele);
		}

		
		String name = "xXTestingxXSeleniumXxXJavaXxXTestng";
		String[] namearray = name.split("xX");
		System.out.println(namearray[0]);
		System.out.println(namearray[1]);
		System.out.println(namearray[2]);
		System.out.println(namearray[3]);
		System.out.println(namearray[4]);

		String empData = "Aajay;27;Toronto:CAN;18-02-1995;Selnium;QA";
		String emp[] = empData.split(";");
		for (String ele : emp) {
			System.out.println(ele);
		}

		String credentials = "admin:admin";
		System.out.println(credentials.split(":")[0]);
		System.out.println(credentials.split(":")[1]);

		// substring
		String message = "Your order id is 128956";
		System.out.println(message.substring(8));
		System.out.println(message.substring(17)); // hard coded value
		System.out.println(message.substring(0, 17));

		System.out.println(message.substring(message.lastIndexOf("is") + 3, message.length()));

	}

}
