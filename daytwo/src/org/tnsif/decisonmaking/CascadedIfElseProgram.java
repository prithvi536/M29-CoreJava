package org.tnsif.decisonmaking;

import java.util.Scanner;

public class CascadedIfElseProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three values");
		float per1 =s.nextFloat();
		float per2 =s.nextFloat();
		float per3 =s.nextFloat();
		
		if(per1>per2 && per1>per3) {
			System.out.println("Person1 has highest percentage "+ per1);
		}
		else if(per2>per3 && per2>per1) {
			System.out.println("Person2 has highest percentage "+ per2);
		}
		else {
			System.out.println("Person3 has highest percentage "+ per3);
		}

	}

}
