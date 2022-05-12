package WebDriver_Architecture;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("launch chrome browser");
	}
	@Override
	public void findElement() {
		System.out.println("find element");
		
	}

	@Override
	public void findElements() {
		System.out.println("find elements");
		
	}

	@Override
	public void click() {
		System.out.println("click on element");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("enter the value: " + value);
		
	}

	@Override
	public void get(String url) {
		System.out.println("enter the url: " + url);
		
	}

	@Override
	public String getTitle() {
		return "some title";
	}

	
	
}
