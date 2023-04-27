package org.tnsif.interfacedemo;

public class ATMMachineChild implements ATMMachine{

	@Override
	public void withdraw() {
		System.out.println("withdraw amount "+amountWit);		
	}

	@Override
	public void deposit() {
		System.out.println("deposit amount "+amountDep);
		
	}
	

}
