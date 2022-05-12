package CodingAssignments;

public class Browser {

	String browserName;
	String vendorName;
	double currentVersion;
	
	
	public Browser(String browserName, double currentVersion) {
		this.browserName = browserName;
		this.currentVersion = currentVersion;
	}


	public Browser( double currentVersion, String vendorName) {
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}


	public Browser(String browserName, String vendorName) {
		super();
		this.browserName = browserName;
		this.vendorName = vendorName;
	}


	public Browser(String browserName, String vendorName, double currentVersion) {
		super();
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}
	
	
	public String getBrowserInfo() {
		return browserName + " " + vendorName + " " + currentVersion;
	}
}
