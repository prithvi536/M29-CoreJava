// +-*/%
package org.tnsif.operatordemo;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of x and y");
		int x= s.nextInt();
		int y = s.nextInt();
		s.close();
		
		System.out.println("Addition of two nos: "+ (x+y));
		System.out.println("subtraction of two nos: "+ (x-y));
		System.out.println("multiplication of two nos: "+ (x*y));
		System.out.println("division of two nos: "+ (x/y));
		System.out.println("Modulo of two nos: "+ (x%y));
		
		

	}

}
