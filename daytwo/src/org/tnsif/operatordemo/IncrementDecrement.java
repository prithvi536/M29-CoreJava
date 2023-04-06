package org.tnsif.operatordemo;

public class IncrementDecrement {

	public static void main(String[] args) {
		int y,a=12, b=7;
		int x=a++; //13
		++a; //14
		
		--b; //6
		y=b--; //6
		
		System.out.println(a);
		System.out.println(y);
		System.out.println(b); //5

	}

}
