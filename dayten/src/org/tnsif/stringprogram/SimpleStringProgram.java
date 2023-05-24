package org.tnsif.stringprogram;

public class SimpleStringProgram {

	public static void main(String[] args) {
		String str1 = "Prithvi";
		System.out.println("using string literal "+str1);
		
		String str2 = new String("Prithvi");
		System.out.println("Using new keyword "+str2);
		
		String str3 = "Prithvi";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
	}

}