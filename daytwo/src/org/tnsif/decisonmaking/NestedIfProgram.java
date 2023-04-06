package org.tnsif.decisonmaking;

import java.util.Scanner;

public class NestedIfProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		
		
		if(num>=0) {
			if(num == 0) {
				System.out.println("Number is Zero");
			}
			else {
				System.out.println("Number is Positive");
			}
		}
		else {
			System.out.println("Number is negative number");
		}
		

	}
}