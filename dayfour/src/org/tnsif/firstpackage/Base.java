package org.tnsif.firstpackage;

public class Base {
	int vardefault = 10;
	public String varpublic = "Prithvi";
	private int varprivate = 100;
	protected int varprotected = 500;
	
	void methodDefault() {
		System.out.println("Default access method "+vardefault);
	}
	public void methodPublic() {
		System.out.println("Public access method "+varpublic);
	}
	private void methodPrivate() {
		System.out.println("Private access method "+varprivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access method "+varprotected);
	}
}
