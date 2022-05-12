package WebDriver_Architecture;

public class GoogleTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
//		ChromeDriver driver = new ChromeDriver(); // can access the CD and WD methods
//		FirefoxDriver driver = new FirefoxDriver();
		
		// cross browser testing logic
		String browser = "safari";
		if(browser.equals("chrome")) {
			driver = new ChromeDriver(); // can access only WD methods
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver = new ChromeDriver();
		}
		else {
			System.out.println("please pass the right browser");
		}
		
		driver.findElement();
		driver.findElements();
		
		driver.get("https://naveenautomationlabs.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.sendKeys("aajaykuamrdinne");
		driver.click();

	}

}
