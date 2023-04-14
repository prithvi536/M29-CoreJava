package org.tnsif.singleinheritance;

//parent class
public class Citizen {
	private String name;
	private int adhaarNo;
	private String city;
	private long contactNo;
	
	public Citizen() {
		super();
		
	}

	public Citizen(String name, int adhaarNo, String city, long contactNo) {
		super();
		this.name = name;
		this.adhaarNo = adhaarNo;
		this.city = city;
		this.contactNo = contactNo;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(int adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	//when u print object it calls to toString method
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhaarNo=" + adhaarNo + ", city=" + city + ", contactNo=" + contactNo + "]";
	}

}
