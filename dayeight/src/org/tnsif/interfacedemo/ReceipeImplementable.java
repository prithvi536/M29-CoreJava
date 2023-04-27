package org.tnsif.interfacedemo;

public class ReceipeImplementable implements Receipe {

	private String name;
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//implementable method
	@Override
	public String displayName() {
		
		return "Welcome to "+name;
	}
}
