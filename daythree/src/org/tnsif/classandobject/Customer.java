package org.tnsif.classandobject;

public class Customer {
	
	//private data members 
	private int customerId;
	private String customerName;
	private String city;
	
	//constructor doesn't have any return type
	//it is same as class name followed by ()
	
	//default constructor
	public Customer() {
		super();
	}
	
	//parameterized constructor
	public Customer(int customerId, String customerName, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
	}



	/*setters and getters method
	 * to access private data members in another class
	 */
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	//object of a class will call to toString()
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
	}
	
	

}
