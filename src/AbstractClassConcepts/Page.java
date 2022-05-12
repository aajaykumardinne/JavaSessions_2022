package AbstractClassConcepts;


// abstract class object can not be created
// but abstract class constrcutor can be created
// it will be called when we create the object of child class
// It is not mandatory to create the abstract method in abstract class
public abstract class Page {

	public abstract void title();
	
	public abstract void url();
	
	public  Page() {
		System.out.println("page -- default constrcutor");
	}
	
	public  Page(int t) {
		System.out.println("page -- constrcutor: " +t);
	}
	
	public void header() {
		System.out.println("page header");
	}

	public final void logo() {
		System.out.println("page logo");
	}
	
}
