package org.tnsif.customexception;

//to create custom exception
public class LoginCredentials extends Exception{

	private String str1;

	public LoginCredentials(String str1) {
		super();
		this.str1 = str1;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str1=" + str1 + "]";
	}

}
