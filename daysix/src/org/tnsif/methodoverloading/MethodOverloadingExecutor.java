package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		MethodOverloadingExample m1 = new MethodOverloadingExample();
		System.out.println(m1.multiplication(12,10));
		System.out.println(m1.multiplication(12.99f, 561.33f));
		System.out.println(m1.multiplication(10.99f, 32));
		System.out.println(m1.multiplication(60, 499.99f));
		
		System.out.println(m1.print("welcome prithviraj"));
		System.out.println(m1.print("Hello ","Prithvi"));
	}

}
