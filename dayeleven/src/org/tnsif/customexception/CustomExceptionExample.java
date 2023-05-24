package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) throws LoginCredentials {
		
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		String password = s.nextLine();
		
		try {
			if(id.equals("prithvi@gmail.com") && password.equals("prithvi123")) {
				
				System.out.println("credential matched");
			}
			else {
				throw new LoginCredentials("Invalid Credentials");
			}
		}
		//handling exception using user-defined exception
		catch (LoginCredentials e) {
			System.out.println("exception handled "+e);
		}
		
	}

}
