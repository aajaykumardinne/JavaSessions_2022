package Encapsulation;

public class Browser {
	
	
	public void launchBrowser() {
		System.out.println("launch browser");
		getVersion();
		OSVersion();
		getEnoughRAM();
		System.out.println("browser is launched");
	}
	
	private void getVersion() {
		System.out.println("check the version");
	}

	private void OSVersion() {
		System.out.println("check the os version");
	}
	
	private void getEnoughRAM() {
		System.out.println("checkEngouhRAM");
	}
	
}
