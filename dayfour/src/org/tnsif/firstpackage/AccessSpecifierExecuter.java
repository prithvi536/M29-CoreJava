package org.tnsif.firstpackage;

public class AccessSpecifierExecuter {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		//b.methodPrivate(); can't use in another class
		
		System.out.println(b instanceof Base);
		

	}

}
