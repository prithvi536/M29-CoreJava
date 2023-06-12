package org.tnsif.threading;

public class DriverClass {

	public static void main(String[] args) {
		Account account = new Account();
		account.setId(101);
		account.setName("Amit");
		account.setBalance(50000);
		
		AccountThread t1 = new AccountThread(account, 10000);
		AccountThread t2 = new AccountThread(account, 20000);
		AccountThread t3 = new AccountThread(account, 10000);
		/* try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		System.out.println(account);
	}

}
