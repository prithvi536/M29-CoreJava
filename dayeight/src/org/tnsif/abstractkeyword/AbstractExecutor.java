package org.tnsif.abstractkeyword;

public class AbstractExecutor {

	public static void main(String[] args) {
		Remote r1 = new RemoteChild();
		
		r1.cellName = "Panasonic";
		r1.display();
		r1.functionRemote();
		r1.create();
		
		RemoteChild r = new RemoteChild();
		r.cellName = "Durocell";
		r.display();
		r.functionRemote();
		r.create();

	}

}
