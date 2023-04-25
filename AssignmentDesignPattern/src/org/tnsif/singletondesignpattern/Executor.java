package org.tnsif.singletondesignpattern;

public class Executor {

	public static void main(String[] args) {
		
		EagerInitialization singleton1 = EagerInitialization.getInstance();
		EagerInitialization singleton2 = EagerInitialization.getInstance();
		
		System.out.println(singleton1);
		System.out.println(singleton2);

	}

}
