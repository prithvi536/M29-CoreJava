package org.tnsif.userinputdemo;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		//user input
		Scanner s = new Scanner(System.in);
		System.out.println("enter ur salary");
		float salary = s.nextFloat();
		
		System.out.println("enter ur name");
		//next() is used to get first word of sentence
		String name = s.next();
		s.nextLine();
		
		System.out.println("enter ur name");
		//nextLine() is used to get entire sentence of your string
		String name1 = s.nextLine();
		
		System.out.println("enter the character");
		char c = s.next().charAt(2);
		
		System.out.println("salary is "+ salary);
		System.out.println("name is "+ name);
		System.out.println("name1 is "+ name1);
		System.out.println("character is "+ c);
		
		s.close();

	}

}

