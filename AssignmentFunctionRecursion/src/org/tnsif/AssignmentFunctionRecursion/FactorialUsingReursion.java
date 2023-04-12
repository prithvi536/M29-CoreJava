package org.tnsif.AssignmentFunctionRecursion;

import java.util.Scanner;

public class FactorialUsingReursion {
	
	static int factorial(int num) {
		if(num!=0)
			return num*factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		
		System.out.println(factorial(n)); //function call
		s.close();

	}

}
