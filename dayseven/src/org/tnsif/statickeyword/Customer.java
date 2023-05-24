package org.tnsif.statickeyword;

public class Customer {
	//private String name;
	
	private int custId;
	private static String companyName;
	
	/*static block is used to initialize static 
	 * variable only*/
	static {
		//we cannot use non-static variable inside static block
		//name = "Capgemini";
		
		companyName = "Capgemini";
		
		
	}
	
	public Customer() {
		custId++;
		
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", companyName=" + companyName + "]";
	}
	
	static void display() {
		System.out.println("Company Name "+ companyName);
	}
}
