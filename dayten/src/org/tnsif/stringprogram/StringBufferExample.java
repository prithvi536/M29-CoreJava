package org.tnsif.stringprogram;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer("Prithvi");
		System.out.println(str1.capacity()); //empty string buffer has capacity of 16 .. for prithvi it will be 16+5
		System.out.println(str1.charAt(2));
	}

}
