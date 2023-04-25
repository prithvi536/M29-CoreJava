package org.tnsif.statickeyword;

public class Employee {
	//non-static data members
	private int empId;
	private String name;
	
	//static data member
	static String companyName = "Capgemini"; 

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
}
