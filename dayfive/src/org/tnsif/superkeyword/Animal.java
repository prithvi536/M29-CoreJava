package org.tnsif.superkeyword;

public class Animal {
	public String animalType= "wild";
	public int legs=2;
	
	
	
	public Animal() {
		System.out.println("Animal class constructor");
	}



	public void display()
	{
		System.out.println("Animal Type "+animalType);
		System.out.println("No. of Legs "+legs);
	}

	

	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", legs=" + legs + "]";
	}

	
}
