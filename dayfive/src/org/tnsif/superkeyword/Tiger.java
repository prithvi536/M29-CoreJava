package org.tnsif.superkeyword;

public class Tiger extends Animal{
	public String animalType = "TigerWild";
	public int legs =4;
	
	
	public Tiger() {
		super(); //calls the default constructor of parent class
		System.out.println("tiger class constructor");
	}


	public void display()
	{
		
		super.display(); //super keyword method 
		System.out.println(super.animalType); //super keyword variable
		System.out.println(super.legs);
		System.out.println("Animal Type "+animalType);
		System.out.println("No. of Legs "+legs);
		
	}

	
	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", legs=" + legs + "]";
	}
	

}
