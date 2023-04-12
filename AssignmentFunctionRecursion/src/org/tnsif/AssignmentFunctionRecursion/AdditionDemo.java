package org.tnsif.AssignmentFunctionRecursion;

import java.util.Scanner;

public class AdditionDemo {
	static void addition(int a,int b) {
		int sum = a+b;
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value of a and b");
		int x = s.nextInt();
		int y = s.nextInt();
		
		addition(x,y);
		s.close();
		//System.out.println(addition(a,b));
	}

}
