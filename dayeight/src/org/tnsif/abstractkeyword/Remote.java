package org.tnsif.abstractkeyword;

public abstract class Remote {
	public String cellName;

	abstract void create();
	abstract void functionRemote(); //abstract method
	
	//concrete method
	void display() {
		System.out.println("Cell name is "+cellName);
	}
	
}
class RemoteChild extends Remote {
	
	void functionRemote() {
		System.out.println("Abstract class is implemented");
	}

	@Override
	void create() {
	System.out.println("abstract method 2");
		
	}
	
}
