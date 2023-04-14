package org.tnsif.hierarchicalinheritance;

//parent class
public class Android {
	private String brand;
	private String ownerName;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public Android() {
		System.out.println("Default Constructor");
		brand = "Realme";
		ownerName = "Li BingZong";
			}
	
	public Android(String brand, String ownerName) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", ownerName=" + ownerName + "]";
	}
}
