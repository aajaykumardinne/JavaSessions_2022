package Encapsulation;

public class Company {

	public String name;
	private int sharePrice;
	public String hq;
	
	// setter
	public void setsharePrice(int SharePrice) {
		this.sharePrice = SharePrice;
	}
	
	// getter
	public int getSharePrice() {
		return sharePrice;
	}
	
	public static void main(String[] args) {
		
		Company c1 = new Company();
		c1.name= "Google";
		c1.hq= "Hyd";

		
	}

}
