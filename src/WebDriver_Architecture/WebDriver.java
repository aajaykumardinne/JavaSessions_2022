package WebDriver_Architecture;

public interface WebDriver extends SearchContext{
	
	@Override
	public void findElement();
	
	@Override
	public void findElements();
	
	public void click();
	
	public void sendKeys(String value);
	
	public void get(String url);
	
	public String getTitle();
	

}
