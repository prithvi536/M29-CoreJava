package org.tnsif.finalkeyword;

public class FinalMethod {

	public FinalMethod() {
		System.out.println("default constructor");
	}
	//final variable
	final int salary = 4000;
	
	//final method
	final void show()
	{
		System.out.println("salary is "+salary);
	}
}
