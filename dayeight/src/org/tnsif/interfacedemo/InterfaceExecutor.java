package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		//cannot instantiate any interface
		//ATMMachine a = new ATMMachine()
		
		ATMMachine a = new ATMMachineChild();
		a.deposit();
		a.withdraw();
		
		ReceipeImplementable r = new ReceipeImplementable();
		r.setName("Prithvi");
		System.out.println(r.displayName());
		
		NestedInterface n = new NestedInterface();
		n.setStr1("Almighty");
		n.setStr2("Prithviraj");
		System.out.println(n.concatenate());

	}

}
