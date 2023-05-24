package org.tnsif.stringprogram;

public class StringOperationExample {

	public static void main(String[] args) {

		String str1 = new String("Prithvi");
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('t'));
		System.out.println(str1.hashCode());
		System.out.println(str1.concat(" Shiwani"));
		System.out.println(str1+" Patil");
	}

}
