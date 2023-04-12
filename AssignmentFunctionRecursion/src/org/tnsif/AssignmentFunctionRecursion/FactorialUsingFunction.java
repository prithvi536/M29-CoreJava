package org.tnsif.AssignmentFunctionRecursion;

import java.util.Scanner;

public class FactorialUsingFunction {
	
	//function definition
	static int factorial(int num) {
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	} 

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		
		System.out.println(factorial(n)); //function call
		s.close();
	}

}
