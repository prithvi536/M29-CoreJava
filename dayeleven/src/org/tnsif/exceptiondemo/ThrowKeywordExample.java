package org.tnsif.exceptiondemo;

import java.io.IOException;

public class ThrowKeywordExample {

	//throws keyword is used to declare an exception
	public static void donate(int age,int weight) throws IOException {
		if(age>18 && weight>50) {
			System.out.println("Person is eligible to donate");
		}
		else {
			//throw keyword is used to throw an exception
			throw new IOException("Not Eligible");
		}
	}	
	
	public static void main(String[] args) {
		
		try {
			ThrowKeywordExample.donate(19, 32);
		} catch (IOException e) {
			System.out.println("Exception handled"+e);
		}

	}

}
