package org.tnsif.AssignmentFunctionRecursion;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
	
	static int fib(int n) {
		if (n==1 || n==2)
			return 1;
		else
			return(fib(n-1)+fib(n-2));
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = s.nextInt();
		System.out.println(fib(n));
		s.close();
	}

}
