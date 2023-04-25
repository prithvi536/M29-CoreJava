package org.tnsif.thiskeyword;

public class ThisKeywordExample {
	private int cvvNo;
	private long atmNo;
	
	
	public ThisKeywordExample(int cvvNo, long atmNo) {
		
		//it can be used to return the current class instance 
		this.cvvNo = cvvNo;
		this.atmNo = atmNo;
	}
	
	public void print() {
		System.out.println("CVV NO "+cvvNo +"\nATM NO. "+ atmNo);
	}
	

}
