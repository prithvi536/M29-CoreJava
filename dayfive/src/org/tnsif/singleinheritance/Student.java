package org.tnsif.singleinheritance;

//child class
public class Student extends Citizen {
	private String college;
	private int rollNo;
	
	public Student() {
		super();
		
	}
	
	public Student(String name, int adhaarNo, String city, long contactNo,String college, int rollNo) {
		super(name, adhaarNo, city, contactNo);
		this.college = college;
		this.rollNo = rollNo;

	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [college=" + college + ", rollNo=" + rollNo + ", getName()=" + getName() + ", getAdhaarNo()="
				+ getAdhaarNo() + ", getCity()=" + getCity() + ", getContactNo()=" + getContactNo() + "]";
	}

	
	
}
