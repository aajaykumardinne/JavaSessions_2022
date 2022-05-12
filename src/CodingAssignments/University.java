package CodingAssignments;

public class University {

	String name;
	String country;
	String establisheddate;

	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public University(String name, String country, String establisheddate) {
		this.name = name;
		this.country = country;
		this.establisheddate = establisheddate;
	}
	
	public String getUniversityInfo() {
		return name + " " + country + " " + establisheddate;

	}

}
