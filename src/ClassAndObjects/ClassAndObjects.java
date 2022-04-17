package ClassAndObjects;

public class ClassAndObjects {

	int i = 20; // class variable

	public static void main(String[] args) {

		int i = 10; // local variable
		System.out.println(i);

		// create the object of the class - use new keyword
		ClassAndObjects obj = new ClassAndObjects();
		System.out.println(obj.i);

		// Def of class
		// class - is a template / blue print / category for the objects
		// will have class properties which will be created to the object.

		// objects -- physical entity should be created from the class category/template

	}

}
