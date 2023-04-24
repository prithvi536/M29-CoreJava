package org.tnsif.constructoroverloading;

public class ConstructorOverloading {
	
	private int x;
	private int y;
	
	//constructor overloading
	public ConstructorOverloading() {
		System.out.println("default");
	}
	
	public ConstructorOverloading(int x) {
		System.out.println("parameterized "+ x);
	}
	
	public ConstructorOverloading(int x, int y) {
		System.out.println("parameterized "+ x * y);
	}

}
