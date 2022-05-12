package AbstractClassConcepts;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("Home -- title");
		
	}

	@Override
	public void url() {
		System.out.println("Home --- url");
	}
	

	@Override
	public void header() {
		System.out.println("homepage header");
	}
	

	
	public void logout() {
		System.out.println("homepage -- logout");
	}
	
	
}
