package org.tnsif.multilevelinheritance;

//parent class1
public class Country {
	private String countryName;
	private String countryCapital;
	
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryCapital=" + countryCapital + "]";
	}
}
