package org.tnsif.interfacedemo;

public interface ATMMachine {

	/*all the variables in an interface are by
	 *  default public static final, so here amount is final type and it
	 *  must be initialized
	 */
	//int amount;
	
	int amountWit =1209;
	int amountDep =1000;
	
	/* by default all the methods 
	inside an interface are public abstract */
	
	void withdraw();
	void deposit();
}
