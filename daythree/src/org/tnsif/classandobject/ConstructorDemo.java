package org.tnsif.classandobject;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id;
		String city,name;
		
		System.out.println("Enter the customer id ");
		id = s.nextInt();
		s.nextLine();
		System.out.println("Enter the customer name ");
		name = s.nextLine();
		System.out.println("Enter the customer city ");
		city = s.nextLine();
		
		Customer c = new Customer(); //default constructor
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCity(city);
		System.out.println(c); //calls to toString method
		
		
		System.out.println("Enter the customer id ");
		id = s.nextInt();
		s.nextLine();
		System.out.println("Enter the customer name ");
		name = s.nextLine();
		System.out.println("Enter the customer city ");
		city = s.nextLine();
		
		Customer c1 = new Customer(id,name,city);
		System.out.println(c1);
	}

}
