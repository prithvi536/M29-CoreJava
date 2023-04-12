package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFCBank h = new HDFCBank(); //object creation
		
		//setters 
		h.setCardNo(123456789l);
		h.setCardType("Debit");
		h.setCvvNo(987);
		h.setPinNo(4444);
		
		System.out.println(h.getCvvNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());
	}

}
